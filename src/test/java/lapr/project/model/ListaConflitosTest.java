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
public class ListaConflitosTest {
    
    public ListaConflitosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registarConflito method, of class ListaConflitos.
     */
    @Test
    public void testRegistarConflito() {
        System.out.println("registarConflito");
        FAE fae = null;
        Candidatura candidatura = null;
        ListaConflitos instance = new ListaConflitos();
        instance.registarConflito(fae, candidatura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
