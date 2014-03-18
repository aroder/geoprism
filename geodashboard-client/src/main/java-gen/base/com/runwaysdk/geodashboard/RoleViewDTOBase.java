package com.runwaysdk.geodashboard;

@com.runwaysdk.business.ClassSignature(hash = 839155843)
public abstract class RoleViewDTOBase extends com.runwaysdk.business.ViewDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.RoleView";
  private static final long serialVersionUID = 839155843;
  
  protected RoleViewDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(clientRequest);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static java.lang.String ASSIGNED = "assigned";
  public static java.lang.String DISPLAYLABEL = "displayLabel";
  public static java.lang.String ID = "id";
  public static java.lang.String ROLEID = "roleId";
  public Boolean getAssigned()
  {
    return com.runwaysdk.constants.MdAttributeBooleanUtil.getTypeSafeValue(getValue(ASSIGNED));
  }
  
  public void setAssigned(Boolean value)
  {
    if(value == null)
    {
      setValue(ASSIGNED, "");
    }
    else
    {
      setValue(ASSIGNED, java.lang.Boolean.toString(value));
    }
  }
  
  public boolean isAssignedWritable()
  {
    return isWritable(ASSIGNED);
  }
  
  public boolean isAssignedReadable()
  {
    return isReadable(ASSIGNED);
  }
  
  public boolean isAssignedModified()
  {
    return isModified(ASSIGNED);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeBooleanMdDTO getAssignedMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeBooleanMdDTO) getAttributeDTO(ASSIGNED).getAttributeMdDTO();
  }
  
  public String getDisplayLabel()
  {
    return getValue(DISPLAYLABEL);
  }
  
  public void setDisplayLabel(String value)
  {
    if(value == null)
    {
      setValue(DISPLAYLABEL, "");
    }
    else
    {
      setValue(DISPLAYLABEL, value);
    }
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
  
  public final com.runwaysdk.transport.metadata.AttributeTextMdDTO getDisplayLabelMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeTextMdDTO) getAttributeDTO(DISPLAYLABEL).getAttributeMdDTO();
  }
  
  public String getRoleId()
  {
    return getValue(ROLEID);
  }
  
  public void setRoleId(String value)
  {
    if(value == null)
    {
      setValue(ROLEID, "");
    }
    else
    {
      setValue(ROLEID, value);
    }
  }
  
  public boolean isRoleIdWritable()
  {
    return isWritable(ROLEID);
  }
  
  public boolean isRoleIdReadable()
  {
    return isReadable(ROLEID);
  }
  
  public boolean isRoleIdModified()
  {
    return isModified(ROLEID);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeCharacterMdDTO getRoleIdMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeCharacterMdDTO) getAttributeDTO(ROLEID).getAttributeMdDTO();
  }
  
  public static final com.runwaysdk.geodashboard.RoleViewDTO[] getAdminRoles(com.runwaysdk.constants.ClientRequestIF clientRequest, com.runwaysdk.geodashboard.GeodashboardUserDTO user)
  {
    String[] _declaredTypes = new String[]{"com.runwaysdk.geodashboard.GeodashboardUser"};
    Object[] _parameters = new Object[]{user};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.RoleViewDTO.CLASS, "getAdminRoles", _declaredTypes);
    return (com.runwaysdk.geodashboard.RoleViewDTO[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.RoleViewDTO[] getDashboardRoles(com.runwaysdk.constants.ClientRequestIF clientRequest, com.runwaysdk.geodashboard.GeodashboardUserDTO user)
  {
    String[] _declaredTypes = new String[]{"com.runwaysdk.geodashboard.GeodashboardUser"};
    Object[] _parameters = new Object[]{user};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.RoleViewDTO.CLASS, "getDashboardRoles", _declaredTypes);
    return (com.runwaysdk.geodashboard.RoleViewDTO[]) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static RoleViewDTO get(com.runwaysdk.constants.ClientRequestIF clientRequest, String id)
  {
    com.runwaysdk.business.ViewDTO dto = (com.runwaysdk.business.ViewDTO)clientRequest.get(id);
    
    return (RoleViewDTO) dto;
  }
  
  public void apply()
  {
    if(isNewInstance())
    {
      getRequest().createSessionComponent(this);
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
  
}