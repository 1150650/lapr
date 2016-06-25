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
public class ExposiçãoComConflitosDetetadosStateTest {
    
    public ExposiçãoComConflitosDetetadosStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoComConflitosDetetadosState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
        ExposiçãoComConflitosDetetadosState instance = new  ExposiçãoComConflitosDetetadosState(m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoCandidaturasConflitosAlterados method, of class ExposiçãoComConflitosDetetadosState.
     */
    @Test
    public void testSetExposicaoCandidaturasConflitosAlterados() {
        System.out.println("setExposicaoCandidaturasConflitosAlterados");
       Exposicao m_e = new Exposicao ();
        ExposiçãoComConflitosDetetadosState instance = new  ExposiçãoComConflitosDetetadosState(m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasConflitosAlterados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoConflitosDetetados method, of class ExposiçãoComConflitosDetetadosState.
     */
    @Test
    public void testIsEstadoConflitosDetetados() {
        System.out.println("isEstadoConflitosDetetados");
        Exposicao m_e = new Exposicao ();
        ExposiçãoComConflitosDetetadosState instance = new  ExposiçãoComConflitosDetetadosState(m_e) ;
         
        boolean expResult = true;
        boolean result = instance.isEstadoConflitosDetetados();
        assertEquals(expResult, result);
        
    }
    
}
