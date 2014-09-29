<%--

    Copyright (c) 2013 TerraFrame, Inc. All rights reserved.

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

<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="/WEB-INF/tlds/geodashboard.tld" prefix="gdb"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

<gdb:localize var="page_title" key="reports.title"/>

<%@page import="com.runwaysdk.constants.DeployProperties" %>
<%
  String webappRoot = request.getContextPath() + "/";
%>

<script type="text/javascript" src="<% out.print(webappRoot); %>jquery/datatables/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" href="<% out.print(webappRoot); %>jquery/datatables/css/jquery.dataTables.css" ></link>
<link rel="stylesheet" href="<% out.print(webappRoot); %>jquery/datatables/css/jquery.dataTables_themeroller.css" ></link>

<!-- Runway Factory -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/runway.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/widget/Widget.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/list/List.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/form/Form.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/contextmenu/ContextMenu.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/button/Button.js"></script>

<!-- Generic -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/datasource/DataSourceIF.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/datasource/Events.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/datasource/DataSourceFactory.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/datasource/BaseServerDataSource.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/datasource/ServerDataSource.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/DataTable.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/Column.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/Events.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/Row.js"></script>

<!-- JQuery -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/Factory.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/TabPanel.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/Dialog.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/datatable/datasource/ServerDataSource.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/datatable/datasource/DataSourceFactory.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/jquery/datatable/DataTable.js"></script>

<!-- Runway Generic -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/PollingRequest.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/datatable/datasource/InstanceQueryDataSource.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/ui/datatable/datasource/MdMethodDataSource.js"></script>
<script type="text/javascript" src="<%out.print(webappRoot);%>com/runwaysdk/ui/RunwayControllerForm.js"></script>
<script type="text/javascript" src="<%out.print(webappRoot);%>com/runwaysdk/ui/RunwayControllerFormDialog.js"></script>
<script type="text/javascript" src="<%out.print(webappRoot);%>com/runwaysdk/ui/RunwayControllerFormDialogDownloader.js"></script>


<link rel="stylesheet" type="text/css" href="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/runway/default.css" />
<link rel="stylesheet" type="text/css" href="<% out.print(webappRoot); %>com/runwaysdk/ui/factory/generic/datatable/DataTable.css" />

<!-- Geodashboard form -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/geodashboard/Geodashboard.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/geodashboard/Form.js"></script>

<!-- Report table -->
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/geodashboard/report/ViewQueryDataSource.js"></script>
<script type="text/javascript" src="<% out.print(webappRoot); %>com/runwaysdk/geodashboard/report/ReportTable.js"></script>
<link rel="stylesheet" type="text/css" href="<% out.print(webappRoot); %>com/runwaysdk/geodashboard/report/ReportTable.css" />

<%@page import="com.runwaysdk.constants.ClientConstants"%>
<%@page import="com.runwaysdk.constants.ClientRequestIF"%>
<%@page import="com.runwaysdk.web.json.JSONController"%>
<%@page import="com.runwaysdk.geodashboard.report.ReportItemDTO"%>
<%@page import="com.runwaysdk.geodashboard.report.ReportItemViewDTO"%>


<%
  ClientRequestIF clientRequest = (ClientRequestIF) request.getAttribute(ClientConstants.CLIENTREQUEST);
%>

<script type="text/javascript">
<%
	// use a try catch before printing out the definitions, otherwise, if an
	// error occurs here, javascript spills onto the actual page (ugly!)
	try
	{
	  String js = JSONController.importTypes(clientRequest.getSessionId(), new String[] {
	      ReportItemDTO.CLASS, ReportItemViewDTO.CLASS
	    }, true);
	  out.print(js);
	  
	}
	catch(Exception e)
	{
	  // perform cleanup
	  throw e;
	}
%>
</script>

</head>

<div id="reportTable"></div>

<script type="text/javascript">
  com.runwaysdk.ui.Manager.setFactory("JQuery");
  
  $(document).ready(function() {
  		var ut = new com.runwaysdk.geodashboard.ui.report.ReportTable({"bAutoWidth":false});  
  		ut.render("#reportTable");
  });
  
</script>
