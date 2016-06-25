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
public class DemonstracaoCandidaturaNaoAvaliadaStateTest {
    
    public DemonstracaoCandidaturaNaoAvaliadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEstadoCandidaturaNaoAvaliada method, of class DemonstracaoCandidaturaNaoAvaliadaState.
     */
    @Test
    public void testIsEstadoCandidaturaNaoAvaliada() {
        System.out.println("isEstadoCandidaturaNaoAvaliada");
        
         Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaNaoAvaliadaState instance = new DemonstracaoCandidaturaNaoAvaliadaState(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaNaoAvaliada();
        assertEquals(expResult, result);
        
    }
    
}
