package com.runwaysdk.geodashboard.gis.persist;

@com.runwaysdk.business.ClassSignature(hash = 372419777)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to HasStyle.java
 *
 * @author Autogenerated by RunwaySDK
 */
public class HasStyleQueryDTO extends com.runwaysdk.business.RelationshipQueryDTO
 implements com.runwaysdk.generation.loader.Reloadable
{
private static final long serialVersionUID = 372419777;

  protected HasStyleQueryDTO(String type)
  {
    super(type);
  }

@SuppressWarnings("unchecked")
public java.util.List<? extends com.runwaysdk.geodashboard.gis.persist.HasStyleDTO> getResultSet()
{
  return (java.util.List<? extends com.runwaysdk.geodashboard.gis.persist.HasStyleDTO>)super.getResultSet();
}
}