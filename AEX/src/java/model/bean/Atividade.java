/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Nicolas
 */
public class Atividade {
    private int id;
    private String nome;
    private String locall;
    private Date dataa;
    private Time hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocall() {
        return locall;
    }

    public void setLocall(String locall) {
        this.locall = locall;
    }

    public Date getDataa() {
        return dataa;
    }

    public void setDataa(Date dataa) {
        this.dataa = dataa;
    }
   
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

}
