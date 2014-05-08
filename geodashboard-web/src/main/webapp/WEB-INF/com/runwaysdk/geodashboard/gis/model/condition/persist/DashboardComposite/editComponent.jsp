<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page_title" scope="request" value="Edit an existing Composite"/>
<dl>
  <mjl:form id="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardComposite.form.id" name="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardComposite.form.name" method="POST">
    <%@include file="form.jsp" %>
    <mjl:command name="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardComposite.form.update.button" value="Update" action="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardCompositeController.update.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardComposite.form.delete.button" value="Delete" action="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardCompositeController.delete.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardComposite.form.cancel.button" value="Cancel" action="com.runwaysdk.geodashboard.gis.model.condition.persist.DashboardCompositeController.cancel.mojo" />
  </mjl:form>
</dl>
