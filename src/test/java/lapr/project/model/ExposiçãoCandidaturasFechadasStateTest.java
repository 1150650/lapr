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
public class ExposiçãoCandidaturasFechadasStateTest {
    
    public ExposiçãoCandidaturasFechadasStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoCandidaturasFechadasState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
       
        ExposiçãoCandidaturasFechadasState instance =new  ExposiçãoCandidaturasFechadasState(m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setExposicaoCandidaturasConflitosDetetados method, of class ExposiçãoCandidaturasFechadasState.
     */
    @Test
    public void testSetExposicaoCandidaturasConflitosDetetados() {
        System.out.println("setExposicaoCandidaturasConflitosDetetados");
        Exposicao m_e = new Exposicao ();
       
        ExposiçãoCandidaturasFechadasState instance =new  ExposiçãoCandidaturasFechadasState(m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasConflitosDetetados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturasFechadas method, of class ExposiçãoCandidaturasFechadasState.
     */
    @Test
    public void testIsEstadoCandidaturasFechadas() {
        System.out.println("isEstadoCandidaturasFechadas");
        Exposicao m_e = new Exposicao ();
       
        ExposiçãoCandidaturasFechadasState instance =new  ExposiçãoCandidaturasFechadasState(m_e) ;
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturasFechadas();
        assertEquals(expResult, result);
        
    }
    
}
