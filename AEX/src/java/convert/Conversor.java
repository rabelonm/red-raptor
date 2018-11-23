/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ncs
 */
public class Conversor {
    public Date converterDate(String ano, String mes, String dia){
        int anoo = Integer.parseInt(ano);
        int mess = Integer.parseInt(mes);
        int diaa = Integer.parseInt(dia);
        Date data = new Date(anoo-1900, mess, diaa);
        return data;
    }
    public Time converterHora(String hora, String min){
        int horaa = Integer.parseInt(hora);
        int minu = Integer.parseInt(min);
        Time t = new Time(horaa, minu, 00);
        return t;
    }
}

