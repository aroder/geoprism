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
<%@ taglib uri="/WEB-INF/tlds/geoprism.tld" prefix="gdb"%>
<%@ taglib uri="http://jawr.net/tags" prefix="jwr" %>

<head>

  <gdb:localize var="page_title" key="dataset.title"/>

  <!-- Datasets Javascript -->
  <jwr:script src="/bundles/category-icon.js" useRandomParam="false"/>

  <script type="text/javascript">${js}</script>
  
</head>


<div id="app-container" class="container" ng-app="category-icon" ng-controller="CategoryIconController as ctrl">

  <h2> <gdb:localize key="category.icon.title"/> </h2>
  
  <div ng-if="errors.length > 0" class="error-container">
    <div class="label-holder">
      <strong style="color: #8c0000;"><gdb:localize key='dashboard.errorsLabel'/></strong>
    </div>
    <div class="holder">
      <div ng-repeat="error in errors">
        <p class="error-message">{{error}}</p>
      </div>
    </div>
  </div>
  
  <form class="modal-form" name="form">
    <div class="modal-dialog">
      <div class="modal-content">
        <fieldset>
          <div class="row-holder">
            <div class="holder" >
              <label ><gdb:localize key="category.icon.label"/></label>
              <span class="text">
                <input type="text" ng-model="icon.label" name="label" required>
              </span>
            </div>
          </div>
          <div class="row-holder">
            <div class="holder" >
              <label ><gdb:localize key="category.icon.file"/></label>
              <span class="text">
                <input type="file" ng-show="!icon.file" ngf-select ng-model="icon.file" name="file" accept="image/*" ngf-max-size="2MB" required ngf-model-invalid="errorFile">
                
                <img style="width:64px;height:64px;" ng-show="form.file.$valid" ngf-thumbnail="icon.file" class="thumb">
                <button ng-click="icon.file = null" ng-show="icon.file"><gdb:localize key="category.icon.remove"/></button>                
              </span>
            </div>
          </div>
          <div class="row-holder">
            <div class="holder">
              <div class="button-holder">
                <input type="button" value="<gdb:localize key="dashboardViewer.ok"/>" class="btn btn-primary" ng-click="ctrl.create()" ng-disabled="form.$invalid" />
              </div>
            </div>
          </div>
        </fieldset>  
      </div>
    </div>
  </form>
  
  <div ng-if="icons === null"><gdb:localize key='dataset.loadingData'/></div>

  <table id="manage-datasets-table" class="table table-bordered table-striped">        
    <tbody>
      <tr ng-repeat="icon in icons">
        <td class="button-column">
          <a href="#" class="fa fa-trash-o ico-remove" ng-click="ctrl.remove(icon)" title="<gdb:localize key="dataset.removeTooltip"/>"></a>           
        </td>
        <td>{{ icon.label }}</td>
      </tr>
    </tbody>    
  </table>
</div>

<script type="text/javascript">
  com.runwaysdk.ui.Manager.setFactory("JQuery");
</script>