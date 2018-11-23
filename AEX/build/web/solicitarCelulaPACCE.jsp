<%-- 
    Document   : solicitarCelulaPACCE
    Created on : 31/10/2018, 16:44:31
    Author     : ncs
--%>

<%@page import="verify.SolicitarCelulaPACCEVerify"%>
<%@page import="model.dao.SolicitarCelulaPACCEDAOImpl"%>
<%@page import="model.dao.SolicitarCelulaPACCEDAO"%>
<%@page import="model.bean.SolicitarCelulaPACCE"%>
<%@page import="model.dao.CelulaPACCEDAOImpl"%>
<%@page import="model.dao.CelulaPACCEDAO"%>
<%@page import="model.bean.CelulaPACCE"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <title>Solicitar Celula PACCE</title>
    </head>
    <body class="p-3 mb-2 bg-info text-white">
        <form class="form-group" method="POST">
            <h1 class="text-center">Solicitar Cadastro de Celula PACCE</h1>
            <h3 class="text-center text-warning">Preencha os campos abaixo para realizar a solicitação: </h3>
            <label for="nome">Nome: </label>
            <input type="text" class="form-control" name="nome" placeholder="Celula de estudo sobre I.A">
            <label for="nome">Nome do articulador: </label>
            <input type="text" class="form-control" name="articulador" placeholder="Ronaldinho Dibrador">
            <label for="descricao">Breve descrição:</label>
            <input type="text" class="form-control" name="descricao" placeholder="Celula com o intuido de estudar sobre areas da inteligencia artificial e afins">
            <label for="email">E-Mail para contato:</label>
            <input type="email" class="form-control" name="email" placeholder="nome@exemplo.com">
            <nav class="navbar navbar-btn">
                <ul class="nav navbar-nav navbar-left">
                    <input type=submit class="btn btn-success" value="Confirmar" name="confirmar">
                </ul>
                <ul class="nav navbar-nav navbar-left">
                    <input type="submit" class="btn btn-success" value="Cancelar" name="cancelar">
                </ul>
            </nav>
        </form>
        <%
            if(request.getParameter("confirmar")!=null){
                SolicitarCelulaPACCE scp = new SolicitarCelulaPACCE();
                SolicitarCelulaPACCEVerify sv = new SolicitarCelulaPACCEVerify();
                SolicitarCelulaPACCEDAOImpl scpd = new SolicitarCelulaPACCEDAOImpl();
                scp.setNome(request.getParameter("nome"));
                scp.setNomeArticulador(request.getParameter("articulador"));
                scp.setDescricao(request.getParameter("descricao"));
                scp.setEmail(request.getParameter("email"));
                if(sv.verifyNome(scp) && sv.verifyNomeArticulador(scp)){
                    scpd.create(scp);
                    response.sendRedirect("celulaPACCE.jsp");
                }else{
                    response.sendRedirect("erro.jsp");
                }
            }
            if(request.getParameter("cancelar")!=null){
                response.sendRedirect("celulaPACCE.jsp");
            }
        %>
    </body>
</html>
