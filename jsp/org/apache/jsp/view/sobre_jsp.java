package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sobre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       <div class=\"bannersobre\">\r\n");
      out.write("            <h1>SOBRE</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text_1\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#ModalLongoExemplo\"> Ingles</button>\r\n");
      out.write("            <h2>COMO SURGIU A ANOTHERANIMES?</h2>\r\n");
      out.write("            <p>AnotherAnimes pensou na necessidade de alguns usuÃ¡rios que geralmente enfrentam\r\n");
      out.write("                quando assistem em diversos lugares suas sÃ©ries, animes e etc, sendo assim acaba\r\n");
      out.write("                perdendo em qual parte parou, nÃ³s oferecemos a opÃ§Ã£o pra vocÃª sempre manter seus\r\n");
      out.write("                episÃ³dios em dia.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text_2\">\r\n");
      out.write("            <h2>QUANDO SURGIU?</h2>\r\n");
      out.write("            <p>No meio do ano de 2020, com todos esse caos de ficarmos em casa devido a\r\n");
      out.write("                pandemia comeÃ§ou a surgir a ideia de nosso projeto.\r\n");
      out.write("                Quem adora ver animes e sÃ©ries sabe como Ã© complicado quando se assiste em\r\n");
      out.write("                vÃ¡rios lugares manter um controle de quais episÃ³dios foram vistos, com isso surgiu a\r\n");
      out.write("                ideia e por que nÃ£o ter um lugar pra isso? E assim surgiu nosso site e aplicativo.\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- BotÃ£o para acionar modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"ModalLongoExemplo\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"TituloModalLongoExemplo\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"TituloModalLongoExemplo\">HOW WAS IT CREATED ANOTHERANIMES?</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("       AnotherAnimes thought of the need of some users that usually face when watching their series, anime and etc. in different places, so that you donât end up losing where you left off, we offer the option of always keeping your episodes up to date.\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"TituloModalLongoExemplo\">WHEN WAS IT CREATED ?</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("      In the middle of the year 2020, with all this chaos of being at home due to the pandemic, the idea of our project started to emerge. Who loves watching anime and series knows how complicated it is to watch in various places to follow which episodes were seen, with that the idea came up and why not have a place for it? And then our website and app came into being.\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("usuario");
    _jspx_th_c_set_0.setValue(new String("Admin"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
