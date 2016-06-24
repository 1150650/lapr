/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class CriarDemonstracaoControllerTest {
    
    public CriarDemonstracaoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selecionarExposicao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSelecionarExposicao() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("selecionarExposicao");
        Exposicao exposicao = new Exposicao();
        ce.getListaExposicoes().adicionarExposicao(exposicao);
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.selecionarExposicao(exposicao);
        
    }

    /**
     * Test of novaDemonstracao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testNovaDemonstracao() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("novaDemonstracao");
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.novaDemonstracao();
        
    }

    /**
     * Test of setDados method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSetDados() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("setDados");
        String Descricao = "eqwrqewr";
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.setDados(Descricao);
       
    }

    /**
     * Test of getListaRecursos method, of class CriarDemonstracaoController.
     */
    @Test
    public void testGetListaRecursos() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaRecursos");
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        ListaRecursos expResult = ce.getRegistoRecursos();
        ListaRecursos result = instance.getListaRecursos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarRecurso method, of class CriarDemonstracaoController.
     */
    @Test
    public void testAdicionarRecurso() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("adicionarRecurso");
        Recurso r = new Recurso();
        r.setRecurso("sasdf");
        ce.getRegistoRecursos().addRecurso(r);
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.novaDemonstracao();
        instance.adicionarRecurso(r);
        
    }

    /**
     * Test of validaRegistaDemonstracao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testValidaRegistaDemonstracao() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("validaRegistaDemonstracao");
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.novaDemonstracao();
        instance.validaRegistaDemonstracao();
        
    }

    /**
     * Test of setEstadoDemonstracaoCriada method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSetEstadoDemonstracaoCriada() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("setEstadoDemonstracaoCriada");
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        instance.novaDemonstracao();
        instance.setEstadoDemonstracaoCriada();
        
    }

    /**
     * Test of getListaExposicoes method, of class CriarDemonstracaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        CentroExposicoes ce= new CentroExposicoes();
        Exposicao expo = new Exposicao();
        ce.getListaExposicoes().adicionarExposicao(expo);
        System.out.println("getListaExposicoes");
        CriarDemonstracaoController instance = new CriarDemonstracaoController(ce);
        Exposicao[] expResult = ce.mostrarLista();
        Exposicao[] result = instance.getListaExposicoes();
        assertArrayEquals(expResult, result);
       
    }
    
}
