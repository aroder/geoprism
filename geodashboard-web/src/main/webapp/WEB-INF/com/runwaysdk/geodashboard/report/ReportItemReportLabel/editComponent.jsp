<%@ taglib uri="/WEB-INF/tlds/runwayLib.tld" prefix="mjl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="page_title" scope="request" value="Edit an existing Report label"/>
<dl>
  <mjl:form id="com.runwaysdk.geodashboard.report.ReportItemReportLabel.form.id" name="com.runwaysdk.geodashboard.report.ReportItemReportLabel.form.name" method="POST">
    <%@include file="form.jsp" %>
    <mjl:command name="com.runwaysdk.geodashboard.report.ReportItemReportLabel.form.update.button" value="Update" action="com.runwaysdk.geodashboard.report.ReportItemReportLabelController.update.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.report.ReportItemReportLabel.form.delete.button" value="Delete" action="com.runwaysdk.geodashboard.report.ReportItemReportLabelController.delete.mojo" />
    <mjl:command name="com.runwaysdk.geodashboard.report.ReportItemReportLabel.form.cancel.button" value="Cancel" action="com.runwaysdk.geodashboard.report.ReportItemReportLabelController.cancel.mojo" />
  </mjl:form>
</dl>
