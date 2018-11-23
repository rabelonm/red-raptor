/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.bean.SolicitarCelulaPACCE;

/**
 *
 * @author ncs
 */
public interface SolicitarCelulaPACCEDAO {
    public void create(SolicitarCelulaPACCE scp) throws SQLException;
}
