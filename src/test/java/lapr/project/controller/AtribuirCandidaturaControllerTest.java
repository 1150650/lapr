/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaFAE;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class AtribuirCandidaturaControllerTest {

    public AtribuirCandidaturaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selecionarExposicao method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testSelecionarExposicao() {
        System.out.println("selecionarExposicao");
        Exposicao expo = new Exposicao();
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.selecionarExposicao(expo);
    }

    /**
     * Test of getListaFAE method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaFAE() {
        System.out.println("getListaFAE");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.selecionarExposicao(new Exposicao());
        ListaFAE expResult = instance.getListaFAE();
        ListaFAE result = instance.getListaFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidatura method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaCandidatura() {
        System.out.println("getListaCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.selecionarExposicao(new Exposicao());
        ListaCandidaturas expResult = instance.getlstCandidaturas();
        ListaCandidaturas result = instance.getListaCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExposicaoSelecionada method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetExposicaoSelecionada() {
        System.out.println("getExposicaoSelecionada");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        Exposicao expResult = null;
        Exposicao result = instance.getExposicaoSelecionada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaFAESelecionada method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaFAESelecionada() {
        System.out.println("getListaFAESelecionada");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        ListaFAE expResult = null;
        ListaFAE result = instance.getListaFAESelecionada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getlstCandidaturas method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetlstCandidaturas() {
        System.out.println("getlstCandidaturas");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getlstCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionarMecanismo method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testSelecionarMecanismo() {
        System.out.println("selecionarMecanismo");
        int indice = 0;
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.selecionarMecanismo(indice);
    }

    /**
     * Test of registaAtribuições method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testRegistaAtribuições() {
        System.out.println("registaAtribuicoes");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.registaAtribuições();
    }

    /**
     * Test of getLstAtribuicoes method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testGetLstAtribuicoes() {
        System.out.println("getLstAtribuicoes");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        ListaAtribuicoes expResult = instance.getLstAtribuicoes();
        ListaAtribuicoes result = instance.getLstAtribuicoes();
        assertEquals(expResult, result);
    }

}
