/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaGestoresTest {
    
    public ListaGestoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterGestor method, of class ListaGestores.
     */
    @Test
    public void testObterGestor() {
        System.out.println("obterGestor");
        int indice = 0;
        ListaGestores instance = new ListaGestores();
        Gestor expResult = null;
        Gestor result = instance.obterGestor(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaGestores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaGestores instance = new ListaGestores();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaGestores method, of class ListaGestores.
     */
    @Test
    public void testGetListaGestores() {
        System.out.println("getListaGestores");
        ListaGestores instance = new ListaGestores();
        List expResult = null;
        List result = instance.getListaGestores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarGestor method, of class ListaGestores.
     */
    @Test
    public void testAdicionarGestor() {
        System.out.println("adicionarGestor");
        Gestor gestor = null;
        ListaGestores instance = new ListaGestores();
        boolean expResult = false;
        boolean result = instance.adicionarGestor(gestor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
