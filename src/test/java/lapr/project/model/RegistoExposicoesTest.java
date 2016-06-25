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
public class RegistoExposicoesTest {
    
    public RegistoExposicoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of adicionarExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testAdicionarExposicao() {
        System.out.println("adicionarExposicao");
        Exposicao e = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        instance.adicionarExposicao(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamanho method, of class RegistoExposicoes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        RegistoExposicoes instance = new RegistoExposicoes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testObterExposicao() {
        System.out.println("obterExposicao");
        int indice = 0;
        RegistoExposicoes instance = new RegistoExposicoes();
        Exposicao expResult = null;
        Exposicao result = instance.obterExposicao(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaExposicoes method, of class RegistoExposicoes.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        RegistoExposicoes instance = new RegistoExposicoes();
        List<Exposicao> expResult = null;
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArray method, of class RegistoExposicoes.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        RegistoExposicoes instance = new RegistoExposicoes();
        Exposicao[] expResult = null;
        Exposicao[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExposicoesOrganizador method, of class RegistoExposicoes.
     */
    @Test
    public void testGetExposicoesOrganizador() {
        System.out.println("getExposicoesOrganizador");
        Utilizador utilizador = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        List expResult = null;
        List result = instance.getExposicoesOrganizador(utilizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indiceDe method, of class RegistoExposicoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Exposicao e = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        int expResult = 0;
        int result = instance.indiceDe(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testNovaExposicao() {
        System.out.println("novaExposicao");
        RegistoExposicoes instance = new RegistoExposicoes();
        Exposicao expResult = null;
        Exposicao result = instance.novaExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
