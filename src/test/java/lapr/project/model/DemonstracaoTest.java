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
import org.w3c.dom.Node;

/**
 *
 * @author JOAO
 */
public class DemonstracaoTest {
    
    public DemonstracaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCodigo method, of class Demonstracao.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Demonstracao instance = new Demonstracao();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Demonstracao.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Demonstracao instance = new Demonstracao();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListalRecursos method, of class Demonstracao.
     */
    @Test
    public void testGetListalRecursos() {
        System.out.println("getListalRecursos");
        Demonstracao instance = new Demonstracao();
        ListaRecursos expResult = null;
        ListaRecursos result = instance.getListalRecursos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Demonstracao.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Demonstracao instance = new Demonstracao();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRecurso method, of class Demonstracao.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = null;
        Demonstracao instance = new Demonstracao();
        instance.addRecurso(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Demonstracao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Demonstracao instance = new Demonstracao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Demonstracao.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int Codigo = 0;
        Demonstracao instance = new Demonstracao();
        instance.setCodigo(Codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportContentToXMLNode method, of class Demonstracao.
     */
    @Test
    public void testExportContentToXMLNode() {
        System.out.println("exportContentToXMLNode");
        Demonstracao instance = new Demonstracao();
        Node expResult = null;
        Node result = instance.exportContentToXMLNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importContentFromXMLNode method, of class Demonstracao.
     */
    @Test
    public void testImportContentFromXMLNode() {
        System.out.println("importContentFromXMLNode");
        Node node = null;
        Demonstracao instance = new Demonstracao();
        Demonstracao expResult = null;
        Demonstracao result = instance.importContentFromXMLNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Demonstracao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Demonstracao instance = new Demonstracao();
        DemonstracaoState expResult = null;
        DemonstracaoState result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Demonstracao.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        DemonstracaoState state = null;
        Demonstracao instance = new Demonstracao();
        instance.setEstado(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoCriada method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoCriada() {
        System.out.println("setDemonstracaoCriada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCriada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoAbertaCandidaturas method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoAbertaCandidaturas() {
        System.out.println("setDemonstracaoAbertaCandidaturas");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoAbertaCandidaturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoCandidaturaAceite method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoCandidaturaAceite() {
        System.out.println("setDemonstracaoCandidaturaAceite");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturaAceite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoCandidaturaAvaliada method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoCandidaturaAvaliada() {
        System.out.println("setDemonstracaoCandidaturaAvaliada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturaAvaliada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoCandidaturaEmAvaliacao method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoCandidaturaEmAvaliacao() {
        System.out.println("setDemonstracaoCandidaturaEmAvaliacao");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturaEmAvaliacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoCandidaturaNaoAvaliada method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoCandidaturaNaoAvaliada() {
        System.out.println("setDemonstracaoCandidaturaNaoAvaliada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturaNaoAvaliada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCandidaturaRejeitada method, of class Demonstracao.
     */
    @Test
    public void testSetCandidaturaRejeitada() {
        System.out.println("setCandidaturaRejeitada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setCandidaturaRejeitada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCandidaturaRetirada method, of class Demonstracao.
     */
    @Test
    public void testSetCandidaturaRetirada() {
        System.out.println("setCandidaturaRetirada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setCandidaturaRetirada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCandidaturasAtribuidas method, of class Demonstracao.
     */
    @Test
    public void testSetCandidaturasAtribuidas() {
        System.out.println("setCandidaturasAtribuidas");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setCandidaturasAtribuidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCandidaturasEmSubmissao method, of class Demonstracao.
     */
    @Test
    public void testSetCandidaturasEmSubmissao() {
        System.out.println("setCandidaturasEmSubmissao");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setCandidaturasEmSubmissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConflitosCandidaturaAlterados method, of class Demonstracao.
     */
    @Test
    public void testSetConflitosCandidaturaAlterados() {
        System.out.println("setConflitosCandidaturaAlterados");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setConflitosCandidaturaAlterados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConflitosCandidaturaDetetados method, of class Demonstracao.
     */
    @Test
    public void testSetConflitosCandidaturaDetetados() {
        System.out.println("setConflitosCandidaturaDetetados");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setConflitosCandidaturaDetetados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoAprovada method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoAprovada() {
        System.out.println("setDemonstracaoAprovada");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoAprovada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDemonstracaoFechadaACandidaturas method, of class Demonstracao.
     */
    @Test
    public void testSetDemonstracaoFechadaACandidaturas() {
        System.out.println("setDemonstracaoFechadaACandidaturas");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.setDemonstracaoFechadaACandidaturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
