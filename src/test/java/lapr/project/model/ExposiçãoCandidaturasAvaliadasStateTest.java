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
public class ExposiçãoCandidaturasAvaliadasStateTest {
    
    public ExposiçãoCandidaturasAvaliadasStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of valida method, of class ExposiçãoCandidaturasAvaliadasState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao m_e = new Exposicao ();
       
        
        ExposiçãoCandidaturasAvaliadasState instance =new   ExposiçãoCandidaturasAvaliadasState(m_e) ;
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidasStand method, of class ExposiçãoCandidaturasAvaliadasState.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidasStand() {
        System.out.println("setExposicaoCandidaturasAtribuidasStand");
        Exposicao m_e = new Exposicao ();
       
        
        ExposiçãoCandidaturasAvaliadasState instance =new   ExposiçãoCandidaturasAvaliadasState(m_e) ;
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidasStand();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturasAvaliadas method, of class ExposiçãoCandidaturasAvaliadasState.
     */
    @Test
    public void testIsEstadoCandidaturasAvaliadas() {
        System.out.println("isEstadoCandidaturasAvaliadas");
        Exposicao m_e = new Exposicao ();
       
        
        ExposiçãoCandidaturasAvaliadasState instance =new   ExposiçãoCandidaturasAvaliadasState(m_e) ;
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturasAvaliadas();
        assertEquals(expResult, result);
        
    }
    
}
