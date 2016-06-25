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
public class TipoDeConflitoTest {
    
    public TipoDeConflitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDescricao method, of class TipoDeConflito.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        TipoDeConflito instance = new TipoDeConflito();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class TipoDeConflito.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        TipoDeConflito instance = new TipoDeConflito();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TipoDeConflito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TipoDeConflito instance = new TipoDeConflito();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConflitoAtivo method, of class TipoDeConflito.
     */
    @Test
    public void testIsConflitoAtivo() {
        System.out.println("isConflitoAtivo");
        TipoDeConflito instance = new TipoDeConflito();
        boolean expResult = false;
        boolean result = instance.isConflitoAtivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
