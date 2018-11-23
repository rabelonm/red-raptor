<%-- 
    Document   : cadastrarAtividade
    Created on : 30/10/2018, 14:26:46
    Author     : ncs
--%>

<%@page import="javafx.scene.control.Alert"%>
<%@page import="java.sql.Time"%>
<%@page import="convert.Conversor"%>
<%@page import="java.sql.Date"%>
<%@page import="model.dao.AtividadeDAOImpl"%>
<%@page import="model.bean.Atividade"%>
<%@page import="verify.AtividadeVerify"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Atividade</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    </head>
    <body class="p-3 mb-2 bg-info text-white">
        <h1 class="text-center"><strong>AEX - Anúncio de Atividades Extracurriculares</strong></h1>
        <form class="form-group" method="POST">
            <h1 class="text-center">Anunciar atividade</h1> 
            <h3 class="text-center text-warning"> Preencha os campos abaixo: </h3>
            <div class="form-group">
                <label for="nome">Nome: </label>
                <input type="text" class="form-control" name="nome" placeholder="Palestra sobre Bootstrap" required="true">
                <label for="local">Local: </label>
                <input type="text" class="form-control" name="local" placeholder="Sala 07 - UFC Campus Russas" required="true>
                <label for="data">Data:</label><br>
                <input type="text" class="form-inline" name="dia" placeholder="Dia" required="true">
                <input type="text" class="form-inline" name="mes" placeholder="Mês" required="true">
                <input type="text" class="form-inline" name="ano" placeholder="Ano" required="true"><br>
                <label for="hora">Hora:</label><br>
                <input type="text" class="form-inline" name="hora" placeholder="Hora" required="true">
                <input type="text" class="form-inline" name="min" placeholder="Minutos" required="true">
            </div>
            <nav class="navbar navbar-btn">
                <ul class="nav navbar-nav navbar-left">
                    <input type=submit class="btn btn-success" value="Confirmar" name="confirmar">
                </ul>
            </nav>
        </form>
         <%
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
                if(av.verifyNome(a)){
                    ad.create(a);
                    response.sendRedirect("index.jsp");
                }else{
                    response.sendRedirect("erro.jsp");
                }
                
            }
        %>
        <form class="form-group" method="POST">
            <ul class="nav navbar-nav">
                    <input type="submit" class="btn btn-success" value="Cancelar" name="cancelar">
            </ul>
            <%
            if(request.getParameter("cancelar")!=null){
                response.sendRedirect("index.jsp");
            }
            %>
        </form>
        
    </body>
</html>
