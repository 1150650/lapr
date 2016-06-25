/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import lapr.project.model.ListaKeywords;

/**
 *
 * @author Filipe
 */
public class KeywordStatistics {

    private ListaKeywords lstkeyword;
    private ListaKeywords lstkeywordnotDuplicat;
    private ArrayList<String> lstrepeticoeskeyword;

    public KeywordStatistics(ListaKeywords lstkeyword) {
        
        this.lstkeyword=lstkeyword;
        this.lstkeywordnotDuplicat=new ListaKeywords();
        this.lstrepeticoeskeyword=new ArrayList();

    }

    public void retirarDuplicados() {
        int i;

        for (i = 0; i < lstkeyword.tamanho(); i++) {
            if (lstkeywordnotDuplicat.contem(lstkeyword.obterKeyword(i)) == false) {
                lstkeywordnotDuplicat.adicionarKeyword(lstkeyword.obterKeyword(i));
            }

        }

    }

    public void numeroRepeticoes() {
        int i;
        int j;
        int cont = 0;

        for (i = 0; i < lstkeywordnotDuplicat.tamanho(); i++) {

            for (j = 0; j < lstkeyword.tamanho(); j++) {
                if (lstkeywordnotDuplicat.obterKeyword(i) == lstkeyword.obterKeyword(j)) {
                    cont = cont + 1;
                }
                lstrepeticoeskeyword.add(Integer.toString(cont));
                cont = 0;
            }
        }
    }

    public void escreverNoFicherioCSV() throws IOException {
        int i;

        FileWriter writer = new FileWriter("StatisticsKeyword.csv");

        writer.append("Keyword");
        writer.append(';');
        writer.append("Numero De Vezes");
        writer.append('\n');

        for (i = 0; i < lstkeywordnotDuplicat.tamanho(); i++) {
            writer.append(lstkeywordnotDuplicat.obterKeyword(i).exportContentToString());
            writer.append(';');
            writer.append(lstrepeticoeskeyword.get(i));
            writer.append('\n');

        }

        writer.flush();
        writer.close();

    }
}
