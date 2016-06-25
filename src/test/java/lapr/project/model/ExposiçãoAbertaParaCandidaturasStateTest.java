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
public class ExposiçãoAbertaParaCandidaturasStateTest {
    
    public ExposiçãoAbertaParaCandidaturasStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoAbertaParaCandidaturasState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
       ExposiçãoAbertaParaCandidaturasState instance= new ExposiçãoAbertaParaCandidaturasState (m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoCandidaturasFechadas method, of class ExposiçãoAbertaParaCandidaturasState.
     */
    @Test
    public void testSetExposicaoCandidaturasFechadas() {
        System.out.println("setExposicaoCandidaturasFechadas");
        Exposicao m_e = new Exposicao ();
       ExposiçãoAbertaParaCandidaturasState instance= new ExposiçãoAbertaParaCandidaturasState (m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasFechadas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoAbertaParaCandidaturas method, of class ExposiçãoAbertaParaCandidaturasState.
     */
    @Test
    public void testIsEstadoAbertaParaCandidaturas() {
        System.out.println("isEstadoAbertaParaCandidaturas");
        Exposicao m_e = new Exposicao ();
       ExposiçãoAbertaParaCandidaturasState instance= new ExposiçãoAbertaParaCandidaturasState (m_e) ;
         
        boolean expResult = true;
        boolean result = instance.isEstadoAbertaParaCandidaturas();
        assertEquals(expResult, result);
        
    }
    
}
