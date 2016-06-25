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
public class ExposicaoCandidaturaAtribuidaStandStateTest {
    
    public ExposicaoCandidaturaAtribuidaStandStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturaAtribuidaStandState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
       ExposicaoCandidaturaAtribuidaStandState instance= new  ExposicaoCandidaturaAtribuidaStandState (m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoStandsConfirmados method, of class ExposicaoCandidaturaAtribuidaStandState.
     */
    @Test
    public void testSetExposicaoStandsConfirmados() {
        System.out.println("setExposicaoStandsConfirmados");
        Exposicao m_e = new Exposicao ();
       ExposicaoCandidaturaAtribuidaStandState instance= new  ExposicaoCandidaturaAtribuidaStandState (m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoStandsConfirmados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturasAtribuidas method, of class ExposicaoCandidaturaAtribuidaStandState.
     */
    @Test
    public void testIsEstadoCandidaturasAtribuidas() {
        System.out.println("isEstadoCandidaturasAtribuidas");
        Exposicao m_e = new Exposicao ();
       ExposicaoCandidaturaAtribuidaStandState instance= new  ExposicaoCandidaturaAtribuidaStandState (m_e) ;
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }
    
}
