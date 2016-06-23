/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class RegistarUtilizadorControllerTest {
    
    public RegistarUtilizadorControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRegistoUtilizadores method, of class RegistarUtilizadorController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(ce);
        instance.getRegistoUtilizadores();
    }

    /**
     * Test of criarUtilizador method, of class RegistarUtilizadorController.
     */
    @Test
    public void testCriarUtilizador() {
        System.out.println("criarUtilizador");
        String nome = "Diogo";
        String email = "diogo@gmail.com";
        String username = "barros16";
        String password = ".DiogoBarros10";
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(ce);
        instance.criarUtilizador(nome, email, username, password);
        
    }

    /**
     * Test of registaUtilizador method, of class RegistarUtilizadorController.
     */
    @Test
    public void testRegistaUtilizador() {
        System.out.println("registaUtilizador");
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(ce);
        instance.criarUtilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        instance.registaUtilizador();
    }
    
}
