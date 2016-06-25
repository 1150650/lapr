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

    
}
