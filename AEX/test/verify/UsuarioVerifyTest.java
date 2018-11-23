/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;

import model.bean.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ncs
     */
public class UsuarioVerifyTest {
    Usuario u;
    UsuarioVerify uv;
    
    @Before
    public void setUp() {
        u = new Usuario();
        u.setNome("Robersvaldo");
        //u.setNome("1123sdad");
        //u.setNome("@ahsau");
        uv = new UsuarioVerify();
    }
    
    /**
     * Test of verifyNome method, of class UsuarioVerify.
     */
    @Test
    public void testVerifyNome() {
        System.out.println("verifyNome");
        boolean expResult = true;
        boolean result = uv.verifyNome(u);
        assertEquals(expResult, result);
    }
    
}
