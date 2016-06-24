/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class RegistarExposicaoControllerTest {
    
    public RegistarExposicaoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of novaExposicao method, of class RegistarExposicaoController.
     */
    @Test
    public void testNovaExposicao() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("novaExposicao");
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        instance.novaExposicao();
        
    }

    /**
     * Test of setDados method, of class RegistarExposicaoController.
     */
    @Test
    public void testSetDados() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("setDados");
        String titulo = "dasf";
        String textoDescritivo = "asdf";
        Date dataInicio = new Date(1998,10,10);
        Date dataFim = new Date(1999,10,10);
        String local = "asdfa";
        
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        instance.novaExposicao();
        instance.setDados(titulo, textoDescritivo, dataInicio, dataFim, local);
       
    }

    /**
     * Test of getListaUtilizadores method, of class RegistarExposicaoController.
     */
    @Test
    public void testGetListaUtilizadores() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaUtilizadores");
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        RegistoUtilizadores expResult = ce.getRegistoUtilizadoresConf();
        RegistoUtilizadores result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of adicionarOrganizador method, of class RegistarExposicaoController.
     */
    @Test
    public void testAdicionarOrganizador() {
        
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("adicionarOrganizador");
        Utilizador selecionado = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        instance.novaExposicao();
        instance.adicionarOrganizador(selecionado);
        
    }

    /**
     * Test of validaRegistaExposicao method, of class RegistarExposicaoController.
     */
    @Test
    public void testValidaRegistaExposicao() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("validaRegistaExposicao");
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        instance.novaExposicao();
        instance.validaRegistaExposicao();
       
    }

    /**
     * Test of setEstadoExposicaoCriada method, of class RegistarExposicaoController.
     */
    @Test
    public void testSetEstadoExposicaoCriada() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("setEstadoExposicaoCriada");
        RegistarExposicaoController instance = new  RegistarExposicaoController(ce); 
        instance.novaExposicao();
        instance.setEstadoExposicaoCriada();
        
    }
    
}
