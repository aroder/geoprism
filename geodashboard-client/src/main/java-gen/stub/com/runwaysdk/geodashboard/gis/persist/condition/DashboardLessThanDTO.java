package com.runwaysdk.geodashboard.gis.persist.condition;

public class DashboardLessThanDTO extends DashboardLessThanDTOBase
 implements com.runwaysdk.generation.loader.Reloadable{
  private static final long serialVersionUID = 1515107677;
  
  public DashboardLessThanDTO(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(clientRequest);
  }
  
  /**
  * Copy Constructor: Duplicates the values and attributes of the given BusinessDTO into a new DTO.
  * 
  * @param businessDTO The BusinessDTO to duplicate
  * @param clientRequest The clientRequest this DTO should use to communicate with the server.
  */
  protected DashboardLessThanDTO(com.runwaysdk.business.BusinessDTO businessDTO, com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(businessDTO, clientRequest);
  }
  
}
