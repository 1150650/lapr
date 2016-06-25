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
public class ExposiçãoCriadaStateTest {
    
    public ExposiçãoCriadaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setExposicaoFAESemDemonstracoes method, of class ExposiçãoCriadaState.
     */
    @Test
    public void testSetExposicaoFAESemDemonstracoes() {
        System.out.println("setExposicaoFAESemDemonstracoes");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCriadaState instance = new ExposiçãoCriadaState( m_e );
        boolean expResult = true;
        boolean result = instance.setExposicaoFAESemDemonstracoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDemonstracoesSemFAE method, of class ExposiçãoCriadaState.
     */
    @Test
    public void testSetDemonstracoesSemFAE() {
        System.out.println("setDemonstracoesSemFAE");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCriadaState instance = new ExposiçãoCriadaState( m_e );
        boolean expResult = true;
        boolean result = instance.setDemonstracoesSemFAE();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class ExposiçãoCriadaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCriadaState instance = new ExposiçãoCriadaState( m_e );
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCriada method, of class ExposiçãoCriadaState.
     */
    @Test
    public void testIsEstadoCriada() {
        System.out.println("isEstadoCriada");
        Exposicao m_e = new Exposicao ();
        ExposiçãoCriadaState instance = new ExposiçãoCriadaState( m_e );
        boolean expResult = true;
        boolean result = instance.isEstadoCriada();
        assertEquals(expResult, result);
        
    }
    
}
