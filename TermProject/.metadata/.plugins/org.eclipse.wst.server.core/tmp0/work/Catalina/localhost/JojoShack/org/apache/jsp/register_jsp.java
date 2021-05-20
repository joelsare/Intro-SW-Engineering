/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.90
 * Generated at: 2020-12-11 04:41:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Create Account</title>\r\n");
      out.write("<link href =\"main.css\" type =\"text/css\" rel =\"stylesheet\"/>\r\n");
      out.write("<link href=\"register.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("<script src=\"register.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write(" \t</header>\r\n");
      out.write(" \t<div class=\"registerForm\">\r\n");
      out.write("\t\t<form action=\"register\" method=\"post\">\r\n");
      out.write("\t            <h2>Sign Up</h2>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <h3>Account Type</h3>\r\n");
      out.write("\t                <input type=\"radio\" id=\"radio1\" name=\"usertype\" value=\"VOLUNTEER\" checked/>\r\n");
      out.write("\t                <label class=\"rl\" for=\"radio1\">Volunteer</label>\r\n");
      out.write("\t\r\n");
      out.write("\t                <input type=\"radio\" id=\"radio2\" name=\"usertype\" value=\"ORGANIZATION\" />\r\n");
      out.write("\t                <label class=\"rl\" for=\"radio2\">Organization</label>\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <label for=\"email\" class=\"floatLabel\" id=\"emailLabel\" >Email</label>\r\n");
      out.write("\t                <input class=\"inputClass\" id=\"Email\" name=\"email\" type=\"text\" onclick=\"addLabel()\" oninput=\"hideLabelEmail()\">\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <label for=\"username\" class=\"floatLabel\" id=\"usernameLabel\" >Username</label>\r\n");
      out.write("\t                <input class=\"inputClass\" id=\"username\" name=\"username\" type=\"text\" onclick=\"addLabel()\" oninput=\"hideLableUser()\">\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <label for=\"password\" class=\"floatLabel\" id=\"pass1Label\">Password</label>\r\n");
      out.write("\t                <input class=\"inputClass\" id=\"password\" name=\"password\" type=\"password\" onclick=\"addLabel()\" oninput=\"hideLablePass()\">\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <label for=\"confirm_password\" class=\"floatLabel\" id=\"pass2Label\">Confirm Password</label>\r\n");
      out.write("\t                <input class=\"inputClass\" id=\"confirm_password\" name=\"confirm_password\" type=\"password\" onclick=\"addLabel()\" onkeyup=\"arePasswordsMatching()\">\r\n");
      out.write("\t                <span id=\"passwordMatchSpan\">Your passwords do not match</span>\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            <p>\r\n");
      out.write("\t                <input class=\"inputClass\" type=\"submit\" value=\"Create My Account\" id=\"submit\">\r\n");
      out.write("\t            </p>\r\n");
      out.write("\t            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
