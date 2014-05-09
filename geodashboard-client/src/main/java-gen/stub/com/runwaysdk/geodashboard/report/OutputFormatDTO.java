package com.runwaysdk.geodashboard.report;

/**
 * This class is generated automatically.
 * DO NOT MAKE CHANGES TO IT - THEY WILL BE OVERWRITTEN
 *
 * @author Autogenerated by RunwaySDK
 */
@com.runwaysdk.business.ClassSignature(hash = 2144689404)
public enum OutputFormatDTO implements com.runwaysdk.business.EnumerationDTOIF, com.runwaysdk.generation.loader.Reloadable
{
  HTML(),
  
  PDF();
  
  public final static String CLASS = "com.runwaysdk.geodashboard.report.OutputFormat";
  
  
  public com.runwaysdk.geodashboard.report.OutputFormatMasterDTO item(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    return (com.runwaysdk.geodashboard.report.OutputFormatMasterDTO) clientRequest.getEnumeration(com.runwaysdk.geodashboard.report.OutputFormatDTO.CLASS, this.name());
  }
  
  @java.lang.SuppressWarnings("unchecked")
  public static java.util.List<com.runwaysdk.geodashboard.report.OutputFormatMasterDTO> items(com.runwaysdk.constants.ClientRequestIF clientRequest, OutputFormatDTO ... items)
  {
    java.lang.String[] itemNames = new java.lang.String[items.length];
    for(int i=0; i<items.length; i++)
    {
      itemNames[i] = items[i].name();
    }
    return (java.util.List<com.runwaysdk.geodashboard.report.OutputFormatMasterDTO>) clientRequest.getEnumerations(com.runwaysdk.geodashboard.report.OutputFormatDTO.CLASS, itemNames);
  }
  
  @java.lang.SuppressWarnings("unchecked")
  public static java.util.List<com.runwaysdk.geodashboard.report.OutputFormatMasterDTO> allItems(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    return (java.util.List<com.runwaysdk.geodashboard.report.OutputFormatMasterDTO>) clientRequest.getAllEnumerations(com.runwaysdk.geodashboard.report.OutputFormatDTO.CLASS);
  }
  
  public java.lang.String getName()
  {
    return this.name();
  }
}
