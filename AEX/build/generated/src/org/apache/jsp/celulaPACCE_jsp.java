package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bean.CelulaPACCE;
import java.util.ArrayList;
import model.dao.CelulaPACCEDAOImpl;

public final class celulaPACCE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-theme.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-theme.min.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\">\n");
      out.write("        <link href=\"css/style.css\">\n");
      out.write("        <title>Celula PACCE</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("        <h1 class=\"text-center\">AEX - Anúncio de Atividades Extracurriculares</h1>\n");
      out.write("        <nav class=\"navbar navbar-btn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-primary btn-lg\">Início</a>\n");
      out.write("                    <a href=\"cadastrarAtividade.jsp\" class=\"btn btn-default btn-lg\">Anúncie aqui!</a>\n");
      out.write("                    <a href=\"celulaPACCE.jsp\" class=\"btn btn-danger btn-lg\">Celulas PACCE</a>\n");
      out.write("                    <a href=\"monitoria.jsp\" class=\"btn btn-warning btn-lg\" >Monitorias</a>\n");
      out.write("                    <a href=\"esportes.jsp\" class=\"btn btn-info btn-lg\">Esportes</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <a href=\"login.jsp\"><img src=\"imagens/login.png\" height=\"40\" width=\"50\"></a>\n");
      out.write("                    <a href=\"login.jsp\" class=\"btn btn-success btn-lg\">Entrar</a><br>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br>\n");
      out.write("        <nav class=\"navbar navbar-btn\">\n");
      out.write("            <div class=\"navbar center-block\">\n");
      out.write("                <a href=\"solicitarCelulaPACCE.jsp\"><h3 class=\"text-center\">Solicitar cadastro de Célula PACCE</h3></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <h1 class=\"text-center\">Células PACCE</h1>\n");
      out.write("        ");

            CelulaPACCEDAOImpl cpdi = new CelulaPACCEDAOImpl();
            ArrayList<CelulaPACCE> cps = cpdi.getAll();
            out.print("<br>");
            for(CelulaPACCE c : cps){
                out.print("<div class="+"jumbotron"+">");
                //out.print("<div class="+"background-css"+">");
                out.print("<h4 class="+"text-center"+"><strong>Nome da Célula:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+c.getNome()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Nome do Articulador:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+c.getArticularor()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Local:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+c.getLocall()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Dia da semana:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+c.getDia()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Horário:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+c.getHora()+"</h4>");
                out.print("</div>");
            }
        
      out.write("\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
