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
public class ModeloListaExposicoesTest {
    
    public ModeloListaExposicoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSize method, of class ModeloListaExposicoes.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ModeloListaExposicoes instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElementAt method, of class ModeloListaExposicoes.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        int indice = 0;
        ModeloListaExposicoes instance = null;
        Object expResult = null;
        Object result = instance.getElementAt(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addElement method, of class ModeloListaExposicoes.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        Exposicao e = null;
        ModeloListaExposicoes instance = null;
        instance.addElement(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
