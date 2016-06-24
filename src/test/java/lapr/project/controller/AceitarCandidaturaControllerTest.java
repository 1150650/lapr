/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Stand;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class AceitarCandidaturaControllerTest {
    
    public AceitarCandidaturaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaExposicoes method, of class AceitarCandidaturaController.
     */
    @Test
    public void testGetListaExposicoes() {
        CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaExposicoes");
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        Exposicao[] expResult = ce.mostrarLista();
        Exposicao[] result = instance.getListaExposicoes();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasExposicoes method, of class AceitarCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturasExposicoes() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaCandidaturasExposicoes");
        Exposicao expo = new Exposicao();
        ce.getListaExposicoes().adicionarExposicao(expo);
    
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        ListaCandidaturas expResult = expo.getListaCandidaturasExposicoes() ;
        ListaCandidaturas result = instance.getListaCandidaturasExposicoes(expo);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListaCandidaturasDemonstracoes method, of class AceitarCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturasDemonstracoes() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaCandidaturasDemonstracoes");
        Exposicao expo = new Exposicao();

        ce.getListaExposicoes().adicionarExposicao(expo);
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        ListaCandidaturas expResult =expo.getListaCandidaturasDemonstracoes() ;
        ListaCandidaturas result = instance.getListaCandidaturasDemonstracoes(expo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of aceitarCandidaturaDemonstracao method, of class AceitarCandidaturaController.
     */
    @Test
    public void testAceitarCandidaturaDemonstracao() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("aceitarCandidaturaDemonstracao");
        
        Candidatura c = new Candidatura();
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        instance.aceitarCandidaturaDemonstracao(c);
        
    }

    /**
     * Test of aceitarCandidaturaExposciao method, of class AceitarCandidaturaController.
     */
    @Test
    public void testAceitarCandidaturaExposciao() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("aceitarCandidaturaExposciao");
        Candidatura c = new Candidatura();
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        instance.aceitarCandidaturaExposciao(c);
       
    }

    /**
     * Test of getListaStands method, of class AceitarCandidaturaController.
     */
    @Test
    public void testGetListaStands() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("getListaStands");
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        Stand[] expResult = ce.mostrarListaStand();
        Stand[] result = instance.getListaStands();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of adicionarStandCandidaturaExposciao method, of class AceitarCandidaturaController.
     */
    @Test
    public void testAdicionarStandCandidaturaExposciao() {
         CentroExposicoes ce= new CentroExposicoes();
        System.out.println("adicionarStandCandidaturaExposciao");
        Stand s = new Stand("teste");
        AceitarCandidaturaController instance = new AceitarCandidaturaController(ce) ;
        instance.adicionarStandCandidaturaExposciao(s);
        
    }
    
}
