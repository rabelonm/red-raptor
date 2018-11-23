package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.UsuarioDAOImpl;
import verify.UsuarioVerify;
import model.bean.Usuario;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"p-3 mb-2 bg-info text-white\">\r\n");
      out.write("        <h1 class=\"text-center\"><strong>AEX- Anúncio de Atividades Extracurriculares</strong></h1>\r\n");
      out.write("        <form action=\"login.jsp\" method=\"POST\">\r\n");
      out.write("            <h1 class=\"text-center\">Login do Usuário</h1>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"email\">Endereço de E-Mail: </label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"nome@exemplo.com\">\r\n");
      out.write("                <label for=\"senha\">Senha:</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"senha\" placeholder=\"********\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <nav class=\"navbar navbar-btn\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("                        <input type=submit class=\"btn btn-success\" value=\"Confirmar\" name=\"confirmar\">\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\" value=\"Cancelar\" name=\"cancelar\">\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"text-warning\">Não possui cadastro? <a href=\"cadastrarUsuario.jsp\" class=\"text-capitalize\"> Clique Aqui!</a></p>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");

            if(request.getParameter("confirmar") != null){
                Usuario u = new Usuario();
                UsuarioDAOImpl ud = new UsuarioDAOImpl();
                UsuarioVerify uv = new UsuarioVerify();
                u.setEmail(request.getParameter("email"));
                u.setSenha(request.getParameter("senha"));
                
                if(ud.checkLogin(u.getEmail(), u.getSenha())){
                    response.sendRedirect("logado.jsp");
                    
                }else{
                    response.sendRedirect("erro.jsp");
                }
                
            }
            if(request.getParameter("cancelar") != null){
                response.sendRedirect("index.jsp");
            }
        
      out.write("\r\n");
      out.write("    </body> \r\n");
      out.write("</html>\r\n");
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
