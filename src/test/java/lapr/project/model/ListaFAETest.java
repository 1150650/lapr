/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class ListaFAETest {
    
    public ListaFAETest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obterFAE method, of class ListaFAE.
     */
    @Test
    public void testObterFAE() {
        System.out.println("obterFAE");
        int indice = 0;
        
        ListaFAE instance = new ListaFAE();
        FAE fae = new FAE();
        instance.adicionarFAE(fae);
        
        FAE expResult = fae;
        FAE result = instance.obterFAE(indice);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarFAE method, of class ListaFAE.
     */
    @Test
    public void testAdicionarFAE() {
        System.out.println("adicionarFAE");
        FAE fae = new FAE();
        ListaFAE instance = new ListaFAE();
        boolean expResult =true ;
        boolean result = instance.adicionarFAE(fae);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerFAE method, of class ListaFAE.
     */
    @Test
    public void testRemoverFAE() {
        System.out.println("removerFAE");
        FAE fae = new FAE();
        ListaFAE instance = new ListaFAE();
        instance.adicionarFAE(fae);
        boolean expResult =true;
        boolean result = instance.removerFAE(fae);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tamanho method, of class ListaFAE.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaFAE instance = new ListaFAE();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of indiceDe method, of class ListaFAE.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        FAE fae = new FAE();
        ListaFAE instance = new ListaFAE();
        instance.adicionarFAE(fae);
        int expResult = 0;
        int result = instance.indiceDe(fae);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ordenarListaFAE method, of class ListaFAE.
     */
    @Test
    public void testOrdenarListaFAE() {
        System.out.println("ordenarListaFAE");
        ListaFAE instance = new ListaFAE();
        ArrayList<FAE> expResult = instance.ordenarListaFAE();
        ArrayList<FAE> result = instance.ordenarListaFAE();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obterFAEId method, of class ListaFAE.
     */
    @Test
    public void testObterFAEId() {
        System.out.println("obterFAEId");
        Utilizador utilizador = new Utilizador();
        String id = "123";
        
        
        FAE exp = new FAE(utilizador,id);
        String identificador = "123";
        ListaFAE instance = new ListaFAE();
        instance.adicionarFAE(exp);
        FAE expResult = exp;
        FAE result = instance.obterFAEId(identificador);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaFAEs method, of class ListaFAE.
     */
    @Test
    public void testGetListaFAEs() {
        System.out.println("getListaFAEs");
        ListaFAE instance = new ListaFAE();
        List expResult = instance.getListaFAEs();
        List result = instance.getListaFAEs();
        assertEquals(expResult, result);
        
    }



    /**
     * Test of registaFAE method, of class ListaFAE.
     */
    @Test
    public void testRegistaFAE() {
        System.out.println("registaFAE");
        FAE fae = new FAE();
        ListaFAE instance = new ListaFAE();
        instance.registaFAE(fae);
        
    }
    
}
