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
public class DemonstracaoCandidaturaAvaliacaoStateTest {
    
    public DemonstracaoCandidaturaAvaliacaoStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setCandidaturaNaoAvaliada method, of class DemonstracaoCandidaturaAvaliacaoState.
     */
    @Test
    public void testSetCandidaturaNaoAvaliada() {
        System.out.println("setCandidaturaNaoAvaliada");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliacaoState instance = new DemonstracaoCandidaturaAvaliacaoState(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturaNaoAvaliada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaAvaliada method, of class DemonstracaoCandidaturaAvaliacaoState.
     */
    @Test
    public void testSetCandidaturaAvaliada() {
        System.out.println("setCandidaturaAvaliada");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliacaoState instance = new DemonstracaoCandidaturaAvaliacaoState(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturaAvaliada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturaAvaliacaoState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliacaoState instance = new DemonstracaoCandidaturaAvaliacaoState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturaEmAvaliacao method, of class DemonstracaoCandidaturaAvaliacaoState.
     */
    @Test
    public void testIsEstadoCandidaturaEmAvaliacao() {
        System.out.println("isEstadoCandidaturaEmAvaliacao");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaAvaliacaoState instance = new DemonstracaoCandidaturaAvaliacaoState(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaEmAvaliacao();
        assertEquals(expResult, result);
        
    }
    
}
