/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.bean.Usuario;

/**
 *
 * @author Nicolas
 */
public interface UsuarioDAO {
    public void create(Usuario a) throws SQLException;
    public boolean checkLogin(String email, String senha)throws SQLException;
}
