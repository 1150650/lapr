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
public class ExposicaoStandsConfirmadosStateTest {
    
    public ExposicaoStandsConfirmadosStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposicaoStandsConfirmadosState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
       ExposicaoStandsConfirmadosState instance= new ExposicaoStandsConfirmadosState (m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoStandsConfirmados method, of class ExposicaoStandsConfirmadosState.
     */
    @Test
    public void testSetExposicaoStandsConfirmados() {
        System.out.println("setExposicaoStandsConfirmados");
        Exposicao m_e = new Exposicao ();
       ExposicaoStandsConfirmadosState instance= new ExposicaoStandsConfirmadosState (m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoStandsConfirmados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoStandConfirmado method, of class ExposicaoStandsConfirmadosState.
     */
    @Test
    public void testIsEstadoStandConfirmado() {
        System.out.println("isEstadoStandConfirmado");
        
        Exposicao m_e = new Exposicao ();
       ExposicaoStandsConfirmadosState instance= new ExposicaoStandsConfirmadosState (m_e) ;
         
        boolean expResult = true;
        boolean result = instance.isEstadoStandConfirmado();
        assertEquals(expResult, result);
        
    }
    
}
