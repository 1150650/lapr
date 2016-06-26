/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class CriarCandidaturaExposicaoControllerTest {

    public CriarCandidaturaExposicaoControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaExposicoes method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        RegistoExposicoes expResult = ce.getListaExposicoes();
        RegistoExposicoes result = instance.getListaExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionaExposicao method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testSelecionaExposicao() {
        System.out.println("selecionaExposicao");
        Exposicao e = new Exposicao();
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        instance.selecionaExposicao(e);
    }

    /**
     * Test of novaCandidatura method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        instance.novaCandidatura();
    }

    /**
     * Test of setDados method, of class CriarCandidaturaExposicaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 123456789;
        float areaPretendida = 12F;
        String produtos = "a";
        int nConvites = 1;
        String[] Keywords = new String[4];
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        instance.selecionaExposicao(new Exposicao());
        instance.novaCandidatura();;
        instance.setDados(nomeEmpresa, morada, telemovel, areaPretendida, produtos, nConvites, Keywords);
    }

    /**
     * Test of adicionarCandidatura method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        instance.selecionaExposicao(new Exposicao());
        instance.novaCandidatura();
        instance.adicionarCandidatura();

    }

    /**
     * Test of getRepresentante method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetRepresentante() {
        System.out.println("getRepresentante");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        instance.selecionaExposicao(new Exposicao());
        Representante expResult = null;
        Representante result = instance.getRepresentante();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturas method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoes method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        ListaDemonstracoes expResult = null;
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExposicaoSelecionada method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetExposicaoSelecionada() {
        System.out.println("getExposicaoSelecionada");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        Exposicao expResult = null;
        Exposicao result = instance.getExposicaoSelecionada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCandidaturaCriada method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetCandidaturaCriada() {
        System.out.println("getCandidaturaCriada");
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        CriarCandidaturaExposicaoController instance = new CriarCandidaturaExposicaoController(ce, u);
        CandidaturaExposicao expResult = null;
        CandidaturaExposicao result = instance.getCandidaturaCriada();
        assertEquals(expResult, result);
    }

}
