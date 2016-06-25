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
public class DemonstracaoCandidaturaAceiteTest {
    
    public DemonstracaoCandidaturaAceiteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isEstadoCandidaturaAceite method, of class DemonstracaoCandidaturaAceite.
     */
    @Test
    public void testIsEstadoCandidaturaAceite() {
        System.out.println("isEstadoCandidaturaAceite");
        Demonstracao d = new Demonstracao ();
         
       DemonstracaoCandidaturaAceite instance = new  DemonstracaoCandidaturaAceite(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturaAceite();
        assertEquals(expResult, result);
        
    }
    
}
