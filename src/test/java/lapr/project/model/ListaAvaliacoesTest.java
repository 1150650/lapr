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
public class ListaAvaliacoesTest {
    
    public ListaAvaliacoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testAddAvaliacao() {
        System.out.println("addAvaliacao");
        Avaliacao avaliacao = null;
        ListaAvaliacoes instance = new ListaAvaliacoes();
        boolean expResult = false;
        boolean result = instance.addAvaliacao(avaliacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testRemoverAvaliacao() {
        System.out.println("removerAvaliacao");
        Avaliacao avaliacao = null;
        ListaAvaliacoes instance = new ListaAvaliacoes();
        boolean expResult = false;
        boolean result = instance.removerAvaliacao(avaliacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testObterAvaliacao() {
        System.out.println("obterAvaliacao");
        int indice = 0;
        ListaAvaliacoes instance = new ListaAvaliacoes();
        Avaliacao expResult = null;
        Avaliacao result = instance.obterAvaliacao(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaAvaliacoes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaAvaliacoes instance = new ListaAvaliacoes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaAvaliacoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Avaliacao avaliacao = null;
        ListaAvaliacoes instance = new ListaAvaliacoes();
        int expResult = 0;
        int result = instance.indiceDe(avaliacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testAdicionarAvaliacao() {
        System.out.println("adicionarAvaliacao");
        Avaliacao avaliacao = null;
        ListaAvaliacoes instance = new ListaAvaliacoes();
        instance.adicionarAvaliacao(avaliacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
