package com.runwaysdk.geodashboard.parse;

@com.runwaysdk.business.ClassSignature(hash = -100929624)
public abstract class DateParseExceptionDTOBase extends com.runwaysdk.business.SmartExceptionDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.parse.DateParseException";
  private static final long serialVersionUID = -100929624;
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequestIF)
  {
    super(clientRequestIF);
  }
  
  protected DateParseExceptionDTOBase(com.runwaysdk.business.ExceptionDTO exceptionDTO)
  {
    super(exceptionDTO);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale)
  {
    super(clientRequest, locale);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.String developerMessage)
  {
    super(clientRequest, locale, developerMessage);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.Throwable cause)
  {
    super(clientRequest, locale, cause);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.util.Locale locale, java.lang.String developerMessage, java.lang.Throwable cause)
  {
    super(clientRequest, locale, developerMessage, cause);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.Throwable cause)
  {
    super(clientRequest, cause);
  }
  
  public DateParseExceptionDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String msg, java.lang.Throwable cause)
  {
    super(clientRequest, msg, cause);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static java.lang.String ID = "id";
  public static java.lang.String INPUT = "input";
  public static java.lang.String PATTERN = "pattern";
  public String getInput()
  {
    return getValue(INPUT);
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
  
  public boolean isInputWritable()
  {
    return isWritable(INPUT);
  }
  
  public boolean isInputReadable()
  {
    return isReadable(INPUT);
  }
  
  public boolean isInputModified()
  {
    return isModified(INPUT);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeTextMdDTO getInputMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeTextMdDTO) getAttributeDTO(INPUT).getAttributeMdDTO();
  }
  
  public String getPattern()
  {
    return getValue(PATTERN);
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
  
  public boolean isPatternWritable()
  {
    return isWritable(PATTERN);
  }
  
  public boolean isPatternReadable()
  {
    return isReadable(PATTERN);
  }
  
  public boolean isPatternModified()
  {
    return isModified(PATTERN);
  }
  
  public final com.runwaysdk.transport.metadata.AttributeTextMdDTO getPatternMd()
  {
    return (com.runwaysdk.transport.metadata.AttributeTextMdDTO) getAttributeDTO(PATTERN).getAttributeMdDTO();
  }
  
  /**
   * Overrides java.lang.Throwable#getMessage() to retrieve the localized
   * message from the exceptionDTO, instead of from a class variable.
   */
  public String getMessage()
  {
    java.lang.String template = super.getMessage();
    
    template = template.replace("{id}", this.getId().toString());
    template = template.replace("{input}", this.getInput().toString());
    template = template.replace("{pattern}", this.getPattern().toString());
    
    return template;
  }
  
}