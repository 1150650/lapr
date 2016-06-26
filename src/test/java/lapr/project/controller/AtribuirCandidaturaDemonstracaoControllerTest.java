/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Mecanismo;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class AtribuirCandidaturaDemonstracaoControllerTest {
    
    public AtribuirCandidaturaDemonstracaoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setRepresentante method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testSetRepresentante() {
        System.out.println("setRepresentante");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador("teste", "teste@gmail.com", "teste", ".Teste404");
        Representante representante = new Representante(u);
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        instance.setRepresentante(representante);
    }

    /**
     * Test of getListaFAE method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaFAE() {
        System.out.println("getListaFAE");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        List expResult = instance.getListaFAE(exposicao);
        List result = instance.getListaFAE(exposicao);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidatura method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaCandidatura() {
        System.out.println("getListaCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        ListaCandidaturas expResult = instance.getListaCandidatura();
        ListaCandidaturas result = instance.getListaCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoMecanismos method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetRegistoMecanismos() {
        System.out.println("getRegistoMecanismos");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        List expResult = instance.getRegistoMecanismos();
        List result = instance.getRegistoMecanismos();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionaMecanismo method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testSelecionaMecanismo() {
        System.out.println("selecionaMecanismo");
        Mecanismo mecanismo = null;
        AtribuirCandidaturaDemonstracaoController instance = null;
        instance.selecionaMecanismo(mecanismo);
    }

    /**
     * Test of registaAtribuicao method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testRegistaAtribuicao() {
        System.out.println("registaAtribuicao");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        instance.registaAtribuicao();
    }

    /**
     * Test of setCandidaturasAtribuidas method, of class AtribuirCandidaturaDemonstracaoController.
     */
    @Test
    public void testSetCandidaturasAtribuidas() {
        System.out.println("setCandidaturasAtribuidas");
        CentroExposicoes ce = new CentroExposicoes();
        AtribuirCandidaturaDemonstracaoController instance = new AtribuirCandidaturaDemonstracaoController(ce);
        instance.setCandidaturasAtribuidas();
    }
    
}
