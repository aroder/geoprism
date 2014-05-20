package com.runwaysdk.geodashboard.gis.web.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.runwaysdk.gis.StrategyInitializer;
import com.runwaysdk.system.scheduler.SchedulerManager;

public class GISContextListener implements ServletContextListener
{
  @Override
  public void contextInitialized(ServletContextEvent arg0) {
    StrategyInitializer.startUp();
    SchedulerManager.start();
//    SessionEntryManager.initialize();
  }
  
  @Override
  public void contextDestroyed(ServletContextEvent arg0) {
    StrategyInitializer.tearDown();
    SchedulerManager.shutdown();
//    SessionEntryManager.destroy();
  }
}
