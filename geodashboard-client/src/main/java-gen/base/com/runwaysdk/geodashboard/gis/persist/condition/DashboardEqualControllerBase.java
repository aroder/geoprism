package com.runwaysdk.geodashboard.gis.persist.condition;

@com.runwaysdk.business.ClassSignature(hash = 2003438013)
public class DashboardEqualControllerBase implements com.runwaysdk.generation.loader.Reloadable
{
  public static final String CLASS = "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController";
  protected javax.servlet.http.HttpServletRequest req;
  protected javax.servlet.http.HttpServletResponse resp;
  protected java.lang.Boolean isAsynchronous;
  protected java.lang.String dir;
  protected java.lang.String layout;
  
  public DashboardEqualControllerBase(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Boolean isAsynchronous)
  {
    this(req, resp, isAsynchronous, "","");
  }
  
  public DashboardEqualControllerBase(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Boolean isAsynchronous, java.lang.String dir, java.lang.String layout)
  {
    this.req = req;
    this.resp = resp;
    this.isAsynchronous = isAsynchronous;
    this.dir = dir;
    this.layout = layout;
  }
  
  protected void render(String jsp) throws java.io.IOException, javax.servlet.ServletException
  {
    if(!resp.isCommitted())
    {
      if(this.isAsynchronous())
      {
        req.getRequestDispatcher(dir+jsp).forward(req, resp);
      }
      else
      {
        req.setAttribute(com.runwaysdk.controller.JSPFetcher.INNER_JSP, dir+jsp);
        req.getRequestDispatcher(layout).forward(req, resp);
      }
    }
  }
  
  public javax.servlet.http.HttpServletRequest getRequest()
  {
    return this.req;
  }
  
  public javax.servlet.http.HttpServletResponse getResponse()
  {
    return this.resp;
  }
  
  public java.lang.Boolean isAsynchronous()
  {
    return this.isAsynchronous;
  }
  
  public com.runwaysdk.constants.ClientRequestIF getClientRequest()
  {
    return (com.runwaysdk.constants.ClientRequestIF) req.getAttribute(com.runwaysdk.constants.ClientConstants.CLIENTREQUEST);
  }
  
  public com.runwaysdk.ClientSession getClientSession()
  {
    return (com.runwaysdk.ClientSession) req.getSession().getAttribute(com.runwaysdk.constants.ClientConstants.CLIENTSESSION);
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void cancel(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.cancel");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void failCancel(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failCancel");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void create(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.create");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void failCreate(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failCreate");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void delete(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.delete");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void failDelete(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failDelete");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:id", post=false)
  public void edit(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.edit");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:id", post=false)
  public void failEdit(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failEdit");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="", post=false)
  public void newInstance() throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.newInstance");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="", post=false)
  public void failNewInstance() throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failNewInstance");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void update(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.update");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO:dto", post=true)
  public void failUpdate(com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualDTO dto) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failUpdate");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:id", post=false)
  public void view(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.view");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:id", post=false)
  public void failView(java.lang.String id) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failView");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="", post=false)
  public void viewAll() throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.viewAll");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="", post=false)
  public void failViewAll() throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failViewAll");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:sortAttribute, java.lang.Boolean:isAscending, java.lang.Integer:pageSize, java.lang.Integer:pageNumber", post=false)
  public void viewPage(java.lang.String sortAttribute, java.lang.Boolean isAscending, java.lang.Integer pageSize, java.lang.Integer pageNumber) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.viewPage");
  }
  
  @com.runwaysdk.controller.ActionParameters(parameters="java.lang.String:sortAttribute, java.lang.String:isAscending, java.lang.String:pageSize, java.lang.String:pageNumber", post=false)
  public void failViewPage(java.lang.String sortAttribute, java.lang.String isAscending, java.lang.String pageSize, java.lang.String pageNumber) throws java.io.IOException, javax.servlet.ServletException
  {
    String msg = "This method should never be invoked.  It should be overwritten in com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.java";
    throw new com.runwaysdk.controller.UndefinedControllerActionException(msg, req.getLocale(), "com.runwaysdk.geodashboard.gis.persist.condition.DashboardEqualController.failViewPage");
  }
  
}