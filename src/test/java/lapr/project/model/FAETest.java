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
public class FAETest {
    
    public FAETest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIdentificador method, of class FAE.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        FAE instance = new FAE();
        String expResult = "";
        String result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizador method, of class FAE.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        FAE instance = new FAE();
        Utilizador expResult = null;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUtilizador method, of class FAE.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador utilizador = null;
        FAE instance = new FAE();
        instance.setUtilizador(utilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificador method, of class FAE.
     */
    @Test
    public void testSetIdentificador() {
        System.out.println("setIdentificador");
        String identificador = "";
        FAE instance = new FAE();
        instance.setIdentificador(identificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperienciaFAE method, of class FAE.
     */
    @Test
    public void testGetExperienciaFAE() {
        System.out.println("getExperienciaFAE");
        FAE instance = new FAE();
        int expResult = 0;
        int result = instance.getExperienciaFAE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentarExperienciaFAE method, of class FAE.
     */
    @Test
    public void testAumentarExperienciaFAE() {
        System.out.println("aumentarExperienciaFAE");
        FAE instance = new FAE();
        instance.aumentarExperienciaFAE();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FAE.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FAE instance = new FAE();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListacandidatura method, of class FAE.
     */
    @Test
    public void testGetListacandidatura() {
        System.out.println("getListacandidatura");
        FAE instance = new FAE();
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getListacandidatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarCandidatura method, of class FAE.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        Candidatura c = null;
        FAE instance = new FAE();
        instance.adicionarCandidatura(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class FAE.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        FAE o = null;
        FAE instance = new FAE();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
