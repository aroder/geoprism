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
package net.geoprism.report;

@com.runwaysdk.business.ClassSignature(hash = 403871365)
public abstract class UnsupportedDrillThroughFormatExceptionDTOBase extends com.runwaysdk.business.SmartExceptionDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "net.geoprism.report.UnsupportedDrillThroughFormatException";
  private static final long serialVersionUID = 403871365;
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequestIF)
  {
    super(clientRequestIF);
  }
  
  protected UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.business.ExceptionDTO exceptionDTO)
  {
    super(exceptionDTO);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale)
  {
    super(clientRequest, locale);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.String developerMessage)
  {
    super(clientRequest, locale, developerMessage);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.Throwable cause)
  {
    super(clientRequest, locale, cause);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.String developerMessage, java.lang.Throwable cause)
  {
    super(clientRequest, locale, developerMessage, cause);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.Throwable cause)
  {
    super(clientRequest, cause);
  }
  
  public UnsupportedDrillThroughFormatExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String msg, java.lang.Throwable cause)
  {
    super(clientRequest, msg, cause);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static java.lang.String ID = "id";
  public static java.lang.String OUTPUTFORMAT = "outputFormat";
  public String getOutputFormat()
  {
    return getValue(OUTPUTFORMAT);
  }
  
  public void setOutputFormat(String value)
  {
    if(value == null)
    {
      setValue(OUTPUTFORMAT, "");
    }
    else
    {
      setValue(OUTPUTFORMAT, value);
    }
  }
  
  public boolean isOutputFormatWritable()
  {
    return isWritable(OUTPUTFORMAT);
  }
  
  public boolean isOutputFormatReadable()
  {
    return isReadable(OUTPUTFORMAT);
  }
  
  public boolean isOutputFormatModified()
  {
    return isModified(OUTPUTFORMAT);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeTextMdDTO getOutputFormatMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeTextMdDTO) getAttributeDTO(OUTPUTFORMAT).getAttributeMdDTO();
  }
  
  /**
   * Overrides java.lang.Throwable#getMessage() to retrieve the localized
   * message from the exceptionDTO, instead of from a class variable.
   */
  public String getMessage()
  {
    java.lang.String template = super.getMessage();
    
    template = template.replace("{id}", this.getId().toString());
    template = template.replace("{outputFormat}", this.getOutputFormat().toString());
    
    return template;
  }
  
}
