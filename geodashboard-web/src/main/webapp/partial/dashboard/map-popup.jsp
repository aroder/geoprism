<%--

    Copyright (c) 2015 TerraFrame, Inc. All rights reserved.

    This file is part of Runway SDK(tm).

    Runway SDK(tm) is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    Runway SDK(tm) is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with Runway SDK(tm).  If not, see <http://www.gnu.org/licenses/>.

--%>

<%@ taglib uri="/WEB-INF/tlds/geodashboard.tld" prefix="gdb"%>

<div ng-cloak ng-style="{'top':feature.y + 'px', 'left':feature.x + 'px', 'position':'absolute', 'z-index':50}" class="ol-overlay-container">
  <div id="popup" class="ol-popup">
    <a href="#" ng-click="ctrl.close()" id="popup-closer" class="ol-popup-closer"></a>
    <h3 class="popup-heading">{{feature.layerDisplayName}}</h3>
    <table class="table">
      <thead class="popup-table-heading">
        <tr>
          <th><gdb:localize key="com.runwaysdk.geodashboard.DynamicMap.location"/></th>  
          <th><gdb:localize key="com.runwaysdk.geodashboard.DynamicMap.aggregationMethod"/></th> 
          <th><gdb:localize key="com.runwaysdk.geodashboard.DynamicMap.aggregateValue"/></th> 
        </tr>  
      </thead>
      <tbody>  
        <tr> 
          <td>{{feature.featureDisplayName}}</td>  
          <td>{{feature.aggregationMethod}}</td>  
          <td>{{feature.attributeValue}}</td>  
        </tr>
        <tr ng-if="ctrl.canEditData()"> 
          <td colspan="3">
            <a href="#" ng-click="ctrl.editData()" class="edit-feature"><gdb:localize key="com.runwaysdk.geodashboard.DynamicMap.editFeature"/></a>
          </td>  
        </tr>
      </tbody>
    </table>
  </div>         
</div>