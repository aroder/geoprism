package com.runwaysdk.geodashboard.gis.persist;

@com.runwaysdk.business.ClassSignature(hash = 1446026013)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to DashboardStyle.java
 *
 * @author Autogenerated by RunwaySDK
 */
public class DashboardStyleQueryDTO extends com.runwaysdk.business.BusinessQueryDTO
 implements com.runwaysdk.generation.loader.Reloadable
{
private static final long serialVersionUID = 1446026013;

  protected DashboardStyleQueryDTO(String type)
  {
    super(type);
  }

@SuppressWarnings("unchecked")
public java.util.List<? extends com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO> getResultSet()
{
  return (java.util.List<? extends com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO>)super.getResultSet();
}
}