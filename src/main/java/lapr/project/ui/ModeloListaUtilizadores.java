/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import javax.swing.AbstractListModel;

/**
 *
 * @author JOAO
 */
class ModeloListaUtilizadores extends AbstractListModel {

    private RegistoUtilizadores listautilizadores;
    
    public ModeloListaUtilizadores(RegistoUtilizadores listautilizadores) {
        this.listautilizadores = listautilizadores;
    }

  
    public int getSize() {
        return listautilizadores.tamanho();
    }

    public Object getElementAt(int indice) {
        return listautilizadores.obterUtilizador(indice);
    }
    
    public boolean addElement(Utilizador utilizador){
        boolean jogadorAdicionado = listautilizadores.registaUtilizador(utilizador);
        if(jogadorAdicionado)
            fireIntervalAdded(this, getSize()-1, getSize()-1);
        return jogadorAdicionado;
    } 

    public boolean removeElement(Utilizador utilizador){
        int indice = listautilizadores.indiceDe(utilizador);
        boolean jogadorRemovido = listautilizadores.removerUtilizador(utilizador);
        if(jogadorRemovido)
            fireIntervalRemoved(this, indice, indice);
        return jogadorRemovido;
    }

    
    
    
    
    

}


