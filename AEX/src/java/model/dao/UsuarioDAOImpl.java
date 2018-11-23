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
import model.bean.Usuario;

/**
 *
 * @author Nicolas
 */
public class UsuarioDAOImpl implements UsuarioDAO{

    @Override
    public void create(Usuario a) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        String crt = "INSERT INTO USUARIO(nome, email, senha) VALUES (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(crt);
        stmt.setString(1, a.getNome());
        stmt.setString(2, a.getEmail());
        stmt.setString(3, a.getSenha());
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }

    @Override
    public boolean checkLogin(String email, String senha) throws SQLException {
        boolean check = false;
        Connection con = ConnectionFactory.getConnection();
        String select = "SELECT * FROM USUARIO WHERE email=? and senha=?";
        PreparedStatement stmt = con.prepareStatement(select);
        stmt.setString(1, email);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            check = true;
        }
        return check;
    } 
}
