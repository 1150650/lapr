/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.swing.AbstractListModel;
import lapr.project.model.*;

public class ModeloListaCandidaturas extends AbstractListModel {

    private ListaCandidaturas listaCandidatura;
    
    public ModeloListaCandidaturas(ListaCandidaturas listaCandidatura) {
        this.listaCandidatura = listaCandidatura;
    }

    @Override
    public int getSize() {
        return listaCandidatura.tamanho();
    }

    @Override
    public Object getElementAt(int indice) {
        return listaCandidatura.obterCandidatura(indice);
    }
    
    public boolean addElement(Candidatura candidatura){
        boolean jogadorAdicionado = listaCandidatura.adicionarCandidatura(candidatura);
        if(jogadorAdicionado)
            fireIntervalAdded(this, getSize()-1, getSize()-1);
        return jogadorAdicionado;
    } 

    public boolean removeElement(Candidatura candidatura){
        int indice = listaCandidatura.indiceDe(candidatura);
        boolean jogadorRemovido = listaCandidatura.removerCandidatura(candidatura);
        if(jogadorRemovido)
            fireIntervalRemoved(this, indice, indice);
        return jogadorRemovido;
    }
    
    public boolean contains(Candidatura candidatura){
        return listaCandidatura.contem(candidatura);
    }
    

}
