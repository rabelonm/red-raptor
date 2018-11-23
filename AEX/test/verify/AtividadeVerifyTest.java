/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verify;

import model.bean.Atividade;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ncs
 */
public class AtividadeVerifyTest {
    Atividade a;
    AtividadeVerify av;
 
    @Before
    public void setUp() {
        a = new Atividade();
        //a.setNome("Joao Pedro");
        //a.setNome("1pedro");
        a.setNome("João");
        a.setLocall("Sala sete");
        av = new AtividadeVerify();
    }
    
    /**
     * Test of verifyNome method, of class AtividadeVerify.
     */
    @Test
    public void testVerifyNome() {
        System.out.println("verifyNome");
        boolean expResult = true;
        boolean result = av.verifyNome(a);
        assertEquals(expResult, result);
    }
}
