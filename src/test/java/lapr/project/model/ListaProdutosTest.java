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
public class ListaProdutosTest {
    
    public ListaProdutosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addProduto method, of class ListaProdutos.
     */
    @Test
    public void testAddProduto() {
        System.out.println("addProduto");
        Produto e = new Produto();
        ListaProdutos instance = new ListaProdutos();
        instance.addProduto(e);
        
    }

    /**
     * Test of validaProduto method, of class ListaProdutos.
     */
    @Test
    public void testValidaProduto() {
        System.out.println("validaProduto");
        Produto e = new Produto();
        ListaProdutos instance = new ListaProdutos();
       
        boolean expResult = true;
        boolean result = instance.validaProduto(e);
        assertEquals(expResult, result);
        
    }
    
}
