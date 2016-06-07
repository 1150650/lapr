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

    private double calcularDesvioPadrao(List<Integer> listInteger, List<Integer> listMedia) {
        double media = calcularMedia(listMedia);
        double total = 0;
        for (int avaliacao : listInteger) {
            total = total + Math.abs(avaliacao - media);
        }
        return total / listInteger.size();
    }

    private double calcularMedia(List<Integer> listInteger) {
        double total = 0;
        for (int avaliacao : listInteger) {
            total = total + avaliacao;
        }
        return total / listInteger.size();
    }

}
