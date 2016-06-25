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
public class RegistoTipoDeConflitoTest {
    
    public RegistoTipoDeConflitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of adicionarTipoDeConflito method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testAdicionarTipoDeConflito() {
        System.out.println("adicionarTipoDeConflito");
        TipoDeConflito e = new TipoDeConflito ();
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        instance.adicionarTipoDeConflito(e);
        
    }

    /**
     * Test of tamanho method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obterTipoDeConflito method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testObterTipoDeConflito() {
        System.out.println("obterTipoDeConflito");
        int indice = 0;
         TipoDeConflito e = new TipoDeConflito ();
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        instance.adicionarTipoDeConflito(e);
        TipoDeConflito expResult = e;
        TipoDeConflito result = instance.obterTipoDeConflito(indice);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaTipoDeConflito method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testGetListaTipoDeConflito() {
        System.out.println("getListaTipoDeConflito");
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        List<TipoDeConflito> expResult =instance.getListaTipoDeConflito();
        List<TipoDeConflito> result = instance.getListaTipoDeConflito();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getArray method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        TipoDeConflito[] expResult = instance.getArray();
        TipoDeConflito[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of novoTipoDeConflito method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testNovoTipoDeConflito() {
        System.out.println("novoTipoDeConflito");
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        TipoDeConflito expResult = null;
        TipoDeConflito result = instance.novoTipoDeConflito();
        expResult= result;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTiposConflitoAtivos method, of class RegistoTipoDeConflito.
     */
    @Test
    public void testGetTiposConflitoAtivos() {
        System.out.println("getTiposConflitoAtivos");
        RegistoTipoDeConflito instance = new RegistoTipoDeConflito();
        List<TipoDeConflito> expResult = null;
        List<TipoDeConflito> result = instance.getTiposConflitoAtivos();
        expResult =result ;
        assertEquals(expResult, result);
        
    }
    
}
