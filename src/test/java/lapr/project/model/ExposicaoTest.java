/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class ExposicaoTest {
    
    public ExposicaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTitulo method, of class Exposicao.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        String expResult = "Expo1";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTextoDescritivo method, of class Exposicao.
     */
    @Test
    public void testGetTextoDescritivo() {
        System.out.println("getTextoDescritivo");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        String expResult = "Isto é uma descrição";
        String result = instance.getTextoDescritivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataInicio method, of class Exposicao.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        Date expResult = new Date(2015, 9, 22);
        Date result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFim method, of class Exposicao.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        Date expResult =  new Date(2016, 9, 22);
        Date result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocal method, of class Exposicao.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        String expResult = "Porto";
        String result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturasExposicoes method, of class Exposicao.
     */
    @Test
    public void testGetListaCandidaturasExposicoes() {
        System.out.println("getListaCandidaturasExposicoes");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaCandidaturas expResult = instance.getListaCandidaturasExposicoes();
        ListaCandidaturas result = instance.getListaCandidaturasExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaDemonstracoes expResult = instance.getListaDemonstracao();
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaFAE method, of class Exposicao.
     */
    @Test
    public void testGetListaFAE() {
        System.out.println("getListaFAE");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaFAE expResult = instance.getListaFAE();
        ListaFAE result = instance.getListaFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class Exposicao.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "Expo1";
        Exposicao instance = new Exposicao(titulo, "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        instance.setTitulo(titulo);
    }

    /**
     * Test of setTextoDescritivo method, of class Exposicao.
     */
    @Test
    public void testSetTextoDescritivo() {
        System.out.println("setTextoDescritivo");
        String texto = "Isto é uma descrição";
        Exposicao instance = new Exposicao("Expo1", texto, new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        instance.setTextoDescritivo(texto);
    }

    /**
     * Test of setPeriodo method, of class Exposicao.
     */
    @Test
    public void testSetPeriodo() {
        System.out.println("setPeriodo");
        Date dataInicio = new Date(2015, 9, 22);
        Date dataFim = new Date(2016, 9, 22);
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", dataInicio, dataFim, "Porto");
        instance.setPeriodo(dataInicio, dataFim);
    }

    /**
     * Test of setDataInicio method, of class Exposicao.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Date dataInicio = new Date(2015, 9, 22);
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", dataInicio, new Date(2016, 9, 22), "Porto");
        instance.setDataInicio(dataInicio);
    }

    /**
     * Test of setDataFim method, of class Exposicao.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Date dataFim = new Date(2016, 9, 22);
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), dataFim, "Porto");
        instance.setDataFim(dataFim);
    }

    /**
     * Test of setLocal method, of class Exposicao.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "Porto";
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), local);
        instance.setLocal(local);
    }

    /**
     * Test of setListaCandidaturasExposicoes method, of class Exposicao.
     */
    @Test
    public void testSetListaCandidaturasExposicoes() {
        System.out.println("setListaCandidaturasExposicoes");
        ListaCandidaturas listaCandidaturasExposicoes = new ListaCandidaturas();
        Exposicao instance = new Exposicao();
        instance.setListaCandidaturasExposicoes(listaCandidaturasExposicoes);
    }

    /**
     * Test of toString method, of class Exposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        String expResult = String.format("Título: %s; Local: %s", "Expo1", "Porto");
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarCandidatura method, of class Exposicao.
     */
    @Test
    public void testAdicionarCandidatura() {
        System.out.println("adicionarCandidatura");
        CandidaturaExposicao d = new CandidaturaExposicao();
        Exposicao instance = new Exposicao();
        instance.adicionarCandidatura(d);
    }

    /**
     * Test of mostrarLista method, of class Exposicao.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("mostrarLista");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        Candidatura[] expResult = instance.mostrarLista();
        Candidatura[] result = instance.mostrarLista();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getListaOrganizadores method, of class Exposicao.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaOrganizadores expResult = instance.getListaOrganizadores();
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaConflitos method, of class Exposicao.
     */
    @Test
    public void testGetListaConflitos() {
        System.out.println("getListaConflitos");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaConflitos expResult = instance.getListaConflitos();
        ListaConflitos result = instance.getListaConflitos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaRepresentantes method, of class Exposicao.
     */
    @Test
    public void testGetListaRepresentantes() {
        System.out.println("getListaRepresentantes");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        RegistoRepresentantes expResult = instance.getListaRepresentantes();
        RegistoRepresentantes result = instance.getListaRepresentantes();
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarRepresentante method, of class Exposicao.
     */
    @Test
    public void testAdicionarRepresentante() {
        System.out.println("adicionarRepresentante");
        Representante r = new Representante();
        Exposicao instance = new Exposicao();
        instance.adicionarRepresentante(r);
    }

    /**
     * Test of getListaCandidaturasDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testGetListaCandidaturasDemonstracoes() {
        System.out.println("getListaCandidaturasDemonstracoes");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaCandidaturas expResult = instance.getListaCandidaturasDemonstracoes();
        ListaCandidaturas result = instance.getListaCandidaturasDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracao method, of class Exposicao.
     */
    @Test
    public void testGetListaDemonstracao() {
        System.out.println("getListaDemonstracao");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaDemonstracoes expResult = instance.getListaDemonstracao();
        ListaDemonstracoes result = instance.getListaDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaCandidaturasDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testSetListaCandidaturasDemonstracoes() {
        System.out.println("setListaCandidaturasDemonstracoes");
        ListaCandidaturas listaCandidaturasDemonstracoes = new ListaCandidaturas();
        Exposicao instance = new Exposicao();
        instance.setListaCandidaturasDemonstracoes(listaCandidaturasDemonstracoes);
    }

    /**
     * Test of setListaDemonstracao method, of class Exposicao.
     */
    @Test
    public void testSetListaDemonstracao() {
        System.out.println("setListaDemonstracao");
        ListaDemonstracoes listaDemonstracao = new ListaDemonstracoes();
        Exposicao instance = new Exposicao();
        instance.setListaDemonstracao(listaDemonstracao);
    }

    /**
     * Test of setListaAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testSetListaAtribuicoes() {
        System.out.println("setListaAtribuicoes");
        ListaAtribuicoes lstA = new ListaAtribuicoes();
        Exposicao instance = new Exposicao();
        instance.setListaAtribuicoes(lstA);
    }

    /**
     * Test of getListaAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ListaAtribuicoes expResult = instance.getListaAtribuicoes();
        ListaAtribuicoes result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
    }

  

    /**
     * Test of getExposicaoEstado method, of class Exposicao.
     */
    @Test
    public void testGetExposicaoEstado() {
        System.out.println("getExposicaoEstado");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        ExposiçãoState expResult = null;
        ExposiçãoState result = instance.getExposicaoEstado();
        expResult=result;
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstado method, of class Exposicao.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        ExposiçãoState m_state2 = null;
        Exposicao instance = new Exposicao();
        instance.setEstado(m_state2);
    }

    /**
     * Test of setExposicaoCriada method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCriada() {
        System.out.println("setExposicaoCriada");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCriada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoDemonstracoesSemFAE method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoDemonstracoesSemFAE() {
        System.out.println("setExposicaoDemonstracoesSemFAE");
        Exposicao instance = new Exposicao();
        boolean expResult = true;
        boolean result = instance.setExposicaoDemonstracoesSemFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoFAESemDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoFAESemDemonstracoes() {
        System.out.println("setExposicaoFAESemDemonstracoes");
        Exposicao instance = new Exposicao();
        boolean expResult = true;
        boolean result = instance.setExposicaoFAESemDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCompleta method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCompleta() {
        System.out.println("setExposicaoCompleta");
        Exposicao instance = new Exposicao("Expo1", "Isto é uma descrição", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        boolean expResult = false;
        boolean result = instance.setExposicaoCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoAbertaParaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoAbertaParaCandidaturas() {
        System.out.println("setExposicaoAbertaParaCandidaturas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoAbertaParaCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasFechadas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasFechadas() {
        System.out.println("setExposicaoCandidaturasFechadas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturaConflitosDetetados method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturaConflitosDetetados() {
        System.out.println("setExposicaoCandidaturaConflitosDetetados");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturaConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturaConflitosAlterados method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturaConflitosAlterados() {
        System.out.println("setExposicaoCandidaturaConflitosAlterados");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturaConflitosAlterados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidas() {
        System.out.println("setExposicaoCandidaturasAtribuidas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAvaliadas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasAvaliadas() {
        System.out.println("setExposicaoCandidaturasAvaliadas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidasStand method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidasStand() {
        System.out.println("setExposicaoCandidaturasAtribuidasStand");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidasStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoStandsConfirmados method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoStandsConfirmados() {
        System.out.println("setExposicaoStandsConfirmados");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoStandsConfirmados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoDemonstracoesDefinidas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoDemonstracoesDefinidas() {
        System.out.println("setExposicaoDemonstracoesDefinidas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoDemonstracoesDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoAbertaCandDemonstracao method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoAbertaCandDemonstracao() {
        System.out.println("setExposicaoAbertaCandDemonstracao");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoAbertaCandDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoFechadaCandDemonstracao method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoFechadaCandDemonstracao() {
        System.out.println("setExposicaoFechadaCandDemonstracao");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoFechadaCandDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoConflitosDetetadosDemonstracao method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoConflitosDetetadosDemonstracao() {
        System.out.println("setExposicaoConflitosDetetadosDemonstracao");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoConflitosDetetadosDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoConflitosAlteradosDemonstracao method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoConflitosAlteradosDemonstracao() {
        System.out.println("setExposicaoConflitosAlteradosDemonstracao");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoConflitosAlteradosDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasDemonstracaoAtribuidas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasDemonstracaoAtribuidas() {
        System.out.println("setExposicaoCandidaturasDemonstracaoAtribuidas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasDemonstracaoAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasDemonstracaoAvaliadas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasDemonstracaoAvaliadas() {
        System.out.println("setExposicaoCandidaturasDemonstracaoAvaliadas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasDemonstracaoAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasDemonstracaoAceites method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasDemonstracaoAceites() {
        System.out.println("setExposicaoCandidaturasDemonstracaoAceites");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasDemonstracaoAceites();
        assertEquals(expResult, result);
    }
    
}
