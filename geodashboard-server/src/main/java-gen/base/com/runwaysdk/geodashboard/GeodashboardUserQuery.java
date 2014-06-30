package com.runwaysdk.geodashboard;

@com.runwaysdk.business.ClassSignature(hash = 1307483921)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to GeodashboardUser.java
 *
 * @author Autogenerated by RunwaySDK
 */
public  class GeodashboardUserQuery extends com.runwaysdk.system.UsersQuery
 implements com.runwaysdk.generation.loader.Reloadable
{

  public GeodashboardUserQuery(com.runwaysdk.query.QueryFactory componentQueryFactory)
  {
    super(componentQueryFactory);
    if (this.getComponentQuery() == null)
    {
      com.runwaysdk.business.BusinessQuery businessQuery = componentQueryFactory.businessQuery(this.getClassType());

       this.setBusinessQuery(businessQuery);
    }
  }

  public GeodashboardUserQuery(com.runwaysdk.query.ValueQuery valueQuery)
  {
    super(valueQuery);
    if (this.getComponentQuery() == null)
    {
      com.runwaysdk.business.BusinessQuery businessQuery = new com.runwaysdk.business.BusinessQuery(valueQuery, this.getClassType());

       this.setBusinessQuery(businessQuery);
    }
  }

  public String getClassType()
  {
    return com.runwaysdk.geodashboard.GeodashboardUser.CLASS;
  }
  public com.runwaysdk.query.SelectableChar getEmail()
  {
    return getEmail(null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getFirstName()
  {
    return getFirstName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getLastName()
  {
    return getLastName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getPhoneNumber()
  {
    return getPhoneNumber(null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getComponentQuery().get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, displayLabel);

  }
  /**  
   * Returns an iterator of Business objects that match the query criteria specified
   * on this query object. 
   * @return iterator of Business objects that match the query criteria specified
   * on this query object.
   */
  public com.runwaysdk.query.OIterator<? extends GeodashboardUser> getIterator()
  {
    this.checkNotUsedInValueQuery();
    String sqlStmt;
    if (_limit != null && _skip != null)
    {
      sqlStmt = this.getComponentQuery().getSQL(_limit, _skip);
    }
    else
    {
      sqlStmt = this.getComponentQuery().getSQL();
    }
    java.util.Map<String, com.runwaysdk.query.ColumnInfo> columnInfoMap = this.getComponentQuery().getColumnInfoMap();

    java.sql.ResultSet results = com.runwaysdk.dataaccess.database.Database.query(sqlStmt);
    return new com.runwaysdk.business.BusinessIterator<GeodashboardUser>(this.getComponentQuery().getMdEntityIF(), columnInfoMap, results);
  }


/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface GeodashboardUserQueryReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.system.UsersQuery.UsersQueryReferenceIF
  {

    public com.runwaysdk.query.SelectableChar getEmail();
    public com.runwaysdk.query.SelectableChar getEmail(String alias);
    public com.runwaysdk.query.SelectableChar getEmail(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getFirstName();
    public com.runwaysdk.query.SelectableChar getFirstName(String alias);
    public com.runwaysdk.query.SelectableChar getFirstName(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getLastName();
    public com.runwaysdk.query.SelectableChar getLastName(String alias);
    public com.runwaysdk.query.SelectableChar getLastName(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getPhoneNumber();
    public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias);
    public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias, String displayLabel);

    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.GeodashboardUser geodashboardUser);

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.GeodashboardUser geodashboardUser);

  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class GeodashboardUserQueryReference extends com.runwaysdk.system.UsersQuery.UsersQueryReference
 implements GeodashboardUserQueryReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public GeodashboardUserQueryReference(com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }


    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.GeodashboardUser geodashboardUser)
    {
      if(geodashboardUser == null) return this.EQ((java.lang.String)null);
      return this.EQ(geodashboardUser.getId());
    }

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.GeodashboardUser geodashboardUser)
    {
      if(geodashboardUser == null) return this.NE((java.lang.String)null);
      return this.NE(geodashboardUser.getId());
    }

  public com.runwaysdk.query.SelectableChar getEmail()
  {
    return getEmail(null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getFirstName()
  {
    return getFirstName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getLastName()
  {
    return getLastName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getPhoneNumber()
  {
    return getPhoneNumber(null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, displayLabel);

  }
  }

/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface GeodashboardUserQueryMultiReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.system.UsersQuery.UsersQueryMultiReferenceIF
  {

    public com.runwaysdk.query.SelectableChar getEmail();
    public com.runwaysdk.query.SelectableChar getEmail(String alias);
    public com.runwaysdk.query.SelectableChar getEmail(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getFirstName();
    public com.runwaysdk.query.SelectableChar getFirstName(String alias);
    public com.runwaysdk.query.SelectableChar getFirstName(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getLastName();
    public com.runwaysdk.query.SelectableChar getLastName(String alias);
    public com.runwaysdk.query.SelectableChar getLastName(String alias, String displayLabel);
    public com.runwaysdk.query.SelectableChar getPhoneNumber();
    public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias);
    public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias, String displayLabel);

    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser);
    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser);
    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser);
    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser);
    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser);
  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class GeodashboardUserQueryMultiReference extends com.runwaysdk.system.UsersQuery.UsersQueryMultiReference
 implements GeodashboardUserQueryMultiReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public GeodashboardUserQueryMultiReference(com.runwaysdk.dataaccess.MdAttributeMultiReferenceDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, String mdMultiReferenceTableName, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, mdMultiReferenceTableName, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }



    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser)  {

      String[] itemIdArray = new String[geodashboardUser.length]; 

      for (int i=0; i<geodashboardUser.length; i++)
      {
        itemIdArray[i] = geodashboardUser[i].getId();
      }

      return this.containsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser)  {

      String[] itemIdArray = new String[geodashboardUser.length]; 

      for (int i=0; i<geodashboardUser.length; i++)
      {
        itemIdArray[i] = geodashboardUser[i].getId();
      }

      return this.notContainsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser)  {

      String[] itemIdArray = new String[geodashboardUser.length]; 

      for (int i=0; i<geodashboardUser.length; i++)
      {
        itemIdArray[i] = geodashboardUser[i].getId();
      }

      return this.containsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser)  {

      String[] itemIdArray = new String[geodashboardUser.length]; 

      for (int i=0; i<geodashboardUser.length; i++)
      {
        itemIdArray[i] = geodashboardUser[i].getId();
      }

      return this.notContainsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.GeodashboardUser ... geodashboardUser)  {

      String[] itemIdArray = new String[geodashboardUser.length]; 

      for (int i=0; i<geodashboardUser.length; i++)
      {
        itemIdArray[i] = geodashboardUser[i].getId();
      }

      return this.containsExactly(itemIdArray);
  }
  public com.runwaysdk.query.SelectableChar getEmail()
  {
    return getEmail(null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getEmail(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.EMAIL, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getFirstName()
  {
    return getFirstName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getFirstName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.FIRSTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getLastName()
  {
    return getLastName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getLastName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.LASTNAME, alias, displayLabel);

  }
  public com.runwaysdk.query.SelectableChar getPhoneNumber()
  {
    return getPhoneNumber(null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getPhoneNumber(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.get(com.runwaysdk.geodashboard.GeodashboardUser.PHONENUMBER, alias, displayLabel);

  }
  }
}
