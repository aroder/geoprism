<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="/WEB-INF/tlds/geodashboard.tld" prefix="gdb"%>

<gdb:localize var="page_title" key="geoEntity.editTitle"/>
  <mjl:form classes="submit-form" id="com.runwaysdk.system.gis.geo.GeoEntity.form.id" name="com.runwaysdk.system.gis.geo.GeoEntity.form.name" method="POST">
    <%@include file="form.jsp" %>
    <!--
    <mjl:command name="com.runwaysdk.system.gis.geo.GeoEntity.form.update.button" value="Update" action="com.runwaysdk.system.gis.geo.GeoEntityController.update.mojo" />
    <mjl:command name="com.runwaysdk.system.gis.geo.GeoEntity.form.delete.button" value="Delete" action="com.runwaysdk.system.gis.geo.GeoEntityController.delete.mojo" />
    <mjl:command name="com.runwaysdk.system.gis.geo.GeoEntity.form.cancel.button" value="Cancel" action="com.runwaysdk.system.gis.geo.GeoEntityController.cancel.mojo" />
    -->
  </mjl:form>
