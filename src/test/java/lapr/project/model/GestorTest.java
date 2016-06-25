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
public class GestorTest {
    
    public GestorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setUtilizador method, of class Gestor.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador utilizador = new Utilizador();
        Gestor instance = new Gestor();
        instance.setUtilizador(utilizador);
        
    }

    /**
     * Test of getUtilizador method, of class Gestor.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Utilizador utilizador = new Utilizador();
        Gestor instance = new Gestor();
        instance.setUtilizador(utilizador);
        
        Utilizador expResult = utilizador;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
       
    }
    
}
