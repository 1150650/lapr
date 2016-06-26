/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class ConfirmarUtilizadorControllerTest {

    public ConfirmarUtilizadorControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRegistoUtilizadoresNConf method, of class
     * ConfirmarUtilizadorController.
     */
    @Test
    public void testGetRegistoUtilizadoresNConf() {
        System.out.println("getRegistoUtilizadoresNConf");
        CentroExposicoes ce = new CentroExposicoes();
        ConfirmarUtilizadorController instance = new ConfirmarUtilizadorController(ce);
        RegistoUtilizadores expResult = instance.getRegistoUtilizadoresNConf();
        RegistoUtilizadores result = ce.getRegistoUtilizadoresNConf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoUtilizadores method, of class
     * ConfirmarUtilizadorController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        ConfirmarUtilizadorController instance = new ConfirmarUtilizadorController(ce);
        RegistoUtilizadores expResult = ce.getRegistoUtilizadoresConf();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of selecionarUtilizador method, of class
     * ConfirmarUtilizadorController.
     */
    @Test
    public void testSelecionarUtilizador() {
        System.out.println("selecionarUtilizador");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        ConfirmarUtilizadorController instance = new ConfirmarUtilizadorController(ce);
        instance.selecionarUtilizador(u);
    }

    /**
     * Test of confirmarUtilizador method, of class
     * ConfirmarUtilizadorController.
     */
    @Test
    public void testConfirmarUtilizador() {
        System.out.println("confirmarUtilizador");
        CentroExposicoes ce = new CentroExposicoes();
        ConfirmarUtilizadorController instance = new ConfirmarUtilizadorController(ce);
        instance.selecionarUtilizador(new Utilizador());
        instance.confirmarUtilizador();
    }

}
