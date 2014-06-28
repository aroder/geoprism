<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page_title" scope="request" value="Edit an existing Enterprise Survey"/>
<dl>
  <mjl:form id="org.ideorg.iq.EnterpriseSurvey.form.id" name="org.ideorg.iq.EnterpriseSurvey.form.name" method="POST">
    <%@include file="form.jsp" %>
    <mjl:command name="org.ideorg.iq.EnterpriseSurvey.form.update.button" value="Update" action="org.ideorg.iq.EnterpriseSurveyController.update.mojo" />
    <mjl:command name="org.ideorg.iq.EnterpriseSurvey.form.delete.button" value="Delete" action="org.ideorg.iq.EnterpriseSurveyController.delete.mojo" />
    <mjl:command name="org.ideorg.iq.EnterpriseSurvey.form.cancel.button" value="Cancel" action="org.ideorg.iq.EnterpriseSurveyController.cancel.mojo" />
  </mjl:form>
</dl>
