/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class RankingStatisticsTest {

    public void ensureMediaWorks() {
        double expected = 255.75;
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(12);
        testList.add(1000);
        testList.add(1);
        RankingStatistics media = new RankingStatistics();
        double result = media.calcularMedia(testList);
        assertEquals(expected, result);
    }

    public void ensureDesvioPadraoWorks() {
        double expected = 2 / 3;
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(12);
        testList.add(11);
        testList.add(11);
        List<Integer> testDesvio = new ArrayList<>();
        testDesvio.add(10);
        testDesvio.add(11);
        testDesvio.add(12);
        RankingStatistics desvioPadrao = new RankingStatistics();
        double result = desvioPadrao.calcularDesvioPadrao(testList, testDesvio);
        assertEquals(expected, result);
    }

}
