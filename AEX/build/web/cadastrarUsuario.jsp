<%-- 
    Document   : cadastrarUsuario
    Created on : 30/10/2018, 14:39:47
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
        <title>Cadastrar Usuário</title> 
    </head>
    <body class="p-3 mb-2 bg-info text-white">
        <h1 class="text-center">AEX - Anúncio de Atividades Extracurriculares</h1>
        <form action="cadastrarUsuario.jsp" method="POST">
            <h1 class="text-center"> Cadastrar Usuário </h1>
            <h4 class="text-center text-warning"> Insira os dados abaixo para efetuar o seu cadastro.</h4>
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" class="form-control" name="nome" placeholder="Ronaldinho Dibrador">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" placeholder="nome@exemplo.com">
                <label for="senha">Senha:</label>
                <input type="password" class="form-control" name="senha" placeholder="********">
                <nav class="navbar navbar-btn">
                    <ul class="nav navbar-nav navbar-left">
                        <input type=submit class="btn btn-success" value="Confirmar" name="confirmar">
                    </ul>
                    <ul class="nav navbar-nav navbar-left">
                        <input type="submit" class="btn btn-success" value="Cancelar" name="cancelar">
                    </ul>
                </nav>
            </div>
             <p class="text-warning">Já é cadastrado? <a href="cadastrarUsuario.jsp" class="text-capitalize">Entre aqui!</a></p>
        </form>
        <%
                if(request.getParameter("confirmar") != null){
                    Usuario u = new Usuario();
                    u.setNome(request.getParameter("nome"));
                    u.setEmail(request.getParameter("email"));
                    u.setSenha(request.getParameter("senha"));
                    UsuarioVerify uv = new UsuarioVerify();
                    if(uv.verifyNome(u)){
                        UsuarioDAOImpl ud = new UsuarioDAOImpl();
                        ud.create(u);
                        response.sendRedirect("index.jsp");
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
