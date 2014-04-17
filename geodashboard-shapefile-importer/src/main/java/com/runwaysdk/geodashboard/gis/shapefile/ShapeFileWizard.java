package com.runwaysdk.geodashboard.gis.shapefile;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import com.runwaysdk.generation.loader.Reloadable;
import com.runwaysdk.geodashboard.gis.GISImportLogger;
import com.runwaysdk.geodashboard.gis.GISImportLoggerIF;
import com.runwaysdk.geodashboard.gis.GISManagerWindow;
import com.runwaysdk.geodashboard.gis.Localizer;
import com.runwaysdk.geodashboard.gis.TaskListener;
import com.runwaysdk.logging.LogLevel;
import com.runwaysdk.logging.RunwayLogUtil;
import com.runwaysdk.system.gis.geo.Universal;

public class ShapeFileWizard extends Wizard implements Reloadable
{
  class ShapefileImportRunner implements IRunnableWithProgress, Reloadable
  {
    private ShapeFileImporter importer;

    private GISImportLoggerIF logger;

    public ShapefileImportRunner(ShapeFileImporter importer, GISImportLoggerIF logger)
    {
      this.importer = importer;
      this.logger = logger;
    }

    public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
    {
      setImporting(true);

      importer.addListener(new TaskListener(monitor));
      importer.setUniversalId(data.getUniversal());
      importer.setType(data.getType());
      importer.setName(data.getName());
      importer.setId(data.getId());
      importer.setParent(data.getParent());
      importer.setParentType(data.getParentType());
      importer.run(logger);
    }
  }

  public static String  SHAPEFILE_LOG_DIR = "shapefile";

  private ShapeFileBean data;

  private Universal[]   universals;

  private boolean       importing;

  public ShapeFileWizard(Universal[] universals)
  {
    this.universals = universals;
    this.data = new ShapeFileBean();
    this.importing = false;

    setWindowTitle(Localizer.getMessage("SHAPE_FILE_WIZARD"));
    setNeedsProgressMonitor(true);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jface.wizard.IWizard#addPages()
   */
  public void addPages()
  {
    addPage(new ShapeFilePage(data));
    addPage(new UniversalPage(data, universals));
    addPage(new ShapeFileAttributePage(data));
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jface.wizard.IWizard#performFinish()
   */
  public boolean performFinish()
  {
    try
    {
      File file = new File(GISManagerWindow.LOG_DIR + File.separator + SHAPEFILE_LOG_DIR + File.separator + System.currentTimeMillis() + GISManagerWindow.LOG_EXT);

      file.getParentFile().mkdirs();

      GISImportLogger logger = new GISImportLogger(file);

      ShapeFileImporter importer = new ShapeFileImporter(data.getShapeFile());

      // Run the importer
      getContainer().run(true, false, new ShapefileImportRunner(importer, logger));

      if (logger.hasLogged())
      {
        String message = Localizer.getMessage("ERROR_IN_IMPORT") + " " + file.getAbsolutePath();

        MessageDialog.openConfirm(getShell(), Localizer.getMessage("MESSAGE"), message);
      }
    }
    catch (Exception e)
    {
      this.handleException(e);

      return false;
    }

    return true;
  }

  private void handleException(Throwable throwable)
  {
    RunwayLogUtil.logToLevel(LogLevel.ERROR, "Uncaught exception in the shapefile importer", throwable);

    if (throwable == null || throwable instanceof NullPointerException)
    {
      String message = Localizer.getMessage("UNKNOWN_SHAPE_FILE_EXCEPTION");

      this.error(message);
      this.setImporting(false);
    }
    else if (throwable instanceof InvocationTargetException)
    {
      this.handleException(throwable.getCause());
    }
    else
    {
      this.error(throwable.getLocalizedMessage());
      this.setImporting(false);
    }
  }

  private void error(String message)
  {
    this.getLastPage().setErrorMessage(message);
  }

  public WizardPage getLastPage()
  {
    return (WizardPage) this.getPage(ShapeFileAttributePage.PAGE_NAME);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jface.wizard.IWizard#performCancel()
   */
  public boolean performCancel()
  {
    if (!this.isImporting())
    {
      return MessageDialog.openConfirm(getShell(), Localizer.getMessage("CONFIRMATION"), Localizer.getMessage("CANCEL_MESSAGE"));
    }

    return false;
  }

  public ShapeFileBean getData()
  {
    return data;
  }

  private synchronized void setImporting(boolean importing)
  {
    this.importing = importing;
  }

  private synchronized boolean isImporting()
  {
    return importing;
  }
}