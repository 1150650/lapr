/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
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
        System.out.println("obterAtribuicao");
        int i = 0;
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuição(atribuicao);
        
        AtribuicaoFAE expResult =atribuicao;
        AtribuicaoFAE result = instance.obterAtribuicao(i);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarAtribuição method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarAtribuição() {
        System.out.println("adicionarAtribui\u00e7\u00e3o");
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        boolean expResult = true;
        boolean result = instance.adicionarAtribuição(atribuicao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerAtribuicao method, of class ListaAtribuicoes.
     */
    @Test
    public void testRemoverAtribuicao() {
        System.out.println("removerAtribuicao");
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        boolean expResult = false;
        boolean result = instance.removerAtribuicao(atribuicao);
        assertEquals(expResult, result);
        
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
        
    }

    /**
     * Test of indiceDe method, of class ListaAtribuicoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuição(atribuicao);
        int expResult = 0;
        int result = instance.indiceDe(atribuicao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of contem method, of class ListaAtribuicoes.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuição(atribuicao);
        boolean expResult = true;
        boolean result = instance.contem(atribuicao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarNovaLista method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarNovaLista() {
        System.out.println("adicionarNovaLista");
        List<AtribuicaoFAE> listaAtribuiçao = new ArrayList();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarNovaLista(listaAtribuiçao);
        
    }

    /**
     * Test of adicionarAtribuiçoesFAE method, of class ListaAtribuicoes.
     */
    @Test
    public void testAdicionarAtribuiçoesFAE() {
        System.out.println("adicionarAtribui\u00e7oesFAE");
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuiçoesFAE();
        
    }

    /**
     * Test of obterAtribuicao method, of class ListaAtribuicoes.
     */
    @Test
    public void testObterAtribuicao() {
        System.out.println("obterAtribuicao");
        int i = 0;
        AtribuicaoFAE atribuicao = new AtribuicaoFAE ();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarAtribuição(atribuicao);
        
        AtribuicaoFAE expResult =atribuicao;
        AtribuicaoFAE result = instance.obterAtribuicao(i);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaAtribuicoes method, of class ListaAtribuicoes.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        List<AtribuicaoFAE> listaAtribuiçao = new ArrayList();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.adicionarNovaLista(listaAtribuiçao);
        
        List<AtribuicaoFAE> expResult =listaAtribuiçao;
        List<AtribuicaoFAE> result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
        
    }
    
}
