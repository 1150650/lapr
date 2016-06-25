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
public class AtribuicaoFAETest {
    
    public AtribuicaoFAETest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setFAE method, of class AtribuicaoFAE.
     */
    @Test
    public void testSetFAE() {
        System.out.println("setFAE");
        FAE fae = new FAE();
        AtribuicaoFAE instance = new AtribuicaoFAE();
        instance.setFAE(fae);
        
    }

    /**
     * Test of setCandidatura method, of class AtribuicaoFAE.
     */
    @Test
    public void testSetCandidatura() {
        System.out.println("setCandidatura");
        Candidatura candidatura = new Candidatura();
        AtribuicaoFAE instance = new AtribuicaoFAE();
        instance.setCandidatura(candidatura);
        
    }

    /**
     * Test of getFAE method, of class AtribuicaoFAE.
     */
    @Test
    public void testGetFAE() {
        System.out.println("getFAE");
        FAE fae = new FAE();
        AtribuicaoFAE instance = new AtribuicaoFAE();
        instance.setFAE(fae);
        FAE expResult = fae;
        FAE result = instance.getFAE();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCandidatura method, of class AtribuicaoFAE.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        AtribuicaoFAE instance = new AtribuicaoFAE();
        Candidatura expResult =  new Candidatura();
         instance.setCandidatura(expResult);
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class AtribuicaoFAE.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Candidatura candidatura =  new Candidatura();
        FAE fae = new FAE();
        
        AtribuicaoFAE instance = new AtribuicaoFAE();
        instance.setCandidatura(candidatura);
        instance.setFAE(fae);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addCandidaturaFae method, of class AtribuicaoFAE.
     */
    @Test
    public void testAddCandidaturaFae() {
        System.out.println("addCandidaturaFae");
        AtribuicaoFAE instance = new AtribuicaoFAE();
        Candidatura candidatura = new Candidatura();
        FAE fae = new FAE();
        instance.setFAE(fae);
        instance.setCandidatura(candidatura);
        instance.addCandidaturaFae();
        
    }
    
}
