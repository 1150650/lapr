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
public class DemonstracaoCandidaturaAvaliadaStateTest {
    
    public DemonstracaoCandidaturaAvaliadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setCandidaturaAceite method, of class DemonstracaoCandidaturaAvaliadaState.
     */
    @Test
    public void testSetCandidaturaAceite() {
        System.out.println("setCandidaturaAceite");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliadaState instance = new DemonstracaoCandidaturaAvaliadaState(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturaAceite();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaAvaliada method, of class DemonstracaoCandidaturaAvaliadaState.
     */
    @Test
    public void testSetCandidaturaAvaliada() {
        System.out.println("setCandidaturaAvaliada");
       Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliadaState instance = new DemonstracaoCandidaturaAvaliadaState(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturaAvaliada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturaAvaliadaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
       Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliadaState instance = new DemonstracaoCandidaturaAvaliadaState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturaAvaliada method, of class DemonstracaoCandidaturaAvaliadaState.
     */
    @Test
    public void testIsEstadoCandidaturaAvaliada() {
        System.out.println("isEstadoCandidaturaAvaliada");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliadaState instance = new DemonstracaoCandidaturaAvaliadaState(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaAvaliada();
        assertEquals(expResult, result);
        
    }
    
}
