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
public class RecursoTest {
    
    public RecursoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setRecurso method, of class Recurso.
     */
    @Test
    public void testSetRecurso() {
        System.out.println("setRecurso");
        String r = "123";
        Recurso instance = new Recurso();
        instance.setRecurso(r);
        
    }

    /**
     * Test of getRecurso method, of class Recurso.
     */
    @Test
    public void testGetRecurso() {
        System.out.println("getRecurso");
        Recurso instance = new Recurso();
         String r = "123";
        instance.setRecurso(r);
        String expResult = "123";
        String result = instance.getRecurso();
        assertEquals(expResult, result);
        
    }
    
}
