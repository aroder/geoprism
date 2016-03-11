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
package net.geoprism.data.etl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.runwaysdk.business.Business;
import com.runwaysdk.business.BusinessFacade;

public class TargetContext implements TargetContextIF
{
  private Map<String, TargetDefinitionIF> definitions;

  public TargetContext()
  {
    this.definitions = new HashMap<String, TargetDefinitionIF>();
  }

  public void addDefinition(TargetDefinitionIF definition)
  {
    this.definitions.put(definition.getSourceType(), definition);
  }

  public TargetDefinitionIF getDefinition(String sourceType)
  {
    return this.definitions.get(sourceType);
  }

  @Override
  public String getType(String sourceType)
  {
    TargetDefinitionIF definition = this.getDefinition(sourceType);

    return definition.getTargetType();
  }

  @Override
  public Business newBusiness(String sourceType)
  {
    TargetDefinitionIF definition = this.getDefinition(sourceType);

    if (definition != null)
    {
      String type = definition.getTargetType();

      Business business = BusinessFacade.newBusiness(type);

      return business;
    }

    return null;
  }

  @Override
  public List<TargetFieldIF> getFields(String sourceType)
  {
    TargetDefinitionIF definition = this.getDefinition(sourceType);

    return definition.getFields();
  }

  @Override
  public List<TargetDefinitionIF> getDefinitions()
  {
    return new LinkedList<TargetDefinitionIF>(this.definitions.values());
  }

  public void persist()
  {
    List<TargetDefinitionIF> definitions = this.getDefinitions();

    for (TargetDefinitionIF definition : definitions)
    {
      definition.persist();
    }
  }
}
