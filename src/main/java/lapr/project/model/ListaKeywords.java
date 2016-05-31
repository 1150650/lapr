/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOAO
 */
public class ListaKeywords {
     private List<KeywordExample> listaKeyword;

   
    public ListaKeywords() {
        listaKeyword = new ArrayList <>();
    }
    
   
    public KeywordExample obterKeyword(int indice) {
        return listaKeyword.get(indice);
    }
    
    
    public boolean adicionarKeyword(KeywordExample  keyword) {
        if (!listaKeyword.contains( keyword)) {
            return listaKeyword.add( keyword);
        }
        return false;
    }
    
   
    public boolean removerKeyword(KeywordExample  keyword) {
        return listaKeyword.remove( keyword);
    }
    
    
    public int tamanho() {
        return this.listaKeyword.size();
    }
    
   
    public int indiceDe(KeywordExample  keyword) {
        return listaKeyword.indexOf( keyword);
    }
    
  
    public boolean contem(KeywordExample  keyword) {
        return listaKeyword.contains(keyword);
    }
    
}
