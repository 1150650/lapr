/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.awt.event.FocusEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class HintPasswordFieldTest {
    
    public HintPasswordFieldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of focusGained method, of class HintPasswordField.
     */
    @Test
    public void testFocusGained() {
        System.out.println("focusGained");
        FocusEvent e = null;
        HintPasswordField instance = new HintPasswordField("Teste");
        instance.focusGained(e);
    }

    /**
     * Test of focusLost method, of class HintPasswordField.
     */
    @Test
    public void testFocusLost() {
        System.out.println("focusLost");
        FocusEvent e = null;
        HintPasswordField instance = new HintPasswordField("Teste");
        instance.focusLost(e);
    }

    /**
     * Test of getText method, of class HintPasswordField.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        HintPasswordField instance = new HintPasswordField("Teste");
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
    }
    
}
