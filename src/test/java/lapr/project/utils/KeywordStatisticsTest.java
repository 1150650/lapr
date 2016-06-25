/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import lapr.project.model.KeywordExample;
import lapr.project.model.ListaKeywords;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOAO
 */
public class KeywordStatisticsTest {
    
    public KeywordStatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of retirarDuplicados method, of class KeywordStatistics.
     */
    @Test
    public void testRetirarDuplicados() {
        System.out.println("retirarDuplicados");
        ListaKeywords lstkeyword=new ListaKeywords();
        KeywordExample k = new KeywordExample();
        lstkeyword.adicionarKeyword(k);
        KeywordStatistics instance = new KeywordStatistics(lstkeyword);
        instance.retirarDuplicados();
        
    }

    /**
     * Test of numeroRepeticoes method, of class KeywordStatistics.
     */
    @Test
    public void testNumeroRepeticoes() {
        System.out.println("numeroRepeticoes");
        ListaKeywords lstkeyword=new ListaKeywords();
        KeywordExample k = new KeywordExample();
        lstkeyword.adicionarKeyword(k);
        KeywordStatistics instance = new KeywordStatistics(lstkeyword);
        instance.retirarDuplicados();
        instance.numeroRepeticoes();
        
    }

    /**
     * Test of escreverNoFicherioCSV method, of class KeywordStatistics.
     */
    @Test
    public void testEscreverNoFicherioCSV() throws Exception {
        System.out.println("escreverNoFicherioCSV");
        ListaKeywords lstkeyword=new ListaKeywords();
        KeywordExample k = new KeywordExample();
        lstkeyword.adicionarKeyword(k);
        KeywordStatistics instance = new KeywordStatistics(lstkeyword);
        instance.retirarDuplicados();
        instance.numeroRepeticoes();
        instance.escreverNoFicherioCSV();
        
    }
    
}
