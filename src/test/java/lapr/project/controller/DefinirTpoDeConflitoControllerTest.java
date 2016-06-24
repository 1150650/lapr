/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class DefinirTpoDeConflitoControllerTest {
    
    public DefinirTpoDeConflitoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaTipoDeConflitos method, of class DefinirTpoDeConflitoController.
     */
    @Test
    public void testGetListaTipoDeConflitos() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaTipoDeConflitos");
        DefinirTpoDeConflitoController instance = new DefinirTpoDeConflitoController(ce);
        instance.criarTipoDeConflito();
        instance.getListaTipoDeConflitos();
        
    }

    /**
     * Test of criarTipoDeConflito method, of class DefinirTpoDeConflitoController.
     */
    @Test
    public void testCriarTipoDeConflito() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("criarTipoDeConflito");
        DefinirTpoDeConflitoController instance = new DefinirTpoDeConflitoController(ce);
        instance.criarTipoDeConflito();
        
    }

    /**
     * Test of definirTipoDeConflito method, of class DefinirTpoDeConflitoController.
     */
    @Test
    public void testDefinirTipoDeConflito() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("definirTipoDeConflito");
        String descricao = "";
        DefinirTpoDeConflitoController instance =new DefinirTpoDeConflitoController(ce);
        instance.criarTipoDeConflito();
        instance.definirTipoDeConflito(descricao);
       
    }

    /**
     * Test of registarTipoDeConflito method, of class DefinirTpoDeConflitoController.
     */
    @Test
    public void testRegistarTipoDeConflito() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("registarTipoDeConflito");
        DefinirTpoDeConflitoController instance = new DefinirTpoDeConflitoController(ce);
        instance.criarTipoDeConflito();
        instance.registarTipoDeConflito();
        
    }
    
}
