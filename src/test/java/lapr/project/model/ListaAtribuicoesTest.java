/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaAtribuicoesTest {
    
    public ListaAtribuicoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterAtribuiçao method, of class ListaAtribuicoes.
     */
    @Test
    public void testObterAtribuiçao() {
        System.out.println("obterAtribui\u00e7ao");
        int indice = 0;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        AtribuicaoFAE expResult = null;
        AtribuicaoFAE result = instance.obterAtribuiçao(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarAtribuição method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarAtribuição() {
        System.out.println("adicionarAtribui\u00e7\u00e3o");
        AtribuicaoFAE atribuicao = null;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        boolean expResult = false;
        boolean result = instance.adicionarAtribuição(atribuicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAtribuicao method, of class ListaAtribuicoes.
     */
    @Test
    public void testRemoverAtribuicao() {
        System.out.println("removerAtribuicao");
        AtribuicaoFAE atribuicao = null;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        boolean expResult = false;
        boolean result = instance.removerAtribuicao(atribuicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaAtribuicoes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaAtribuicoes instance = new ListaAtribuicoes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaAtribuicoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        AtribuicaoFAE atribuicao = null;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        int expResult = 0;
        int result = instance.indiceDe(atribuicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contem method, of class ListaAtribuicoes.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        AtribuicaoFAE atribuicao = null;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        boolean expResult = false;
        boolean result = instance.contem(atribuicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarNovaLista method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarNovaLista() {
        System.out.println("adicionarNovaLista");
        List<AtribuicaoFAE> listaAtribuiçao = null;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarNovaLista(listaAtribuiçao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarAtribuiçoesFAE method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarAtribuiçoesFAE() {
        System.out.println("adicionarAtribui\u00e7oesFAE");
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuiçoesFAE();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterAtribuicao method, of class ListaAtribuicoes.
     */
    @Test
    public void testObterAtribuicao() {
        System.out.println("obterAtribuicao");
        int i = 0;
        ListaAtribuicoes instance = new ListaAtribuicoes();
        AtribuicaoFAE expResult = null;
        AtribuicaoFAE result = instance.obterAtribuicao(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAtribuicoes method, of class ListaAtribuicoes.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        ListaAtribuicoes instance = new ListaAtribuicoes();
        List<AtribuicaoFAE> expResult = null;
        List<AtribuicaoFAE> result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
