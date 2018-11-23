package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javafx.scene.control.Alert;
import java.sql.Time;
import convert.Conversor;
import java.sql.Date;
import model.dao.AtividadeDAOImpl;
import model.bean.Atividade;
import verify.AtividadeVerify;

public final class cadastrarAtividade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastrar Atividade</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("        <h1 class=\"text-center\">AEX - Anúncio de Atividades Extracurriculares</h1>\n");
      out.write("        <form class=\"form-group\" method=\"POST\">\n");
      out.write("            <h1 class=\"text-center\">Anúnciar atividade</h1> \n");
      out.write("            <h3 class=\"text-center text-warning\"> Preencha os campos abaixo: </h3>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"nome\">Nome: </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"nome\" placeholder=\"Palestra sobre Bootstrap\" requiere>\n");
      out.write("                <label for=\"local\">Local: </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"local\" placeholder=\"Sala 07 - UFC Campus Russas\" requiere>\n");
      out.write("                <label for=\"data\">Data:</label><br>\n");
      out.write("                <input type=\"text\" class=\"form-inline\" name=\"dia\" placeholder=\"Dia\" requiere>\n");
      out.write("                <input type=\"text\" class=\"form-inline\" name=\"mes\" placeholder=\"Mês\" requiere>\n");
      out.write("                <input type=\"text\" class=\"form-inline\" name=\"ano\" placeholder=\"Ano\" requiere><br>\n");
      out.write("                <label for=\"hora\">Hora:</label><br>\n");
      out.write("                <input type=\"text\" class=\"form-inline\" name=\"hora\" placeholder=\"Hora\" requiere>\n");
      out.write("                <input type=\"text\" class=\"form-inline\" name=\"min\" placeholder=\"Minutos\" requiere>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-btn\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                    <input type=submit class=\"btn btn-success\" value=\"Confirmar\" name=\"confirmar\">\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </form>\n");
      out.write("        <form class=\"form-group\" method=\"POST\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success\" value=\"Cancelar\" name=\"cancelar\">\n");
      out.write("            </ul>\n");
      out.write("        </form>\n");
      out.write("        ");

            if(request.getParameter("confirmar")!=null){
                Atividade a = new Atividade();
                AtividadeVerify av = new AtividadeVerify();
                AtividadeDAOImpl ad = new AtividadeDAOImpl();
                Conversor c = new Conversor();
                Date d = c.converterDate(request.getParameter("ano"),request.getParameter("mes"),request.getParameter("dia"));
                Time t = c.converterHora(request.getParameter("hora"), request.getParameter("min"));
                a.setNome(request.getParameter("nome"));
                a.setLocall(request.getParameter("local"));
                a.setDataa(d);
                a.setHora(t);
                
                ad.create(a);
                
            }
            if(request.getParameter("cancelar")!=null){
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
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
