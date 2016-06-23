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
 * @author Diogo
 */
public class UtilizadorTest {
    
    public UtilizadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNome method, of class Utilizador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = "Diogo";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Utilizador.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = "diogo@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsername method, of class Utilizador.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = "barros15";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Utilizador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = "0FkqiqDcttqu32";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPasswordDesencriptada method, of class Utilizador.
     */
    @Test
    public void testGetPasswordDesencriptada() {
        System.out.println("getPasswordDesencriptada");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = ".DiogoBarros10";
        String result = instance.getPasswordDesencriptada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNome method, of class Utilizador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Diogo";
        Utilizador instance = new Utilizador();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmail method, of class Utilizador.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "diogo@gmail.com";
        Utilizador instance = new Utilizador();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUsername method, of class Utilizador.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "barros15";
        Utilizador instance = new Utilizador();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPasswordDesencriptada method, of class Utilizador.
     */
    @Test
    public void testSetPasswordDesencriptada() {
        System.out.println("setPassword");
        String password = ".DiogoBarros10";
        Utilizador instance = new Utilizador();
        instance.setPasswordDesencriptada(password);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador("Diogo", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        String expResult = "Nome: Diogo Email: diogo@gmail.com Username: barros15";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
