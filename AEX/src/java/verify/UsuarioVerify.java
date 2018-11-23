/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;

import model.bean.Usuario;

/**
 *
 * @author ncs
 */
public class UsuarioVerify {
    
    public boolean verifyNome(Usuario u){
        String nome = u.getNome();
        return nome.matches("^[[ ]|\\p{L}*]+$");
    }
}
