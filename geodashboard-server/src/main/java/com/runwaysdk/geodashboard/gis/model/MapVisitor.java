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
package com.runwaysdk.geodashboard.gis.model;

import com.runwaysdk.geodashboard.gis.model.condition.And;
import com.runwaysdk.geodashboard.gis.model.condition.Category;
import com.runwaysdk.geodashboard.gis.model.condition.Equal;
import com.runwaysdk.geodashboard.gis.model.condition.Gradient;
import com.runwaysdk.geodashboard.gis.model.condition.GreaterThan;
import com.runwaysdk.geodashboard.gis.model.condition.GreaterThanOrEqual;
import com.runwaysdk.geodashboard.gis.model.condition.IsBetween;
import com.runwaysdk.geodashboard.gis.model.condition.IsLike;
import com.runwaysdk.geodashboard.gis.model.condition.IsNull;
import com.runwaysdk.geodashboard.gis.model.condition.LessThan;
import com.runwaysdk.geodashboard.gis.model.condition.LessThanOrEqual;
import com.runwaysdk.geodashboard.gis.model.condition.NotEqual;
import com.runwaysdk.geodashboard.gis.model.condition.Or;

public interface MapVisitor
{
  public void visit(Map component);

  public void visit(ThematicLayer component);
  
  public void visit(ReferenceLayer component);

  public void visit(Style style);

  public void visit(ThematicStyle component);

  public void visit(Or component);

  public void visit(And component);

  public void visit(Equal component);

  public void visit(NotEqual component);

  public void visit(GreaterThan component);

  public void visit(GreaterThanOrEqual component);

  public void visit(LessThan component);

  public void visit(LessThanOrEqual component);

  public void visit(IsLike component);

  public void visit(IsNull component);

  public void visit(IsBetween component);

  public void visit(Gradient component);

  public void visit(Category component);
}
