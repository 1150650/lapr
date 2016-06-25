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
public class DemonstracaoCandidaturaConflitosAlteradosTest {
    
    public DemonstracaoCandidaturaConflitosAlteradosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setCandidaturasAtribuidas method, of class DemonstracaoCandidaturaConflitosAlterados.
     */
    @Test
    public void testSetCandidaturasAtribuidas() {
        System.out.println("setCandidaturasAtribuidas");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosAlterados instance  = new DemonstracaoCandidaturaConflitosAlterados(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturasAtribuidas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturaConflitosAlterados.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosAlterados instance  = new DemonstracaoCandidaturaConflitosAlterados(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoConflitosCandidaturaAlterados method, of class DemonstracaoCandidaturaConflitosAlterados.
     */
    @Test
    public void testIsEstadoConflitosCandidaturaAlterados() {
        System.out.println("isEstadoConflitosCandidaturaAlterados");
        Demonstracao d = new Demonstracao ();
         
        DemonstracaoCandidaturaConflitosAlterados instance  = new DemonstracaoCandidaturaConflitosAlterados(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoConflitosCandidaturaAlterados();
        assertEquals(expResult, result);
       
    }
    
}
