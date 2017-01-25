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
(function() {
  function EditableMapWebGLController($scope, $rootScope, localizationService,
      webGLMapService, locationService, $sce, $compile) {
    var controller = this;

    $scope.renderBase = true;
    $scope.baseLayers = [];
    $scope.contextStyle = {
      fill : "rgba(0, 0, 0, 0.25)",
      strokeColor : "rgba(0, 0, 0, 0.75)",
      strokeWidth : 5,
      radius : 7
    };
    $scope.targetStyle = {
      fill : "rgba(161, 202, 241, 0.75)",
      strokeColor : "rgba(255, 0, 0, 0.75)",
      strokeWidth : 3,
      radius : 7
    };
    $scope.sharedGeoData = {};

    var selectedFeature = null;

    controller.init = function() {

      var hoverCallback = function(featureId) {
        $scope.$emit('hoverChange', {
          id : featureId
        });
        $scope.$apply();
      }

      var featureClickCallback = function(feature, map) {
        var isDoubleClick = false;
        
        if (controller._isEditing) { return; }

        controller.stopEditing();

        // is it already selected?
        if (selectedFeature != null
            && selectedFeature.properties.id == feature.properties.id) {
          controller.unselectFeature(feature);
          isDoubleClick = true;
          selectedFeature = null;
        } else {
          controller.selectFeature(feature);
          selectedFeature = feature;
        }

        $scope.$emit('locationFocus', {
          id : feature.properties.id,
          isDoubleClick : isDoubleClick
        });
        $scope.$apply();
      }

      //
      // Setting up empty layers to be populated later
      //
      // NOTE: We can't move this code into the map factory because it requires
      // the event listeners which reference the scope.
      //
      var emptyGeoJSON = {
        "type" : "FeatureCollection",
        "totalFeatures" : 0,
        "features" : [],
        "crs" : {
          "type" : "name",
          "properties" : {
            "name" : "urn:ogc:def:crs:EPSG::4326"
          }
        }
      };

      controller.addVectorLayer(emptyGeoJSON, "context-multipolygon",
          $scope.contextStyle, "CONTEXT", 2);
      controller.addVectorLayer(emptyGeoJSON, "context-point",
          $scope.contextStyle, "CONTEXT", 2);

      controller.addVectorLayer(emptyGeoJSON, "target-multipolygon",
          $scope.targetStyle, "TARGET", 2);
      controller.addVectorLayer(emptyGeoJSON, "target-point",
          $scope.targetStyle, "TARGET", 2);

      controller.addVectorHoverEvents(hoverCallback, [ "target-point",
          "target-multipolygon" ]);
      controller.addVectorClickEvents(featureClickCallback, [ "target-point",
          "target-multipolygon" ]);
      //
      // end
      //

      // Create editing control
      var map = controller.getWebGLMap();
      controller._editingControl = new MapboxDraw({
        controls : {
          point : false,
          line_string : false,
          polygon : false,
          trash : true,
          combine_features : false,
          uncombine_features : false
        }
      });
      map.addControl(controller._editingControl);
      
      // Hide the controls until we enter an editing session
      $(".mapbox-gl-draw_ctrl-draw-btn.mapbox-gl-draw_trash").css("display", "none");

      
      // Define the GeoprismEditingControl
      controller._geoprismEditingControl = new net.geoprism.gis.GeoprismEditingControl(controller);
      map.addControl(controller._geoprismEditingControl);
      
      controller._isEditing = false;
    }

    controller.getWebGLMap = function() {
      return webGLMapService.getWebGlMap();
    }

    controller.baseLayerPanelMouseOut = function() {
      $scope.showBaseLayerPanel = false;
    }

    controller.toggleBaseLayer = function(targetLayer) {
      $scope.baseLayers.forEach(function(lyr) {
        if (lyr.layerId === targetLayer.layerId) {
          webGLMapService.toggleBaseLayer(lyr, $scope.activeBaseLayer);
          $scope.activeBaseLayer = targetLayer;
        }
      });
    }

    controller.removeVectorData = function() {
      webGLMapService.removeAllVectorLayers();
    }

    controller.getMapData = function(callback, data, workspace) {
      webGLMapService.getGeoJSONData(callback, data, workspace);
    }

    controller.addVectorClickEvents = function(featureClickCallback, layersArr) {
      webGLMapService.addVectorClickEvents(featureClickCallback, layersArr);
    }

    controller.addVectorHoverEvents = function(hoverCallback, layersArr) {
      webGLMapService.addVectorHoverEvents(hoverCallback, layersArr);
    }

    controller.addNewPointControl = function(feature, saveCallback) {
      mapService.addNewPointControl(feature, saveCallback);
    }

    controller.zoomToLayersExtent = function(layersArr) {
      webGLMapService.zoomToLayersExtent(layersArr);
    }

    controller.zoomToExtentOfFeatures = function(featureGeoIds) {
      webGLMapService.zoomToExtentOfFeatures(featureGeoIds);
    }

    controller.selectFeature = function(feature) {
      if (controller._isEditing) { return; }
      
      webGLMapService.selectFeature(feature);
    }

    controller.unselectFeature = function(feature) {
      $scope.$emit('locationUnhighlight');
      
      webGLMapService.unselectFeature(feature);
    }

    controller.focusOnFeature = function(feature) {
      webGLMapService.focusOnFeature(feature);
    }

    controller.focusOffFeature = function(feature) {
      webGLMapService.focusOffFeature(feature);
    }

    controller.addVectorLayer = function(layerGeoJSON, layerName, styleObj,
        type, stackingIndex) {
      webGLMapService.addVectorLayer(layerGeoJSON, layerName, styleObj, type,
          stackingIndex);
    }

    controller.updateVectorLayer = function(layerGeoJSON, layerName, styleObj,
        type, stackingIndex) {
      webGLMapService.updateVectorLayer(layerGeoJSON, layerName, styleObj,
          type, stackingIndex);
    }

    controller.startEditingFeatures = function(featureIds) {
      var map = controller.getWebGLMap();
      
      this.unselectFeature(null);
      
      // enable editing controls
      controller._geoprismEditingControl.startEditing();
      $(".mapbox-gl-draw_ctrl-draw-btn.mapbox-gl-draw_trash").removeAttr("style");

      // Add features to editing control
      var filter = [ "!=", "id", "" ];
      if (featureIds != null)
      {
        filter = [ '==', 'id', featureIds ];
      }
      var features = map.querySourceFeatures("target-multipolygon", {
        filter : filter
      });
      for (var i = 0; i < features.length; ++i) {
        this._editingControl.add(features[i]);
      }
      
      // Show/hide relevant/irrelevant target features
      if (featureIds != null)
      {
        map.setFilter("target-multipolygon", [ "!=", "id", featureIds ]);
      }
      else
      {
        map.setFilter("target-multipolygon", [ "==", "id", "" ]);
      }
      
      controller._isEditing = true;
    }

    controller.stopEditing = function() {
      if (!controller._isEditing) { return; }
      
      var map = controller.getWebGLMap();
      
      controller._geoprismEditingControl.stopEditing();
      $(".mapbox-gl-draw_ctrl-draw-btn.mapbox-gl-draw_trash").css("display", "none");

      this._editingControl.deleteAll();
      map.setFilter("target-multipolygon", [ "!=", "id", "" ]);
      
      controller._isEditing = false;
    }

    controller.refreshBaseLayer = function() {
      if ($scope.baseLayers.length > 0) {
        for (var i = 0; i < $scope.baseLayers.length; i++) {
          var layer = $scope.baseLayers[i];

          if (layer.isActive) {
            webGLMapService.showLayer(layer, 0);
          } else {
            webGLMapService.hideLayer(layer);
          }
        }
      }
    }

    controller.refreshInteractiveLayers = function(triggeringEvent) {
      if (!isEmptyJSONObject($scope.sharedGeoData)) {
        var data = $scope.sharedGeoData;

        var targetCallback = function(data) {
          var geomType;
          for (var i = 0; i < data.features.length; i++) {
            var feature = data.features[i];
            feature.properties.isHoverable = true;
            feature.properties.isClickable = true;
            geomType = feature.geometry.type.toLowerCase();
          }

          controller.updateVectorLayer(data, "target-" + geomType,
              $scope.targetStyle, "TARGET", 2);
        }

        data.layers.forEach(function(layer) {
          controller.getMapData(targetCallback, layer, layer.workspace);
        });
      }
    }

    controller.refreshWithContextLayer = function(triggeringEvent) {
      if (!isEmptyJSONObject($scope.sharedGeoData)) {
        var data = $scope.sharedGeoData;

        for (var i = 0; i < data.geometries.length; i++) {
          var layer = data.geometries[i];

          for (var l = 0; l < layer.features.length; l++) {
            var feature = layer.features[l];
            feature.properties.isHoverable = i === 0 ? false : true;
            feature.properties.isClickable = i === 0 ? false : true;
          }

          if (i === 0) {
            controller.updateVectorLayer(layer, "context-multipolygon",
                $scope.contextStyle, "CONTEXT", 1);
            controller.zoomToLayersExtent([ "context-multipolygon" ]);
          } else if (i === 1) {
            controller.updateVectorLayer(layer, "target-multipolygon",
                $scope.targetStyle, "TARGET", 2);
            controller.zoomToLayersExtent([ "target-multipolygon" ]);
          }
        }

        // var contextCallback = function(data) {
        // for(var i=0; i<data.features.length; i++){
        // var feature = data.features[i];
        // feature.properties.isHoverable = false;
        // feature.properties.isClickable = false;
        // }
        //				  
        // controller.updateVectorLayer(data, "context-multipolygon",
        // $scope.contextStyle, "CONTEXT", 1);
        // controller.zoomToLayersExtent(["context-multipolygon"]);
        // }
        //			  
        // var targetCallback = function(data) {
        // for(var i=0; i<data.features.length; i++){
        // var feature = data.features[i];
        // feature.properties.isHoverable = true;
        // feature.properties.isClickable = true;
        // }
        //				  
        // controller.updateVectorLayer(data, "target-multipolygon",
        // $scope.targetStyle, "TARGET", 2);
        // controller.zoomToLayersExtent(["target-multipolygon"]);
        // }

        // controller.removeVectorData();

        // get context geo data
        // controller.getMapData(contextCallback, data.layers[0],
        // data.workspace);

        // get target geo data
        // controller.getMapData(targetCallback, data.layers[1],
        // data.workspace);
      }
    }

    function isEmptyJSONObject(obj) {
      for ( var prop in obj) {
        if (obj.hasOwnProperty(prop))
          return false;
      }

      return true && JSON.stringify(obj) === JSON.stringify({});
    }

    $scope.$on('listHoverOver', function(event, data) {
      controller.focusOnFeature(data);
    });

    $scope.$on('listHoverOff', function(event, data) {
      controller.focusOffFeature(data);
    });

    $scope.$on('listItemClick', function(event, data) {
      controller.zoomToExtentOfFeatures(data.geoIds)
    });

    $scope.$on('editLocation', function(event, data) {
      controller.startEditingFeatures(data.id);
    });
    
    $scope.$on('cancelEditLocation', function(event, data) {
      controller.stopEditing();
    });

    // Recieve shared data from parent controller based on user selection of
    // target location
    $scope.$on('sharedGeoData', function(event, data) {
      if (!isEmptyJSONObject(data)) {

        $scope.sharedGeoData = data;

        controller.refreshWithContextLayer('sharedGeoData');
      } else if (!isEmptyJSONObject($scope.sharedGeoData)) {
        controller.refreshWithContextLayer('sharedGeoData');
      }
    });

    $scope.$on("layerChange", function(event, data) {
      $scope.sharedGeoData = data;

      if ($scope.includeContextLayer) {
        controller.refreshWithContextLayer('layerChange');
      } else {
        controller.refreshInteractiveLayers('layerChange');
      }
    });

    // $scope.$watch("activeBaseLayer", function(newVal, oldVal) {
    // if(newVal){
    // console.log("watched")
    // }
    // });

    controller.init();
  }

  function EditableMapWebGL() {
    return {
      restrict : 'E',
      replace : true,
      templateUrl : com.runwaysdk.__applicationContextPath
          + '/partial/widgets/editable-map-webgl.jsp',
      scope : {
        includeContextLayer : '=includeContextLayer',
        baseMapType : "@baseMapType"
      },
      controller : EditableMapWebGLController,
      controllerAs : 'ctrl',
      link : function(scope, element, attrs, ctrl) {
      }
    }
  }
  
  Mojo.Meta.newClass('net.geoprism.gis.GeoprismEditingControl', {
    Extends : com.runwaysdk.ui.Component,  
    IsAbstract : false,
    Instance : {
     
      initialize : function(controller) {
        this._controller = controller;
      },
      
      onAdd : function(map) {
        this._map = map;
        this._container = $(document.createElement('div'));
        this._container.addClass('mapboxgl-ctrl-group mapboxgl-ctrl');

        this._bEdit = $(document.createElement("button"));
        this._bEdit.addClass('fa fa-pencil-square-o');
        this._bEdit.css("color", "black");
        this._bEdit.css("font-size", "14px");
        this._container.append(this._bEdit);
        
        this._bSave = $(document.createElement("button"));
        this._bSave.addClass('fa fa-floppy-o');
        this._bSave.css("color", "black");
        this._bSave.css("display", "none");
        this._bSave.css("font-size", "14px");
        this._container.append(this._bSave);

        var that = this;
        this._bEdit.click(function() {
          that._controller.startEditingFeatures(null);
        });
        
        this._bSave.click(function() {
          that._controller.stopEditing();
        });

        return this._container[0];
      },
      
      onRemove : function() {
        this._container.parentNode.removeChild(this._container);
        this._map = undefined;
      },
      
      startEditing: function() {
        this._bEdit.css("display", "none");
        this._bSave.css("display", "block");
      },
      
      stopEditing : function() {
        this._bEdit.css("display", "block");
        this._bSave.css("display", "none");
      }
    }
  });

  angular.module("editable-map-webgl", [ "styled-inputs",
      "localization-service", "webgl-map-service", "location-service" ]);
  angular.module("editable-map-webgl").controller('editableMapWebglController',
      EditableMapWebGLController).directive('editableMapWebgl',
      EditableMapWebGL)
})();
