/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class RegistarStandControllerTest {
    
    public RegistarStandControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of criarStand method, of class RegistarStandController.
     */
    @Test
    public void testCriarStand() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("criarStand");
        RegistarStandController instance = new  RegistarStandController(ce);
        instance.criarStand();
        
    }

    /**
     * Test of setDadosStand method, of class RegistarStandController.
     */
    @Test
    public void testSetDadosStand() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("setDadosStand");
        String descricao = "djbfsdlj";
        RegistarStandController instance = new  RegistarStandController(ce);
        instance.criarStand();
        instance.setDadosStand(descricao);
        
    }

    /**
     * Test of registarStand method, of class RegistarStandController.
     */
    @Test
    public void testRegistarStand() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("registarStand");
        RegistarStandController instance = new  RegistarStandController(ce);
        instance.registarStand();
       
    }
    
}
