/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;

import model.bean.SolicitarCelulaPACCE;

/**
 *
 * @author ncs
 */
public class SolicitarCelulaPACCEVerify {
    
    public boolean verifyNome(SolicitarCelulaPACCE s){
        String nome = s.getNome();
        return nome.matches("^[[ ]|\\p{L}*]+$");
    }
    public boolean verifyNomeArticulador(SolicitarCelulaPACCE s){
        String nomeArticulador = s.getNome();
        return nomeArticulador.matches("^[[ ]|\\p{L}*]+$");
    }
    
}
