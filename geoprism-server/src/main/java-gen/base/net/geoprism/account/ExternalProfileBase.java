package net.geoprism.account;

@com.runwaysdk.business.ClassSignature(hash = -1624733877)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to ExternalProfile.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class ExternalProfileBase extends com.runwaysdk.system.SingleActor implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "net.geoprism.account.ExternalProfile";
  public static java.lang.String DISPLAYNAME = "displayName";
  public static java.lang.String REMOTEID = "remoteId";
  public static java.lang.String SERVERID = "serverId";
  public static java.lang.String USERNAME = "username";
  private static final long serialVersionUID = -1624733877;
  
  public ExternalProfileBase()
  {
    super();
  }
  
  public String getDisplayName()
  {
    return getValue(DISPLAYNAME);
  }
  
  public void validateDisplayName()
  {
    this.validateAttribute(DISPLAYNAME);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getDisplayNameMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.account.ExternalProfile.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(DISPLAYNAME);
  }
  
  public void setDisplayName(String value)
  {
    if(value == null)
    {
      setValue(DISPLAYNAME, "");
    }
    else
    {
      setValue(DISPLAYNAME, value);
    }
  }
  
  public String getRemoteId()
  {
    return getValue(REMOTEID);
  }
  
  public void validateRemoteId()
  {
    this.validateAttribute(REMOTEID);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getRemoteIdMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.account.ExternalProfile.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(REMOTEID);
  }
  
  public void setRemoteId(String value)
  {
    if(value == null)
    {
      setValue(REMOTEID, "");
    }
    else
    {
      setValue(REMOTEID, value);
    }
  }
  
  public String getServerId()
  {
    return getValue(SERVERID);
  }
  
  public void validateServerId()
  {
    this.validateAttribute(SERVERID);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getServerIdMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.account.ExternalProfile.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(SERVERID);
  }
  
  public void setServerId(String value)
  {
    if(value == null)
    {
      setValue(SERVERID, "");
    }
    else
    {
      setValue(SERVERID, value);
    }
  }
  
  public String getUsername()
  {
    return getValue(USERNAME);
  }
  
  public void validateUsername()
  {
    this.validateAttribute(USERNAME);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getUsernameMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.account.ExternalProfile.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(USERNAME);
  }
  
  public void setUsername(String value)
  {
    if(value == null)
    {
      setValue(USERNAME, "");
    }
    else
    {
      setValue(USERNAME, value);
    }
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public static ExternalProfileQuery getAllInstances(String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    ExternalProfileQuery query = new ExternalProfileQuery(new com.runwaysdk.query.QueryFactory());
    com.runwaysdk.business.Entity.getAllInstances(query, sortAttribute, ascending, pageSize, pageNumber);
    return query;
  }
  
  public static ExternalProfile get(String id)
  {
    return (ExternalProfile) com.runwaysdk.business.Business.get(id);
  }
  
  public static ExternalProfile getByKey(String key)
  {
    return (ExternalProfile) com.runwaysdk.business.Business.get(CLASS, key);
  }
  
  public static java.lang.String login(java.lang.String serverId, java.lang.String code, java.lang.String locales)
  {
    String msg = "This method should never be invoked.  It should be overwritten in net.geoprism.account.ExternalProfile.java";
    throw new com.runwaysdk.dataaccess.metadata.ForbiddenMethodException(msg);
  }
  
  public static ExternalProfile lock(java.lang.String id)
  {
    ExternalProfile _instance = ExternalProfile.get(id);
    _instance.lock();
    
    return _instance;
  }
  
  public static ExternalProfile unlock(java.lang.String id)
  {
    ExternalProfile _instance = ExternalProfile.get(id);
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
