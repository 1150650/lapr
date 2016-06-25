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
        String descricao = "123";
        TipoDeConflito instance = new TipoDeConflito();
        instance.setDescricao(descricao);
        String expResult = "123";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescricao method, of class TipoDeConflito.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "123";
        TipoDeConflito instance = new TipoDeConflito();
        instance.setDescricao(descricao);
        
    }

    /**
     * Test of toString method, of class TipoDeConflito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TipoDeConflito instance = new TipoDeConflito();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    
    
}
