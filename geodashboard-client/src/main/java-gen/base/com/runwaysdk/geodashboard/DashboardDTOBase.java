package com.runwaysdk.geodashboard;

@com.runwaysdk.business.ClassSignature(hash = -1871192138)
public abstract class DashboardDTOBase extends com.runwaysdk.business.BusinessDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.Dashboard";
  private static final long serialVersionUID = -1871192138;
  
  protected DashboardDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(clientRequest);
  }
  
  /**
  * Copy Constructor: Duplicates the values and attributes of the given BusinessDTO into a new DTO.
  * 
  * @param businessDTO The BusinessDTO to duplicate
  * @param clientRequest The clientRequest this DTO should use to communicate with the server.
  */
  protected DashboardDTOBase(com.runwaysdk.business.BusinessDTO businessDTO, com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(businessDTO, clientRequest);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static java.lang.String COUNTRY = "country";
  public static java.lang.String CREATEDATE = "createDate";
  public static java.lang.String CREATEDBY = "createdBy";
  public static java.lang.String DISPLAYLABEL = "displayLabel";
  public static java.lang.String ENTITYDOMAIN = "entityDomain";
  public static java.lang.String FILTERDATE = "filterDate";
  public static java.lang.String FROMDATE = "fromDate";
  public static java.lang.String ID = "id";
  public static java.lang.String KEYNAME = "keyName";
  public static java.lang.String LASTUPDATEDATE = "lastUpdateDate";
  public static java.lang.String LASTUPDATEDBY = "lastUpdatedBy";
  public static java.lang.String LOCKEDBY = "lockedBy";
  public static java.lang.String MAP = "map";
  public static java.lang.String OWNER = "owner";
  public static java.lang.String SEQ = "seq";
  public static java.lang.String SITEMASTER = "siteMaster";
  public static java.lang.String TODATE = "toDate";
  public static java.lang.String TYPE = "type";
  public com.runwaysdk.system.gis.geo.GeoEntityDTO getCountry()
  {
    if(getValue(COUNTRY) == null || getValue(COUNTRY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.gis.geo.GeoEntityDTO.get(getRequest(), getValue(COUNTRY));
    }
  }
  
  public String getCountryId()
  {
    return getValue(COUNTRY);
  }
  
  public void setCountry(com.runwaysdk.system.gis.geo.GeoEntityDTO value)
  {
    if(value == null)
    {
      setValue(COUNTRY, "");
    }
    else
    {
      setValue(COUNTRY, value.getId());
    }
  }
  
  public boolean isCountryWritable()
  {
    return isWritable(COUNTRY);
  }
  
  public boolean isCountryReadable()
  {
    return isReadable(COUNTRY);
  }
  
  public boolean isCountryModified()
  {
    return isModified(COUNTRY);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getCountryMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(COUNTRY).getAttributeMdDTO();
  }
  
  public java.util.Date getCreateDate()
  {
    return com.runwaysdk.constants.MdAttributeDateTimeUtil.getTypeSafeValue(getValue(CREATEDATE));
  }
  
  public boolean isCreateDateWritable()
  {
    return isWritable(CREATEDATE);
  }
  
  public boolean isCreateDateReadable()
  {
    return isReadable(CREATEDATE);
  }
  
  public boolean isCreateDateModified()
  {
    return isModified(CREATEDATE);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeDateTimeMdDTO getCreateDateMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeDateTimeMdDTO) getAttributeDTO(CREATEDATE).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.SingleActorDTO getCreatedBy()
  {
    if(getValue(CREATEDBY) == null || getValue(CREATEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.SingleActorDTO.get(getRequest(), getValue(CREATEDBY));
    }
  }
  
  public String getCreatedById()
  {
    return getValue(CREATEDBY);
  }
  
  public boolean isCreatedByWritable()
  {
    return isWritable(CREATEDBY);
  }
  
  public boolean isCreatedByReadable()
  {
    return isReadable(CREATEDBY);
  }
  
  public boolean isCreatedByModified()
  {
    return isModified(CREATEDBY);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getCreatedByMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(CREATEDBY).getAttributeMdDTO();
  }
  
  public com.runwaysdk.geodashboard.DashboardDisplayLabelDTO getDisplayLabel()
  {
    return (com.runwaysdk.geodashboard.DashboardDisplayLabelDTO) this.getAttributeStructDTO(DISPLAYLABEL).getStructDTO();
  }
  
  public boolean isDisplayLabelWritable()
  {
    return isWritable(DISPLAYLABEL);
  }
  
  public boolean isDisplayLabelReadable()
  {
    return isReadable(DISPLAYLABEL);
  }
  
  public boolean isDisplayLabelModified()
  {
    return isModified(DISPLAYLABEL);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeLocalCharacterMdDTO getDisplayLabelMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeLocalCharacterMdDTO) getAttributeDTO(DISPLAYLABEL).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.metadata.MdDomainDTO getEntityDomain()
  {
    if(getValue(ENTITYDOMAIN) == null || getValue(ENTITYDOMAIN).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.metadata.MdDomainDTO.get(getRequest(), getValue(ENTITYDOMAIN));
    }
  }
  
  public String getEntityDomainId()
  {
    return getValue(ENTITYDOMAIN);
  }
  
  public void setEntityDomain(com.runwaysdk.system.metadata.MdDomainDTO value)
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
  
  public boolean isEntityDomainWritable()
  {
    return isWritable(ENTITYDOMAIN);
  }
  
  public boolean isEntityDomainReadable()
  {
    return isReadable(ENTITYDOMAIN);
  }
  
  public boolean isEntityDomainModified()
  {
    return isModified(ENTITYDOMAIN);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getEntityDomainMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(ENTITYDOMAIN).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.metadata.MdAttributeDTO getFilterDate()
  {
    if(getValue(FILTERDATE) == null || getValue(FILTERDATE).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.metadata.MdAttributeDTO.get(getRequest(), getValue(FILTERDATE));
    }
  }
  
  public String getFilterDateId()
  {
    return getValue(FILTERDATE);
  }
  
  public void setFilterDate(com.runwaysdk.system.metadata.MdAttributeDTO value)
  {
    if(value == null)
    {
      setValue(FILTERDATE, "");
    }
    else
    {
      setValue(FILTERDATE, value.getId());
    }
  }
  
  public boolean isFilterDateWritable()
  {
    return isWritable(FILTERDATE);
  }
  
  public boolean isFilterDateReadable()
  {
    return isReadable(FILTERDATE);
  }
  
  public boolean isFilterDateModified()
  {
    return isModified(FILTERDATE);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getFilterDateMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(FILTERDATE).getAttributeMdDTO();
  }
  
  public java.util.Date getFromDate()
  {
    return com.runwaysdk.constants.MdAttributeDateUtil.getTypeSafeValue(getValue(FROMDATE));
  }
  
  public void setFromDate(java.util.Date value)
  {
    if(value == null)
    {
      setValue(FROMDATE, "");
    }
    else
    {
      setValue(FROMDATE, new java.text.SimpleDateFormat(com.runwaysdk.constants.Constants.DATE_FORMAT).format(value));
    }
  }
  
  public boolean isFromDateWritable()
  {
    return isWritable(FROMDATE);
  }
  
  public boolean isFromDateReadable()
  {
    return isReadable(FROMDATE);
  }
  
  public boolean isFromDateModified()
  {
    return isModified(FROMDATE);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeDateMdDTO getFromDateMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeDateMdDTO) getAttributeDTO(FROMDATE).getAttributeMdDTO();
  }
  
  public String getKeyName()
  {
    return getValue(KEYNAME);
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
  
  public boolean isKeyNameWritable()
  {
    return isWritable(KEYNAME);
  }
  
  public boolean isKeyNameReadable()
  {
    return isReadable(KEYNAME);
  }
  
  public boolean isKeyNameModified()
  {
    return isModified(KEYNAME);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeCharacterMdDTO getKeyNameMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeCharacterMdDTO) getAttributeDTO(KEYNAME).getAttributeMdDTO();
  }
  
  public java.util.Date getLastUpdateDate()
  {
    return com.runwaysdk.constants.MdAttributeDateTimeUtil.getTypeSafeValue(getValue(LASTUPDATEDATE));
  }
  
  public boolean isLastUpdateDateWritable()
  {
    return isWritable(LASTUPDATEDATE);
  }
  
  public boolean isLastUpdateDateReadable()
  {
    return isReadable(LASTUPDATEDATE);
  }
  
  public boolean isLastUpdateDateModified()
  {
    return isModified(LASTUPDATEDATE);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeDateTimeMdDTO getLastUpdateDateMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeDateTimeMdDTO) getAttributeDTO(LASTUPDATEDATE).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.SingleActorDTO getLastUpdatedBy()
  {
    if(getValue(LASTUPDATEDBY) == null || getValue(LASTUPDATEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.SingleActorDTO.get(getRequest(), getValue(LASTUPDATEDBY));
    }
  }
  
  public String getLastUpdatedById()
  {
    return getValue(LASTUPDATEDBY);
  }
  
  public boolean isLastUpdatedByWritable()
  {
    return isWritable(LASTUPDATEDBY);
  }
  
  public boolean isLastUpdatedByReadable()
  {
    return isReadable(LASTUPDATEDBY);
  }
  
  public boolean isLastUpdatedByModified()
  {
    return isModified(LASTUPDATEDBY);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getLastUpdatedByMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(LASTUPDATEDBY).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.UsersDTO getLockedBy()
  {
    if(getValue(LOCKEDBY) == null || getValue(LOCKEDBY).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.UsersDTO.get(getRequest(), getValue(LOCKEDBY));
    }
  }
  
  public String getLockedById()
  {
    return getValue(LOCKEDBY);
  }
  
  public boolean isLockedByWritable()
  {
    return isWritable(LOCKEDBY);
  }
  
  public boolean isLockedByReadable()
  {
    return isReadable(LOCKEDBY);
  }
  
  public boolean isLockedByModified()
  {
    return isModified(LOCKEDBY);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getLockedByMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(LOCKEDBY).getAttributeMdDTO();
  }
  
  public com.runwaysdk.geodashboard.gis.persist.DashboardMapDTO getMap()
  {
    if(getValue(MAP) == null || getValue(MAP).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.geodashboard.gis.persist.DashboardMapDTO.get(getRequest(), getValue(MAP));
    }
  }
  
  public String getMapId()
  {
    return getValue(MAP);
  }
  
  public void setMap(com.runwaysdk.geodashboard.gis.persist.DashboardMapDTO value)
  {
    if(value == null)
    {
      setValue(MAP, "");
    }
    else
    {
      setValue(MAP, value.getId());
    }
  }
  
  public boolean isMapWritable()
  {
    return isWritable(MAP);
  }
  
  public boolean isMapReadable()
  {
    return isReadable(MAP);
  }
  
  public boolean isMapModified()
  {
    return isModified(MAP);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getMapMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(MAP).getAttributeMdDTO();
  }
  
  public com.runwaysdk.system.ActorDTO getOwner()
  {
    if(getValue(OWNER) == null || getValue(OWNER).trim().equals(""))
    {
      return null;
    }
    else
    {
      return com.runwaysdk.system.ActorDTO.get(getRequest(), getValue(OWNER));
    }
  }
  
  public String getOwnerId()
  {
    return getValue(OWNER);
  }
  
  public void setOwner(com.runwaysdk.system.ActorDTO value)
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
  
  public boolean isOwnerWritable()
  {
    return isWritable(OWNER);
  }
  
  public boolean isOwnerReadable()
  {
    return isReadable(OWNER);
  }
  
  public boolean isOwnerModified()
  {
    return isModified(OWNER);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeReferenceMdDTO getOwnerMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeReferenceMdDTO) getAttributeDTO(OWNER).getAttributeMdDTO();
  }
  
  public Long getSeq()
  {
    return com.runwaysdk.constants.MdAttributeLongUtil.getTypeSafeValue(getValue(SEQ));
  }
  
  public boolean isSeqWritable()
  {
    return isWritable(SEQ);
  }
  
  public boolean isSeqReadable()
  {
    return isReadable(SEQ);
  }
  
  public boolean isSeqModified()
  {
    return isModified(SEQ);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeNumberMdDTO getSeqMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeNumberMdDTO) getAttributeDTO(SEQ).getAttributeMdDTO();
  }
  
  public String getSiteMaster()
  {
    return getValue(SITEMASTER);
  }
  
  public boolean isSiteMasterWritable()
  {
    return isWritable(SITEMASTER);
  }
  
  public boolean isSiteMasterReadable()
  {
    return isReadable(SITEMASTER);
  }
  
  public boolean isSiteMasterModified()
  {
    return isModified(SITEMASTER);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeCharacterMdDTO getSiteMasterMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeCharacterMdDTO) getAttributeDTO(SITEMASTER).getAttributeMdDTO();
  }
  
  public java.util.Date getToDate()
  {
    return com.runwaysdk.constants.MdAttributeDateUtil.getTypeSafeValue(getValue(TODATE));
  }
  
  public void setToDate(java.util.Date value)
  {
    if(value == null)
    {
      setValue(TODATE, "");
    }
    else
    {
      setValue(TODATE, new java.text.SimpleDateFormat(com.runwaysdk.constants.Constants.DATE_FORMAT).format(value));
    }
  }
  
  public boolean isToDateWritable()
  {
    return isWritable(TODATE);
  }
  
  public boolean isToDateReadable()
  {
    return isReadable(TODATE);
  }
  
  public boolean isToDateModified()
  {
    return isModified(TODATE);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeDateMdDTO getToDateMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeDateMdDTO) getAttributeDTO(TODATE).getAttributeMdDTO();
  }
  
  public final com.runwaysdk.geodashboard.DashboardDTO clone(java.lang.String name)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{name};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "clone", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardDTO) getRequest().invokeMethod(_metadata, this, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.DashboardDTO clone(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id, java.lang.String name)
  {
    String[] _declaredTypes = new String[]{"java.lang.String", "java.lang.String"};
    Object[] _parameters = new Object[]{id, name};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "clone", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.DashboardDTO create(com.runwaysdk.constants.ClientRequestIF clientRequest, com.runwaysdk.geodashboard.DashboardDTO dto)
  {
    String[] _declaredTypes = new String[]{"com.runwaysdk.geodashboard.Dashboard"};
    Object[] _parameters = new Object[]{dto};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "create", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final java.lang.String[] getCategoryInputSuggestions(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String mdAttributeId, java.lang.String universalId, java.lang.String aggregationVal, java.lang.String text, java.lang.Integer limit)
  {
    String[] _declaredTypes = new String[]{"java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String", "java.lang.Integer"};
    Object[] _parameters = new Object[]{mdAttributeId, universalId, aggregationVal, text, limit};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getCategoryInputSuggestions", _declaredTypes);
    return (java.lang.String[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.ontology.ClassifierDTO[] getClassifierRoots(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String mdAttributeId)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{mdAttributeId};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getClassifierRoots", _declaredTypes);
    return (com.runwaysdk.geodashboard.ontology.ClassifierDTO[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.ontology.ClassifierDTO[] getClassifierSuggestions(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String mdAttributeId, java.lang.String text, java.lang.Integer limit)
  {
    String[] _declaredTypes = new String[]{"java.lang.String", "java.lang.String", "java.lang.Integer"};
    Object[] _parameters = new Object[]{mdAttributeId, text, limit};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getClassifierSuggestions", _declaredTypes);
    return (com.runwaysdk.geodashboard.ontology.ClassifierDTO[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.business.ValueQueryDTO getGeoEntitySuggestions(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String text, java.lang.Integer limit)
  {
    String[] _declaredTypes = new String[]{"java.lang.String", "java.lang.Integer"};
    Object[] _parameters = new Object[]{text, limit};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getGeoEntitySuggestions", _declaredTypes);
    return (com.runwaysdk.business.ValueQueryDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.DashboardQueryDTO getSortedDashboards(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    String[] _declaredTypes = new String[]{};
    Object[] _parameters = new Object[]{};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getSortedDashboards", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardQueryDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public final com.runwaysdk.system.metadata.MdClassDTO[] getSortedTypes()
  {
    String[] _declaredTypes = new String[]{};
    Object[] _parameters = new Object[]{};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getSortedTypes", _declaredTypes);
    return (com.runwaysdk.system.metadata.MdClassDTO[]) getRequest().invokeMethod(_metadata, this, _parameters);
  }
  
  public static final com.runwaysdk.system.metadata.MdClassDTO[] getSortedTypes(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{id};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getSortedTypes", _declaredTypes);
    return (com.runwaysdk.system.metadata.MdClassDTO[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final java.lang.String[] getTextSuggestions(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String mdAttributeId, java.lang.String text, java.lang.Integer limit)
  {
    String[] _declaredTypes = new String[]{"java.lang.String", "java.lang.String", "java.lang.Integer"};
    Object[] _parameters = new Object[]{mdAttributeId, text, limit};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "getTextSuggestions", _declaredTypes);
    return (java.lang.String[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  @SuppressWarnings("unchecked")
  public java.util.List<? extends com.runwaysdk.geodashboard.MetadataWrapperDTO> getAllMetadata()
  {
    return (java.util.List<? extends com.runwaysdk.geodashboard.MetadataWrapperDTO>) getRequest().getChildren(this.getId(), com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public static java.util.List<? extends com.runwaysdk.geodashboard.MetadataWrapperDTO> getAllMetadata(com.runwaysdk.constants.ClientRequestIF clientRequestIF, String id)
  {
    return (java.util.List<? extends com.runwaysdk.geodashboard.MetadataWrapperDTO>) clientRequestIF.getChildren(id, com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public java.util.List<? extends com.runwaysdk.geodashboard.DashboardMetadataDTO> getAllMetadataRelationships()
  {
    return (java.util.List<? extends com.runwaysdk.geodashboard.DashboardMetadataDTO>) getRequest().getChildRelationships(this.getId(), com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  @SuppressWarnings("unchecked")
  public static java.util.List<? extends com.runwaysdk.geodashboard.DashboardMetadataDTO> getAllMetadataRelationships(com.runwaysdk.constants.ClientRequestIF clientRequestIF, String id)
  {
    return (java.util.List<? extends com.runwaysdk.geodashboard.DashboardMetadataDTO>) clientRequestIF.getChildRelationships(id, com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  public com.runwaysdk.geodashboard.DashboardMetadataDTO addMetadata(com.runwaysdk.geodashboard.MetadataWrapperDTO child)
  {
    return (com.runwaysdk.geodashboard.DashboardMetadataDTO) getRequest().addChild(this.getId(), child.getId(), com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  public static com.runwaysdk.geodashboard.DashboardMetadataDTO addMetadata(com.runwaysdk.constants.ClientRequestIF clientRequestIF, String id, com.runwaysdk.geodashboard.MetadataWrapperDTO child)
  {
    return (com.runwaysdk.geodashboard.DashboardMetadataDTO) clientRequestIF.addChild(id, child.getId(), com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  public void removeMetadata(com.runwaysdk.geodashboard.DashboardMetadataDTO relationship)
  {
    getRequest().deleteChild(relationship.getId());
  }
  
  public static void removeMetadata(com.runwaysdk.constants.ClientRequestIF clientRequestIF, com.runwaysdk.geodashboard.DashboardMetadataDTO relationship)
  {
    clientRequestIF.deleteChild(relationship.getId());
  }
  
  public void removeAllMetadata()
  {
    getRequest().deleteChildren(this.getId(), com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  public static void removeAllMetadata(com.runwaysdk.constants.ClientRequestIF clientRequestIF, String id)
  {
    clientRequestIF.deleteChildren(id, com.runwaysdk.geodashboard.DashboardMetadataDTO.CLASS);
  }
  
  public static com.runwaysdk.geodashboard.DashboardDTO get(com.runwaysdk.constants.ClientRequestIF clientRequest, String id)
  {
    com.runwaysdk.business.EntityDTO dto = (com.runwaysdk.business.EntityDTO)clientRequest.get(id);
    
    return (com.runwaysdk.geodashboard.DashboardDTO) dto;
  }
  
  public void apply()
  {
    if(isNewInstance())
    {
      getRequest().createBusiness(this);
    }
    else
    {
      getRequest().update(this);
    }
  }
  public void delete()
  {
    getRequest().delete(this.getId());
  }
  
  public static com.runwaysdk.geodashboard.DashboardQueryDTO getAllInstances(com.runwaysdk.constants.ClientRequestIF clientRequest, String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    return (com.runwaysdk.geodashboard.DashboardQueryDTO) clientRequest.getAllInstances(com.runwaysdk.geodashboard.DashboardDTO.CLASS, sortAttribute, ascending, pageSize, pageNumber);
  }
  
  public void lock()
  {
    getRequest().lock(this);
  }
  
  public static com.runwaysdk.geodashboard.DashboardDTO lock(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{id};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "lock", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public void unlock()
  {
    getRequest().unlock(this);
  }
  
  public static com.runwaysdk.geodashboard.DashboardDTO unlock(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{id};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.DashboardDTO.CLASS, "unlock", _declaredTypes);
    return (com.runwaysdk.geodashboard.DashboardDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
}
