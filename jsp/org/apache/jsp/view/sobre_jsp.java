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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"bannersobre\">\r\n");
      out.write("\t<h1>SOBRE</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"text_1\">\r\n");
      out.write("\t<div class=\"edits\">\r\n");
      out.write("\t\t<a type=\"button\" style=\"background: #2E2759; color: #fff;\" class=\"btn\"\r\n");
      out.write("\t\t\tdata-toggle=\"modal\" data-target=\"#ModalLongoExemplo\">Ingles</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h2>COMO SURGIU A ANOTHERANIMES?</h2>\r\n");
      out.write("\t<p>AnotherAnimes pensou na necessidade de alguns usuÃ¡rios que\r\n");
      out.write("\t\tgeralmente enfrentam quando assistem em diversos lugares suas sÃ©ries,\r\n");
      out.write("\t\tanimes e etc, sendo assim acaba perdendo em qual parte parou, nÃ³s\r\n");
      out.write("\t\toferecemos a opÃ§Ã£o pra vocÃª sempre manter seus episÃ³dios em dia.</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"text_2\">\r\n");
      out.write("\t<h2>QUANDO SURGIU?</h2>\r\n");
      out.write("\t<p>No meio do ano de 2020, com todos esse caos de ficarmos em casa\r\n");
      out.write("\t\tdevido a pandemia comeÃ§ou a surgir a ideia de nosso projeto. Quem\r\n");
      out.write("\t\tadora ver animes e sÃ©ries sabe como Ã© complicado quando se assiste em\r\n");
      out.write("\t\tvÃ¡rios lugares manter um controle de quais episÃ³dios foram vistos, com\r\n");
      out.write("\t\tisso surgiu a ideia e por que nÃ£o ter um lugar pra isso? E assim\r\n");
      out.write("\t\tsurgiu nosso site e aplicativo.</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- BotÃ£o para acionar modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"ModalLongoExemplo\" tabindex=\"-1\"\r\n");
      out.write("\trole=\"dialog\" aria-labelledby=\"TituloModalLongoExemplo\"\r\n");
      out.write("\taria-hidden=\"true\">\r\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<h5 class=\"modal-title font-weight-bold\"\r\n");
      out.write("\t\t\t\t\tid=\"TituloModalLongoExemplo\" style=\"color: #2E2759;\">HOW WAS\r\n");
      out.write("\t\t\t\t\tIT CREATED ANOTHERANIMES?</h5>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">AnotherAnimes thought of the need of\r\n");
      out.write("\t\t\t\tsome users that usually face when watching their series, anime and\r\n");
      out.write("\t\t\t\tetc. in different places, so that you donât end up losing where you\r\n");
      out.write("\t\t\t\tleft off, we offer the option of always keeping your episodes up to\r\n");
      out.write("\t\t\t\tdate.</div>\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<h5 class=\"modal-title font-weight-bold\"\r\n");
      out.write("\t\t\t\t\tid=\"TituloModalLongoExemplo\" style=\"color: #2E2759;\">WHEN WAS\r\n");
      out.write("\t\t\t\t\tIT CREATED ?</h5>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\tIn the middle of the year 2020, with all this chaos of being at home\r\n");
      out.write("\t\t\t\tdue to the pandemic, the idea of our project started to emerge. Who\r\n");
      out.write("\t\t\t\tloves watching anime and series knows how complicated it is to watch\r\n");
      out.write("\t\t\t\tin various places to follow which episodes were seen, with that the\r\n");
      out.write("\t\t\t\tidea came up and why not have a place for it? And then our website\r\n");
      out.write("\t\t\t\tand app came into being.\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\"></div>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
