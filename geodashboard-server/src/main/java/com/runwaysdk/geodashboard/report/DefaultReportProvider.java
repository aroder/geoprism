package com.runwaysdk.geodashboard.report;

import com.runwaysdk.generation.loader.Reloadable;
import com.runwaysdk.query.ValueQuery;

public class DefaultReportProvider implements ReportProviderIF, Reloadable
{

  @Override
  public ValueQuery getValuesForReporting(String type, String category, String criteria)
  {
    return null;
  }

  @Override
  public ValueQuery getTypesForReporting()
  {
    return null;
  }

}
