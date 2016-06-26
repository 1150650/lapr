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
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class AlterarCandidaturaControllerTest {
    
    public AlterarCandidaturaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selecionarCandidatura method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testSelecionarCandidatura() {
        Utilizador u = new Utilizador();
        CentroExposicoes ce = new CentroExposicoes();
        System.out.println("selecionarCandidatura");
        CandidaturaExposicao c = null;
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        instance.selecionarCandidatura(c);
    }

    /**
     * Test of validarNovosDadosGlobal method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testValidarNovosDadosGlobal() {
        System.out.println("validarNovosDadosGlobal");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        instance.selecionarCandidatura(new CandidaturaExposicao());
        boolean expResult = false;
        boolean result = instance.validarNovosDadosGlobal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of novaCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        String nomeEmpresa = "Ola";
        String morada = "Rua da Banan";
        int telemovel = 123456789;
        float areaExposicao = 1.0F;
        String produtos = "Vinho Verde";
        int nConvites = 0;
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        instance.novaCandidatura(nomeEmpresa, morada, telemovel, areaExposicao, produtos, nConvites);
    }

    /**
     * Test of getCandidaturaSelecionada method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testGetCandidaturaSelecionada() {
        System.out.println("getCandidaturaSelecionada");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        CandidaturaExposicao expResult = null;
        CandidaturaExposicao result = instance.getCandidaturaSelecionada();
        assertEquals(expResult, result);
    }

    /**
     * Test of alterarDadosCandidatura method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testAlterarDadosCandidatura() {
        System.out.println("alterarDadosCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        CandidaturaExposicao c = null;
        instance.selecionarCandidatura(c);
        instance.alterarDadosCandidatura();
    }

    /**
     * Test of selecionaExposicao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testSelecionaExposicao() {
        System.out.println("selecionaExposicao");
        Exposicao expo = new Exposicao();
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        instance.selecionaExposicao(expo);
    }

    /**
     * Test of getListaCandidaturas method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        ListaCandidaturas expResult = null;
        ListaCandidaturas result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCandidaturaAlterada method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testGetCandidaturaAlterada() {
        System.out.println("getCandidaturaAlterada");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador();
        AlterarCandidaturaController instance = new AlterarCandidaturaController(u, ce);
        CandidaturaExposicao expResult = null;
        CandidaturaExposicao result = instance.getCandidaturaAlterada();
        assertEquals(expResult, result);
    }
    
}
