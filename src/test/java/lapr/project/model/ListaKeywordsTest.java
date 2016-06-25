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
public class ListaKeywordsTest {
    
    public ListaKeywordsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterKeyword method, of class ListaKeywords.
     */
    @Test
    public void testObterKeyword() {
        System.out.println("obterKeyword");
        int indice = 0;
        ListaKeywords instance = new ListaKeywords();
        KeywordExample expResult = null;
        KeywordExample result = instance.obterKeyword(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarKeyword method, of class ListaKeywords.
     */
    @Test
    public void testAdicionarKeyword() {
        System.out.println("adicionarKeyword");
        KeywordExample keyword = null;
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = false;
        boolean result = instance.adicionarKeyword(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerKeyword method, of class ListaKeywords.
     */
    @Test
    public void testRemoverKeyword() {
        System.out.println("removerKeyword");
        KeywordExample keyword = null;
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = false;
        boolean result = instance.removerKeyword(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaKeywords.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaKeywords instance = new ListaKeywords();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaKeywords.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        KeywordExample keyword = null;
        ListaKeywords instance = new ListaKeywords();
        int expResult = 0;
        int result = instance.indiceDe(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contem method, of class ListaKeywords.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        KeywordExample keyword = null;
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = false;
        boolean result = instance.contem(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
