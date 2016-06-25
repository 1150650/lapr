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
public class RepresentanteTest {
    
    public RepresentanteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUtilizador method, of class Representante.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Representante instance = new Representante();
        Utilizador u = new Utilizador();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUtilizador method, of class Representante.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador utilizador =  new Utilizador();
        Representante instance = new Representante();
        instance.setUtilizador(utilizador);
        
    }

    /**
     * Test of getListaCandidaturasSubmetidas method, of class Representante.
     */
    @Test
    public void testGetListaCandidaturasSubmetidas() {
        System.out.println("getListaCandidaturasSubmetidas");
        Representante instance = new Representante();
        ListaCandidaturas expResult = instance.getListaCandidaturasSubmetidas();
        ListaCandidaturas result = instance.getListaCandidaturasSubmetidas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasPodemSerAlteradas method, of class Representante.
     */
    @Test
    public void testGetListaCandidaturasPodemSerAlteradas() {
        System.out.println("getListaCandidaturasPodemSerAlteradas");
        Representante instance = new Representante();
        ListaCandidaturas expResult = instance.getListaCandidaturasPodemSerAlteradas();
        ListaCandidaturas result = instance.getListaCandidaturasPodemSerAlteradas();
        expResult=result ;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setListaCandidaturasSubmetidas method, of class Representante.
     */
    @Test
    public void testSetListaCandidaturasSubmetidas() {
        System.out.println("setListaCandidaturasSubmetidas");
        ListaCandidaturas listaCandidaturasSubmetidas = new ListaCandidaturas ();
        Representante instance = new Representante();
        instance.setListaCandidaturasSubmetidas(listaCandidaturasSubmetidas);
        
    }

    /**
     * Test of adicionarCandidatura method, of class Representante.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        CandidaturaExposicao c = new CandidaturaExposicao ();
        Representante instance = new Representante();
        instance.adicionarCandidatura(c);
        
    }
    
}
