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

@com.runwaysdk.business.ClassSignature(hash = -946604429)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to MappableClass.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class MappableClassBase extends com.runwaysdk.business.Business implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "net.geoprism.MappableClass";
  public static java.lang.String CREATEDATE = "createDate";
  public static java.lang.String CREATEDBY = "createdBy";
  public static java.lang.String DATASOURCE = "dataSource";
  public static java.lang.String ENTITYDOMAIN = "entityDomain";
  public static java.lang.String ID = "id";
  public static java.lang.String KEYNAME = "keyName";
  public static java.lang.String LASTUPDATEDATE = "lastUpdateDate";
  public static java.lang.String LASTUPDATEDBY = "lastUpdatedBy";
  public static java.lang.String LOCKEDBY = "lockedBy";
  public static java.lang.String OWNER = "owner";
  public static java.lang.String SEQ = "seq";
  public static java.lang.String SITEMASTER = "siteMaster";
  public static java.lang.String TYPE = "type";
  public static java.lang.String WRAPPEDMDCLASS = "wrappedMdClass";
  private static final long serialVersionUID = -946604429;
  
  public MappableClassBase()
  {
    super();
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(CREATEDBY);
  }
  
  public String getDataSource()
  {
    return getValue(DATASOURCE);
  }
  
  public void validateDataSource()
  {
    this.validateAttribute(DATASOURCE);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeTextDAOIF getDataSourceMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeTextDAOIF)mdClassIF.definesAttribute(DATASOURCE);
  }
  
  public void setDataSource(String value)
  {
    if(value == null)
    {
      setValue(DATASOURCE, "");
    }
    else
    {
      setValue(DATASOURCE, value);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(LASTUPDATEDBY);
  }
  
  public com.runwaysdk.system.SingleActor getLockedBy()
  {
    if (getValue(LOCKEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.SingleActor.get(getValue(LOCKEDBY));
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(LOCKEDBY);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
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
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(TYPE);
  }
  
  public com.runwaysdk.system.metadata.MdClass getWrappedMdClass()
  {
    if (getValue(WRAPPEDMDCLASS).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.metadata.MdClass.get(getValue(WRAPPEDMDCLASS));
    }
  }
  
  public String getWrappedMdClassId()
  {
    return getValue(WRAPPEDMDCLASS);
  }
  
  public void validateWrappedMdClass()
  {
    this.validateAttribute(WRAPPEDMDCLASS);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF getWrappedMdClassMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.MappableClass.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF)mdClassIF.definesAttribute(WRAPPEDMDCLASS);
  }
  
  public void setWrappedMdClass(com.runwaysdk.system.metadata.MdClass value)
  {
    if(value == null)
    {
      setValue(WRAPPEDMDCLASS, "");
    }
    else
    {
      setValue(WRAPPEDMDCLASS, value.getId());
    }
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public static MappableClassQuery getAllInstances(String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    MappableClassQuery query = new MappableClassQuery(new com.runwaysdk.query.QueryFactory());
    com.runwaysdk.business.Entity.getAllInstances(query, sortAttribute, ascending, pageSize, pageNumber);
    return query;
  }
  
  public net.geoprism.MappableClassGeoNode addGeoNode(com.runwaysdk.system.gis.geo.GeoNode geoNode)
  {
    return (net.geoprism.MappableClassGeoNode) addChild(geoNode, net.geoprism.MappableClassGeoNode.CLASS);
  }
  
  public void removeGeoNode(com.runwaysdk.system.gis.geo.GeoNode geoNode)
  {
    removeAllChildren(geoNode, net.geoprism.MappableClassGeoNode.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.system.gis.geo.GeoNode> getAllGeoNode()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.system.gis.geo.GeoNode>) getChildren(net.geoprism.MappableClassGeoNode.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends net.geoprism.MappableClassGeoNode> getAllGeoNodeRel()
  {
    return (com.runwaysdk.query.OIterator<? extends net.geoprism.MappableClassGeoNode>) getChildRelationships(net.geoprism.MappableClassGeoNode.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends net.geoprism.MappableClassGeoNode> getGeoNodeRel(com.runwaysdk.system.gis.geo.GeoNode geoNode)
  {
    return (com.runwaysdk.query.OIterator<? extends net.geoprism.MappableClassGeoNode>) getRelationshipsWithChild(geoNode, net.geoprism.MappableClassGeoNode.CLASS);
  }
  
  public net.geoprism.ClassUniversal addUniversal(com.runwaysdk.system.gis.geo.Universal universal)
  {
    return (net.geoprism.ClassUniversal) addChild(universal, net.geoprism.ClassUniversal.CLASS);
  }
  
  public void removeUniversal(com.runwaysdk.system.gis.geo.Universal universal)
  {
    removeAllChildren(universal, net.geoprism.ClassUniversal.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends com.runwaysdk.system.gis.geo.Universal> getAllUniversal()
  {
    return (com.runwaysdk.query.OIterator<? extends com.runwaysdk.system.gis.geo.Universal>) getChildren(net.geoprism.ClassUniversal.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends net.geoprism.ClassUniversal> getAllUniversalRel()
  {
    return (com.runwaysdk.query.OIterator<? extends net.geoprism.ClassUniversal>) getChildRelationships(net.geoprism.ClassUniversal.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends net.geoprism.ClassUniversal> getUniversalRel(com.runwaysdk.system.gis.geo.Universal universal)
  {
    return (com.runwaysdk.query.OIterator<? extends net.geoprism.ClassUniversal>) getRelationshipsWithChild(universal, net.geoprism.ClassUniversal.CLASS);
  }
  
  public static MappableClass get(String id)
  {
    return (MappableClass) com.runwaysdk.business.Business.get(id);
  }
  
  public static MappableClass getByKey(String key)
  {
    return (MappableClass) com.runwaysdk.business.Business.get(CLASS, key);
  }
  
  public static java.lang.String addIndicator(java.lang.String datasetId, java.lang.String indicator)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static void applyDatasetUpdate(java.lang.String dataset)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static void edit(java.lang.String id)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static java.lang.String getAllAsJSON()
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public java.lang.String getAsJSON()
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final java.lang.String getAsJSON(java.lang.String id)
  {
    MappableClass _instance = MappableClass.get(id);
    return _instance.getAsJSON();
  }
  
  public static java.lang.String getAttributesAsJSON(java.lang.String dashboardId, java.lang.String mdClassId)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static java.lang.String getClassesAsJSON(java.lang.String dashboardId)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static java.lang.String lockIndicator(java.lang.String id)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static void remove(java.lang.String id)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static void removeIndicator(java.lang.String id)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public void xport()
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.MappableClass.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static final void xport(java.lang.String id)
  {
    MappableClass _instance = MappableClass.get(id);
    _instance.xport();
  }
  
  public static MappableClass lock(java.lang.String id)
  {
    MappableClass _instance = MappableClass.get(id);
    _instance.lock();
    
    return _instance;
  }
  
  public static MappableClass unlock(java.lang.String id)
  {
    MappableClass _instance = MappableClass.get(id);
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
