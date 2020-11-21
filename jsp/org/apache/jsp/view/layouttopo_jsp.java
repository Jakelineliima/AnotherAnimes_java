package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layouttopo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>AnotherAnime</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/bootstrap/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/css/bootstrap/css/estilo.css\" />\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&family=Staatliches&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\t\t<script src=\"js/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"css/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("    <header>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"menu container\">\r\n");
      out.write("            <a class=\"logo\" href=\"/index\"><img src=\"/imagens/icones/logo.svg\" alt=\"logo\"></a>\r\n");
      out.write("            <ul class=\"links\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"/index\">Início</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"/contato\">Contato</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"/sobre\">Sobre</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"/salvos\">Salvos</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"/contatomsg\">Mensagems</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"btns\">\r\n");
      out.write("                <a style=\"border-radius: 22px;\" type=\"button\" class=\"btn borda btn-danger\"\r\n");
      out.write("                    href=\"/login\">Entrar</a>\r\n");
      out.write("\r\n");
      out.write("                <a style=\"border-radius: 22px;color: #fff;\" type=\"button\" class=\"btn btn-outline-danger text-light\"\r\n");
      out.write("                    href=\"/conta\">Criar conta</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <a class=\"btn0\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("                    aria-expanded=\"false\">\r\n");
      out.write("                    <img style=\"width:31px;\" src=\"/imagens/icones/menu.svg\" alt=\"menu hamburgue\">\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"/index\">Inicio</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"/contato\">Contato</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"/sobre\">Sobre</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"/salvos\">Salvos</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"/login\">Entrar</a>\r\n");
      out.write("                    <a class=\"dropdown_item\" href=\"/conta\">Criar conta</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>");
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
