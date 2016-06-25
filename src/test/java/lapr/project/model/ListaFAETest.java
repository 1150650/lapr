/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaFAETest {
    
    public ListaFAETest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterFAE method, of class ListaFAE.
     */
    @Test
    public void testObterFAE() {
        System.out.println("obterFAE");
        int indice = 0;
        ListaFAE instance = new ListaFAE();
        FAE expResult = null;
        FAE result = instance.obterFAE(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarFAE method, of class ListaFAE.
     */
    @Test
    public void testAdicionarFAE() {
        System.out.println("adicionarFAE");
        FAE fae = null;
        ListaFAE instance = new ListaFAE();
        boolean expResult = false;
        boolean result = instance.adicionarFAE(fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerFAE method, of class ListaFAE.
     */
    @Test
    public void testRemoverFAE() {
        System.out.println("removerFAE");
        FAE fae = null;
        ListaFAE instance = new ListaFAE();
        boolean expResult = false;
        boolean result = instance.removerFAE(fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaFAE.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaFAE instance = new ListaFAE();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaFAE.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        FAE fae = null;
        ListaFAE instance = new ListaFAE();
        int expResult = 0;
        int result = instance.indiceDe(fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarListaFAE method, of class ListaFAE.
     */
    @Test
    public void testOrdenarListaFAE() {
        System.out.println("ordenarListaFAE");
        ListaFAE instance = new ListaFAE();
        ArrayList<FAE> expResult = null;
        ArrayList<FAE> result = instance.ordenarListaFAE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterFAEId method, of class ListaFAE.
     */
    @Test
    public void testObterFAEId() {
        System.out.println("obterFAEId");
        String identificador = "";
        ListaFAE instance = new ListaFAE();
        FAE expResult = null;
        FAE result = instance.obterFAEId(identificador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFAEs method, of class ListaFAE.
     */
    @Test
    public void testGetListaFAEs() {
        System.out.println("getListaFAEs");
        ListaFAE instance = new ListaFAE();
        List expResult = null;
        List result = instance.getListaFAEs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFAE method, of class ListaFAE.
     */
    @Test
    public void testAddFAE() {
        System.out.println("addFAE");
        Utilizador utilizador = null;
        String id = "";
        ListaFAE instance = new ListaFAE();
        FAE expResult = null;
        FAE result = instance.addFAE(utilizador, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaFAE method, of class ListaFAE.
     */
    @Test
    public void testRegistaFAE() {
        System.out.println("registaFAE");
        FAE fae = null;
        ListaFAE instance = new ListaFAE();
        instance.registaFAE(fae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
