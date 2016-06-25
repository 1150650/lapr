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
public class ModeloListaAtribuicoesTest {
    
    public ModeloListaAtribuicoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSize method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaAtribuicoes listaAtribuicoes =new ListaAtribuicoes();
        ModeloListaAtribuicoes instance = new ModeloListaAtribuicoes(listaAtribuicoes);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getElementAt method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        ListaAtribuicoes listaAtribuicoes =new ListaAtribuicoes();
        int indice = 0;
        AtribuicaoFAE a = new AtribuicaoFAE();
        listaAtribuicoes.adicionarAtribuição(a);
        ModeloListaAtribuicoes instance = new ModeloListaAtribuicoes(listaAtribuicoes);
        
        
        Object expResult = a;
        Object result = instance.getElementAt(indice);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addElement method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        ListaAtribuicoes listaAtribuicoes =new ListaAtribuicoes();
        Candidatura candidatura = new Candidatura();
        FAE fae = new FAE();
        ModeloListaAtribuicoes instance = new ModeloListaAtribuicoes(listaAtribuicoes);
        boolean expResult = true;
        boolean result = instance.addElement(candidatura, fae);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of contains method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        ListaAtribuicoes listaAtribuicoes =new ListaAtribuicoes();
        AtribuicaoFAE atribuicao = new AtribuicaoFAE();
        ModeloListaAtribuicoes instance = new ModeloListaAtribuicoes(listaAtribuicoes);
        boolean expResult = false;
        boolean result = instance.contains(atribuicao);
        assertEquals(expResult, result);
        
    }
    
}
