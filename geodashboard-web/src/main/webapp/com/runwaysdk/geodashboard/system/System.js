/*
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
//define(["../../ClassFramework", "../../Util", "../RunwaySDK_UI", "../factory/runway/widget/Widget", "../datatable/datasource/InstanceQueryDataSource"], function(ClassFramework, Util, UI, Widget, InstanceQueryDataSource) {
(function(){  

	/**
	 * System configuration crud screen.
	 */
	
  var ClassFramework = Mojo.Meta;
  var Widget = com.runwaysdk.ui.factory.runway.Widget;
  var FormEntry = com.runwaysdk.geodashboard.FormEntry;
  var Form = com.runwaysdk.geodashboard.Form;
  
  var systemFormName = "com.runwaysdk.geodashboard.system.SystemForm";
  
  /**
   * LANGUAGE
   */
  com.runwaysdk.Localize.defineLanguage(systemFormName, {
    "newUser" : "New",
    "editUser" : "Edit",
    "deleteUser" : "Delete",
    "dialogEditUserTitle" : "Edit User",
    "dialogViewUserTitle" : "View User",
    "submit" : "Submit",
    "cancel" : "Cancel",
    "close" : "Close",
    "dialogNewUserTitle" : "New User",
    "dialogDeleteUserTitle" : "Confirm Delete",
    "delete" : "Delete",
    "edit" : "Edit",
    "deleteText" : "Are you sure you want to delete user ",
    "confirmPassword" : "Confirm password",
    "confirmRequired" : "Password confirmation is required",
    "passwordMismatch" : "Passwords do not match",
    "invalidEmail" : "Invalid email address format",
    "admin" : "Admin",
    "accountInfo" : "Account information",
    "emailSettingsSectionHeader" : "Email Settings",
    "allow" : "allow",
    "notAllowed" : "Not allowed to create a new user",
  });
  
  var SystemFormEvent = ClassFramework.newClass('com.runwaysdk.geodashboard.system.SystemFormBuilderEvent', {
    Constants : {
      APPLY_SUCCESS : 0,
      APPLY_FAILURE : 1,
      CANCEL_SUCCESS : 2,
      CANCEL_FAILURE : 3,
      ON_EDIT : 4
    },
    Instance : {
      initialize : function(eventType, emailSetting, container) {
        this._eventType = eventType;
        this._emailSetting = emailSetting;
        this._container = container;
      },
      
      getEventType : function(){
        return this._eventType;
      },
      
      getEmailSetting : function(){
    	return this._emailSetting;
      },
      
      getContainer : function(){
    	return this._container;
      }
    }
  });
  
  ClassFramework.newClass('com.runwaysdk.geodashboard.system.SystemFormBuilder', {
      
    Instance : {
       
      initialize : function(factory, emailSetting, user, rolesMap) {
        this._factory = factory;
        this._emailSetting = emailSetting;
        this._user = user;
        this._roleMd = new com.runwaysdk.system.Roles();
        this._rolesMap = rolesMap;
        this._listeners = [];
        this._hasRoles = (this._roleMd.isWritable() && rolesMap != null);
      },
      
      addListener : function (listener)
      {
        this._listeners.push(listener);
      },
      
      getListeners : function()
      {
        return this._listeners;  
      },
      
      fireEvent : function(eventType, user, container)
      {
        for(var i = 0; i < this._listeners.length; i++) {
          this._listeners[i].handleEvent(new SystemFormEvent(eventType, user, container));
        }  
      },
      
      getFactory : function()
      {
        return this._factory;  
      },
      
      localize : function (key)
      {
        return com.runwaysdk.Localize.localize(systemFormName, key);      
      },
      
      render : function(container, readOnly) {
        var form = this._build(readOnly);
        var that = this;
      
        container.appendContent(form);
      
        if(this._emailSetting.isWritable())
        {
          if(!readOnly)
          {          
            var submitCallback = function() {
              // Disable the buttons to prevent multiple submits
              document.getElementById('user-submit').disabled = true;
              document.getElementById('user-cancel').disabled = true;
        
              // Clear any existing error messages
              form.removeErrorMessages();
        
              var values = form.getValues();
         
              var roles = that._getRoles(values);
              that._populateComponent(values);
        
              var applyCallback = new com.runwaysdk.geodashboard.StandbyClientRequest({
                onSuccess : function(user) {
                  container.close();
                
                  that.fireEvent(SystemFormEvent.APPLY_SUCCESS, user, container);
                },
                onFailure : function(ex) {
                  form.handleException(ex);
            
                  document.getElementById('user-submit').disabled = false;
                  document.getElementById('user-cancel').disabled = false;
                 
                  that.fireEvent(SystemFormEvent.APPLY_FAILURE, null, container);
                }
              }, container.getParentNode());

              if(that._hasRoles) {
                that._emailSetting.applyWithRoles(applyCallback, roles);            
              }
              else {
                that._emailSetting.apply(applyCallback);
              }
            };
      
            var cancelCallback = function() {
              if(!that._emailSetting.isNewInstance())
              {                
                var unlockCallback = new com.runwaysdk.geodashboard.StandbyClientRequest({
                  onSuccess : function(user) {
                    container.close();
                  
                    that.fireEvent(SystemFormEvent.CANCEL_SUCCESS, user, container);
                  },
                  onFailure : function(ex) {
                    form.handleException(ex);
                  
                    that.fireEvent(SystemFormEvent.CANCEL_FAILURE, null, container);
                  }
                }, container.getParentNode());
          
                that._emailSetting.unlock(unlockCallback);  
              }
              else
              {
                container.close();
              }
            };
      
            container.addButton(that.localize("submit"), submitCallback, null, {id:'user-submit', class:'btn btn-primary'});
            container.addButton(that.localize("cancel"), cancelCallback, null, {id:'user-cancel', class:'btn'});            
          }
          else
          {
            var editCallback = function() {
              that.fireEvent(SystemFormEvent.ON_EDIT, that._emailSetting, container);            	
            };
          
            container.addButton(that.localize("edit"), editCallback, null, {id:'user-edit', class:'btn btn-primary'});
          }
        }
        else if(this._emailSetting.isReadable())
        {
          container.addButton(that.localize("close"), function(){container.close();}, null, {id:'user-cancel', class:'btn btn-primary'});            
        }
      },
      
      _build : function(readOnly) {
        var form = new Form();
        var that = this;
        var errors = new com.runwaysdk.structure.HashSet();
          
        // Build the admin role section
        form.appendElement(this._newHeader(this.localize('emailSettingsSectionHeader')));
        
        if(!readOnly && this._emailSetting.isServerWritable())
        {
          var serverInput = FormEntry.newInput('text', 'server', {attributes:{type:'text', id:'server'}});
          serverInput.setValue(this._emailSetting ? this._emailSetting.getServer() : "");
          form.addFormEntry(this._emailSetting.getServerMd(), serverInput);
          
          var requiredField = function() { that._requiredField(serverInput.getValue(), serverInput.getId(), form, errors); };
          serverInput.addEventListener('blur', requiredField);
        }
        else if(this._emailSetting.isServerReadable())
        {
          var label = this._emailSetting.getServerMd().getDisplayLabel();        
          var entry = new com.runwaysdk.geodashboard.ReadEntry('server', label, this._emailSetting ? this._emailSetting.getServer() : "");
          form.addEntry(entry);
        }
        
        if(!readOnly && this._emailSetting.isUsernameWritable())
        {
          var userNameInput = FormEntry.newInput('text', 'username', {attributes:{type:'text', id:'username'}});
          userNameInput.setValue(this._emailSetting ? this._emailSetting.getUsername() : "");
          form.addFormEntry(this._emailSetting.getUsernameMd(), userNameInput);
          
          var requiredField = function() { that._requiredField(userNameInput.getValue(), userNameInput.getId(), form, errors); };
          userNameInput.addEventListener('blur', requiredField);
        }
        else if(this._emailSetting.isUsernameReadable())
        {
          var label = this._emailSetting.getUsernameMd().getDisplayLabel();        
          var entry = new com.runwaysdk.geodashboard.ReadEntry('userName', label, this._emailSetting ? this._emailSetting.getUsername() : "");
          form.addEntry(entry);
        }
          
        if(!readOnly && this._emailSetting.isPasswordWritable())
        {
          var passwordInput = FormEntry.newInput('text', 'password', {attributes:{type:'password', id:'password'}});
          passwordInput.setValue(this._emailSetting ? this._emailSetting.getPassword() : "");
          form.addFormEntry(this._emailSetting.getPasswordMd(), passwordInput);
          
          var requiredField = function() { that._requiredField(passwordInput.getValue(), passwordInput.getId(), form, errors); };
          passwordInput.addEventListener('blur', requiredField);
        }
        
        if(!readOnly && this._emailSetting.isPortWritable())
        {
          var portInput = FormEntry.newInput('text', 'port', {attributes:{type:'text', id:'port'}});
          portInput.setValue(this._emailSetting ? this._emailSetting.getPort() : "");
          form.addFormEntry(this._emailSetting.getPortMd(), portInput);
          
          var requiredField = function() {
          	document.getElementById('user-submit').disabled = true;

          	var val = portInput.getValue();
          	
            if(val == null || val === "" || !$.isNumeric(val))
            {
              form.getEntry(portInput.getId()).addInlineError(that.localize('nonNumeric'));   
              errors.add(portInput.getId());
            }
            else
            {
              form.getEntry(portInput.getId()).removeInlineError();
              errors.remove(portInput.getId());
              if (errors.isEmpty())
              {
                document.getElementById('user-submit').disabled = false;
              }
            }
          };
          portInput.addEventListener('blur', requiredField);
        }
        else if(this._emailSetting.isPortReadable())
        {
          var label = this._emailSetting.getPortMd().getDisplayLabel();        
          var entry = new com.runwaysdk.geodashboard.ReadEntry('port', label, this._emailSetting ? this._emailSetting.getPort() : "");
          form.addEntry(entry);                  
        }
        
        if(!readOnly && this._emailSetting.isFromWritable())
        {
          var fromInput = FormEntry.newInput('text', 'from', {attributes:{type:'text', id:'from'}});
          fromInput.setValue(this._emailSetting ? this._emailSetting.getFrom() : "");
          form.addFormEntry(this._emailSetting.getFromMd(), fromInput);
          
          var validateEmail = Mojo.Util.bind(this, function()
          {
            document.getElementById('user-submit').disabled = true;

            if(!this._isValidEmail(fromInput.getValue()))              
            {
              form.getEntry(fromInput.getId()).addInlineError(this.localize('invalidEmail'));          
              errors.add(fromInput.getId());
            }
            else
            {
              form.getEntry(fromInput.getId()).removeInlineError();
              errors.remove(fromInput.getId());
              if (errors.isEmpty())
              {
                document.getElementById('user-submit').disabled = false;   
              }
            }
          });
                
          fromInput.addEventListener('blur', validateEmail);
        }
        else if(this._emailSetting.isFromReadable())
        {
          var label = this._emailSetting.getFromMd().getDisplayLabel();        
          var entry = new com.runwaysdk.geodashboard.ReadEntry('from', label, this._emailSetting ? this._emailSetting.getFrom() : "");
          form.addEntry(entry);
        }
        
        if(!readOnly && this._emailSetting.isToWritable())
        {
          var toInput = FormEntry.newInput('text', 'to', {attributes:{type:'text', id:'to'}});
          toInput.setValue(this._emailSetting ? this._emailSetting.getTo() : "");
          var formEntry = form.addFormEntry(this._emailSetting.getToMd(), toInput);
          formEntry.getLabel().setTitle(this.localize("toTooltip"));
          
          var validateEmail = Mojo.Util.bind(this, function()
          {
            if(toInput.getValue() !== '')
            {
              document.getElementById('user-submit').disabled = true;

              if(!this._isValidEmailList(toInput.getValue()))              
              {
                form.getEntry(toInput.getId()).addInlineError(this.localize('invalidEmail'));
                errors.add(toInput.getId());
              }
              else
              {
                form.getEntry(toInput.getId()).removeInlineError();
                errors.remove(toInput.getId());
                if (errors.isEmpty())
                {
                  document.getElementById('user-submit').disabled = false;
                }
              }
            }
          });
            
          toInput.addEventListener('blur', validateEmail);
        }
        else if(this._emailSetting.isToReadable())
        {
          var label = this._emailSetting.getToMd().getDisplayLabel();        
          var entry = new com.runwaysdk.geodashboard.ReadEntry('to', label, this._emailSetting ? this._emailSetting.getTo() : "");
          form.addEntry(entry);                  
        }
        
        // Check if the this._emailSetting has role permssions
        if(!readOnly && this._hasRoles)
        {
          this.buildRoles(form);	        	
        }
                  
        return form;
      },
      
      buildRoles : function(form) {
        for (var k in this._rolesMap)
        {
          if (this._rolesMap.hasOwnProperty(k))
          {
            var roles = this._rolesMap[k];
              
            // Build the admin role section
            form.appendElement(this._newHeader(this.localize(k)));
                
            for (var i = 0; i < roles.length; ++i) {
              var role = roles[i];
              var options = [{displayLabel:this.localize('allow'), value:role.getRoleId(), checked:role.getAssigned()}]; 
                  
              var entry = new com.runwaysdk.geodashboard.CheckboxFormEntry('role_' + role.getRoleId(), role.getDisplayLabel(), options);
              form.addEntry(entry);
            }
          }
        }    	  
      },
        
      _newHeader : function(displayLabel) {
        // Build the admin role section
        var header = this.getFactory().newElement('h2');
        header.setInnerHTML(displayLabel);

        return header;
      },
      
      _requiredField : function(value, fieldId, form, errors)
      {
        document.getElementById('user-submit').disabled = true;

        if(value === "" || value == null)
        {
          form.getEntry(fieldId).addInlineError(this.localize('requiredField'));          
          errors.add(fieldId);
        }
        else
        {
          form.getEntry(fieldId).removeInlineError();
          errors.remove(fieldId);
          if (errors.isEmpty())
          {
            document.getElementById('user-submit').disabled = false;
          }
        }
      },
        
      _isValidEmail : function(email) { 
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
      },
      
      _isValidEmailList : function(email) { 
        var re = /^[\W]*([\w+\-.%]+@[\w\-.]+\.[A-Za-z]+[\W]*,{1}[\W]*)*([\w+\-.%]+@[\w\-.]+\.[A-Z‌​a-z]+)[\W]*$/;
        return re.test(email);
      },
                    
      _populateComponent : function (values) {
        if(this._emailSetting.isUsernameWritable())
        {          
          this._emailSetting.setUsername(values.get("username"));
        }
            
        if(this._emailSetting.isPasswordWritable())
        {       
          this._emailSetting.setPassword(values.get("password"));                            
        }
            
        if(this._emailSetting.isServerWritable())
        {
          this._emailSetting.setServer(values.get("server"));                            
        }
        
        if(this._emailSetting.isPortWritable())
        {
          this._emailSetting.setPort(values.get("port"));                            
        }
        
        if(this._emailSetting.isFromWritable())
        {
          this._emailSetting.setFrom(values.get("from"));                            
        }
        
        if(this._emailSetting.isToWritable())
        {
          this._emailSetting.setTo(values.get("to"));                            
        }
      },
      
      _getRoles : function (values)
      {
        var roles = [];
        var keys = values.keySet();
    
        for (var i = 0; i < keys.length; i++)
        {
          if(keys[i].indexOf('role_') !== -1)
          {
            var value = values.get(keys[i]);
            
            if(value.length > 0)
            {
              roles.push(value[0]);
            }
          }
        }
        
        return roles;
      }      
    }
  });
  
  ClassFramework.newClass('com.runwaysdk.geodashboard.system.SystemFormConfiguator', {
	  Instance : {
		get : function(factory, emailSetting, user, rolesMap) {
		  return new com.runwaysdk.geodashboard.system.SystemFormBuilder(factory, emailSetting, user, rolesMap);
        },
        
        getRoles : function(callback, user)
        {
          com.runwaysdk.geodashboard.RoleView.getRoles(callback, user);
        }
	  }	  
  });
  
  var systemForm = ClassFramework.newClass(systemFormName, {
      
    Extends : Widget,
      
    Instance : {
        
      initialize : function(emailSetting, user) {
      	this._user = user;
      	this._emailSetting = emailSetting;
        this._footer = null;
                  
        this.$initialize("div");
        
        this._configuator = new com.runwaysdk.geodashboard.system.SystemFormConfiguator();
      },
      getFactory : function ()
      {
        return com.runwaysdk.ui.Manager.getFactory();
      },
      close : function ()
      {
        // Do nothing
      },
      addButton : function (label, callback, context, config)
      {
        var type = 'reset';
    
        if(this._footer === null) {
          this._footer = this.getFactory().newElement('footer');
          this._footer.setAttribute('class', 'bottom-bar');
          
          this._form.appendChild(this._footer);
          
          type = 'submit';          
        }
        
        var button = this.getFactory().newElement('input', {'value':label, 'type':type});
        button.setAttribute('class', config['class']);
        button.setAttribute('id', config['id']);
        button.addEventListener('click', function (e) {
          e.preventDefault();
          
          callback(e);
        });
          
        this._footer.appendChild(button);
      },
      appendContent : function(form) 
      {
        this._form = form;
        
        this.appendChild(form);
      },
      getParentNode : function()
      {
    	  return this.getRawEl();  
      },
      reload : function(user, readOnly)
      {
    	this.setInnerHTML('');
    	this._footer = null;
    	  
        var builder = this._configuator.get(this.getFactory(), user, null);
        builder.render(this, readOnly);
        builder.addListener(this);            	    	  
      },
      handleEvent : function(e) {
    	var that = this;
    	var user = e.getEmailSetting();
    	  
        if(e.getEventType() === SystemFormEvent.ON_EDIT) {
          var lockCallback = new com.runwaysdk.geodashboard.StandbyClientRequest({
            onSuccess : function(user) {
              that.reload(user, false);
            },
            onFailure : function(ex) {
              that.handleException(ex);
            }
          }, e.getContainer().getRawEl());
              
          user.lock(lockCallback);
        }
        else if (e.getEventType() === SystemFormEvent.APPLY_SUCCESS || e.getEventType() === SystemFormEvent.CANCEL_SUCCESS) {
          this.reload(user, true);        	
        }
      },
      render : function(parent) {

        var builder = this._configuator.get(this.getFactory(), this._emailSetting, this._user, null);
        builder.render(this, true);
        builder.addListener(this);
          
        this.$render(parent);        

        if (jcf != null && jcf.customForms != null) {
          jcf.customForms.replaceAll();
        }
      }
    }
  });
  
  return systemForm;
  
})();
