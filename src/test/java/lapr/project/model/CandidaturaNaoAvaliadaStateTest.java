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
 * @author Diogo
 */
public class CandidaturaNaoAvaliadaStateTest {
    
    public CandidaturaNaoAvaliadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEstadoNaoAvaliada method, of class CandidaturaNaoAvaliadaState.
     */
    @Test
    public void testIsEstadoNaoAvaliada() {
        System.out.println("isEstadoNaoAvaliada");
        Candidatura candidatura = new Candidatura();
        CandidaturaNaoAvaliadaState instance = new CandidaturaNaoAvaliadaState(candidatura);
        boolean expResult = true;
        boolean result = instance.isEstadoNaoAvaliada();
        assertEquals(expResult, result);
    }
    
}
