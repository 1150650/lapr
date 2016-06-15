/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.AbstractListModel;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;


/**
 *
 * @author JOAO
 */
public class ModeloListaRecursos extends AbstractListModel {
     private ListaRecursos listarecursos;
    
    public ModeloListaRecursos(ListaRecursos listarecursos) {
        this.listarecursos = listarecursos;
    }

  
    public int getSize() {
        return listarecursos.tamanho();
    }

    public Object getElementAt(int indice) {
        return listarecursos.obterRecurso(indice);
    }
    
    public boolean addElement(Recurso r){
        boolean recursoAdicionado = listarecursos.addRecurso(r);
        if(recursoAdicionado)
            fireIntervalAdded(this, getSize()-1, getSize()-1);
        return recursoAdicionado;
    } 

    public boolean removeElement(Recurso r){
        int indice = listarecursos.indiceDe(r);
        boolean recursoRemovido = listarecursos.removerRecurso(r);
        if(recursoRemovido)
            fireIntervalRemoved(this, indice, indice);
        return recursoRemovido;
    }

}
