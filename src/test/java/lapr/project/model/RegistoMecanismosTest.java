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
public class RegistoMecanismosTest {
    
    public RegistoMecanismosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaMecanismos method, of class RegistoMecanismos.
     */
    @Test
    public void testGetListaMecanismos() {
        System.out.println("getListaMecanismos");
        RegistoMecanismos instance = new RegistoMecanismos();
        List expResult =instance.getListaMecanismos();
        List result = instance.getListaMecanismos();
        assertEquals(expResult, result);
        
    }
    
}
