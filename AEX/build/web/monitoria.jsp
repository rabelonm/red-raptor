<%-- 
    Document   : monitoria
    Created on : 31/10/2018, 16:43:58
    Author     : ncs
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.MonitoriaDAOImpl"%>
<%@page import="model.bean.Monitoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <title>Monitoria</title>
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
        <h1 class="text-center"><strong>Monitorias</strong></h1>
        
        <%
            MonitoriaDAOImpl mdi = new MonitoriaDAOImpl();
            ArrayList<Monitoria> ms = mdi.getAll();
            for(Monitoria m : ms){
                out.print("<div class="+"jumbotron"+">");
                out.print("<h4 class="+"text-center"+"><strong>Nome da Matéria:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+m.getMateria()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Nome do Monitor:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+m.getMonitor()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Local:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+m.getLocall()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Dia da semana:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+m.getDia()+"</h4>");
                out.print("<h4 class="+"text-center"+"><strong>Horário:</strong></h4>");
                out.print("<h4 class="+"text-center"+">"+m.getHora()+"</h4>");
                out.print("</div>");
            }
        %>
    </body>
</html>
