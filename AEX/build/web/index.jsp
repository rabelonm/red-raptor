<%-- 
    Document   : index
    Created on : 30/10/2018, 14:24:30
    Author     : ncs
--%>

<%@page import="model.dao.UsuarioDAOImpl"%>
<%@page import="model.bean.Usuario"%>
<%@page import="model.dao.AtividadeDAOImpl"%>
<%@page import="model.bean.Atividade"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <title>Pagina inicial</title>
    </head>
    <body class="p-3 mb-2 bg-info text-white">
        <h1 class="text-center"><strong>AEX - Anúncio de Atividades Extracurriculares</strong></h1>
            <nav class="navbar navbar-btn">
                <div class="container">
                    <div class="navbar-header">
                        <a href="index.jsp" class="btn btn-primary btn-lg">Início</a>
                        <a href="cadastrarAtividade.jsp" class="btn btn-default btn-lg">Anúncie aqui!</a>
                        <a href="celulaPACCE.jsp" class="btn btn-danger btn-lg">Celulas PACCE</a>
                        <a href="monitoria.jsp" class="btn btn-warning btn-lg" >Monitorias</a>
                        <a href="esportes.jsp" class="btn btn-info btn-lg">Esportes</a>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <a href="login.jsp"><img src="imagens/login.png" height="40" width="50"></a>
                        <a href="login.jsp" class="btn btn-success btn-lg">Entrar</a><br>
                    </ul>
                </div>
            </nav>
        <%
            AtividadeDAOImpl adi = new AtividadeDAOImpl();
            ArrayList<Atividade> atvs = adi.getAll();
            out.print("<br>");
            for(Atividade a : atvs){
                out.print("<div class="+"jumbotron"+">");
                out.print("<h4 class="+"text-center"+"><strong>Nome da Atividade:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+a.getNome()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Local:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+a.getLocall()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Data:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+a.getDataa()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Hora:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+a.getHora()+"</h4><br>");
                out.print("</div>");
            } 
        %>
    </body>
</html>
