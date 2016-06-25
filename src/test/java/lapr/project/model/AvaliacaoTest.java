/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class AvaliacaoTest {
    
    public AvaliacaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setAvaliacao method, of class Avaliacao.
     */
    @Test
    public void testSetAvaliacao() {
        System.out.println("setAvaliacao");
        boolean avaliacao = false;
        Avaliacao instance = new Avaliacao();
        instance.setAvaliacao(avaliacao);
        
    }

    /**
     * Test of setJustificacao method, of class Avaliacao.
     */
    @Test
    public void testSetJustificacao() {
        System.out.println("setJustificacao");
        String justificacao = "3214";
        Avaliacao instance = new Avaliacao();
        instance.setJustificacao(justificacao);
        
    }

    /**
     * Test of getAvaliacao method, of class Avaliacao.
     */
    @Test
    public void testGetAvaliacao() {
        System.out.println("getAvaliacao");
        Avaliacao instance = new Avaliacao();
        boolean expResult = false;
        boolean result = instance.getAvaliacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getJustificacao method, of class Avaliacao.
     */
    @Test
    public void testGetJustificacao() {
        System.out.println("getJustificacao");
        Avaliacao instance = new Avaliacao();
         boolean avaliacao = false;
        instance.setAvaliacao(avaliacao);
        String justificacao = "3214";
        instance.setJustificacao(justificacao);
        String expResult = justificacao;
        String result = instance.getJustificacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Avaliacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Avaliacao instance = new Avaliacao();
        boolean avaliacao = false;
        instance.setAvaliacao(avaliacao);
        String justificacao = "3214";
        instance.setJustificacao(justificacao);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setConhecimentosFAE method, of class Avaliacao.
     */
    @Test
    public void testSetConhecimentosFAE() {
        System.out.println("setConhecimentosFAE");
        int[] conhecimentosFAE = new int [9];
        Avaliacao instance = new Avaliacao();
        instance.setConhecimentosFAE(conhecimentosFAE);
        
    }

    /**
     * Test of getConhecimentosFAE method, of class Avaliacao.
     */
    @Test
    public void testGetConhecimentosFAE() {
        System.out.println("getConhecimentosFAE");
        Avaliacao instance = new Avaliacao();
        int[] conhecimentosFAE = new int [9];
        instance.setConhecimentosFAE(conhecimentosFAE);
        int[] expResult = new int [9];
        int[] result = instance.getConhecimentosFAE();
        assertArrayEquals(expResult, result);
        
    }
    
}
