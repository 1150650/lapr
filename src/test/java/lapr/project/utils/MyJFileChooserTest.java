/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class MyJFileChooserTest {
    
    public MyJFileChooserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of personalizarEmPortugues method, of class MyJFileChooser.
     */
    @Test
    public void testPersonalizarEmPortugues() {
        System.out.println("personalizarEmPortugues");
        MyJFileChooser.personalizarEmPortugues();
        
    }
    
}
