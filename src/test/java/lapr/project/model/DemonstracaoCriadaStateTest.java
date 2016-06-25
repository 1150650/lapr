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
public class DemonstracaoCriadaStateTest {
    
    public DemonstracaoCriadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setDemonstracaoAprovada method, of class DemonstracaoCriadaState.
     */
    @Test
    public void testSetDemonstracaoAprovada() {
        System.out.println("setDemonstracaoAprovada");
        Demonstracao d = new Demonstracao ();
       DemonstracaoCriadaState instance  = new   DemonstracaoCriadaState(d);
        
        boolean expResult = true;
        boolean result = instance.setDemonstracaoAprovada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCriadaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
       DemonstracaoCriadaState instance  = new   DemonstracaoCriadaState(d);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoDemonstracaoCriada method, of class DemonstracaoCriadaState.
     */
    @Test
    public void testIsEstadoDemonstracaoCriada() {
        System.out.println("isEstadoDemonstracaoCriada");
        Demonstracao d = new Demonstracao ();
       DemonstracaoCriadaState instance  = new   DemonstracaoCriadaState(d);
        boolean expResult = true;
        boolean result = instance.isEstadoDemonstracaoCriada();
        assertEquals(expResult, result);
        
    }
    
}
