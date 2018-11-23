<%-- 
    Document   : celulaPACCE
    Created on : 31/10/2018, 16:43:40
    Author     : ncs
--%>

<%@page import="model.bean.CelulaPACCE"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.CelulaPACCEDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-theme.css">
        <link href="bootstrap/css/bootstrap-theme.min.css">
        <link href="bootstrap/css/bootstrap.css">
        <link href="css/style.css">
        <title>Celulas PACCE</title>
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
        <br>
        <nav class="navbar navbar-btn">
            <div class="navbar center-block">
                <a href="solicitarCelulaPACCE.jsp"><h3 class="text-center">Solicitar cadastro de Célula PACCE</h3></a>
            </div>
        </nav>
        <h1 class="text-center">Células PACCE</h1>
        <%
            CelulaPACCEDAOImpl cpdi = new CelulaPACCEDAOImpl();
            ArrayList<CelulaPACCE> cps = cpdi.getAll();
            out.print("<br>");
            for(CelulaPACCE c : cps){
                out.print("<div class="+"jumbotron"+">");
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
        %>
         
    </body>
</html>
