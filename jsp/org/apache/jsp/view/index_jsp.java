package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t    <div class=\"banner text-center text-light\">\r\n");
      out.write("        <h1 class=\"txt-light font-weight-bold\">Já pensou em um lugar<br> para salvar seus episódios?</h1>\r\n");
      out.write("        <p style=\"padding:34px\">Crie sua conta agora e aproveite!</p>\r\n");
      out.write("        <a href=\"/conta\" style=\"border-radius: 22px;  font-family: 'Staatliches', cursive;\" type=\"button\"\r\n");
      out.write("            class=\"btn btn-danger text-light\">Comece agora</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\" rectitle font-weight-bold  text-center\">RECURSOS</h1>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"recurso container\">\r\n");
      out.write("        <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("            <img class=\"cardimg text-center\" src=\"/imagens/icones/save.svg\" alt=\"salve seus episódios\">\r\n");
      out.write("            <div class=\"card-body text-center\">\r\n");
      out.write("                <h5 class=\"card-title font-weight-bold title\">Salve seus episódios</h5>\r\n");
      out.write("                <p class=\"card-text\">Salve seus episódios e a temporada de onde\r\n");
      out.write("                    você parou, só basta você clicar em\r\n");
      out.write("                    adicionar, e adicione a temporada e o\r\n");
      out.write("                    episódio que você deseja.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"card card2\" style=\"width: 18rem;\">\r\n");
      out.write("            <img class=\"cardimg text-center\" src=\"/imagens/icones/smartphone.svg\" alt=\"Disponivel para android\">\r\n");
      out.write("            <div class=\"card-body text-center\">\r\n");
      out.write("                <h5 class=\"card-title font-weight-bold title \">Disponivel para android</h5>\r\n");
      out.write("                <p class=\"card-text\">Também temos aplicativo disponível para\r\n");
      out.write("                    android,\r\n");
      out.write("                    logo estaremos disponibilizando na\r\n");
      out.write("                    play store e aqui no site.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("            <img class=\"cardimg text-center\" src=\"/imagens/icones/livre.svg\" alt=\"salve seus episódios\">\r\n");
      out.write("            <div class=\"card-body text-center\">\r\n");
      out.write("                <h5 class=\"card-title font-weight-bold title \">crie uma conta gratuita</h5>\r\n");
      out.write("                <p class=\"card-text\">É totalmente de grátis e sem taxas, nossos\r\n");
      out.write("                    recursos são totalmente grátis, só criar sua\r\n");
      out.write("                    conta e aproveitar..</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
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
