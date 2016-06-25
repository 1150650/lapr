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
public class ConflitoTest {
    
    public ConflitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFae method, of class Conflito.
     */
    @Test
    public void testGetFae() {
        System.out.println("getFae");
        Conflito instance = new Conflito();
        FAE fae =new FAE();
       
        instance.setFae(fae);
        FAE expResult = fae;
        FAE result = instance.getFae();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFae method, of class Conflito.
     */
    @Test
    public void testSetFae() {
        System.out.println("setFae");
        FAE fae =new FAE();
        Conflito instance = new Conflito();
        instance.setFae(fae);
        
    }

    /**
     * Test of getCandidatura method, of class Conflito.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        Conflito instance = new Conflito();
        Candidatura candidatura = new Candidatura();
        instance.setCandidatura(candidatura);
        Candidatura expResult =candidatura;
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidatura method, of class Conflito.
     */
    @Test
    public void testSetCandidatura() {
        System.out.println("setCandidatura");
        Candidatura candidatura = new Candidatura();
        Conflito instance = new Conflito();
        instance.setCandidatura(candidatura);
        
    }
    
}
