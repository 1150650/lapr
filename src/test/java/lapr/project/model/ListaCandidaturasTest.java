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
public class ListaCandidaturasTest {
    
    public ListaCandidaturasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testObterCandidatura() {
        System.out.println("obterCandidatura");
        int indice = 0;
        ListaCandidaturas instance = new ListaCandidaturas();
        Candidatura expResult = null;
        Candidatura result = instance.obterCandidatura(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        Candidatura candidatura = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = false;
        boolean result = instance.adicionarCandidatura(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testRemoverCandidatura() {
        System.out.println("removerCandidatura");
        Candidatura candidatura = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = false;
        boolean result = instance.removerCandidatura(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class ListaCandidaturas.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaCandidaturas instance = new ListaCandidaturas();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class ListaCandidaturas.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Candidatura candidatura = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        int expResult = 0;
        int result = instance.indiceDe(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contem method, of class ListaCandidaturas.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        Candidatura candidatura = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = false;
        boolean result = instance.contem(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        ListaCandidaturas instance = new ListaCandidaturas();
        Candidatura expResult = null;
        Candidatura result = instance.novaCandidatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCandidaturasAceites method, of class ListaCandidaturas.
     */
    @Test
    public void testGetCandidaturasAceites() {
        System.out.println("getCandidaturasAceites");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = null;
        List result = instance.getCandidaturasAceites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = null;
        List result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("validaCandidatura");
        Candidatura c = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = false;
        boolean result = instance.validaCandidatura(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCandidaturasSemAtribuicao method, of class ListaCandidaturas.
     */
    @Test
    public void testGetCandidaturasSemAtribuicao() {
        System.out.println("getCandidaturasSemAtribuicao");
        ListaCandidaturas instance = new ListaCandidaturas();
        List<Candidatura> expResult = null;
        List<Candidatura> result = instance.getCandidaturasSemAtribuicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasExpo method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasExpo() {
        System.out.println("getListaCandidaturasExpo");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = null;
        List result = instance.getListaCandidaturasExpo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasDemo method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasDemo() {
        System.out.println("getListaCandidaturasDemo");
        ListaCandidaturas instance = new ListaCandidaturas();
        List<Candidatura> expResult = null;
        List<Candidatura> result = instance.getListaCandidaturasDemo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasExpoRetiradas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasExpoRetiradas() {
        System.out.println("getListaCandidaturasExpoRetiradas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = null;
        List result = instance.getListaCandidaturasExpoRetiradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturasDemoRetiradas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasDemoRetiradas() {
        System.out.println("getListaCandidaturasDemoRetiradas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = null;
        List result = instance.getListaCandidaturasDemoRetiradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newCandidaturaDemo method, of class ListaCandidaturas.
     */
    @Test
    public void testNewCandidaturaDemo() {
        System.out.println("newCandidaturaDemo");
        Candidatura candidatura = null;
        ListaCandidaturas instance = new ListaCandidaturas();
        CandidaturaDemonstracao expResult = null;
        CandidaturaDemonstracao result = instance.newCandidaturaDemo(candidatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaCandExposicaoToArray method, of class ListaCandidaturas.
     */
    @Test
    public void testListaCandExposicaoToArray() {
        System.out.println("listaCandExposicaoToArray");
        ListaCandidaturas instance = new ListaCandidaturas();
        CandidaturaExposicao[] expResult = null;
        CandidaturaExposicao[] result = instance.listaCandExposicaoToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
