package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"bannerpag text-center text-light\">\r\n");
      out.write("\t<h1 class=\"txt-light font-weight-bold \">Contato</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<form class=\"container contato\" method=\"POST\" action=\"/contato\">\r\n");
      out.write("\t<div class=\"formcont\">\r\n");
      out.write("\t\t<h2>Esta com problemas ou quer enviar um elogio.</h2>\r\n");
      out.write("\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" id=\"\" placeholder=\"Nome:\" name=\"nome\"\r\n");
      out.write("\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"email\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tid=\"exampleFormControlInput1\" placeholder=\"Email:\" name=\"email\"\r\n");
      out.write("\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<textarea class=\"form-control\" id=\"exampleFormControlTextarea1\"\r\n");
      out.write("\t\t\t\t\trows=\"3\" placeholder=\"Escreva aqui sua mensagem:\" name=\"mensagem\"\r\n");
      out.write("\t\t\t\t\trequired></textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<button style=\"border-radius: 22px;\" type=\"submit\" class=\"btn btncont borda\">Enviar</button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container cont\">\r\n");
      out.write("\t<h2 class=\"text-center\">Siga nossas redes sociais!</h2>\r\n");
      out.write("\t<div class=\"social\">\r\n");
      out.write("\t\t<div class=\"textsoc\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"/imagens/icones/facebook.svg\"\r\n");
      out.write("\t\t\t\talt=\"logo facebook\"></a>\r\n");
      out.write("\t\t\t<p>AnotherAnimes</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"textsoc\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"/imagens/icones/001-instagram.svg\"\r\n");
      out.write("\t\t\t\talt=\"logo instagram\"></a>\r\n");
      out.write("\t\t\t<p>@AnotherAnimes</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"textsoc\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"/imagens/icones/002-twitter.svg\"\r\n");
      out.write("\t\t\t\talt=\"logo twitter\"></a>\r\n");
      out.write("\t\t\t<p>@AnotherAnimes</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".form {\r\n");
      out.write("\twidth: 48%;\r\n");
      out.write("\tmargin: 16px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width : 1066px) {\r\n");
      out.write("\t.form {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>");
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
