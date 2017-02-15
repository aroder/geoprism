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

<div *ngIf="active" style="position: absolute; bottom: 50%; width: 100%; left: 0px;">
  <div class="confirm-overlay ui-widget-overlay ui-front"></div>
  <div class="confirm-modal ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable com-runwaysdk-ui-factory-jquery-Dialog com-runwaysdk-ui-factory-runway-Widget ui-dialog-buttons" tabindex="-1" role="dialog">
    <div class="ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix">
      <span id="ui-id-1" class="ui-dialog-title"><gdb:localize key="dashboard.warning"/></span>
    </div>
    <div class="confirm-text ui-dialog-content ui-widget-content">
      {{message}}
    </div>
    
    <div class="ui-dialog-buttonpane ui-widget-content ui-helper-clearfix">
      <div class="ui-dialog-buttonset">
        <button type="button" (click)="confirm($event)" class="btn btn-primary btn ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" role="button" aria-disabled="false" style="padding: 4px 18px;">
          <span class="ui-button-text"><gdb:localize key="dashboard.Ok"/></span>
        </button>
        <button type="button" (click)="cancel($event)" class="btn btn ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" role="button" aria-disabled="false" style="padding: 4px 18px;">
          <span class="ui-button-text"><gdb:localize key="dashboard.Cancel"/></span>
        </button>
      </div>
    </div>
  </div>  
</div>