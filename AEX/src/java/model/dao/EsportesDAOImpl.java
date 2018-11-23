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
import model.bean.Esporte;

/**
 *
 * @author ncs
 */
public class EsportesDAOImpl implements EsportesDAO{
    @Override
    public ArrayList<Esporte> getAll() throws SQLException {
        ArrayList<Esporte> atividades = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String get = "SELECT * FROM ESPORTES";
        PreparedStatement stmt = con.prepareStatement(get);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Esporte e = new Esporte();
            e.setNome(rs.getString("nome"));
            e.setOrganizador(rs.getString("organizador"));
            e.setLocall(rs.getString("locall"));
            e.setDia(rs.getString("dia"));
            e.setHora(rs.getTime("hora"));
            atividades.add(e);
        }
        ConnectionFactory.closeConnection(con, stmt, rs);
        return atividades;
    }
}
