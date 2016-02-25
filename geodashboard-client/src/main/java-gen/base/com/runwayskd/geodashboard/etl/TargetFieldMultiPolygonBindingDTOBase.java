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
package com.runwayskd.geodashboard.etl;

@com.runwaysdk.business.ClassSignature(hash = -928423464)
public abstract class TargetFieldMultiPolygonBindingDTOBase extends com.runwayskd.geodashboard.etl.TargetFieldCoordinateBindingDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBinding";
  private static final long serialVersionUID = -928423464;
  
  protected TargetFieldMultiPolygonBindingDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(clientRequest);
  }
  
  /**
  * Copy Constructor: Duplicates the values and attributes of the given BusinessDTO into a new DTO.
  * 
  * @param businessDTO The BusinessDTO to duplicate
  * @param clientRequest The clientRequest this DTO should use to communicate with the server.
  */
  protected TargetFieldMultiPolygonBindingDTOBase(com.runwaysdk.business.BusinessDTO businessDTO, com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(businessDTO, clientRequest);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO get(com.runwaysdk.constants.ClientRequestIF clientRequest, String id)
  {
    com.runwaysdk.business.EntityDTO dto = (com.runwaysdk.business.EntityDTO)clientRequest.get(id);
    
    return (com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO) dto;
  }
  
  public void apply()
  {
    if(isNewInstance())
    {
      getRequest().createBusiness(this);
    }
    else
    {
      getRequest().update(this);
    }
  }
  public void delete()
  {
    getRequest().delete(this.getId());
  }
  
  public static com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingQueryDTO getAllInstances(com.runwaysdk.constants.ClientRequestIF clientRequest, String sortAttribute, Boolean ascending, Integer pageSize, Integer pageNumber)
  {
    return (com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingQueryDTO) clientRequest.getAllInstances(com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO.CLASS, sortAttribute, ascending, pageSize, pageNumber);
  }
  
  public void lock()
  {
    getRequest().lock(this);
  }
  
  public static com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO lock(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{id};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO.CLASS, "lock", _declaredTypes);
    return (com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public void unlock()
  {
    getRequest().unlock(this);
  }
  
  public static com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO unlock(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String id)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{id};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO.CLASS, "unlock", _declaredTypes);
    return (com.runwayskd.geodashboard.etl.TargetFieldMultiPolygonBindingDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
}
