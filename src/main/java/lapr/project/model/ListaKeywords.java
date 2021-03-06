/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOAO
 */
@XmlRootElement
public class ListaKeywords {

    @XmlElement (name = "KeyWord")
    private List<KeywordExample> listaKeyword;

    public ListaKeywords() {
        listaKeyword = new ArrayList<>();
    }

    public KeywordExample obterKeyword(int indice) {
        return listaKeyword.get(indice);
    }

    public boolean adicionarKeyword(KeywordExample keyword) {
        if (!listaKeyword.contains(keyword)) {
            return listaKeyword.add(keyword);
        }
        return false;
    }

    public boolean removerKeyword(KeywordExample keyword) {
        return listaKeyword.remove(keyword);
    }

    public int tamanho() {
        return this.listaKeyword.size();
    }

    public int indiceDe(KeywordExample keyword) {
        return listaKeyword.indexOf(keyword);
    }

    public boolean contem(KeywordExample keyword) {
        return listaKeyword.contains(keyword);
    }
    
    public void addKey (String[] Keywords){
        int i;
        for (i=0;i< Keywords.length; i++){
            KeywordExample k = new KeywordExample (Keywords[i]);
            listaKeyword.add(k);
        }
    }

}
