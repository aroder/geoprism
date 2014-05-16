package com.runwaysdk.geodashboard.gis.persist.condition;

public class DashboardCompositeController extends DashboardCompositeControllerBase implements com.runwaysdk.generation.loader.Reloadable
{
  public static final String JSP_DIR = "/WEB-INF/com/runwaysdk/geodashboard/gis/persist/condition/DashboardComposite/";
  public static final String LAYOUT = "WEB-INF/templates/layout.jsp";
  
  public DashboardCompositeController(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Boolean isAsynchronous)
  {
    super(req, resp, isAsynchronous, JSP_DIR, LAYOUT);
  }
  
  public void cancel(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    dto.unlock();
    this.view(dto.getId());
  }
  public void failCancel(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    this.edit(dto.getId());
  }
  public void create(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    try
    {
      dto.apply();
      this.view(dto.getId());
    }
    catch(com.runwaysdk.ProblemExceptionDTO e)
    {
      this.failCreate(dto);
    }
  }
  public void failCreate(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    req.setAttribute("_leftCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_rightCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_styleReference", com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("item", dto);
    render("createComponent.jsp");
  }
  public void delete(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    try
    {
      dto.delete();
      this.viewAll();
    }
    catch(com.runwaysdk.ProblemExceptionDTO e)
    {
      this.failDelete(dto);
    }
  }
  public void failDelete(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    req.setAttribute("_leftCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_rightCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_styleReference", com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("item", dto);
    render("editComponent.jsp");
  }
  public void edit(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto = com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO.lock(super.getClientRequest(), id);
    req.setAttribute("_leftCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_rightCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_styleReference", com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("item", dto);
    render("editComponent.jsp");
  }
  public void failEdit(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    this.view(id);
  }
  public void update(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    try
    {
      dto.apply();
      this.view(dto.getId());
    }
    catch(com.runwaysdk.ProblemExceptionDTO e)
    {
      this.failUpdate(dto);
    }
  }
  public void failUpdate(com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    req.setAttribute("_leftCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_rightCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_styleReference", com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("item", dto);
    render("editComponent.jsp");
  }
  public void view(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    com.runwaysdk.constants.ClientRequestIF clientRequest = super.getClientRequest();
    req.setAttribute("_leftCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_rightCondition", com.runwaysdk.geodashboard.gis.persist.condition.DashboardConditionDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("_styleReference", com.runwaysdk.geodashboard.gis.persist.DashboardStyleDTO.getAllInstances(super.getClientSession().getRequest(), "keyName", true, 0, 0).getResultSet());
    req.setAttribute("item", com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO.get(clientRequest, id));
    render("viewComponent.jsp");
  }
  public void failView(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    this.viewAll();
  }
  public void viewAll() throws java.io.IOException, javax.servlet.ServletException
  {
    com.runwaysdk.constants.ClientRequestIF clientRequest = super.getClientRequest();
    com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeQueryDTO query = com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO.getAllInstances(clientRequest, null, true, 20, 1);
    req.setAttribute("query", query);
    render("viewAllComponent.jsp");
  }
  public void failViewAll() throws java.io.IOException, javax.servlet.ServletException
  {
    resp.sendError(500);
  }
  public void viewPage(java.lang.String sortAttribute, java.lang.Boolean isAscending, java.lang.Integer pageSize, java.lang.Integer pageNumber) throws java.io.IOException, javax.servlet.ServletException
  {
    com.runwaysdk.constants.ClientRequestIF clientRequest = super.getClientRequest();
    com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeQueryDTO query = com.runwaysdk.geodashboard.gis.persist.condition.DashboardCompositeDTO.getAllInstances(clientRequest, sortAttribute, isAscending, pageSize, pageNumber);
    req.setAttribute("query", query);
    render("viewAllComponent.jsp");
  }
  public void failViewPage(java.lang.String sortAttribute, java.lang.String isAscending, java.lang.String pageSize, java.lang.String pageNumber) throws java.io.IOException, javax.servlet.ServletException
  {
    resp.sendError(500);
  }
}