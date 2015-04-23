package com.runwaysdk.geodashboard.gis.geoserver;

import it.geosolutions.geoserver.rest.GeoServerRESTPublisher;
import it.geosolutions.geoserver.rest.GeoServerRESTReader;

import java.net.MalformedURLException;
import java.util.ResourceBundle;

import org.apache.commons.logging.LogFactory;

import com.runwaysdk.business.BusinessDTO;
import com.runwaysdk.configuration.RunwayConfigurationException;
import com.runwaysdk.constants.CommonProperties;
import com.runwaysdk.generation.loader.Reloadable;

public class GeoserverProperties implements Reloadable
{
  private static final String          GEOSERVER_PROPERTIES = "geodashboard/geoserver";
  
  private ResourceBundle bundle;

  private static GeoServerRESTPublisher publisher;

  private static GeoServerRESTReader    restReader;
  
  public static final String SLD_EXTENSION = ".sld";
  
  private GeoserverProperties()
  {
    bundle = ResourceBundle.getBundle(GEOSERVER_PROPERTIES, CommonProperties.getDefaultLocale(),
        BusinessDTO.class.getClassLoader());  }
  
  private static class Singleton implements Reloadable
  {
    private static GeoserverProperties INSTANCE = new GeoserverProperties();
  }

  private static ResourceBundle getBundle()
  {
    return Singleton.INSTANCE.bundle;
  }
  
  public static Integer getDecimalLength()
  {
    return Integer.valueOf(getBundle().getString("geoserver.decimal.length"));
  }
  
  public static Integer getDecimalPrecision()
  {
    return Integer.valueOf(getBundle().getString("geoserver.decimal.precision"));
  }

  public static String getWorkspace()
  {
    return getBundle().getString("geoserver.workspace");
  }
  
  public static Integer getSessionMapLimit()
  {
    return Integer.valueOf(getBundle().getString("geoserver.session.map.limit"));
  }

  public static Integer getSavedMapLimit()
  {
    return Integer.valueOf(getBundle().getString("geoserver.saved.map.limit"));
  }

  public static String getStore()
  {
    return getBundle().getString("geoserver.store");
  }

  public static String getAdminUser()
  {
    return getBundle().getString("admin.user");
  }

  public static String getAdminPassword()
  {
    return getBundle().getString("admin.password");
  }

  public static String getRemotePath()
  {
    return getBundle().getString("geoserver.remote.path");
  }

  public static String getLocalPath()
  {
    return getBundle().getString("geoserver.local.path");
  }

  public static String getGeoserverSLDDir()
  {
    return getBundle().getString("geoserver.sld.dir");
  }

  public static String getGeoserverGWCDir()
  {
    return getBundle().getString("geoserver.gwc.dir");
  }
  
  /**
   * Labeling VendorOption
   * group
   * http://docs.geoserver.org/latest/en/user/styling/sld-reference/labeling.html
   */
  public static String getLabelGroup() {
    return getBundle().getString("geoserver.labeling.group");
  }
  
  /**
   * Labeling VendorOption
   * conflict-resolution
   * http://docs.geoserver.org/latest/en/user/styling/sld-reference/labeling.html
   */
  public static String getLabelConflictResolution() {
    return getBundle().getString("geoserver.labeling.conflict-resolution");
  }
  
  /**
   * Labeling VendorOption
   * spaceAround
   * http://docs.geoserver.org/latest/en/user/styling/sld-reference/labeling.html
   */
  public static String getLabelSpaceAround() {
    return getBundle().getString("geoserver.labeling.spaceAround");
  }
  
  /**
   * Labeling VendorOption
   * goodnessOfFit
   * http://docs.geoserver.org/latest/en/user/styling/sld-reference/labeling.html
   */
  public static String getLabelGoodnessOfFit() {
    return getBundle().getString("geoserver.labeling.goodnessOfFit");
  }
  
  /**
   * Labeling VendorOption
   * autoWrap
   * http://docs.geoserver.org/latest/en/user/styling/sld-reference/labeling.html
   */
  public static String getLabelAutoWrap() {
    return getBundle().getString("geoserver.labeling.autoWrap");
  }
  
  /**
   * Returns the Geoserver REST publisher.
   * 
   * @return
   */
  public static synchronized GeoServerRESTPublisher getPublisher()
  {
    if(publisher == null)
    {
      publisher = new GeoServerRESTPublisher(getLocalPath(), getAdminUser(), getAdminPassword());
    }
    
    return publisher;
  }

  /**
   * Returns the Geoserver REST reader.
   */
  public static synchronized GeoServerRESTReader getReader()
  {
    if(restReader == null)
    {
      try
      {
        restReader = new GeoServerRESTReader(getLocalPath(), getAdminUser(), getAdminPassword());
      }
      catch (MalformedURLException e)
      {
        // We don't know if this is being called via client or server code, so log
        // the error and throw an exception to the calling code for its error handling mechanism.
        String msg = "The "+GeoserverProperties.class.getSimpleName()+"."+GeoServerRESTReader.class.getSimpleName()+" is null.";
        LogFactory.getLog(GeoserverProperties.class.getClass()).error(msg, e);
        
        throw new RunwayConfigurationException(msg);
      }
    }
    
    return restReader;
  }
}
