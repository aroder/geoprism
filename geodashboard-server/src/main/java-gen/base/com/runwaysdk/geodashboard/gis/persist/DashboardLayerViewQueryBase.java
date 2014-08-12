package com.runwaysdk.geodashboard.gis.persist;

@com.runwaysdk.business.ClassSignature(hash = -1441901649)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to DashboardLayerView.java
 *
 * @author Autogenerated by RunwaySDK
 */
public  abstract  class DashboardLayerViewQueryBase extends com.runwaysdk.query.GeneratedViewQuery
 implements com.runwaysdk.generation.loader.Reloadable
{

  public DashboardLayerViewQueryBase(com.runwaysdk.query.QueryFactory componentQueryFactory)
  {
    super(componentQueryFactory);
  }

  public DashboardLayerViewQueryBase(com.runwaysdk.query.QueryFactory componentQueryFactory, com.runwaysdk.query.ViewQueryBuilder viewQueryBuilder)
  {
    super(componentQueryFactory, viewQueryBuilder);
  }
  public String getClassType()
  {
    return com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.CLASS;
  }
  public com.runwaysdk.query.SelectableChar getId()
  {
    return getId(null);

  }
 
  public com.runwaysdk.query.SelectableChar getId(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.ID, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getId(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.ID, alias, displayLabel);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerId()
  {
    return getLayerId(null);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerId(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.LAYERID, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerId(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.LAYERID, alias, displayLabel);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerName()
  {
    return getLayerName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.LAYERNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getLayerName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.LAYERNAME, alias, displayLabel);

  }
 
  public com.runwaysdk.query.SelectableChar getSldName()
  {
    return getSldName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getSldName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.SLDNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getSldName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.SLDNAME, alias, displayLabel);

  }
 
  public com.runwaysdk.query.SelectableChar getViewName()
  {
    return getViewName(null);

  }
 
  public com.runwaysdk.query.SelectableChar getViewName(String alias)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.VIEWNAME, alias, null);

  }
 
  public com.runwaysdk.query.SelectableChar getViewName(String alias, String displayLabel)
  {
    return (com.runwaysdk.query.SelectableChar)this.getSelectable(com.runwaysdk.geodashboard.gis.persist.DashboardLayerView.VIEWNAME, alias, displayLabel);

  }
 
  /**  
   * Returns an iterator of Business objects that match the query criteria specified
   * on this query object. 
   * @return iterator of Business objects that match the query criteria specified
   * on this query object.
   */
  @java.lang.SuppressWarnings("unchecked")
  public com.runwaysdk.query.OIterator<? extends DashboardLayerView> getIterator()
  {
    com.runwaysdk.query.ValueIterator valueIterator;
    if (_pageSize != null && _pageNumber != null)
    {
      valueIterator = (com.runwaysdk.query.ValueIterator<com.runwaysdk.dataaccess.ValueObject>)this.getComponentQuery().getIterator(_pageSize, _pageNumber);
    }
    else
    {
      valueIterator = (com.runwaysdk.query.ValueIterator<com.runwaysdk.dataaccess.ValueObject>)this.getComponentQuery().getIterator();
    }
    return new com.runwaysdk.query.ViewIterator<DashboardLayerView>(this.getMdClassIF(), valueIterator);
  }

}
