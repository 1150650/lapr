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
public class RegistoRepresentantesTest {
    
    public RegistoRepresentantesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addRepresentante method, of class RegistoRepresentantes.
     */
    @Test
    public void testAddRepresentante() {
        System.out.println("addRepresentante");
        Representante r = new Representante();
        RegistoRepresentantes instance = new RegistoRepresentantes();
        instance.addRepresentante(r);
        
    }

    /**
     * Test of validaProduto method, of class RegistoRepresentantes.
     */
    @Test
    public void testValidaProduto() {
        System.out.println("validaProduto");
        Representante r = new Representante();
        RegistoRepresentantes instance = new RegistoRepresentantes();
        instance.addRepresentante(r);
        boolean expResult = false;
        boolean result = instance.validaProduto(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obterRepresentantePorU method, of class RegistoRepresentantes.
     */
    @Test
    public void testObterRepresentantePorU() {
        System.out.println("obterRepresentantePorU");
        Utilizador u = new Utilizador();
        Representante r = new Representante();
        r.setUtilizador(u);
        RegistoRepresentantes instance = new RegistoRepresentantes();
        instance.addRepresentante(r);
        Representante expResult = r;
        Representante result = instance.obterRepresentantePorU(u);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of containsRepresentante method, of class RegistoRepresentantes.
     */
    @Test
    public void testContainsRepresentante() {
        System.out.println("containsRepresentante");
        Representante r =new Representante();
        RegistoRepresentantes instance = new RegistoRepresentantes();
        instance.addRepresentante(r);
        boolean expResult = true;
        boolean result = instance.containsRepresentante(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tamanho method, of class RegistoRepresentantes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        RegistoRepresentantes instance = new RegistoRepresentantes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
    }
    
}
