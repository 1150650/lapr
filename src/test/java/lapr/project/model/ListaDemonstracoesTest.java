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
public class ListaDemonstracoesTest {
    
    public ListaDemonstracoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListalDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testGetListalDemonstracao() {
        System.out.println("getListalDemonstracao");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        ArrayList<Demonstracao> expResult = null;
        ArrayList<Demonstracao> result = instance.getListalDemonstracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListalDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testSetListalDemonstracao() {
        System.out.println("setListalDemonstracao");
        ArrayList<Demonstracao> listalDemonstracao = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.setListalDemonstracao(listalDemonstracao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDemonstracoes.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criacaoDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testCriacaoDemonstracao() {
        System.out.println("criacaoDemonstracao");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        Demonstracao expResult = null;
        Demonstracao result = instance.criacaoDemonstracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testAddDemonstracao() {
        System.out.println("addDemonstracao");
        Demonstracao d = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaDemonstracoes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testObterDemonstracao() {
        System.out.println("obterDemonstracao");
        int indice = 0;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        Demonstracao expResult = null;
        Demonstracao result = instance.obterDemonstracao(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDemonstracaoToArray method, of class ListaDemonstracoes.
     */
    @Test
    public void testListaDemonstracaoToArray() {
        System.out.println("listaDemonstracaoToArray");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        Demonstracao[] expResult = null;
        Demonstracao[] result = instance.listaDemonstracaoToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaDemonstracoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Demonstracao demo = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        int expResult = 0;
        int result = instance.indiceDe(demo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCandidatura method, of class ListaDemonstracoes.
     */
    @Test
    public void testRemoverCandidatura() {
        System.out.println("removerCandidatura");
        Demonstracao demo = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = false;
        boolean result = instance.removerCandidatura(demo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ListaDemonstracoes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Demonstracao demo = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = false;
        boolean result = instance.contains(demo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
