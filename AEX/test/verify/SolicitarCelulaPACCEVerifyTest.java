/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;

import model.bean.SolicitarCelulaPACCE;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ncs
 */
public class SolicitarCelulaPACCEVerifyTest {
    SolicitarCelulaPACCE s;
    SolicitarCelulaPACCEVerify sv;
    
    @Before
    public void setUp() {
        s = new SolicitarCelulaPACCE();
        s.setNome("Ronaldo");
        //s.setNome("11amanso");
        //s.setNome("rOgeriO");
        s.setNomeArticulador("Rogerio");
        //s.setNomeArticulador("123sad1");
        sv = new SolicitarCelulaPACCEVerify();
    }
    
    /**
     * Test of verifyNome method, of class SolicitarCelulaPACCEVerify.
     */
    @Test
    public void testVerifyNome() {
        System.out.println("verifyNome");
        boolean expResult = true;
        boolean result = sv.verifyNome(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifyNomeArticulador method, of class SolicitarCelulaPACCEVerify.
     */
    @Test
    public void testVerifyNomeArticulador() {
        System.out.println("verifyNomeArticulador");
        boolean expResult = true;
        boolean result = sv.verifyNomeArticulador(s);
        assertEquals(expResult, result);
    }
    
}
