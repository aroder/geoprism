<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page_title" scope="request" value="Select Has Thematic Layer Participants"/>
<mjl:form id="com.runwaysdk.geodashboard.gis.persist.HasThematicLayer.form.id" name="com.runwaysdk.geodashboard.gis.persist.HasThematicLayer.form.name" method="POST">
  <dl>
    <dt>
      <label>
        Map
      </label>
    </dt>
    <dd>
      <mjl:select param="parentId" items="${parentList}" var="current" valueAttribute="id">
        <mjl:option>
          ${current.keyName}
        </mjl:option>
      </mjl:select>
    </dd>
    <dt>
      <label>
        Layer
      </label>
    </dt>
    <dd>
      <mjl:select param="childId" items="${childList}" var="current" valueAttribute="id">
        <mjl:option>
          ${current.keyName}
        </mjl:option>
      </mjl:select>
    </dd>
    <mjl:command name="com.runwaysdk.geodashboard.gis.persist.HasThematicLayer.form.newInstance.button" value="New Instance" action="com.runwaysdk.geodashboard.gis.persist.HasThematicLayerController.newInstance.mojo" />
  </dl>
</mjl:form>