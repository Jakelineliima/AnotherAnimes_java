package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alterarsalvo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<div class=\"container adccont\">\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"adicionar\" method=\"POST\" action=\"alterarsalvo\">\r\n");
      out.write("\t\t<h2>EDITE AQUI SEUS EPISÓDIOS ASSISTIDOS</h2>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id_save\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salvo.getId_save()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"adcimg\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label class=\"\"> <img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\tstyle=\"height: 202px;\" src=\"/imagens/imagens/784334.jpg\" />\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"enter\">\r\n");
      out.write("\t\t\t<div class=\"inputs\">\r\n");
      out.write("\t\t\t\t<input class=\"inputtitle\" type=\"text\" name=\"titulo\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salvo.getTitulo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"tmp\">\r\n");
      out.write("\t\t\t\t<input class=\"temp\" type=\"text\" name=\"temporada\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salvo.getTemporada()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input class=\"ep\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"episodio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salvo.getEpisodio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"teste\">\r\n");
      out.write("\t\t\t<button style=\"border-radius: 22px;\" type=\"submit\" class=\"btn borda\">Salvar</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@media ( max-width :999px) {\r\n");
      out.write("\t.adicionar {\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("\t\tflex-direction: column;\r\n");
      out.write("\t}\r\n");
      out.write("\t.borda {\r\n");
      out.write("\t\tmargin: 18px auto;\r\n");
      out.write("\t\tfloat: right;\r\n");
      out.write("\t}\r\n");
      out.write("\t.adcimg {\r\n");
      out.write("\t\twidth: 300px;\r\n");
      out.write("\t\theigth: 203px;\r\n");
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
