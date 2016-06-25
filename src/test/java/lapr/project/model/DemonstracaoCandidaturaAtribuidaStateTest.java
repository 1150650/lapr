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
public class DemonstracaoCandidaturaAtribuidaStateTest {
    
    public DemonstracaoCandidaturaAtribuidaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setCandidaturaEmAvaliacao method, of class DemonstracaoCandidaturaAtribuidaState.
     */
    @Test
    public void testSetCandidaturaEmAvaliacao() {
        System.out.println("setCandidaturaEmAvaliacao");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAtribuidaState instance = new DemonstracaoCandidaturaAtribuidaState(d);
        
        boolean expResult = false;
        boolean result = instance.setCandidaturaEmAvaliacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturaAtribuidaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAtribuidaState instance = new DemonstracaoCandidaturaAtribuidaState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturasAtribuidas method, of class DemonstracaoCandidaturaAtribuidaState.
     */
    @Test
    public void testIsEstadoCandidaturasAtribuidas() {
        System.out.println("isEstadoCandidaturasAtribuidas");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAtribuidaState instance = new DemonstracaoCandidaturaAtribuidaState(d);
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturasAtribuidas();
        assertEquals(expResult, result);
        
    }
    
}
