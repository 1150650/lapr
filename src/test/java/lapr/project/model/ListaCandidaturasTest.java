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
public class ListaCandidaturasTest {
    
    public ListaCandidaturasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testObterCandidatura() {
        System.out.println("obterCandidatura");
        int indice = 0;
        ListaCandidaturas instance = new ListaCandidaturas();
        Candidatura candidatura = new Candidatura ();
        instance.adicionarCandidatura(candidatura);
        Candidatura expResult = candidatura;
        Candidatura result = instance.obterCandidatura(indice);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        Candidatura candidatura = new Candidatura ();
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = true;
        boolean result = instance.adicionarCandidatura(candidatura);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testRemoverCandidatura() {
        System.out.println("removerCandidatura");
       Candidatura candidatura = new Candidatura ();
        
        ListaCandidaturas instance = new ListaCandidaturas();
        instance.adicionarCandidatura(candidatura);
        boolean expResult = true;
        boolean result = instance.removerCandidatura(candidatura);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tamanho method, of class ListaCandidaturas.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaCandidaturas instance = new ListaCandidaturas();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of indiceDe method, of class ListaCandidaturas.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        
        ListaCandidaturas instance = new ListaCandidaturas();
        Candidatura candidatura = new Candidatura ();
        instance.adicionarCandidatura(candidatura);
        int expResult = 0;
        int result = instance.indiceDe(candidatura);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of contem method, of class ListaCandidaturas.
     */
    @Test
    public void testContem() {
        System.out.println("contem");
        
        ListaCandidaturas instance = new ListaCandidaturas();
        Candidatura candidatura = new Candidatura ();
        instance.adicionarCandidatura(candidatura);
        boolean expResult = true;
        boolean result = instance.contem(candidatura);
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of getCandidaturasAceites method, of class ListaCandidaturas.
     */
    @Test
    public void testGetCandidaturasAceites() {
        System.out.println("getCandidaturasAceites");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = instance.getCandidaturasAceites();
        List result = instance.getCandidaturasAceites();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListaCandidaturas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = instance.getListaCandidaturas();
        List result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of validaCandidatura method, of class ListaCandidaturas.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("validaCandidatura");
        Candidatura candidatura = new Candidatura ();
        
        ListaCandidaturas instance = new ListaCandidaturas();
        boolean expResult = false;
        boolean result = instance.validaCandidatura(candidatura);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCandidaturasSemAtribuicao method, of class ListaCandidaturas.
     */
    @Test
    public void testGetCandidaturasSemAtribuicao() {
        System.out.println("getCandidaturasSemAtribuicao");
        ListaCandidaturas instance = new ListaCandidaturas();
        List<Candidatura> expResult = instance.getCandidaturasSemAtribuicao();
        List<Candidatura> result = instance.getCandidaturasSemAtribuicao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasExpo method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasExpo() {
        System.out.println("getListaCandidaturasExpo");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = instance.getListaCandidaturasExpo();
        List result = instance.getListaCandidaturasExpo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasDemo method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasDemo() {
        System.out.println("getListaCandidaturasDemo");
        ListaCandidaturas instance = new ListaCandidaturas();
        List<CandidaturaDemonstracao> expResult =instance.getListaCandidaturasDemo();
        List<CandidaturaDemonstracao> result = instance.getListaCandidaturasDemo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasExpoRetiradas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasExpoRetiradas() {
        System.out.println("getListaCandidaturasExpoRetiradas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = instance.getListaCandidaturasExpoRetiradas();
        List result = instance.getListaCandidaturasExpoRetiradas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasDemoRetiradas method, of class ListaCandidaturas.
     */
    @Test
    public void testGetListaCandidaturasDemoRetiradas() {
        System.out.println("getListaCandidaturasDemoRetiradas");
        ListaCandidaturas instance = new ListaCandidaturas();
        List expResult = instance.getListaCandidaturasDemoRetiradas();
        List result = instance.getListaCandidaturasDemoRetiradas();
        assertEquals(expResult, result);
        
    }

   

    
    
}
