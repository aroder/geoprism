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
package com.runwaysdk.geodashboard.gis.persist;

@com.runwaysdk.business.ClassSignature(hash = -1063603117)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to DashboardMap.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class DashboardMapBase extends com.runwaysdk.business.Business implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.gis.persist.DashboardMap";
  public static java.lang.String ACTIVEBASEMAP = "activeBaseMap";
  public static java.lang.String CREATEDATE = "createDate";
  public static java.lang.String CREATEDBY = "createdBy";
  public static java.lang.String DASHBOARD = "dashboard";
  public static java.lang.String ENTITYDOMAIN = "entityDomain";
  public static java.lang.String ID = "id";
  public static java.lang.String KEYNAME = "keyName";
  public static java.lang.String LASTUPDATEDATE = "lastUpdateDate";
  public static java.lang.String LASTUPDATEDBY = "lastUpdatedBy";
  public static java.lang.String LOCKEDBY = "lockedBy";
  public static java.lang.String NAME = "name";
  public static java.lang.String OWNER = "owner";
  public static java.lang.String SEQ = "seq";
  public static java.lang.String SITEMASTER = "siteMaster";
  public static java.lang.String TYPE = "type";
  private static final long serialVersionUID = -1063603117;
  
  public DashboardMapBase()
  {
    super();
  }
  
  public String getActiveBaseMap()
  {
    return getValue(ACTIVEBASEMAP);
  }
  
  public void validateActiveBaseMap()
  {
    this.validateAttribute(ACTIVEBASEMAP);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getActiveBaseMapMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(ACTIVEBASEMAP);
  }
  
  public void setActiveBaseMap(String value)
  {
    if(value == null)
    {
      setValue(ACTIVEBASEMAP, "");
    }
    else
    {
      setValue(ACTIVEBASEMAP, value);
    }
  }
  
  public java.util.Date getCreateDate()
  {
    return com.runwaysdk.constants.MdAttributeDateTimeUtil.getTypeSafeValue(getValue(CREATEDATE));
  }
  
  public void validateCreateDate()
  {
    this.validateAttribute(CREATEDATE);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeDateTimeDAOIF getCreateDateMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeDateTimeDAOIF)mdClassIF.definesAttribute(CREATEDATE);
  }
  
  public com.runwaysdk.system.SingleActor getCreatedBy()
  {
    if (getValue(CREATEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.SingleActor.get(getValue(CREATEDBY));
    }
  }
  
  public String getCreatedById()
  {
    return getValue(CREATEDBY);
  }
  
  public void validateCreatedBy()
  {
    this.validateAttribute(CREATEDBY);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getCreatedByMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(CREATEDBY);
  }
  
  public com.runwaysdk.geodashboard.Dashboard getDashboard()
  {
    if (getValue(DASHBOARD).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.geodashboard.Dashboard.get(getValue(DASHBOARD));
    }
  }
  
  public String getDashboardId()
  {
    return getValue(DASHBOARD);
  }
  
  public void validateDashboard()
  {
    this.validateAttribute(DASHBOARD);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getDashboardMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(DASHBOARD);
  }
  
  public void setDashboard(com.runwaysdk.geodashboard.Dashboard value)
  {
    if(value == null)
    {
      setValue(DASHBOARD, "");
    }
    else
    {
      setValue(DASHBOARD, value.getId());
    }
  }
  
  public com.runwaysdk.system.metadata.MdDomain getEntityDomain()
  {
    if (getValue(ENTITYDOMAIN).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.metadata.MdDomain.get(getValue(ENTITYDOMAIN));
    }
  }
  
  public String getEntityDomainId()
  {
    return getValue(ENTITYDOMAIN);
  }
  
  public void validateEntityDomain()
  {
    this.validateAttribute(ENTITYDOMAIN);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getEntityDomainMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(ENTITYDOMAIN);
  }
  
  public void setEntityDomain(com.runwaysdk.system.metadata.MdDomain value)
  {
    if(value == null)
    {
      setValue(ENTITYDOMAIN, "");
    }
    else
    {
      setValue(ENTITYDOMAIN, value.getId());
    }
  }
  
  public String getId()
  {
    return getValue(ID);
  }
  
  public void validateId()
  {
    this.validateAttribute(ID);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getIdMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(ID);
  }
  
  public String getKeyName()
  {
    return getValue(KEYNAME);
  }
  
  public void validateKeyName()
  {
    this.validateAttribute(KEYNAME);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getKeyNameMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(KEYNAME);
  }
  
  public void setKeyName(String value)
  {
    if(value == null)
    {
      setValue(KEYNAME, "");
    }
    else
    {
      setValue(KEYNAME, value);
    }
  }
  
  public java.util.Date getLastUpdateDate()
  {
    return com.runwaysdk.constants.MdAttributeDateTimeUtil.getTypeSafeValue(getValue(LASTUPDATEDATE));
  }
  
  public void validateLastUpdateDate()
  {
    this.validateAttribute(LASTUPDATEDATE);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeDateTimeDAOIF getLastUpdateDateMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeDateTimeDAOIF)mdClassIF.definesAttribute(LASTUPDATEDATE);
  }
  
  public com.runwaysdk.system.SingleActor getLastUpdatedBy()
  {
    if (getValue(LASTUPDATEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.SingleActor.get(getValue(LASTUPDATEDBY));
    }
  }
  
  public String getLastUpdatedById()
  {
    return getValue(LASTUPDATEDBY);
  }
  
  public void validateLastUpdatedBy()
  {
    this.validateAttribute(LASTUPDATEDBY);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getLastUpdatedByMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(LASTUPDATEDBY);
  }
  
  public com.runwaysdk.system.Users getLockedBy()
  {
    if (getValue(LOCKEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.Users.get(getValue(LOCKEDBY));
    }
  }
  
  public String getLockedById()
  {
    return getValue(LOCKEDBY);
  }
  
  public void validateLockedBy()
  {
    this.validateAttribute(LOCKEDBY);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getLockedByMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(LOCKEDBY);
  }
  
  public String getName()
  {
    return getValue(NAME);
  }
  
  public void validateName()
  {
    this.validateAttribute(NAME);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getNameMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(NAME);
  }
  
  public void setName(String value)
  {
    if(value == null)
    {
      setValue(NAME, "");
    }
    else
    {
      setValue(NAME, value);
    }
  }
  
  public com.runwaysdk.system.Actor getOwner()
  {
    if (getValue(OWNER).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.Actor.get(getValue(OWNER));
    }
  }
  
  public String getOwnerId()
  {
    return getValue(OWNER);
  }
  
  public void validateOwner()
  {
    this.validateAttribute(OWNER);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getOwnerMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(OWNER);
  }
  
  public void setOwner(com.runwaysdk.system.Actor value)
  {
    if(value == null)
    {
      setValue(OWNER, "");
    }
    else
    {
      setValue(OWNER, value.getId());
    }
  }
  
  public Long getSeq()
  {
    return com.runwaysdk.constants.MdAttributeLongUtil.getTypeSafeValue(getValue(SEQ));
  }
  
  public void validateSeq()
  {
    this.validateAttribute(SEQ);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeLongDAOIF getSeqMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeLongDAOIF)mdClassIF.definesAttribute(SEQ);
  }
  
  public String getSiteMaster()
  {
    return getValue(SITEMASTER);
  }
  
  public void validateSiteMaster()
  {
    this.validateAttribute(SITEMASTER);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getSiteMasterMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(SITEMASTER);
  }
  
  public String getType()
  {
    return getValue(TYPE);
  }
  
  public void validateType()
  {
    this.validateAttribute(TYPE);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getTypeMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.gis.persist.DashboardMap.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(TYPE);
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public static DashboardMapQuery getAllInstances(String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    DashboardMapQuery query = new DashboardMapQuery(new com.runwaysdk.query.QueryFactory());
    com.runwaysdk.business.Entity.getAllInstances(query, sortAttribute, ascending, pageSize, pageNumber);
    return query;
  }
  
  public com.runwaysdk.geodashboard.gis.persist.HasLayer addHasLayer(com.runwaysdk.geodashboard.gis.persist.DashboardLayer dashboardLayer)
  {
    return (com.runwaysdk.geodashboard.gis.persist.HasLayer) addChild(dashboardLayer, com.runwaysdk.geodashboard.gis.persist.HasLayer.CLASS);
  }
  
  public void removeHasLayer(com.runwaysdk.geodashboard.gis.persist.DashboardLayer dashboardLayer)
  {
    removeAllChildren(dashboardLayer, com.runwaysdk.geodashboard.gis.persist.HasLayer.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.DashboardLayer> getAllHasLayer()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.DashboardLayer>) getChildren(com.runwaysdk.geodashboard.gis.persist.HasLayer.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.HasLayer> getAllHasLayerRel()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.HasLayer>) getChildRelationships(com.runwaysdk.geodashboard.gis.persist.HasLayer.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.HasLayer> getHasLayerRel(com.runwaysdk.geodashboard.gis.persist.DashboardLayer dashboardLayer)
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.HasLayer>) getRelationshipsWithChild(dashboardLayer, com.runwaysdk.geodashboard.gis.persist.HasLayer.CLASS);
  }
  
  public com.runwaysdk.geodashboard.gis.persist.SessionMap addSessionEntry(com.runwaysdk.geodashboard.SessionEntry sessionEntry)
  {
    return (com.runwaysdk.geodashboard.gis.persist.SessionMap) addParent(sessionEntry, com.runwaysdk.geodashboard.gis.persist.SessionMap.CLASS);
  }
  
  public void removeSessionEntry(com.runwaysdk.geodashboard.SessionEntry sessionEntry)
  {
    removeAllParents(sessionEntry, com.runwaysdk.geodashboard.gis.persist.SessionMap.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.SessionEntry> getAllSessionEntry()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.SessionEntry>) getParents(com.runwaysdk.geodashboard.gis.persist.SessionMap.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.SessionMap> getAllSessionEntryRel()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.SessionMap>) getParentRelationships(com.runwaysdk.geodashboard.gis.persist.SessionMap.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.SessionMap> getSessionEntryRel(com.runwaysdk.geodashboard.SessionEntry sessionEntry)
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.geodashboard.gis.persist.SessionMap>) getRelationshipsWithParent(sessionEntry, com.runwaysdk.geodashboard.gis.persist.SessionMap.CLASS);
  }
  
  public static DashboardMap get(String id)
  {
    return (DashboardMap) com.runwaysdk.business.Business.get(id);
  }
  
  public static DashboardMap getByKey(String key)
  {
    return (DashboardMap) com.runwaysdk.business.Business.get(CLASS, key);
  }
  
  public java.io.InputStream generateMapImageExport(java.lang.String outFileFormat, java.lang.String mapBounds, java.lang.String mapSize, java.lang.String activeBaseMap)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final java.io.InputStream generateMapImageExport(java.lang.String id, java.lang.String outFileFormat, java.lang.String mapBounds, java.lang.String mapSize, java.lang.String activeBaseMap)
  {
    DashboardMap _instance = DashboardMap.get(id);
    return _instance.generateMapImageExport(outFileFormat, mapBounds, mapSize, activeBaseMap);
  }
  
  public java.lang.String getMapJSON(java.lang.String config)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final java.lang.String getMapJSON(java.lang.String id, java.lang.String config)
  {
    DashboardMap _instance = DashboardMap.get(id);
    return _instance.getMapJSON(config);
  }
  
  public static com.runwaysdk.geodashboard.MdAttributeView[] getSecondaryAttributes(java.lang.String mapId, java.lang.String mdAttributeId)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public com.runwaysdk.system.gis.geo.Universal[] getUniversalAggregations(java.lang.String mdAttributeId)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final com.runwaysdk.system.gis.geo.Universal[] getUniversalAggregations(java.lang.String id, java.lang.String mdAttributeId)
  {
    DashboardMap _instance = DashboardMap.get(id);
    return _instance.getUniversalAggregations(mdAttributeId);
  }
  
  public java.lang.String orderLayers(java.lang.String[] layerIds)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final java.lang.String orderLayers(java.lang.String id, java.lang.String[] layerIds)
  {
    DashboardMap _instance = DashboardMap.get(id);
    return _instance.orderLayers(layerIds);
  }
  
  public java.lang.String updateConditions(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCondition[] conditions)
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.DashboardMap.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final java.lang.String updateConditions(java.lang.String id, com.runwaysdk.geodashboard.gis.persist.condition.DashboardCondition[] conditions)
  {
    DashboardMap _instance = DashboardMap.get(id);
    return _instance.updateConditions(conditions);
  }
  
  public static DashboardMap lock(java.lang.String id)
  {
    DashboardMap _instance = DashboardMap.get(id);
    _instance.lock();
    
    return _instance;
  }
  
  public static DashboardMap unlock(java.lang.String id)
  {
    DashboardMap _instance = DashboardMap.get(id);
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
