/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class AvaliarCandidaturaFAEControllerTest {

    public AvaliarCandidaturaFAEControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selecionarCandidatura method, of class
     * AvaliarCandidaturaFAEController.
     */
    @Test
    public void testSelecionarCandidatura() {
        System.out.println("selecionarCandidatura");
        Candidatura a = new Candidatura();
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        instance.selecionarCandidatura(a);
    }

    /**
     * Test of selecionarExposicao method, of class
     * AvaliarCandidaturaFAEController.
     */
    @Test
    public void testSelecionarExposicao() {
        System.out.println("selecionarExposicao");
        Exposicao e = new Exposicao();
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        instance.selecionarExposicao(e);
    }

    /**
     * Test of getListaAvaliacoes method, of class
     * AvaliarCandidaturaFAEController.
     */
    @Test
    public void testGetListaAvaliacoes() {
        System.out.println("getListaAvaliacoes");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarCandidatura(new Candidatura());
        instance.getListaAvaliacoes();
    }

    /**
     * Test of setFAEAvaliacao method, of class AvaliarCandidaturaFAEController.
     */
    @Test
    public void testSetFAEAvaliacao() {
        System.out.println("setFAEAvaliacao");
        int[] conhecimentoFAE = new int[4];
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarCandidatura(new Candidatura());
        instance.setFAEAvaliacao(conhecimentoFAE);
    }

    /**
     * Test of adicionarAvaliacao method, of class
     * AvaliarCandidaturaFAEController.
     */
    @Test
    public void testAdicionarAvaliacao() {
        System.out.println("adicionarAvaliacao");
        Avaliacao a = new Avaliacao();
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarCandidatura(new Candidatura());
        instance.adicionarAvaliacao(a);
    }

    /**
     * Test of candidaturaSelecionada method, of class
     * AvaliarCandidaturaFAEController.
     */
    @Test
    public void testCandidaturaSelecionada() {
        System.out.println("candidaturaSelecionada");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        Candidatura expResult = null;
        Candidatura result = instance.candidaturaSelecionada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFAE method, of class AvaliarCandidaturaFAEController.
     */
    @Test
    public void testGetFAE() {
        System.out.println("getFAE");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AvaliarCandidaturaFAEController instance = new AvaliarCandidaturaFAEController(ce, u);
        FAE expResult = new FAE();
        FAE result = instance.getFAE();
        assertEquals(expResult, result);
    }

}
