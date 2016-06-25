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
public class DemonstracaoCandidaturaRetiradaStateTest {
    
    public DemonstracaoCandidaturaRetiradaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEstadoCandidaturaRetirada method, of class DemonstracaoCandidaturaRetiradaState.
     */
    @Test
    public void testIsEstadoCandidaturaRetirada() {
        System.out.println("isEstadoCandidaturaRetirada");
        Demonstracao d = new Demonstracao ();
       DemonstracaoCandidaturaRetiradaState instance  = new   DemonstracaoCandidaturaRetiradaState (d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaRetirada();
        assertEquals(expResult, result);
        
    }
    
}
