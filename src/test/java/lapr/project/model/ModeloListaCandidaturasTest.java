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
public class ModeloListaCandidaturasTest {
    
    public ModeloListaCandidaturasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSize method, of class ModeloListaCandidaturas.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ModeloListaCandidaturas instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElementAt method, of class ModeloListaCandidaturas.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        int indice = 0;
        ModeloListaCandidaturas instance = null;
        Object expResult = null;
        Object result = instance.getElementAt(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addElement method, of class ModeloListaCandidaturas.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        Candidatura candidatura = null;
        ModeloListaCandidaturas instance = null;
        boolean expResult = false;
        boolean result = instance.addElement(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeElement method, of class ModeloListaCandidaturas.
     */
    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        Candidatura candidatura = null;
        ModeloListaCandidaturas instance = null;
        boolean expResult = false;
        boolean result = instance.removeElement(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ModeloListaCandidaturas.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Candidatura candidatura = null;
        ModeloListaCandidaturas instance = null;
        boolean expResult = false;
        boolean result = instance.contains(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
