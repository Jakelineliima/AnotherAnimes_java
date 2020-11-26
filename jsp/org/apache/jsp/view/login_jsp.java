package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("        <div class=\"bannerlogin\">\r\n");
      out.write("            <img src=\"/imagens/login-bg.jpg\" alt=\"banner\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"titulo\">\r\n");
      out.write("            <h1>Faça login e aproveite!</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"formulario container\">\r\n");
      out.write("            <form action=\"login\" method=\"POST\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\"\r\n");
      out.write("                        placeholder=\"E-mail\" name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Senha\" name=\"senha\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <input\r\n");
      out.write("                    style=\"border-radius: 22px; background-color: #2e2759; color: #fff; font-weight: bold; font-family: 'Staatliches'; width: 100px;\"\r\n");
      out.write("                    type=\"submit\" value=\"Login\" name=\"botao\" class=\"btn\" >\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    <style>\r\n");
      out.write("       @media(max-width:360px){\r\n");
      out.write("    .formulario > form{\r\n");
      out.write("    \twidth:100%;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
