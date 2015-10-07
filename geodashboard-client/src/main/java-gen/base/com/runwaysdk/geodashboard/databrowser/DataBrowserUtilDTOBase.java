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
package com.runwaysdk.geodashboard.databrowser;

@com.runwaysdk.business.ClassSignature(hash = 1649833896)
public abstract class DataBrowserUtilDTOBase extends com.runwaysdk.business.UtilDTO implements com.runwaysdk.generation.loader.Reloadable
{
  public final static String CLASS = "com.runwaysdk.geodashboard.databrowser.DataBrowserUtil";
  private static final long serialVersionUID = 1649833896;
  
  protected DataBrowserUtilDTOBase(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    super(clientRequest);
  }
  
  protected java.lang.String getDeclaredType()
  {
    return CLASS;
  }
  
  public static java.lang.String ID = "id";
  public static final void deleteData(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String type)
  {
    String[] _declaredTypes = new String[]{"java.lang.String"};
    Object[] _parameters = new Object[]{type};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.databrowser.DataBrowserUtilDTO.CLASS, "deleteData", _declaredTypes);
    clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.databrowser.MetadataTypeQueryDTO getDefaultTypes(com.runwaysdk.constants.ClientRequestIF clientRequest)
  {
    String[] _declaredTypes = new String[]{};
    Object[] _parameters = new Object[]{};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.databrowser.DataBrowserUtilDTO.CLASS, "getDefaultTypes", _declaredTypes);
    return (com.runwaysdk.geodashboard.databrowser.MetadataTypeQueryDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static final com.runwaysdk.geodashboard.databrowser.MetadataTypeQueryDTO getTypes(com.runwaysdk.constants.ClientRequestIF clientRequest, java.lang.String[] packages, java.lang.String[] types)
  {
    String[] _declaredTypes = new String[]{"[Ljava.lang.String;", "[Ljava.lang.String;"};
    Object[] _parameters = new Object[]{packages, types};
    com.runwaysdk.business.MethodMetaData _metadata = new com.runwaysdk.business.MethodMetaData(com.runwaysdk.geodashboard.databrowser.DataBrowserUtilDTO.CLASS, "getTypes", _declaredTypes);
    return (com.runwaysdk.geodashboard.databrowser.MetadataTypeQueryDTO) clientRequest.invokeMethod(_metadata, null, _parameters);
  }
  
  public static DataBrowserUtilDTO get(com.runwaysdk.constants.ClientRequestIF clientRequest, String id)
  {
    com.runwaysdk.business.UtilDTO dto = (com.runwaysdk.business.UtilDTO)clientRequest.get(id);
    
    return (DataBrowserUtilDTO) dto;
  }
  
  public void apply()
  {
    if(isNewInstance())
    {
      getRequest().createSessionComponent(this);
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
  
}
