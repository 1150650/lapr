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
public class ProdutoTest {
    
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setDesignacao method, of class Produto.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "123";
        Produto instance = new Produto();
        instance.setDesignacao(designacao);
        
    }

    /**
     * Test of getDesignacao method, of class Produto.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        Produto instance = new Produto();
        String designacao = "123";
        instance.setDesignacao(designacao);
        String expResult = "123";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        
    }
    
}
