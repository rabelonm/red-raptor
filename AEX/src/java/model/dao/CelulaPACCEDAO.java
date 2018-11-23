/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.CelulaPACCE;

/**
 *
 * @author Nicolas
 */
public interface CelulaPACCEDAO {
    public void create(CelulaPACCE cp) throws SQLException;
    public ArrayList<CelulaPACCE> getAll() throws SQLException;
    public void delete(CelulaPACCE cp) throws SQLException;
}
