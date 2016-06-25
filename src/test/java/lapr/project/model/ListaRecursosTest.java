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
public class ListaRecursosTest {
    
    public ListaRecursosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

   

    /**
     * Test of addRecurso method, of class ListaRecursos.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = new Recurso ();
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = true;
        boolean result = instance.addRecurso(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obterRecurso method, of class ListaRecursos.
     */
    @Test
    public void testObterRecurso() {
        System.out.println("obterRecurso");
        int indice = 0;
        Recurso r = new Recurso ();
        ListaRecursos instance = new ListaRecursos();
        instance.addRecurso(r);
        Recurso expResult = r;
        Recurso result = instance.obterRecurso(indice);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tamanho method, of class ListaRecursos.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaRecursos instance = new ListaRecursos();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of indiceDe method, of class ListaRecursos.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Recurso r = new Recurso();
        ListaRecursos instance = new ListaRecursos();
        instance.addRecurso(r);
        int expResult = 0;
        int result = instance.indiceDe(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerRecurso method, of class ListaRecursos.
     */
    @Test
    public void testRemoverRecurso() {
        System.out.println("removerRecurso");
        Recurso r = new Recurso();
        ListaRecursos instance = new ListaRecursos();
         instance.addRecurso(r);
        boolean expResult = true;
        boolean result = instance.removerRecurso(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaRecursos method, of class ListaRecursos.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        ListaRecursos instance = new ListaRecursos();
        ArrayList expResult = instance.getListaRecursos();
        ArrayList result = instance.getListaRecursos();
        assertEquals(expResult, result);
        
    }
    
}
