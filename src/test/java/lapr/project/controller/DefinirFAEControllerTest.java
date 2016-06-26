/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class DefinirFAEControllerTest {
    
    public DefinirFAEControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getExposicoesOrganizador method, of class DefinirFAEController.
     */
    @Test
    public void testGetExposicoesOrganizador() {
        System.out.println("getExposicoesOrganizador");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador utilizador = new Utilizador("Utilizador", "diogo@gmail.com", "utilizador", ".Utilizador2016");
        DefinirFAEController instance = new DefinirFAEController(ce);
        List<Exposicao> expResult = instance.getExposicoesOrganizador(utilizador);
        List<Exposicao> result = instance.getExposicoesOrganizador(utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUtilizadores method, of class DefinirFAEController.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(ce);
        List expResult = instance.getListaUtilizadores();
        List result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoUtilizadores method, of class DefinirFAEController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(ce);
        RegistoUtilizadores expResult = instance.getRegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of addFAE method, of class DefinirFAEController.
     */
    @Test
    public void testAddFAE() {
        System.out.println("addFAE");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador utilizador = new Utilizador("Utilizador", "diogo@gmail.com", "utilizador", ".Utilizador2016");
        String id = "fae1";
        DefinirFAEController instance = new DefinirFAEController(ce);
        FAE expResult = instance.addFAE(utilizador, id);
        FAE result = instance.addFAE(utilizador, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaFAE method, of class DefinirFAEController.
     */
    @Test
    public void testRegistaFAE() {
        System.out.println("registaFAE");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador utilizador = new Utilizador("Utilizador", "diogo@gmail.com", "utilizador", ".Utilizador2016");
        FAE fae = new FAE(utilizador, "fae1");
        DefinirFAEController instance = new DefinirFAEController(ce);
        instance.registaFAE(fae);
    }

    /**
     * Test of setFAEDefinido method, of class DefinirFAEController.
     */
    @Test
    public void testSetFAEDefinido() {
        System.out.println("setFAEDefinido");
        CentroExposicoes ce = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(ce);
        boolean expResult = true;
        boolean result = instance.setFAEDefinido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicao method, of class DefinirFAEController.
     */
    @Test
    public void testSetExposicao() {
        System.out.println("setExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        DefinirFAEController instance = new DefinirFAEController(ce);
        instance.setExposicao(exposicao);
    }

    /**
     * Test of getExposicao method, of class DefinirFAEController.
     */
    @Test
    public void testGetExposicao() {
        System.out.println("getExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(ce);
        Exposicao expResult = instance.getExposicao();
        Exposicao result = instance.getExposicao();
        assertEquals(expResult, result);
    }
    
}
