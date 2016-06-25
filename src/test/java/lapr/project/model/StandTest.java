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
public class StandTest {
    
    public StandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDescricao method, of class Stand.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Stand instance = new Stand();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Stand.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Stand instance = new Stand();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Stand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Stand instance = new Stand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCandidatura method, of class Stand.
     */
    @Test
    public void testHasCandidatura() {
        System.out.println("hasCandidatura");
        Stand instance = new Stand();
        boolean expResult = false;
        boolean result = instance.hasCandidatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCandidatura method, of class Stand.
     */
    @Test
    public void testAddCandidatura() {
        System.out.println("addCandidatura");
        Candidatura candidatura = null;
        Stand instance = new Stand();
        instance.addCandidatura(candidatura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
