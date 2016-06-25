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
public class ListaStandsTest {
    
    public ListaStandsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of tamanho method, of class ListaStands.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaStands instance = new ListaStands();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterStand method, of class ListaStands.
     */
    @Test
    public void testObterStand() {
        System.out.println("obterStand");
        int indice = 0;
        ListaStands instance = new ListaStands();
        Stand expResult = null;
        Stand result = instance.obterStand(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaStands method, of class ListaStands.
     */
    @Test
    public void testGetListaStands() {
        System.out.println("getListaStands");
        ListaStands instance = new ListaStands();
        List<Stand> expResult = null;
        List<Stand> result = instance.getListaStands();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarStand method, of class ListaStands.
     */
    @Test
    public void testAdicionarStand() {
        System.out.println("adicionarStand");
        Stand s = null;
        ListaStands instance = new ListaStands();
        boolean expResult = false;
        boolean result = instance.adicionarStand(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novoStand method, of class ListaStands.
     */
    @Test
    public void testNovoStand() {
        System.out.println("novoStand");
        ListaStands instance = new ListaStands();
        Stand expResult = null;
        Stand result = instance.novoStand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaStandsDisponiveis method, of class ListaStands.
     */
    @Test
    public void testGetListaStandsDisponiveis() {
        System.out.println("getListaStandsDisponiveis");
        ListaStands instance = new ListaStands();
        List expResult = null;
        List result = instance.getListaStandsDisponiveis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaStandCandidatura method, of class ListaStands.
     */
    @Test
    public void testRegistaStandCandidatura() {
        System.out.println("registaStandCandidatura");
        Stand stand = null;
        Candidatura candidatura = null;
        ListaStands instance = new ListaStands();
        instance.registaStandCandidatura(stand, candidatura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
