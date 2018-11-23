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
import model.bean.CelulaPACCE;

/**
 *
 * @author Nicolas
 */
public class CelulaPACCEDAOImpl implements CelulaPACCEDAO{

    @Override
    public void create(CelulaPACCE cp) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String crt = "INSERT INTO CELULA_PACCE(nome, articulador, locall, dia, hora)"
                + "VALUES (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(crt);
        stmt.setString(1, cp.getNome());
        stmt.setString(2, cp.getArticularor());
        stmt.setString(3, cp.getLocall());
        stmt.setString(4, cp.getDia());
        stmt.setTime(5, cp.getHora());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }

    @Override
    public void delete(CelulaPACCE cp) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String del = "DELETE FROM CELULA_PACCE WHERE ID=?";
        PreparedStatement stmt = con.prepareStatement(del);
        stmt.setInt(1, cp.getId());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }

    @Override
    public ArrayList<CelulaPACCE> getAll() throws SQLException {
       ArrayList<CelulaPACCE> celulas = new ArrayList<>();
       Connection con = ConnectionFactory.getConnection();
       String get = "SELECT * FROM CELULA_PACCE";
       PreparedStatement stmt = con.prepareStatement(get);
       ResultSet rs = stmt.executeQuery();
       while(rs.next()){
           CelulaPACCE cp = new CelulaPACCE();
           cp.setNome(rs.getString("nome"));
           cp.setArticularor(rs.getString("articulador"));
           cp.setLocall(rs.getString("locall"));
           cp.setDia(rs.getString("dia"));
           cp.setHora(rs.getTime("hora"));
           celulas.add(cp);
       }
       ConnectionFactory.closeConnection(con, stmt, rs);
       return celulas;
    }
}
  
