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
 * @author Simão Pedro
 */
public class RegistoUtilizadoresTest {
    
    public RegistoUtilizadoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of criarUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testCriarUtilizador() {
        System.out.println("criarUtilizador");
        String nome = "";
        String email = "";
        String username = "";
        String password = "";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = null;
        Utilizador result = instance.criarUtilizador(nome, email, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obterUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testObterUtilizador() {
        System.out.println("obterUtilizador");
        int indice = 0;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = null;
        Utilizador result = instance.obterUtilizador(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of tamanho method, of class RegistoUtilizadores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of registaUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRegistaUtilizador() {
        System.out.println("registaUtilizador");
        Utilizador u = null;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = false;
        boolean result = instance.registaUtilizador(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validaAlteracaoDados method, of class RegistoUtilizadores.
     */
    @Test
    public void testValidaAlteracaoDados() {
        System.out.println("validaAlteracaoDados");
        Utilizador u = null;
        String email = "";
        String username = "";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.validaAlteracaoDados(u, email, username);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removerUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        Utilizador u = null;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = false;
        boolean result = instance.removerUtilizador(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarDados method, of class RegistoUtilizadores.
     */
    @Test
    public void testAlterarDados() {
        System.out.println("alterarDados");
        Utilizador utilizadorAtivo = null;
        String nome = "";
        String email = "";
        String username = "";
        String password = "";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.alterarDados(utilizadorAtivo, nome, email, username, password);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getRegistoUtilizadores method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        List<Utilizador> expResult = null;
        List<Utilizador> result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of indiceDe method, of class RegistoUtilizadores.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Utilizador u = null;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        int expResult = 0;
        int result = instance.indiceDe(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
