package com.runwaysdk.geodashboard.gis.persist.condition;

@com.runwaysdk.business.ClassSignature(hash = -682919136)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to DashboardLessThanOrEqual.java
 *
 * @author Autogenerated by RunwaySDK
 */
public  class DashboardLessThanOrEqualQuery extends com.runwaysdk.geodashboard.gis.persist.condition.DashboardPrimitiveQuery
 implements com.runwaysdk.generation.loader.Reloadable
{

  public DashboardLessThanOrEqualQuery(com.runwaysdk.query.QueryFactory componentQueryFactory)
  {
    super(componentQueryFactory);
    if (this.getComponentQuery() == null)
    {
      com.runwaysdk.business.BusinessQuery businessQuery = componentQueryFactory.businessQuery(this.getClassType());

       this.setBusinessQuery(businessQuery);
    }
  }

  public DashboardLessThanOrEqualQuery(com.runwaysdk.query.ValueQuery valueQuery)
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
    return com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.CLASS;
  }
  /**  
   * Returns an iterator of Business objects that match the query criteria specified
   * on this query object. 
   * @return iterator of Business objects that match the query criteria specified
   * on this query object.
   */
  public com.runwaysdk.query.OIterator<? extends DashboardLessThanOrEqual> getIterator()
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
    return new com.runwaysdk.business.BusinessIterator<DashboardLessThanOrEqual>(this.getComponentQuery().getMdEntityIF(), columnInfoMap, results);
  }


/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface DashboardLessThanOrEqualQueryReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.geodashboard.gis.persist.condition.DashboardPrimitiveQuery.DashboardPrimitiveQueryReferenceIF
  {


    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual dashboardLessThanOrEqual);

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual dashboardLessThanOrEqual);

  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class DashboardLessThanOrEqualQueryReference extends com.runwaysdk.geodashboard.gis.persist.condition.DashboardPrimitiveQuery.DashboardPrimitiveQueryReference
 implements DashboardLessThanOrEqualQueryReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public DashboardLessThanOrEqualQueryReference(com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }


    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual dashboardLessThanOrEqual)
    {
      if(dashboardLessThanOrEqual == null) return this.EQ((java.lang.String)null);
      return this.EQ(dashboardLessThanOrEqual.getId());
    }

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual dashboardLessThanOrEqual)
    {
      if(dashboardLessThanOrEqual == null) return this.NE((java.lang.String)null);
      return this.NE(dashboardLessThanOrEqual.getId());
    }

  }

/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface DashboardLessThanOrEqualQueryMultiReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.geodashboard.gis.persist.condition.DashboardPrimitiveQuery.DashboardPrimitiveQueryMultiReferenceIF
  {


    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual);
    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual);
    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual);
    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual);
    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual);
  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class DashboardLessThanOrEqualQueryMultiReference extends com.runwaysdk.geodashboard.gis.persist.condition.DashboardPrimitiveQuery.DashboardPrimitiveQueryMultiReference
 implements DashboardLessThanOrEqualQueryMultiReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public DashboardLessThanOrEqualQueryMultiReference(com.runwaysdk.dataaccess.MdAttributeMultiReferenceDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, String mdMultiReferenceTableName, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, mdMultiReferenceTableName, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }



    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual)  {

      String[] itemIdArray = new String[dashboardLessThanOrEqual.length]; 

      for (int i=0; i<dashboardLessThanOrEqual.length; i++)
      {
        itemIdArray[i] = dashboardLessThanOrEqual[i].getId();
      }

      return this.containsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual)  {

      String[] itemIdArray = new String[dashboardLessThanOrEqual.length]; 

      for (int i=0; i<dashboardLessThanOrEqual.length; i++)
      {
        itemIdArray[i] = dashboardLessThanOrEqual[i].getId();
      }

      return this.notContainsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual)  {

      String[] itemIdArray = new String[dashboardLessThanOrEqual.length]; 

      for (int i=0; i<dashboardLessThanOrEqual.length; i++)
      {
        itemIdArray[i] = dashboardLessThanOrEqual[i].getId();
      }

      return this.containsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual)  {

      String[] itemIdArray = new String[dashboardLessThanOrEqual.length]; 

      for (int i=0; i<dashboardLessThanOrEqual.length; i++)
      {
        itemIdArray[i] = dashboardLessThanOrEqual[i].getId();
      }

      return this.notContainsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual ... dashboardLessThanOrEqual)  {

      String[] itemIdArray = new String[dashboardLessThanOrEqual.length]; 

      for (int i=0; i<dashboardLessThanOrEqual.length; i++)
      {
        itemIdArray[i] = dashboardLessThanOrEqual[i].getId();
      }

      return this.containsExactly(itemIdArray);
  }
  }
}