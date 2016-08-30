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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/geoprism.tld" prefix="gdb"%>

<div>
  <div ng-if="show">
    <div class="modal-backdrop fade in"></div>
    <div id="modal-div" style="display: block;" class="modal fade in" role="dialog" aria-hidden="false" data-backdrop="static" data-keyboard="false">
    <dl>      
      <form class="modal-form" name="ctrl.form">    
        <div class="modal-dialog">
          <div class="modal-content" show-on-ready>
            <div class="heading">
              <h1><gdb:localize key="dataset.editTooltip"/></h1>
            </div>      
            <fieldset>            
              <div class="row-holder" ng-show="errors.length > 0 && show">
                <div class="label-holder">
                </div>      
                <div class="holder">
                  <div class="alert alertbox" ng-repeat="error in errors track by $index">
                    <p >{{error}}</p>
                  </div>
                </div>
              </div>            
              <div class="row-holder">
                <div class="label-holder">
                  <label><gdb:localize key="category.icon.label"/></label>
                </div>          
                <div class="holder" >
                  <span class="text">
                    <input type="text" ng-model="dataset.label" name="label" required>
                  </span>
                </div>
              </div>
              <div class="row-holder">
                <div class="label-holder">
                  <label><gdb:localize key="dataset.attributes"/></label>
                </div>          
                <div class="holder" >
                  <table class="list-table table table-bordered table-striped">
                    <tbody>
                      <tr ng-repeat="attribute in dataset.attributes" class="fade-ngRepeat-item">
                        <td class="submit-form">
                          <dl>
                            <dd>
                              <input type="text" name="{{attribute.label}}" ng-model="attribute.label" required></input>
                            </dd>
                            <dd ng-if="attribute.type == 'Category'">
                              <gdb:localize key="dataset.category"/> <a ng-click="ctrl.open(attribute.root)">{{attribute.root.label}}</a>
                            </dd>
                          </dl>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>      
              <div class="row-holder" fire-on-ready>
                <div class="label-holder">
                </div>                    
                <div class="holder">
                  <div class="button-holder">
                    <input type="button" value="<gdb:localize key="dataset.cancel"/>" class="btn btn-default" ng-click="ctrl.cancel()" />              
                    <input type="button" value="<gdb:localize key="dataset.submit"/>" class="btn btn-primary" ng-click="ctrl.apply()" ng-disabled="ctrl.form.$invalid" />
                  </div>
                </div>
              </div>
            </fieldset>
          </div>
        </div>
      </form>
    </dl>   
    </div>
  </div>
  <category-modal></category-modal>
</div>
