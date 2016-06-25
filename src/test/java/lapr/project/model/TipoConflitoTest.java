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
public class TipoConflitoTest {
    
    public TipoConflitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMecanismoDetecaoConflito method, of class TipoConflito.
     */
    @Test
    public void testGetMecanismoDetecaoConflito() {
        System.out.println("getMecanismoDetecaoConflito");
        TipoConflito instance = new TipoConflito();
        MecanismoDetecaoConflito expResult = instance.getMecanismoDetecaoConflito();
        MecanismoDetecaoConflito result = instance.getMecanismoDetecaoConflito();
        assertEquals(expResult, result);
        
    }
    
}
