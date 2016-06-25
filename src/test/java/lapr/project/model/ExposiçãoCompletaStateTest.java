/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ExposiçãoCompletaStateTest {
    
    public ExposiçãoCompletaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoCompletaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
         Exposicao m_e = new Exposicao ();
        ExposiçãoCompletaState instance = new  ExposiçãoCompletaState(m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoAbertaParaCandidaturas method, of class ExposiçãoCompletaState.
     */
    @Test
    public void testSetExposicaoAbertaParaCandidaturas() {
        System.out.println("setExposicaoAbertaParaCandidaturas");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCompletaState instance = new  ExposiçãoCompletaState(m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoAbertaParaCandidaturas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCompleta method, of class ExposiçãoCompletaState.
     */
    @Test
    public void testIsEstadoCompleta() {
        System.out.println("isEstadoCompleta");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCompletaState instance = new  ExposiçãoCompletaState(m_e) ;
        boolean expResult = true;
        boolean result = instance.isEstadoCompleta();
        assertEquals(expResult, result);
        
    }
    
}
