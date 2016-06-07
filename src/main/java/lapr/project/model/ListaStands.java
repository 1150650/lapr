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
public class ListaStands {
      private List<Stand> listaStands;


    public ListaStands() {
        listaStands = new ArrayList <>();
    }
    
    
    public int tamanho() {
        return this.listaStands.size();
    }
    
    public Stand obterStand(int indice) {
        return listaStands.get(indice);
    }
    
    public List<Stand> getListaStands() {
        return new ArrayList(listaStands);
    }
    
     public boolean adicionarStand(Stand s) {
        if (!listaStands.contains(s)) {
            return listaStands.add(s);
        }
        return false;
    }
     
     public Stand novoStand(){
        return new Stand();
    }

    public List getListaStandsDisponiveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void registaStandCandidatura(Stand stand, Candidatura candidatura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
