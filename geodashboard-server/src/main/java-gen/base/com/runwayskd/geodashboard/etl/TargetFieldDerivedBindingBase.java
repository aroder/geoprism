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
package com.runwayskd.geodashboard.etl;

@com.runwaysdk.business.ClassSignature(hash = 1963740170)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to TargetFieldDerivedBinding.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class TargetFieldDerivedBindingBase extends com.runwayskd.geodashboard.etl.TargetFieldCoordinateBinding implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwayskd.geodashboard.etl.TargetFieldDerivedBinding";
  public static java.lang.String GEOENTITY = "geoEntity";
  public static java.lang.String UNIVERSAL = "universal";
  private static final long serialVersionUID = 1963740170;
  
  public TargetFieldDerivedBindingBase()
  {
    super();
  }
  
  public com.runwaysdk.system.gis.geo.GeoEntity getGeoEntity()
  {
    if (getValue(GEOENTITY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.gis.geo.GeoEntity.get(getValue(GEOENTITY));
    }
  }
  
  public String getGeoEntityId()
  {
    return getValue(GEOENTITY);
  }
  
  public void validateGeoEntity()
  {
    this.validateAttribute(GEOENTITY);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getGeoEntityMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwayskd.geodashboard.etl.TargetFieldDerivedBinding.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(GEOENTITY);
  }
  
  public void setGeoEntity(com.runwaysdk.system.gis.geo.GeoEntity value)
  {
    if(value == null)
    {
      setValue(GEOENTITY, "");
    }
    else
    {
      setValue(GEOENTITY, value.getId());
    }
  }
  
  public com.runwaysdk.system.gis.geo.Universal getUniversal()
  {
    if (getValue(UNIVERSAL).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.gis.geo.Universal.get(getValue(UNIVERSAL));
    }
  }
  
  public String getUniversalId()
  {
    return getValue(UNIVERSAL);
  }
  
  public void validateUniversal()
  {
    this.validateAttribute(UNIVERSAL);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getUniversalMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwayskd.geodashboard.etl.TargetFieldDerivedBinding.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(UNIVERSAL);
  }
  
  public void setUniversal(com.runwaysdk.system.gis.geo.Universal value)
  {
    if(value == null)
    {
      setValue(UNIVERSAL, "");
    }
    else
    {
      setValue(UNIVERSAL, value.getId());
    }
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public static TargetFieldDerivedBindingQuery getAllInstances(String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    TargetFieldDerivedBindingQuery query = new TargetFieldDerivedBindingQuery(new com.runwaysdk.query.QueryFactory());
    com.runwaysdk.business.Entity.getAllInstances(query, sortAttribute, ascending, pageSize, pageNumber);
    return query;
  }
  
  public static TargetFieldDerivedBinding get(String id)
  {
    return (TargetFieldDerivedBinding) com.runwaysdk.business.Business.get(id);
  }
  
  public static TargetFieldDerivedBinding getByKey(String key)
  {
    return (TargetFieldDerivedBinding) com.runwaysdk.business.Business.get(CLASS, key);
  }
  
  public static TargetFieldDerivedBinding lock(java.lang.String id)
  {
    TargetFieldDerivedBinding _instance = TargetFieldDerivedBinding.get(id);
    _instance.lock();
    
    return _instance;
  }
  
  public static TargetFieldDerivedBinding unlock(java.lang.String id)
  {
    TargetFieldDerivedBinding _instance = TargetFieldDerivedBinding.get(id);
    _instance.unlock();
    
    return _instance;
  }
  
  public String toString()
  {
    if (this.isNew())
    {
      return "New: "+ this.getClassDisplayLabel();
    }
    else
    {
      return super.toString();
    }
  }
}
