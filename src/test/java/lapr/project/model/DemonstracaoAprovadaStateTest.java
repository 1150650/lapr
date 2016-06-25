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
public class DemonstracaoAprovadaStateTest {
    
    public DemonstracaoAprovadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setAbertaACandidaturas method, of class DemonstracaoAprovadaState.
     */
    @Test
    public void testSetAbertaACandidaturas() {
        System.out.println("setAbertaACandidaturas");
        Demonstracao d = new Demonstracao ();
         
         DemonstracaoAprovadaState instance = new  DemonstracaoAprovadaState(d);
        boolean expResult = false;
        boolean result = instance.setAbertaACandidaturas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoAprovadaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
         
         DemonstracaoAprovadaState instance = new  DemonstracaoAprovadaState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isEstadoDemonstracaoAprovada method, of class DemonstracaoAprovadaState.
     */
    @Test
    public void testIsEstadoDemonstracaoAprovada() {
        System.out.println("isEstadoDemonstracaoAprovada");
        Demonstracao d = new Demonstracao ();
         
         DemonstracaoAprovadaState instance = new  DemonstracaoAprovadaState(d);
       
        boolean expResult = true;
        boolean result = instance.isEstadoDemonstracaoAprovada();
        assertEquals(expResult, result);
        
    }
    
}
