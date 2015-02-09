package com.runwaysdk.geodashboard.gis.persist.condition;

import com.runwaysdk.geodashboard.gis.model.MapVisitor;
import com.runwaysdk.geodashboard.gis.model.condition.LessThan;
import com.runwaysdk.query.Attribute;
import com.runwaysdk.query.AttributeCharacter;
import com.runwaysdk.query.AttributeDate;
import com.runwaysdk.query.AttributeNumber;
import com.runwaysdk.query.QueryFactory;
import com.runwaysdk.query.ValueQuery;

public class DashboardLessThan extends DashboardLessThanBase implements com.runwaysdk.generation.loader.Reloadable, LessThan
{
  private static final long serialVersionUID = -1060927779;

  public DashboardLessThan()
  {
    super();
  }

  @Override
  public void restrictQuery(QueryFactory factory, ValueQuery query, Attribute attr)
  {
    if (attr instanceof AttributeNumber)
    {
      query.AND( ( (AttributeNumber) attr ).LT(this.getComparisonValue()));
    }
    else if (attr instanceof AttributeDate)
    {
      query.AND( ( (AttributeDate) attr ).LT(this.getComparisonValueAsDate()));
    }
    else if (attr instanceof AttributeCharacter)
    {
      query.AND( ( (AttributeDate) attr ).EQ(this.getComparisonValue()));
    }
  }

  @Override
  public void accepts(MapVisitor visitor)
  {
    visitor.visit(this);
  }

}
