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
public class ExposiçãoConflitosAlteradosStateTest {
    
    public ExposiçãoConflitosAlteradosStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoConflitosAlteradosState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
        
        ExposiçãoConflitosAlteradosState instance = new ExposiçãoConflitosAlteradosState(m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidas method, of class ExposiçãoConflitosAlteradosState.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidas() {
        System.out.println("setExposicaoCandidaturasAtribuidas");
         Exposicao m_e = new Exposicao ();
        
        ExposiçãoConflitosAlteradosState instance = new ExposiçãoConflitosAlteradosState(m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoConflitosAlterados method, of class ExposiçãoConflitosAlteradosState.
     */
    @Test
    public void testIsEstadoConflitosAlterados() {
        System.out.println("isEstadoConflitosAlterados");
         Exposicao m_e = new Exposicao ();
        
        ExposiçãoConflitosAlteradosState instance = new ExposiçãoConflitosAlteradosState(m_e) ;
        boolean expResult = true;
        boolean result = instance.isEstadoConflitosAlterados();
        assertEquals(expResult, result);
        
    }
    
}
