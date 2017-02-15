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

<form #form="ngForm" name="form" class="modal-form">
  <div>
    <fieldset>
      <section class="form-container">



<div>
  <div class="wide-holder">
    <div class="row-holder">    
      <div class="inline-value">
        <label><gdb:localize key="dataUploader.locationContext"/></label>   
        <div class="label-help-ico-container">
          <i class="fa fa-question-circle help-info-ico" title="<gdb:localize key="dataUploader.locationContextHelpToolTip"/>"></i>
        </div>   
      </div>
      <div class="inline-value">
        <label><gdb:localize key="dataUploader.unknownLocation"/></label>
        <div class="label-help-ico-container">
          <i class="fa fa-question-circle help-info-ico" title="<gdb:localize key="dataUploader.unknownLocationNameHelpToolTip"/>"></i>
      </div>   
      </div>
      <div class="inline-combo">
        <label><gdb:localize key="dataUploader.synonymn"/></label>
        <div class="label-help-ico-container">
          <i class="fa fa-question-circle help-info-ico" title="<gdb:localize key="dataUploader.synonymSearchHelpToolTip"/>"></i>
      </div> 
      </div>
      <div class="inline-actions">
        <label><gdb:localize key="dataUploader.actions"/></label>
        <div class="label-help-ico-container">
          <i class="fa fa-question-circle help-info-ico" title="<gdb:localize key="dataUploader.locationProblemActionsHelpToolTip"/>"></i>
      </div> 
      </div>
    </div>  
    
    <div *ngFor="let problem of problems.locations; let i = index;">
      <geo-validation-problem [problem]="problem" [workbook]="workbook" [index]="i"></geo-validation-problem>
    </div>
  </div>
  <div class="wide-holder">
    <div class="error-message">
      <p *ngIf="hasProblems()"><gdb:localize key="dataUploader.existingProblems"/></p>
    </div>          
  </div>  
</div>


      </section>        
    </fieldset>   
    
    <paging [form]="form" [page]="page" [global]="!hasProblems()"></paging>
  </div>
</form>

