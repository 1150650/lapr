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
public class CandidaturaExposicaoTest {
    
    public CandidaturaExposicaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    

    /**
     * Test of setAreaPretendida method, of class CandidaturaExposicao.
     */
    @Test
    public void testSetAreaPretendida() {
        System.out.println("setAreaPretendida");
        float areaPretendida = 0.0F;
        CandidaturaExposicao instance = new CandidaturaExposicao();
        instance.setAreaPretendida(areaPretendida);
        
    }

    /**
     * Test of getAreaPretendida method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetAreaPretendida() {
        System.out.println("getAreaPretendida");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        float areaPretendida = 0.0F;
        instance.setAreaPretendida(areaPretendida);
        float expResult = 0.0F;
        float result = instance.getAreaPretendida();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getKEYWORDS method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetKEYWORDS() {
        System.out.println("getKEYWORDS");
        String[] KEYWORDS = new String [3];
        CandidaturaExposicao instance = new CandidaturaExposicao();
        instance.setKEYWORDS(KEYWORDS);       
        String[] expResult = new String[3];
        String[] result = instance.getKEYWORDS();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setKEYWORDS method, of class CandidaturaExposicao.
     */
    @Test
    public void testSetKEYWORDS() {
        System.out.println("setKEYWORDS");
        String[] KEYWORDS = new String [3];
        CandidaturaExposicao instance = new CandidaturaExposicao();
        instance.setKEYWORDS(KEYWORDS);
        
    }

    /**
     * Test of setDemonstracoesComInteresse method, of class CandidaturaExposicao.
     */
    @Test
    public void testSetDemonstracoesComInteresse() {
        System.out.println("setDemonstracoesComInteresse");
        ListaDemonstracoes demonstracoesComInteresse = new ListaDemonstracoes();
        CandidaturaExposicao instance = new CandidaturaExposicao();
        instance.setDemonstracoesComInteresse(demonstracoesComInteresse);
        
    }

    /**
     * Test of getDemonstracoesComInteresse method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetDemonstracoesComInteresse() {
        System.out.println("getDemonstracoesComInteresse");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        ListaDemonstracoes demonstracoesComInteresse = new ListaDemonstracoes();
        instance.setDemonstracoesComInteresse(demonstracoesComInteresse);
        ListaDemonstracoes expResult = demonstracoesComInteresse;
        ListaDemonstracoes result = instance.getDemonstracoesComInteresse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addDemonstracoesComInteresse method, of class CandidaturaExposicao.
     */
    @Test
    public void testAddDemonstracoesComInteresse() {
        System.out.println("addDemonstracoesComInteresse");
        Demonstracao demonstracao = new Demonstracao();
        CandidaturaExposicao instance = new CandidaturaExposicao();
        boolean expResult = true;
        boolean result = instance.addDemonstracoesComInteresse(demonstracao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class CandidaturaExposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
