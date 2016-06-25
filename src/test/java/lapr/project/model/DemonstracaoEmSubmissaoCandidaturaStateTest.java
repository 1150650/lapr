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
public class DemonstracaoEmSubmissaoCandidaturaStateTest {
    
    public DemonstracaoEmSubmissaoCandidaturaStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setFechadaACandidaturas method, of class DemonstracaoEmSubmissaoCandidaturaState.
     */
    @Test
    public void testSetFechadaACandidaturas() {
        System.out.println("setFechadaACandidaturas");
        Demonstracao d = new Demonstracao ();
       DemonstracaoEmSubmissaoCandidaturaState instance = new DemonstracaoEmSubmissaoCandidaturaState(d);
        boolean expResult = false;
        boolean result = instance.setFechadaACandidaturas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaRetirada method, of class DemonstracaoEmSubmissaoCandidaturaState.
     */
    @Test
    public void testSetCandidaturaRetirada() {
        System.out.println("setCandidaturaRetirada");
        Demonstracao d = new Demonstracao ();
       DemonstracaoEmSubmissaoCandidaturaState instance = new DemonstracaoEmSubmissaoCandidaturaState(d);
        boolean expResult = false;
        boolean result = instance.setCandidaturaRetirada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class DemonstracaoEmSubmissaoCandidaturaState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao d = new Demonstracao ();
       DemonstracaoEmSubmissaoCandidaturaState instance = new DemonstracaoEmSubmissaoCandidaturaState(d);
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstadoCandidaturasEmSubmissao method, of class DemonstracaoEmSubmissaoCandidaturaState.
     */
    @Test
    public void testIsEstadoCandidaturasEmSubmissao() {
        System.out.println("isEstadoCandidaturasEmSubmissao");
        Demonstracao d = new Demonstracao ();
       DemonstracaoEmSubmissaoCandidaturaState instance = new DemonstracaoEmSubmissaoCandidaturaState(d);
        
        boolean expResult = true;
        boolean result = instance.isEstadoCandidaturasEmSubmissao();
        assertEquals(expResult, result);
        
    }
    
}
