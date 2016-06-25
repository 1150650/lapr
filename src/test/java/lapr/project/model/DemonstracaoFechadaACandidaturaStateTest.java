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
public class DemonstracaoFechadaACandidaturaStateTest {
    
    public DemonstracaoFechadaACandidaturaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setConflitosCandidaturaDetetados method, of class DemonstracaoFechadaACandidaturaState.
     */
    @Test
    public void testSetConflitosCandidaturaDetetados() {
        System.out.println("setConflitosCandidaturaDetetados");
        Demonstracao d = new Demonstracao ();
        DemonstracaoFechadaACandidaturaState instance = new DemonstracaoFechadaACandidaturaState(d);
        boolean expResult = false;
        boolean result = instance.setConflitosCandidaturaDetetados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoFechadaACandidaturaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
        DemonstracaoFechadaACandidaturaState instance = new DemonstracaoFechadaACandidaturaState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoFechadaACandidaturas method, of class DemonstracaoFechadaACandidaturaState.
     */
    @Test
    public void testIsEstadoFechadaACandidaturas() {
        System.out.println("isEstadoFechadaACandidaturas");
        Demonstracao d = new Demonstracao ();
        DemonstracaoFechadaACandidaturaState instance = new DemonstracaoFechadaACandidaturaState(d);
        boolean expResult = true;
        boolean result = instance.isEstadoFechadaACandidaturas();
        assertEquals(expResult, result);
        
    }
    
}
