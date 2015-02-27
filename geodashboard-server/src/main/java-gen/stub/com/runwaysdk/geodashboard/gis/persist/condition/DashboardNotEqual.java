package com.runwaysdk.geodashboard.gis.persist.condition;

import com.runwaysdk.dataaccess.MdAttributeReferenceDAOIF;
import com.runwaysdk.dataaccess.MdBusinessDAOIF;
import com.runwaysdk.generation.loader.Reloadable;
import com.runwaysdk.geodashboard.gis.model.MapVisitor;
import com.runwaysdk.geodashboard.gis.model.condition.NotEqual;
import com.runwaysdk.geodashboard.ontology.Classifier;
import com.runwaysdk.geodashboard.ontology.ClassifierAllPathsTableQuery;
import com.runwaysdk.query.Attribute;
import com.runwaysdk.query.AttributeCharacter;
import com.runwaysdk.query.AttributeDate;
import com.runwaysdk.query.AttributeNumber;
import com.runwaysdk.query.AttributeReference;
import com.runwaysdk.query.QueryFactory;
import com.runwaysdk.query.ValueQuery;

public class DashboardNotEqual extends DashboardNotEqualBase implements Reloadable, NotEqual
{
  private static final long serialVersionUID = -2096281098;

  public DashboardNotEqual()
  {
    super();
  }

  @Override
  public void restrictQuery(QueryFactory factory, ValueQuery query, Attribute attr)
  {
    if (attr instanceof AttributeNumber)
    {
      query.AND( ( (AttributeNumber) attr ).NE(this.getComparisonValue()));
    }
    else if (attr instanceof AttributeDate)
    {
      query.AND( ( (AttributeDate) attr ).NE(this.getComparisonValueAsDate()));
    }
    else if (attr instanceof AttributeCharacter)
    {
      query.AND( ( (AttributeCharacter) attr ).NE(this.getComparisonValue()));
    }
    else if (attr instanceof AttributeReference)
    {
      AttributeReference attributeTerm = (AttributeReference) attr;
      MdAttributeReferenceDAOIF mdAttributeTerm = (MdAttributeReferenceDAOIF) attributeTerm.getMdAttributeIF();
      MdBusinessDAOIF mdBusinessDAO = mdAttributeTerm.getReferenceMdBusinessDAO();

      if (mdBusinessDAO.definesType().equals(Classifier.CLASS))
      {
        ClassifierAllPathsTableQuery allPathQuery = new ClassifierAllPathsTableQuery(factory);

        allPathQuery.WHERE(allPathQuery.getParentTerm().NE(this.getComparisonValue()));

        query.AND(attributeTerm.EQ(allPathQuery.getChildTerm()));
      }
    }
  }

  @Override
  public void accepts(MapVisitor visitor)
  {
    visitor.visit(this);
  }

}