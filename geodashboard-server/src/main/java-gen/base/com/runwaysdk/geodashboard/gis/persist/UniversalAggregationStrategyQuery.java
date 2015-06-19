package com.runwaysdk.geodashboard.gis.persist;

@com.runwaysdk.business.ClassSignature(hash = 1167533400)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to UniversalAggregationStrategy.java
 *
 * @author Autogenerated by RunwaySDK
 */
public  class UniversalAggregationStrategyQuery extends com.runwaysdk.geodashboard.gis.persist.AggregationStrategyQuery
 implements com.runwaysdk.generation.loader.Reloadable
{

  public UniversalAggregationStrategyQuery(com.runwaysdk.query.QueryFactory componentQueryFactory)
  {
    super(componentQueryFactory);
    if (this.getComponentQuery() == null)
    {
      com.runwaysdk.business.BusinessQuery businessQuery = componentQueryFactory.businessQuery(this.getClassType());

       this.setBusinessQuery(businessQuery);
    }
  }

  public UniversalAggregationStrategyQuery(com.runwaysdk.query.ValueQuery valueQuery)
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
    return com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.CLASS;
  }
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal()
  {
    return getUniversal(null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias)
  {

    com.runwaysdk.dataaccess.MdAttributeDAOIF mdAttributeIF = this.getComponentQuery().getMdAttributeROfromMap(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL);

    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.getComponentQuery().internalAttributeFactory(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL, mdAttributeIF, this, alias, null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias, String displayLabel)
  {

    com.runwaysdk.dataaccess.MdAttributeDAOIF mdAttributeIF = this.getComponentQuery().getMdAttributeROfromMap(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL);

    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.getComponentQuery().internalAttributeFactory(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL, mdAttributeIF, this, alias, displayLabel);

  }
  protected com.runwaysdk.query.AttributeReference referenceFactory( com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias,  com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String userDefinedAlias, String userDefinedDisplayLabel)
  {
    String name = mdAttributeIF.definesAttribute();
    
    if (name.equals(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL)) 
    {
       return new com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReference((com.runwaysdk.dataaccess.MdAttributeRefDAOIF)mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
    else 
    {
      return super.referenceFactory(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
  }

  /**  
   * Returns an iterator of Business objects that match the query criteria specified
   * on this query object. 
   * @return iterator of Business objects that match the query criteria specified
   * on this query object.
   */
  public com.runwaysdk.query.OIterator<? extends UniversalAggregationStrategy> getIterator()
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
    return new com.runwaysdk.business.BusinessIterator<UniversalAggregationStrategy>(this.getComponentQuery().getMdEntityIF(), columnInfoMap, results);
  }


/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface UniversalAggregationStrategyQueryReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.geodashboard.gis.persist.AggregationStrategyQuery.AggregationStrategyQueryReferenceIF
  {

    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal();
    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias);
    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias, String displayLabel);

    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy universalAggregationStrategy);

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy universalAggregationStrategy);

  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class UniversalAggregationStrategyQueryReference extends com.runwaysdk.geodashboard.gis.persist.AggregationStrategyQuery.AggregationStrategyQueryReference
 implements UniversalAggregationStrategyQueryReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public UniversalAggregationStrategyQueryReference(com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }


    public com.runwaysdk.query.BasicCondition EQ(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy universalAggregationStrategy)
    {
      if(universalAggregationStrategy == null) return this.EQ((java.lang.String)null);
      return this.EQ(universalAggregationStrategy.getId());
    }

    public com.runwaysdk.query.BasicCondition NE(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy universalAggregationStrategy)
    {
      if(universalAggregationStrategy == null) return this.NE((java.lang.String)null);
      return this.NE(universalAggregationStrategy.getId());
    }

  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal()
  {
    return getUniversal(null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias)
  {
    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.get(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL, alias, null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias, String displayLabel)
  {
    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.get(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL,  alias, displayLabel);

  }
  protected com.runwaysdk.query.AttributeReference referenceFactory( com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias,  com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String userDefinedAlias, String userDefinedDisplayLabel)
  {
    String name = mdAttributeIF.definesAttribute();
    
    if (name.equals(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL)) 
    {
       return new com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReference((com.runwaysdk.dataaccess.MdAttributeRefDAOIF)mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
    else 
    {
      return super.referenceFactory(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
  }

  }

/**
 * Interface that masks all type unsafe query methods and defines all type safe methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public interface UniversalAggregationStrategyQueryMultiReferenceIF extends com.runwaysdk.generation.loader.Reloadable, com.runwaysdk.geodashboard.gis.persist.AggregationStrategyQuery.AggregationStrategyQueryMultiReferenceIF
  {

    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal();
    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias);
    public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias, String displayLabel);

    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy);
    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy);
    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy);
    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy);
    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy);
  }

/**
 * Implements type safe query methods.
 * This type is used when a join is performed on this class as a reference.
 **/
  public static class UniversalAggregationStrategyQueryMultiReference extends com.runwaysdk.geodashboard.gis.persist.AggregationStrategyQuery.AggregationStrategyQueryMultiReference
 implements UniversalAggregationStrategyQueryMultiReferenceIF
, com.runwaysdk.generation.loader.Reloadable
  {

  public UniversalAggregationStrategyQueryMultiReference(com.runwaysdk.dataaccess.MdAttributeMultiReferenceDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias, String mdMultiReferenceTableName, com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String alias, String displayLabel)
  {
    super(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, mdMultiReferenceTableName, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, alias, displayLabel);

  }



    public com.runwaysdk.query.Condition containsAny(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy)  {

      String[] itemIdArray = new String[universalAggregationStrategy.length]; 

      for (int i=0; i<universalAggregationStrategy.length; i++)
      {
        itemIdArray[i] = universalAggregationStrategy[i].getId();
      }

      return this.containsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAny(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy)  {

      String[] itemIdArray = new String[universalAggregationStrategy.length]; 

      for (int i=0; i<universalAggregationStrategy.length; i++)
      {
        itemIdArray[i] = universalAggregationStrategy[i].getId();
      }

      return this.notContainsAny(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsAll(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy)  {

      String[] itemIdArray = new String[universalAggregationStrategy.length]; 

      for (int i=0; i<universalAggregationStrategy.length; i++)
      {
        itemIdArray[i] = universalAggregationStrategy[i].getId();
      }

      return this.containsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition notContainsAll(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy)  {

      String[] itemIdArray = new String[universalAggregationStrategy.length]; 

      for (int i=0; i<universalAggregationStrategy.length; i++)
      {
        itemIdArray[i] = universalAggregationStrategy[i].getId();
      }

      return this.notContainsAll(itemIdArray);
  }

    public com.runwaysdk.query.Condition containsExactly(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy ... universalAggregationStrategy)  {

      String[] itemIdArray = new String[universalAggregationStrategy.length]; 

      for (int i=0; i<universalAggregationStrategy.length; i++)
      {
        itemIdArray[i] = universalAggregationStrategy[i].getId();
      }

      return this.containsExactly(itemIdArray);
  }
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal()
  {
    return getUniversal(null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias)
  {
    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.get(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL, alias, null);

  }
 
  public com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF getUniversal(String alias, String displayLabel)
  {
    return (com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReferenceIF)this.get(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL,  alias, displayLabel);

  }
  protected com.runwaysdk.query.AttributeReference referenceFactory( com.runwaysdk.dataaccess.MdAttributeRefDAOIF mdAttributeIF, String attributeNamespace, String definingTableName, String definingTableAlias,  com.runwaysdk.dataaccess.MdBusinessDAOIF referenceMdBusinessIF, String referenceTableAlias, com.runwaysdk.query.ComponentQuery rootQuery, java.util.Set<com.runwaysdk.query.Join> tableJoinSet, String userDefinedAlias, String userDefinedDisplayLabel)
  {
    String name = mdAttributeIF.definesAttribute();
    
    if (name.equals(com.runwaysdk.geodashboard.gis.persist.UniversalAggregationStrategy.UNIVERSAL)) 
    {
       return new com.runwaysdk.system.gis.geo.UniversalQuery.UniversalQueryReference((com.runwaysdk.dataaccess.MdAttributeRefDAOIF)mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
    else 
    {
      return super.referenceFactory(mdAttributeIF, attributeNamespace, definingTableName, definingTableAlias, referenceMdBusinessIF, referenceTableAlias, rootQuery, tableJoinSet, userDefinedAlias, userDefinedDisplayLabel);
    }
  }

  }
}