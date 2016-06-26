/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.List;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class RankingStatistics {

    public double calcularDesvioPadrao(List<Double> listDouble) {
        return Math.sqrt(calcularVariancia(listDouble));
    }

    public double calcularVariancia(List<Double> listDouble) {
        double media = calcularMedia(listDouble);
        double total = 0;
        for (double n : listDouble) {
            total = total + Math.pow(n - media, 2);
        }
        return total / (listDouble.size() - 1);
    }

    public double calcularMedia(List<Double> listDouble) {
        double total = 0;
        for (double n : listDouble) {
            total = total + n;
        }
        return total / listDouble.size();
    }

}
