/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2021-11-28 18:38:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/httpbase.jsp", out, false);
      out.write("\n");
      out.write("    <title>Login to Axis2 :: Administration page</title>\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body onload=\"javascript:document.LoginForm.userName.focus();\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/header.inc", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/link-footer.jsp", out, false);
      out.write("\n");
      out.write("    <table summary=\"main content table\" class=\"FULL_BLANK\">\n");
      out.write("      <tr>\n");
      out.write("        <td valign=\"top\">\n");
      out.write("        \t<h2>Welcome :</h2>\n");
      out.write("        \t<p>Welcome to the Axis2 administration console. From inside the Axis2 administration console you can :</p>\n");
      out.write("\t    \t<ul style=\"list-style: none;\" class=\"loginUL\">\n");
      out.write("\t       \t\t<li>Check on the health of your Axis2 deployment.</li>\n");
      out.write(" \t       \t\t<li>Change any parameters at run time.</li>\n");
      out.write(" \t       \t\t<li>Upload new services into Axis2 [Service hot-deployment].</li>\n");
      out.write(" \t   \t\t</ul>\n");
      out.write("\t        <span style=\"color:orange\">Warning: Please note that configuration changes done through the administration console\n");
      out.write("    \t    will be lost when the server is restarted.</span>\n");
      out.write("    \t</td>\n");
      out.write("        <td valign=\"top\" align=\"left\">\n");
      out.write("          <form method=\"post\" name=\"LoginForm\" action=\"axis2-admin/login\">\n");
      out.write("            <table summary=\"login table\" class=\"LOG_IN_FORM\">\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\" style=\"bgcolor:#b0b0b0\"><span style=\"color:#FFFFFF\">Login</span></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                 <td align=\"center\" colspan=\"2\">&nbsp;</td>\n");
      out.write("               </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"right\">Username:</td>\n");
      out.write("                <td><input style=\"align:left\" type=\"text\" name=\"userName\" tabindex=\"1\">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"right\">Password : </td>\n");
      out.write("                <td><input style=\"align:left\" type=\"password\" name=\"password\" tabindex=\"2\">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                  <br>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\">\n");
      out.write("                  <input name=\"cancel\" type=\"reset\" value=\" Clear \"> &nbsp; &nbsp;\n");
      out.write("                  <input name=\"submit\" type=\"submit\" value=\" Login \">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\">\n");
      out.write("                  <span style=\"color:red\">&nbsp;");
 if (request.getAttribute("errorMessage") != null) {
      out.print( request.getAttribute("errorMessage"));
 } 
      out.write("&nbsp;</span>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("          <br><br><br><br><br><br>\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>   \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/include/footer.inc", out, false);
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
