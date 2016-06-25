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
public class ListaOrganizadoresTest {
    
    public ListaOrganizadoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testObterOrganizador() {
        System.out.println("obterOrganizador");
        int indice = 0;
        ListaOrganizadores instance = new ListaOrganizadores();
        Organizador expResult = null;
        Organizador result = instance.obterOrganizador(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testAdicionarOrganizador() {
        System.out.println("adicionarOrganizador");
        Organizador organizador = null;
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = false;
        boolean result = instance.adicionarOrganizador(organizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testRemoverOrganizador() {
        System.out.println("removerOrganizador");
        Organizador organizador = null;
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = false;
        boolean result = instance.removerOrganizador(organizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaOrganizadores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaOrganizadores instance = new ListaOrganizadores();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaOrganizadores.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Organizador organizador = null;
        ListaOrganizadores instance = new ListaOrganizadores();
        int expResult = 0;
        int result = instance.indiceDe(organizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testIsUserOrganizador() {
        System.out.println("isUserOrganizador");
        Utilizador utilizador = null;
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = false;
        boolean result = instance.isUserOrganizador(utilizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaOrganizadores method, of class ListaOrganizadores.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        ListaOrganizadores instance = new ListaOrganizadores();
        List expResult = null;
        List result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
