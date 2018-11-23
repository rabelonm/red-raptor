/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.SolicitarCelulaPACCE;

/**
 *
 * @author ncs
 */
public class SolicitarCelulaPACCEDAOImpl implements SolicitarCelulaPACCEDAO{

    @Override
    public void create(SolicitarCelulaPACCE scp) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String crt = "INSERT INTO SOLICITAR_CELULA_PACCE(nome, nome_articulador, descricao, email)"
                + "VALUES (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(crt);
        stmt.setString(1, scp.getNome());
        stmt.setString(2, scp.getNomeArticulador());
        stmt.setString(3, scp.getDescricao());
        stmt.setString(4, scp.getEmail());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
}
