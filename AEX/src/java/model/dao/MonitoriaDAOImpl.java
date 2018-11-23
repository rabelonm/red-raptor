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
import model.bean.Monitoria;

/**
 *
 * @author Nicolas
 */
public class MonitoriaDAOImpl implements MonitoriaDAO{

    @Override
    public void create(Monitoria m) throws SQLException {
       Connection con = ConnectionFactory.getConnection();
       String crt = "INSERT INTO MONITORIA(materia, monitor, locall, dia, hora) VALUES"
               + "(?,?,?,?,?)";
       PreparedStatement stmt = con.prepareStatement(crt);
       stmt.setString(1, m.getMateria());
       stmt.setString(2, m.getMonitor());
       stmt.setString(3, m.getLocall());
       stmt.setString(4, m.getDia());
       stmt.setTime(5, m.getHora());
       stmt.execute();
       ConnectionFactory.closeConnection(con, stmt);
    }

    @Override
    public void delete(Monitoria m) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String del = "DELETE FROM MONITORIA WHERE ID=?";
        PreparedStatement stmt = con.prepareStatement(del);
        stmt.setInt(1, m.getId());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }

    @Override
    public ArrayList<Monitoria> getAll() throws SQLException {
       ArrayList<Monitoria> monitorias = new ArrayList<>();
       Connection con = ConnectionFactory.getConnection();
       String get = "SELECT * FROM MONITORIA";
       PreparedStatement stmt = con.prepareStatement(get);
       ResultSet rs = stmt.executeQuery();
       while(rs.next()){
           Monitoria m = new Monitoria();
           m.setMateria(rs.getString("materia"));
           m.setMonitor(rs.getString("monitor"));
           m.setLocall(rs.getString("locall"));
           m.setDia(rs.getString("dia"));
           m.setHora(rs.getTime("hora"));
           monitorias.add(m);
       }
       ConnectionFactory.closeConnection(con, stmt, rs);
       return monitorias;
    }
    
}
