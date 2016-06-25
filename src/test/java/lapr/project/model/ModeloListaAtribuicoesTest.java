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
        ModeloListaAtribuicoes instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElementAt method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        int indice = 0;
        ModeloListaAtribuicoes instance = null;
        Object expResult = null;
        Object result = instance.getElementAt(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addElement method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        Candidatura candidatura = null;
        FAE fae = null;
        ModeloListaAtribuicoes instance = null;
        boolean expResult = false;
        boolean result = instance.addElement(candidatura, fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ModeloListaAtribuicoes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        AtribuicaoFAE atribuicao = null;
        ModeloListaAtribuicoes instance = null;
        boolean expResult = false;
        boolean result = instance.contains(atribuicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
