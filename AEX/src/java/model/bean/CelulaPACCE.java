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
public class CelulaPACCE {
    private int id;
    private String nome;
    private String articularor;
    private String locall;
    private String dia;
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

    public String getArticularor() {
        return articularor;
    }

    public void setArticularor(String articularor) {
        this.articularor = articularor;
    }

    public String getLocall() {
        return locall;
    }

    public void setLocall(String locall) {
        this.locall = locall;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
