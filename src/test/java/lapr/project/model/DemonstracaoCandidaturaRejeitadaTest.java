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
public class DemonstracaoCandidaturaRejeitadaTest {
    
    public DemonstracaoCandidaturaRejeitadaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEstadoCandidaturaRejeitada method, of class DemonstracaoCandidaturaRejeitada.
     */
    @Test
    public void testIsEstadoCandidaturaRejeitada() {
        System.out.println("isEstadoCandidaturaRejeitada");
        
         Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaRejeitada instance = new DemonstracaoCandidaturaRejeitada(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaRejeitada();
        assertEquals(expResult, result);
        
    }
    
}
