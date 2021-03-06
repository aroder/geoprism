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
package net.geoprism;

@com.runwaysdk.business.ClassSignature(hash = 456046804)
/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 * Custom business logic should be added to DateParseException.java
 *
 * @author Autogenerated by RunwaySDK
 */
public abstract class DateParseExceptionBase extends com.runwaysdk.business.SmartException implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "net.geoprism.DateParseException";
  public static java.lang.String ID = "id";
  public static java.lang.String INPUT = "input";
  public static java.lang.String PATTERN = "pattern";
  private static final long serialVersionUID = 456046804;
  
  public DateParseExceptionBase()
  {
    super();
  }
  
  public DateParseExceptionBase(java.lang.String developerMessage)
  {
    super(developerMessage);
  }
  
  public DateParseExceptionBase(java.lang.String developerMessage, java.lang.Throwable cause)
  {
    super(developerMessage, cause);
  }
  
  public DateParseExceptionBase(java.lang.Throwable cause)
  {
    super(cause);
  }
  
  public String getId()
  {
    return getValue(ID);
  }
  
  public void validateId()
  {
    this.validateAttribute(ID);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF getIdMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.DateParseException.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeCharacterDAOIF)mdClassIF.definesAttribute(ID);
  }
  
  public String getInput()
  {
    return getValue(INPUT);
  }
  
  public void validateInput()
  {
    this.validateAttribute(INPUT);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeTextDAOIF getInputMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.DateParseException.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeTextDAOIF)mdClassIF.definesAttribute(INPUT);
  }
  
  public void setInput(String value)
  {
    if(value == null)
    {
      setValue(INPUT, "");
    }
    else
    {
      setValue(INPUT, value);
    }
  }
  
  public String getPattern()
  {
    return getValue(PATTERN);
  }
  
  public void validatePattern()
  {
    this.validateAttribute(PATTERN);
  }
  
  public static com.runwaysdk.dataaccess.MdAttributeTextDAOIF getPatternMd()
  {
    com.runwaysdk.dataaccess.MdClassDAOIF mdClassIF = com.runwaysdk.dataaccess.metadata.MdClassDAO.getMdClassDAO(net.geoprism.DateParseException.CLASS);
    return (com.runwaysdk.dataaccess.MdAttributeTextDAOIF)mdClassIF.definesAttribute(PATTERN);
  }
  
  public void setPattern(String value)
  {
    if(value == null)
    {
      setValue(PATTERN, "");
    }
    else
    {
      setValue(PATTERN, value);
    }
  }
  
  protected String getDeclaredType()
  {
    return CLASS;
  }
  
  public java.lang.String localize(java.util.Locale locale)
  {
    java.lang.String message = super.localize(locale);
    message = replace(message, "{id}", this.getId());
    message = replace(message, "{input}", this.getInput());
    message = replace(message, "{pattern}", this.getPattern());
    return message;
  }
  
}
