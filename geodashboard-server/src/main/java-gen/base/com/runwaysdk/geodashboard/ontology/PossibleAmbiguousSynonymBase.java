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
package com.runwaysdk.geodashboard.ontology;

@com.runwaysdk.business.ClassSignature(hash = -499939234)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to PossibleAmbiguousSynonym.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class PossibleAmbiguousSynonymBase extends com.runwaysdk.business.Warning implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.ontology.PossibleAmbiguousSynonym";
  public static java.lang.String CLASSIFIERLABEL = "classifierLabel";
  public static java.lang.String ID = "id";
  public static java.lang.String SYNONYMLABEL = "synonymLabel";
  private static final long serialVersionUID = -499939234;
  
  public PossibleAmbiguousSynonymBase()
  {
    super();
  }
  
  public String getClassifierLabel()
  {
    return getValue(CLASSIFIERLABEL);
  }
  
  public void validateClassifierLabel()
  {
    this.validateAttribute(CLASSIFIERLABEL);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeDAOIF getClassifierLabelMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.ontology.PossibleAmbiguousSynonym.CLASS);
    return mdClassIF.definesAttribute(CLASSIFIERLABEL);
  }
  
  public void setClassifierLabel(String value)
  {
    if(value == null)
    {
      setValue(CLASSIFIERLABEL, "");
    }
    else
    {
      setValue(CLASSIFIERLABEL, value);
    }
  }
  
  public String getId()
  {
    return getValue(ID);
  }
  
  public void validateId()
  {
    this.validateAttribute(ID);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeDAOIF getIdMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.ontology.PossibleAmbiguousSynonym.CLASS);
    return mdClassIF.definesAttribute(ID);
  }
  
  public String getSynonymLabel()
  {
    return getValue(SYNONYMLABEL);
  }
  
  public void validateSynonymLabel()
  {
    this.validateAttribute(SYNONYMLABEL);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeDAOIF getSynonymLabelMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(com.runwaysdk.geodashboard.ontology.PossibleAmbiguousSynonym.CLASS);
    return mdClassIF.definesAttribute(SYNONYMLABEL);
  }
  
  public void setSynonymLabel(String value)
  {
    if(value == null)
    {
      setValue(SYNONYMLABEL, "");
    }
    else
    {
      setValue(SYNONYMLABEL, value);
    }
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public java.lang.String localize(java.util.Locale locale)
  {
    java.lang.String message = super.localize(locale);
    message = replace(message, "{classifierLabel}", this.getClassifierLabel());
    message = replace(message, "{id}", this.getId());
    message = replace(message, "{synonymLabel}", this.getSynonymLabel());
    return message;
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
