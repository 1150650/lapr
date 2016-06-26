/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simão Pedro
 */
public class DecidirDemonstraçõesControllerTest {

    public DecidirDemonstraçõesControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selecionarExposicao method, of class
     * DecidirDemonstraçõesController.
     */
    @Test
    public void testSelecionarExposicao() {
        System.out.println("selecionarExposicao");
        Exposicao e = new Exposicao();
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(e);
    }

    /**
     * Test of getListaDemonstracoes method, of class
     * DecidirDemonstraçõesController.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.getListaDemonstracoes();
    }

    /**
     * Test of selecionarDemonstracao method, of class
     * DecidirDemonstraçõesController.
     */
    @Test
    public void testSelecionarDemonstracao() {
        System.out.println("selecionarDemonstracao");
        Demonstracao demo = new Demonstracao();
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarDemonstracao(demo);

    }

    /**
     * Test of apresentarDados method, of class DecidirDemonstraçõesController.
     */
    @Test
    public void testApresentarDados() {
        System.out.println("apresentarDados");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarDemonstracao(new Demonstracao());
        String expResult = "";
        String result = instance.apresentarDados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoAberta method, of class
     * DecidirDemonstraçõesController.
     */
    @Test
    public void testSetDemonstracaoAberta() {
        System.out.println("setDemonstracaoAberta");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarDemonstracao(new Demonstracao());
        boolean expResult = false;
        boolean result = instance.setDemonstracaoAberta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoDemonstracaoDefinidas method, of class
     * DecidirDemonstraçõesController.
     */
    @Test
    public void testSetExposicaoDemonstracaoDefinidas() {
        System.out.println("setExposicaoDemonstracaoDefinidas");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(new Exposicao());
        instance.selecionarDemonstracao(new Demonstracao());
        boolean expResult = true;
        boolean result = instance.setExposicaoDemonstracaoDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLstDemo method, of class DecidirDemonstraçõesController.
     */
    @Test
    public void testGetLstDemo() {
        System.out.println("getLstDemo");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao c = new Exposicao();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.selecionarExposicao(c);
        ListaDemonstracoes expResult = c.getListaDemonstracao();
        ListaDemonstracoes result = instance.getLstDemo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLstDemo method, of class DecidirDemonstraçõesController.
     */
    @Test
    public void testSetLstDemo() {
        System.out.println("setLstDemo");
        CentroExposicoes ce = new CentroExposicoes();
        ListaDemonstracoes lstDemo = null;
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        instance.setLstDemo(lstDemo);
        
    }

    /**
     * Test of getDemonstraccao method, of class DecidirDemonstraçõesController.
     */
    @Test
    public void testGetDemonstraccao() {
        System.out.println("getDemonstraccao");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        Demonstracao expResult = null;
        Demonstracao result = instance.getDemonstraccao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpo method, of class DecidirDemonstraçõesController.
     */
    @Test
    public void testGetExpo() {
        System.out.println("getExpo");
        CentroExposicoes ce = new CentroExposicoes();
        DecidirDemonstraçõesController instance = new DecidirDemonstraçõesController(ce);
        Exposicao expResult = null;
        Exposicao result = instance.getExpo();
        assertEquals(expResult, result);
    }

}
