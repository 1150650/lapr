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
import org.w3c.dom.Node;

/**
 *
 * @author JOAO
 */
public class DemonstracaoTest {
    
    public DemonstracaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCodigo method, of class Demonstracao.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Demonstracao instance = new Demonstracao();
        int Codigo = 0;
       
        instance.setCodigo(Codigo);
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescricao method, of class Demonstracao.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Demonstracao instance = new Demonstracao();
          String descricao = "1324";
        
        instance.setDescricao(descricao);
        String expResult = "1324";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of setDescricao method, of class Demonstracao.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "1324";
        Demonstracao instance = new Demonstracao();
        instance.setDescricao(descricao);
        
    }

    /**
     * Test of addRecurso method, of class Demonstracao.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = new Recurso();
        Demonstracao instance = new Demonstracao();
        instance.addRecurso(r);
        
    }

    /**
     * Test of toString method, of class Demonstracao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Demonstracao instance = new Demonstracao();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCodigo method, of class Demonstracao.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int Codigo = 0;
        Demonstracao instance = new Demonstracao();
        instance.setCodigo(Codigo);
        
    }


    /**
     * Test of getEstado method, of class Demonstracao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Demonstracao instance = new Demonstracao();
         DemonstracaoState state = new DemonstracaoState ();
        instance.setEstado(state);
        DemonstracaoState expResult = state;
        DemonstracaoState result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Demonstracao.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        DemonstracaoState state = new DemonstracaoState ();
        Demonstracao instance = new Demonstracao();
        instance.setEstado(state);
       
    }
    
   

    
    
}
