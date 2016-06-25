/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaRecursosTest {
    
    public ListaRecursosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of criarRecurso method, of class ListaRecursos.
     */
    @Test
    public void testCriarRecurso() {
        System.out.println("criarRecurso");
        String recurso = "";
        ListaRecursos instance = new ListaRecursos();
        Recurso expResult = null;
        Recurso result = instance.criarRecurso(recurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRecurso method, of class ListaRecursos.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = null;
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = false;
        boolean result = instance.addRecurso(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterRecurso method, of class ListaRecursos.
     */
    @Test
    public void testObterRecurso() {
        System.out.println("obterRecurso");
        int indice = 0;
        ListaRecursos instance = new ListaRecursos();
        Recurso expResult = null;
        Recurso result = instance.obterRecurso(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaRecursos.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaRecursos instance = new ListaRecursos();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaRecursos.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Recurso r = null;
        ListaRecursos instance = new ListaRecursos();
        int expResult = 0;
        int result = instance.indiceDe(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerRecurso method, of class ListaRecursos.
     */
    @Test
    public void testRemoverRecurso() {
        System.out.println("removerRecurso");
        Recurso r = null;
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = false;
        boolean result = instance.removerRecurso(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaRecursos method, of class ListaRecursos.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        ListaRecursos instance = new ListaRecursos();
        ArrayList expResult = null;
        ArrayList result = instance.getListaRecursos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
