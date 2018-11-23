/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Monitoria;

/**
 *
 * @author Nicolas
 */
public interface MonitoriaDAO {
    public void create(Monitoria m) throws SQLException;
    public ArrayList<Monitoria> getAll() throws SQLException;
    public void delete(Monitoria m) throws SQLException;
}
