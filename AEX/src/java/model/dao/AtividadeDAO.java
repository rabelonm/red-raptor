/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Atividade;

/**
 *
 * @author Nicolas
 */
public interface AtividadeDAO {
    public void create(Atividade a) throws SQLException;
    public ArrayList<Atividade> getAll() throws SQLException;
    public void delete(Atividade a) throws SQLException;
    public ArrayList<Atividade> dayActivitys() throws SQLException;
    public ArrayList<Atividade> weekActivitys() throws SQLException;
}
