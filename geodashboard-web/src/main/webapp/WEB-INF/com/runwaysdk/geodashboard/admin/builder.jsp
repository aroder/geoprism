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
<%@ taglib uri="/WEB-INF/tlds/geodashboard.tld" prefix="gdb"%>
<%@ taglib uri="http://jawr.net/tags" prefix="jwr" %>

<head>

<gdb:localize var="page_title" key="dashboardbuilder.title"/>

<!-- User account CSS -->
<jwr:style src="/bundles/datatable.css" useRandomParam="false"/>  
<jwr:style src="/com/runwaysdk/geodashboard/userstable/UsersTable.css" useRandomParam="false"/>  

<jwr:style src="/font-awesome-font-icons/font-awesome-4.3.0/css/font-awesome.min.css" useRandomParam="false"/>  


<!-- User account Javascript -->
<jwr:script src="/bundles/datatablejquery.js" useRandomParam="false"/>
<jwr:script src="/bundles/datatable.js" useRandomParam="false"/>
<jwr:script src="/bundles/builder.js" useRandomParam="false"/>
<script type="text/javascript">${js}</script>

</head>

<div id="dashboardTable"></div>

<script type="text/javascript">
  com.runwaysdk.ui.Manager.setFactory("JQuery");
  
  $(document).ready(function() {
    var table = new com.runwaysdk.ui.userstable.DashboardTable({"bAutoWidth":false});  
    table.render("#dashboardTable");
  });
  
</script>