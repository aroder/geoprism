/**
 * Copyright (c) 2015 TerraFrame, Inc. All rights reserved.
 *
 * This file is part of Runway SDK(tm).
 *
 * Runway SDK(tm) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Runway SDK(tm) is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Runway SDK(tm).  If not, see <http://www.gnu.org/licenses/>.
 */
package net.geoprism;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.runwaysdk.configuration.ConfigurationManager;
import com.runwaysdk.constants.DeployProperties;
import com.runwaysdk.constants.LocalProperties;
import com.runwaysdk.dataaccess.InstallerCP;
import com.runwaysdk.dataaccess.ProgrammingErrorException;
import com.runwaysdk.dataaccess.database.Database;
import com.runwaysdk.dataaccess.io.Versioning;
import com.runwaysdk.dataaccess.io.XMLImporter;
import com.runwaysdk.dataaccess.io.dataDefinition.SAXSourceParser;
import com.runwaysdk.dataaccess.transaction.Transaction;
import com.runwaysdk.generated.system.gis.geo.GeoEntityAllPathsTableQuery;
import com.runwaysdk.generated.system.gis.geo.UniversalAllPathsTableQuery;
import com.runwaysdk.query.QueryFactory;
import com.runwaysdk.session.Request;
import com.runwaysdk.system.gis.geo.AllowedIn;
import com.runwaysdk.system.gis.geo.GeoEntity;
import com.runwaysdk.system.gis.geo.LocatedIn;
import com.runwaysdk.system.gis.geo.Universal;
import com.runwaysdk.util.ServerInitializerFacade;

import net.geoprism.configuration.GeoprismConfigurationResolver;
import net.geoprism.context.PatchingContextListener;
import net.geoprism.context.ProjectDataConfiguration;
import net.geoprism.data.CachedEndpoint;
import net.geoprism.data.LocationImporter;
import net.geoprism.data.XMLEndpoint;
import net.geoprism.data.XMLLocationImporter;
import net.geoprism.data.aws.AmazonEndpoint;
import net.geoprism.data.importer.GeoprismImportPlugin;
import net.geoprism.ontology.Classifier;
import net.geoprism.ontology.ClassifierAllPathsTableQuery;
import net.geoprism.ontology.ClassifierIsARelationship;

public class GeoprismPatcher
{
  private static Logger logger = LoggerFactory.getLogger(PatchingContextListener.class);

  private File metadataDir;
  
  public GeoprismPatcher(File metadataDir)
  {
    this.metadataDir = metadataDir;
  }
  
  public static void main(String[] args)
  {
    String metadataPath = null;
    
    if (args.length > 0)
    {
      metadataPath = args[0];
    }
    if (args.length > 1)
    {
      String externalConfigDir = args[1];
      
      GeoprismConfigurationResolver resolver = (GeoprismConfigurationResolver) ConfigurationManager.Singleton.INSTANCE.getConfigResolver();
      resolver.setExternalConfigDir(new File(externalConfigDir));
    }
    
    executeWithRequest(metadataPath);
  }

  @Request
  private static void executeWithRequest(String metadataPath)
  {
    File fMetadataPath = null;
    if (metadataPath == null)
    {
      metadataPath = DeployProperties.getDeployBin();
      fMetadataPath = new File(metadataPath, "metadata");
    }
    else
    {
      fMetadataPath = new File(metadataPath);
    }
    
    execute(fMetadataPath);
  }
  
  public static void execute(File metadataDir)
  {
    GeoprismPatcher listener = new GeoprismPatcher(metadataDir);
    listener.initialize();
    listener.startup();
    listener.shutdown();
  }
  
  public void initialize()
  {
    LocalProperties.setSkipCodeGenAndCompile(true);

    if (!Database.tableExists("md_class"))
    {
      this.initializeDatabase();
    }
  }

  private void initializeDatabase()
  {
    try
    {
      InputStream schema = this.getClass().getResourceAsStream("/com/runwaysdk/resources/xsd/schema.xsd");

      InputStream[] xmlFilesIS = InstallerCP.buildMetadataInputStreamList();

      XMLImporter importer = new XMLImporter(schema, xmlFilesIS);
      importer.toDatabase();

      ServerInitializerFacade.rebuild();
    }
    catch (IOException e)
    {
      throw new ProgrammingErrorException(e);
    }
  }

  public void startup()
  {
    SAXSourceParser.registerPlugin(new GeoprismImportPlugin());

    this.patchMetadata();
  }

  protected String[] getModules()
  {
    return new String[] { "geoprism" };
  }

  @Transaction
  protected boolean patchMetadata()
  {
    LocalProperties.setSkipCodeGenAndCompile(true);

    String[] modules = this.getModules();

    for (String module : modules)
    {
      File metadata = new File(metadataDir, module);

      if (metadata.exists() && metadata.isDirectory())
      {
        logger.info("Importing metadata schema files from [" + metadata.getAbsolutePath() + "].");
        Versioning.main(new String[] { metadata.getAbsolutePath() });
      }
      else
      {
        logger.error("Metadata schema files were not found at [" + metadata.getAbsolutePath() + "]! Unable to import schemas.");
      }
    }

    /*
     * Rebuild the all path tables if required
     */
    boolean initialized = Classifier.getStrategy().isInitialized();

    Classifier.getStrategy().initialize(ClassifierIsARelationship.CLASS);
    Universal.getStrategy().initialize(AllowedIn.CLASS);
    GeoEntity.getStrategy().initialize(LocatedIn.CLASS);

    if (new UniversalAllPathsTableQuery(new QueryFactory()).getCount() == 0)
    {
      Universal.getStrategy().reinitialize(AllowedIn.CLASS);
    }

    if (new GeoEntityAllPathsTableQuery(new QueryFactory()).getCount() == 0)
    {
      GeoEntity.getStrategy().reinitialize(LocatedIn.CLASS);
    }

    if (new ClassifierAllPathsTableQuery(new QueryFactory()).getCount() == 0)
    {
      Classifier.getStrategy().reinitialize(ClassifierIsARelationship.CLASS);
    }

    /*
     * Load location data
     */
    ProjectDataConfiguration configuration = new ProjectDataConfiguration();

    XMLEndpoint endpoint = this.getEndpoint();

    LocationImporter importer = new XMLLocationImporter(endpoint);
    importer.loadProjectData(configuration);

    return initialized;
  }

  public void shutdown()
  {

  }

  private XMLEndpoint getEndpoint()
  {
    String cacheDirectory = System.getProperty("endpoint.cache");

    if (cacheDirectory != null)
    {
      return new CachedEndpoint(new AmazonEndpoint(), new File(cacheDirectory));
    }

    return new AmazonEndpoint();
//    return new LocalEndpoint(new File("/home/terraframe/Documents/geoprism/DSEDP/cache"));
  }
}
