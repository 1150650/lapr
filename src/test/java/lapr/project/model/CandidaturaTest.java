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
public class CandidaturaTest {
    
    public CandidaturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNomeEmpresa method, of class Candidatura.
     */
    @Test
    public void testGetNomeEmpresa() {
        System.out.println("getNomeEmpresa");
        Candidatura instance = new Candidatura();
        String nomeEmpresa = "1234";
        
        instance.setNomeEmpresa(nomeEmpresa);
        String expResult = "1234";
        String result = instance.getNomeEmpresa();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMorada method, of class Candidatura.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Candidatura instance = new Candidatura();
        String expResult = "1234";
         String morada = "1234";
        instance.setMorada(morada);
        String result = instance.getMorada();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTelemovel method, of class Candidatura.
     */
    @Test
    public void testGetTelemovel() {
        System.out.println("getTelemovel");
        Candidatura instance = new Candidatura();
        int telemovel = 913002932;
        instance.setTelemovel(telemovel);
        int expResult =913002932;
        int result = instance.getTelemovel();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProdutos method, of class Candidatura.
     */
    @Test
    public void testGetProdutos() {
        System.out.println("getProdutos");
        Candidatura instance = new Candidatura();
       
        String produtos = "1324";
        instance.setProdutos(produtos);
      
        String expResult = "1234";
        String result = instance.getProdutos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getQuantidadeConvites method, of class Candidatura.
     */
    @Test
    public void testGetQuantidadeConvites() {
        System.out.println("getQuantidadeConvites");
        Candidatura instance = new Candidatura();
        int quantidadeConvites = 0;
        
        instance.setQuantidadeConvites(quantidadeConvites);
        int expResult = 0;
        int result = instance.getQuantidadeConvites();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListaAvaliacoes method, of class Candidatura.
     */
    @Test
    public void testGetListaAvaliacoes() {
        System.out.println("getListaAvaliacoes");
        Candidatura instance = new Candidatura();
        ListaAvaliacoes expResult = new ListaAvaliacoes ();
        ListaAvaliacoes result = instance.getListaAvaliacoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNomeEmpresa method, of class Candidatura.
     */
    @Test
    public void testSetNomeEmpresa() {
        System.out.println("setNomeEmpresa");
        String nomeEmpresa = "1234";
        Candidatura instance = new Candidatura();
        instance.setNomeEmpresa(nomeEmpresa);
        
    }

    /**
     * Test of setMorada method, of class Candidatura.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "1234";
        Candidatura instance = new Candidatura();
        instance.setMorada(morada);
        
    }

    /**
     * Test of setTelemovel method, of class Candidatura.
     */
    @Test
    public void testSetTelemovel() {
        System.out.println("setTelemovel");
        int telemovel = 913002932;
        Candidatura instance = new Candidatura();
        instance.setTelemovel(telemovel);
        
    }

    /**
     * Test of setProdutos method, of class Candidatura.
     */
    @Test
    public void testSetProdutos() {
        System.out.println("setProdutos");
        String produtos = "1324";
        Candidatura instance = new Candidatura();
        instance.setProdutos(produtos);
        
    }

    /**
     * Test of setQuantidadeConvites method, of class Candidatura.
     */
    @Test
    public void testSetQuantidadeConvites() {
        System.out.println("setQuantidadeConvites");
        int quantidadeConvites = 0;
        Candidatura instance = new Candidatura();
        instance.setQuantidadeConvites(quantidadeConvites);
        
    }

    /**
     * Test of toString method, of class Candidatura.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Candidatura instance = new Candidatura();
        String nomeEmpresa = "1234";
        instance.setNomeEmpresa(nomeEmpresa);
        String morada = "1234";
        instance.setMorada(morada);
        int quantidadeConvites = 0;
        String produtos = "1324";
        instance.setProdutos(produtos);
        instance.setQuantidadeConvites(quantidadeConvites);
        int telemovel = 913002932;
        instance.setTelemovel(telemovel);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of setCandidaturaStandAtribuido method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaStandAtribuido() {
        System.out.println("setCandidaturaStandAtribuido");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaStandAtribuido();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setavalicaoFAE method, of class Candidatura.
     */
    @Test
    public void testSetavalicaoFAE() {
        System.out.println("setavalicaoFAE");
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        Candidatura instance = new Candidatura();
        instance.setavalicaoFAE(p1, p2, p3, p4, p5);
        
    }

    /**
     * Test of getState method, of class Candidatura.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Candidatura instance = new Candidatura();
        CandidaturaState expResult = new CandidaturaState();
        CandidaturaState result = instance.getState();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Candidatura.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        CandidaturaState state = new CandidaturaState();
        Candidatura instance = new Candidatura();
        instance.setEstado(state);
        
    }

    /**
     * Test of setCandidaturaEmSubmissao method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaEmSubmissao() {
        System.out.println("setCandidaturaEmSubmissao");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaEmSubmissao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStand method, of class Candidatura.
     */
    @Test
    public void testSetStand() {
        System.out.println("setStand");
        Stand stand = new Stand();
        Candidatura instance = new Candidatura();
        instance.setStand(stand);
        
    }

    /**
     * Test of getStand method, of class Candidatura.
     */
    @Test
    public void testGetStand() {
        System.out.println("getStand");
        Candidatura instance = new Candidatura();
        Stand expResult = null;
        Stand result = instance.getStand();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaConflitosDetetados method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaConflitosDetetados() {
        System.out.println("setCandidaturaConflitosDetetados");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaConflitosDetetados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaAceite method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaAceite() {
        System.out.println("setCandidaturaAceite");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaAceite();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaAlterada method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaAlterada() {
        System.out.println("setCandidaturaAlterada");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaAlterada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaAvaliada method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaAvaliada() {
        System.out.println("setCandidaturaAvaliada");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaAvaliada();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCandidaturaEmAvaliacao method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaEmAvaliacao() {
        System.out.println("setCandidaturaEmAvaliacao");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaEmAvaliacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaFechada method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaFechada() {
        System.out.println("setCandidaturaFechada");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaFechada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaRetirada method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaRetirada() {
        System.out.println("setCandidaturaRetirada");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaRetirada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCandidaturaStandsAtribuidos method, of class Candidatura.
     */
    @Test
    public void testSetCandidaturaStandsAtribuidos() {
        System.out.println("setCandidaturaStandsAtribuidos");
        Candidatura instance = new Candidatura();
        boolean expResult = false;
        boolean result = instance.setCandidaturaStandsAtribuidos();
        assertEquals(expResult, result);
        
    }
    
}
