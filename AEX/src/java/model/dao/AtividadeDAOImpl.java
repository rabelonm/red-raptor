/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Atividade;

/**
 *
 * @author Nicolas
 */
public class AtividadeDAOImpl implements AtividadeDAO{

    @Override
    public void create(Atividade a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String crt = "INSERT INTO ATIVIDADE(nome, locall, dataa, hora"
                + ") VALUES (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(crt);
        stmt.setString(1, a.getNome());
        stmt.setString(2, a.getLocall());
        stmt.setDate(3, a.getDataa());
        stmt.setTime(4, a.getHora());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt); 
    }

    @Override
    public ArrayList<Atividade> getAll() throws SQLException {
        ArrayList<Atividade> atividades = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String get = "SELECT * FROM ATIVIDADE";
        PreparedStatement stmt = con.prepareStatement(get);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Atividade a = new Atividade();
            a.setNome(rs.getString("nome"));
            a.setLocall(rs.getString("locall"));
            a.setDataa(rs.getDate("dataa"));
            a.setHora(rs.getTime("hora"));
            atividades.add(a);
        }
        ConnectionFactory.closeConnection(con, stmt, rs);
        return atividades;
    }

    @Override
    public void delete(Atividade a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String del = "DELETE FROM ATIVIDADE WHERE ID = ?";
        PreparedStatement stmt = con.prepareStatement(del);
        stmt.setInt(1, a.getId());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }

    //Proximas atts
    @Override
    public ArrayList<Atividade> dayActivitys() throws SQLException {
        ArrayList<Atividade> atividades = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String dayA = "SELECT * FROM ATIVIDADE WHERE dataatv = CURRENT_DATE";
        PreparedStatement stmt = con.prepareStatement(dayA);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Atividade a = new Atividade();
            a.setNome(rs.getString("nome"));
            a.setLocall(rs.getString("locall"));
            a.setDataa(rs.getDate("dataa"));
            a.setHora(rs.getTime("hora"));
            atividades.add(a);
        }
        ConnectionFactory.closeConnection(con, stmt, rs);
        return atividades;
    }
    //Proximas atts
    @Override
    public ArrayList<Atividade> weekActivitys() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
