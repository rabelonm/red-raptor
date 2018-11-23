/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;
import model.bean.Atividade;

/**
 *
 * @author ncs
 */
public class AtividadeVerify {
    
    public boolean verifyNome(Atividade a){
        String nome = a.getNome();
        return nome.matches("^[[ ]|\\p{L}*]+$");
    }
}
