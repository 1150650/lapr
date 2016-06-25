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
public class DemonstracaoCandidaturaConflitosDetetadosTest {
    
    public DemonstracaoCandidaturaConflitosDetetadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setConflitosCandidaturaAlterados method, of class DemonstracaoCandidaturaConflitosDetetados.
     */
    @Test
    public void testSetConflitosCandidaturaAlterados() {
        System.out.println("setConflitosCandidaturaAlterados");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosDetetados instance = new DemonstracaoCandidaturaConflitosDetetados(d);
        boolean expResult = false;
        boolean result = instance.setConflitosCandidaturaAlterados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturaConflitosDetetados.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosDetetados instance = new DemonstracaoCandidaturaConflitosDetetados(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoConflitosCandidaturaDetetados method, of class DemonstracaoCandidaturaConflitosDetetados.
     */
    @Test
    public void testIsEstadoConflitosCandidaturaDetetados() {
        System.out.println("isEstadoConflitosCandidaturaDetetados");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosDetetados instance = new DemonstracaoCandidaturaConflitosDetetados(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoConflitosCandidaturaDetetados();
        assertEquals(expResult, result);
        
    }
    
}
