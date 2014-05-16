<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page_title" scope="request" value="Edit an existing Less Than Or Equal"/>
<dl>
  <mjl:form id="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.form.id" name="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.form.name" method="POST">
    <%@include file="form.jsp" %>
    <mjl:command name="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.form.update.button" value="Update" action="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqualController.update.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.form.delete.button" value="Delete" action="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqualController.delete.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqual.form.cancel.button" value="Cancel" action="com.runwaysdk.geodashboard.gis.persist.condition.DashboardLessThanOrEqualController.cancel.mojo" />
  </mjl:form>
</dl>