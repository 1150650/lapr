/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class CentroExposicoesTest {
    
    public CentroExposicoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoExposicoes listaExposicoes = new RegistoExposicoes();
        
        instance.setListaExposicoes(listaExposicoes);
        RegistoExposicoes expResult = listaExposicoes;
        RegistoExposicoes result = instance.getListaExposicoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getArrayExposicao method, of class CentroExposicoes.
     */
    @Test
    public void testGetArrayExposicao() {
        System.out.println("getArrayExposicao");
        CentroExposicoes instance = new CentroExposicoes();
        Exposicao[] expResult =instance.getArrayExposicao();
        Exposicao[] result = instance.getArrayExposicao();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getListastands method, of class CentroExposicoes.
     */
    @Test
    public void testGetListastands() {
        System.out.println("getListastands");
        CentroExposicoes instance = new CentroExposicoes();
         ListaStands listaStands = new ListaStands();
        
        instance.setListaStands(listaStands);
        ListaStands expResult = listaStands;
        ListaStands result = instance.getListastands();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaTipoDeConflito method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaTipoDeConflito() {
        System.out.println("getListaTipoDeConflito");
        CentroExposicoes instance = new CentroExposicoes();
         RegistoTipoDeConflito listaTipoDeConflito = new RegistoTipoDeConflito();
        instance.setListaTipoDeConflito(listaTipoDeConflito);
        RegistoTipoDeConflito expResult = listaTipoDeConflito;
        RegistoTipoDeConflito result = instance.getListaTipoDeConflito();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRegistoUtilizadoresConf method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoUtilizadoresConf() {
        System.out.println("getRegistoUtilizadoresConf");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoUtilizadores registoUtilizadoresConf = new RegistoUtilizadores ();
        
        instance.setRegistoUtilizadoresConf(registoUtilizadoresConf);
        RegistoUtilizadores expResult = registoUtilizadoresConf;
        RegistoUtilizadores result = instance.getRegistoUtilizadoresConf();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of mostrarLista method, of class CentroExposicoes.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("mostrarLista");
        CentroExposicoes instance = new CentroExposicoes();
        Exposicao[] expResult =instance.mostrarLista();
        Exposicao[] result = instance.mostrarLista();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getRegistoUtilizadoresNConf method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoUtilizadoresNConf() {
        System.out.println("getRegistoUtilizadoresNConf");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoUtilizadores registoUtilizadoresNConf = new RegistoUtilizadores ();
    
        instance.setRegistoUtilizadoresNConf(registoUtilizadoresNConf);
        RegistoUtilizadores expResult = registoUtilizadoresNConf;
        RegistoUtilizadores result = instance.getRegistoUtilizadoresNConf();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRegistoMecanismos method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoMecanismos() {
        System.out.println("getRegistoMecanismos");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoMecanismos registoMecanismos = new RegistoMecanismos ();
        
        instance.setRegistoMecanismos(registoMecanismos);
        RegistoMecanismos expResult = registoMecanismos;
        RegistoMecanismos result = instance.getRegistoMecanismos();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListaDemonstracoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        CentroExposicoes instance = new CentroExposicoes();
        ListaDemonstracoes registoDemonstracoes = new ListaDemonstracoes();
        
        instance.setRegistoDemonstracoes(registoDemonstracoes);
        ListaDemonstracoes expResult = registoDemonstracoes;
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRegistoRecursos method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoRecursos() {
        System.out.println("getRegistoRecursos");
        CentroExposicoes instance = new CentroExposicoes();
        ListaRecursos listarecursos = new ListaRecursos ();
        
        instance.setListarecursos(listarecursos);
        ListaRecursos expResult = listarecursos;
        ListaRecursos result = instance.getRegistoRecursos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaGestores method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaGestores() {
        System.out.println("getListaGestores");
        CentroExposicoes instance = new CentroExposicoes();
        ListaGestores listaGestores = new ListaGestores ();
        
        instance.setListaGestores(listaGestores);
        ListaGestores expResult = listaGestores;
        ListaGestores result = instance.getListaGestores();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mostrarListaStand method, of class CentroExposicoes.
     */
    @Test
    public void testMostrarListaStand() {
        System.out.println("mostrarListaStand");
        CentroExposicoes instance = new CentroExposicoes();
        Stand[] expResult = instance.mostrarListaStand();
        Stand[] result = instance.mostrarListaStand();
        assertArrayEquals(expResult, result);
        
    }

  

    /**
     * Test of getListaStands method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaStands() {
        System.out.println("getListaStands");
        CentroExposicoes instance = new CentroExposicoes();
        ListaStands listaStands = new ListaStands();
        
        instance.setListaStands(listaStands);
        ListaStands expResult = listaStands;
        ListaStands result = instance.getListaStands();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setListaStands method, of class CentroExposicoes.
     */
    @Test
    public void testSetListaStands() {
        System.out.println("setListaStands");
        ListaStands listaStands = new ListaStands();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListaStands(listaStands);
        
    }

    /**
     * Test of getListarecursos method, of class CentroExposicoes.
     */
    @Test
    public void testGetListarecursos() {
        System.out.println("getListarecursos");
        CentroExposicoes instance = new CentroExposicoes();
        ListaRecursos listarecursos = new ListaRecursos ();
        
        instance.setListarecursos(listarecursos);
        ListaRecursos expResult = listarecursos;
        ListaRecursos result = instance.getListarecursos();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setListarecursos method, of class CentroExposicoes.
     */
    @Test
    public void testSetListarecursos() {
        System.out.println("setListarecursos");
        ListaRecursos listarecursos = new ListaRecursos ();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListarecursos(listarecursos);
        
    }

    /**
     * Test of getRegistoDemonstracoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoDemonstracoes() {
        System.out.println("getRegistoDemonstracoes");
        CentroExposicoes instance = new CentroExposicoes();
         ListaDemonstracoes registoDemonstracoes = new ListaDemonstracoes();
        
        instance.setRegistoDemonstracoes(registoDemonstracoes);
        ListaDemonstracoes expResult =registoDemonstracoes;
        ListaDemonstracoes result = instance.getRegistoDemonstracoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setRegistoDemonstracoes method, of class CentroExposicoes.
     */
    @Test
    public void testSetRegistoDemonstracoes() {
        System.out.println("setRegistoDemonstracoes");
        ListaDemonstracoes registoDemonstracoes = new ListaDemonstracoes();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setRegistoDemonstracoes(registoDemonstracoes);
        
    }

    /**
     * Test of setListaExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testSetListaExposicoes() {
        System.out.println("setListaExposicoes");
        RegistoExposicoes listaExposicoes = new RegistoExposicoes();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListaExposicoes(listaExposicoes);
        
    }

    /**
     * Test of setListaTipoDeConflito method, of class CentroExposicoes.
     */
    @Test
    public void testSetListaTipoDeConflito() {
        System.out.println("setListaTipoDeConflito");
        RegistoTipoDeConflito listaTipoDeConflito = new RegistoTipoDeConflito();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListaTipoDeConflito(listaTipoDeConflito);
        
    }

    /**
     * Test of setRegistoUtilizadoresNConf method, of class CentroExposicoes.
     */
    @Test
    public void testSetRegistoUtilizadoresNConf() {
        System.out.println("setRegistoUtilizadoresNConf");
        RegistoUtilizadores registoUtilizadoresNConf = new RegistoUtilizadores ();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setRegistoUtilizadoresNConf(registoUtilizadoresNConf);
        
    }

    /**
     * Test of setRegistoUtilizadoresConf method, of class CentroExposicoes.
     */
    @Test
    public void testSetRegistoUtilizadoresConf() {
        System.out.println("setRegistoUtilizadoresConf");
        RegistoUtilizadores registoUtilizadoresConf = new RegistoUtilizadores ();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setRegistoUtilizadoresConf(registoUtilizadoresConf);
        
    }

    /**
     * Test of setRegistoMecanismos method, of class CentroExposicoes.
     */
    @Test
    public void testSetRegistoMecanismos() {
        System.out.println("setRegistoMecanismos");
        RegistoMecanismos registoMecanismos = new RegistoMecanismos ();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setRegistoMecanismos(registoMecanismos);
        
    }

    /**
     * Test of setListaGestores method, of class CentroExposicoes.
     */
    @Test
    public void testSetListaGestores() {
        System.out.println("setListaGestores");
        ListaGestores listaGestores = new ListaGestores ();
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListaGestores(listaGestores);
        
    }
    
}
