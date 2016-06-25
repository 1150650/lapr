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
public class CandidaturaDemonstracaoTest {
    
    public CandidaturaDemonstracaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDemonstracao method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetDemonstracao() {
        System.out.println("getDemonstracao");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        Demonstracao expResult = new Demonstracao();
        instance.setDemonstracao(expResult);
        Demonstracao result = instance.getDemonstracao();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDemonstracao method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testSetDemonstracao() {
        System.out.println("setDemonstracao");
        Demonstracao demonstracao = new Demonstracao();
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        instance.setDemonstracao(demonstracao);
        
    }

    /**
     * Test of toString method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
         Demonstracao demonstracao = new Demonstracao();
        instance.setDemonstracao(demonstracao);
        
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
