/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Esporte;

/**
 *
 * @author ncs
 */
public interface EsportesDAO {
    public ArrayList<Esporte> getAll() throws SQLException;
}
