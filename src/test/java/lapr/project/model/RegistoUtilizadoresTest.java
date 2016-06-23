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
        String nome = "Diogo";
        String email = "diogo@gmail.com";
        String username = "barros16";
        String password = ".DiogoBarros10";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador(nome, email, username, password);
        Utilizador result = instance.criarUtilizador(nome, email, username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of obterUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testObterUtilizador() {
        System.out.println("obterUtilizador");
        int indice = 0;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador u = new Utilizador();
        instance.registaUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.obterUtilizador(indice);
        assertEquals(expResult, result);
        
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
        
    }

    /**
     * Test of registaUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRegistaUtilizador() {
        System.out.println("registaUtilizador");
        Utilizador u = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.registaUtilizador(u);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validaAlteracaoDados method, of class RegistoUtilizadores.
     */
    @Test
    public void testValidaAlteracaoDados() {
        System.out.println("validaAlteracaoDados");
        Utilizador u = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        String email = "diogo2@gmail.com";
        String username = "barros15";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.validaAlteracaoDados(u, email, username);

    }

    /**
     * Test of removerUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        Utilizador u = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.removerUtilizador(u);
        assertEquals(expResult, result);

    }

    /**
     * Test of alterarDados method, of class RegistoUtilizadores.
     */
    @Test
    public void testAlterarDados() {
        System.out.println("alterarDados");
        Utilizador utilizadorAtivo = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        String nome = "Diogo1";
        String email = "diogo1@gmail.com";
        String username = "barros17";
        String password = ".DiogoBarros11";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.alterarDados(utilizadorAtivo, nome, email, username, password);


    }

    /**
     * Test of getRegistoUtilizadores method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        List<Utilizador> expResult = new ArrayList<>();
        List<Utilizador> result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of indiceDe method, of class RegistoUtilizadores.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Utilizador u = new Utilizador();
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.registaUtilizador(u);
        int expResult = 0;
        int result = instance.indiceDe(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
