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
public class RepresentanteTest {
    
    public RepresentanteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUtilizador method, of class Representante.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Representante instance = new Representante();
        Utilizador expResult = null;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUtilizador method, of class Representante.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador utilizador = null;
        Representante instance = new Representante();
        instance.setUtilizador(utilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasSubmetidas method, of class Representante.
     */
    @Test
    public void testGetListaCandidaturasSubmetidas() {
        System.out.println("getListaCandidaturasSubmetidas");
        Representante instance = new Representante();
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getListaCandidaturasSubmetidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasPodemSerAlteradas method, of class Representante.
     */
    @Test
    public void testGetListaCandidaturasPodemSerAlteradas() {
        System.out.println("getListaCandidaturasPodemSerAlteradas");
        Representante instance = new Representante();
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getListaCandidaturasPodemSerAlteradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCandidaturasSubmetidas method, of class Representante.
     */
    @Test
    public void testSetListaCandidaturasSubmetidas() {
        System.out.println("setListaCandidaturasSubmetidas");
        ListaCandidaturas listaCandidaturasSubmetidas = null;
        Representante instance = new Representante();
        instance.setListaCandidaturasSubmetidas(listaCandidaturasSubmetidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarCandidatura method, of class Representante.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        CandidaturaExposicao c = null;
        Representante instance = new Representante();
        instance.adicionarCandidatura(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
