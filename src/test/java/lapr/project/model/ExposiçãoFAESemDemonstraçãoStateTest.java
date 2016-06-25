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
public class ExposiçãoFAESemDemonstraçãoStateTest {
    
    public ExposiçãoFAESemDemonstraçãoStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoFAESemDemonstraçãoState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
       Exposicao m_e = new Exposicao ();
        ExposiçãoFAESemDemonstraçãoState instance = new ExposiçãoFAESemDemonstraçãoState( m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setExposicaoCompleta method, of class ExposiçãoFAESemDemonstraçãoState.
     */
    @Test
    public void testSetExposicaoCompleta() {
        System.out.println("setExposicaoCompleta");
        Exposicao m_e = new Exposicao ();
        ExposiçãoFAESemDemonstraçãoState instance = new ExposiçãoFAESemDemonstraçãoState( m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCompleta();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of isEstadoFAESemDemonstracao method, of class ExposiçãoFAESemDemonstraçãoState.
     */
    @Test
    public void testIsEstadoFAESemDemonstracao() {
        System.out.println("isEstadoFAESemDemonstracao");
        Exposicao m_e = new Exposicao ();
        ExposiçãoFAESemDemonstraçãoState instance = new ExposiçãoFAESemDemonstraçãoState( m_e) ;
        boolean expResult = true;
        boolean result = instance.isEstadoFAESemDemonstracao();
        assertEquals(expResult, result);
        
        
    }
    
}
