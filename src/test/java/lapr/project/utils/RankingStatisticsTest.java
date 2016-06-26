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
        List<Double> listDouble = new ArrayList<Double>();
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        RankingStatistics instance = new RankingStatistics();
        double expResult = 2.0;
        double result = instance.calcularDesvioPadrao(listDouble);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularVariancia method, of class RankingStatistics.
     */
    @Test
    public void testCalcularVariancia() {
        System.out.println("calcularVariancia");
        List<Double> listDouble = new ArrayList<Double>();
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        RankingStatistics instance = new RankingStatistics();
        double expResult = 0.0;
        double result = instance.calcularVariancia(listDouble);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcularMedia method, of class RankingStatistics.
     */
    @Test
    public void testCalcularMedia() {
        System.out.println("calcularMedia");
        List<Double> listDouble = new ArrayList<Double>();
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        listDouble.add(2.0);
        RankingStatistics instance = new RankingStatistics();
        double expResult = 0.0;
        double result = instance.calcularMedia(listDouble);
        assertEquals(expResult, result, 0.0);

    }

}
