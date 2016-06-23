/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class RankingStatisticsTest {
    
    public RankingStatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcularDesvioPadrao method, of class RankingStatistics.
     */
    @Test
    public void testCalcularDesvioPadrao() {
        System.out.println("calcularDesvioPadrao");
        List<Integer> listInteger = new ArrayList<>();
        List<Integer> listMedia = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listMedia.add(1);
        listMedia.add(1);
        RankingStatistics instance = new RankingStatistics();
        double expResult = (int)1;
        double result = instance.calcularDesvioPadrao(listInteger, listMedia);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularMedia method, of class RankingStatistics.
     */
    @Test
    public void testCalcularMedia() {
        System.out.println("calcularMedia");
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(1);
        RankingStatistics instance = new RankingStatistics();
        double expResult = 0;
        double result = instance.calcularMedia(listInteger);
        assertEquals(expResult, result);
    }
    
}
