<%-- 
    Document   : Login
    Created on : 30/10/2018, 14:26:35
    Author     : ncs
--%>

<%@page import="model.dao.UsuarioDAOImpl"%>
<%@page import="verify.UsuarioVerify"%>
<%@page import="model.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <title>Login</title>
    </head>
    <body class="p-3 mb-2 bg-info text-white">
        <h1 class="text-center"><strong>AEX- Anúncio de Atividades Extracurriculares</strong></h1>
        <form action="login.jsp" method="POST">
            <h1 class="text-center">Login do Usuário</h1>
            <div class="form-group">
                <label for="email">Endereço de E-Mail: </label>
                <input type="email" class="form-control" name="email" placeholder="nome@exemplo.com">
                <label for="senha">Senha:</label>
                <input type="password" class="form-control" name="senha" placeholder="********">
                <br>
                <nav class="navbar navbar-btn">
                    <ul class="nav navbar-nav navbar-left">
                        <input type=submit class="btn btn-success" value="Confirmar" name="confirmar">
                    </ul>
                    <ul class="nav navbar-nav navbar-left">
                        <input type="submit" class="btn btn-success" value="Cancelar" name="cancelar">
                    </ul>
                </nav>
            </div>
            <p class="text-warning">Não possui cadastro? <a href="cadastrarUsuario.jsp" class="text-capitalize"> Clique Aqui!</a></p>
        </form>
        <%
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
        %>
    </body> 
</html>
