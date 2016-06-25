/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaDemonstracoesTest {
    
    public ListaDemonstracoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListalDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testGetListalDemonstracao() {
        System.out.println("getListalDemonstracao");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        ArrayList<Demonstracao> listalDemonstracao = new ArrayList();
        instance.setListalDemonstracao(listalDemonstracao);
        ArrayList<Demonstracao> expResult = listalDemonstracao;
        ArrayList<Demonstracao> result = instance.getListalDemonstracao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setListalDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testSetListalDemonstracao() {
        System.out.println("setListalDemonstracao");
        ArrayList<Demonstracao> listalDemonstracao = new ArrayList();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.setListalDemonstracao(listalDemonstracao);
       
    }

    

    /**
     * Test of addDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testAddDemonstracao() {
        System.out.println("addDemonstracao");
        Demonstracao d = new Demonstracao ();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(d);
       
    }

    /**
     * Test of tamanho method, of class ListaDemonstracoes.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obterDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testObterDemonstracao() {
        System.out.println("obterDemonstracao");
        int indice = 0;
        Demonstracao d = new Demonstracao ();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(d);
        
        Demonstracao expResult = d;
        Demonstracao result = instance.obterDemonstracao(indice);
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of indiceDe method, of class ListaDemonstracoes.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Demonstracao demo = new Demonstracao ();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(demo);
        int expResult = 0;
        int result = instance.indiceDe(demo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerCandidatura method, of class ListaDemonstracoes.
     */
    @Test
    public void testRemoverCandidatura() {
        System.out.println("removerCandidatura");
        Demonstracao demo = new Demonstracao ();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(demo);
        boolean expResult = true;
        boolean result = instance.removerCandidatura(demo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of contains method, of class ListaDemonstracoes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Demonstracao demo = new Demonstracao ();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.addDemonstracao(demo);
        boolean expResult = true;
        boolean result = instance.contains(demo);
        assertEquals(expResult, result);
        
    }
    
}
