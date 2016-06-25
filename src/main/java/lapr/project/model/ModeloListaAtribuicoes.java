/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import javax.swing.AbstractListModel;

/**
 *
 * @author SimãoPedro
 */
public class ModeloListaAtribuicoes extends AbstractListModel implements Serializable {

    private ListaAtribuicoes listaAtribuicoes;

    public ModeloListaAtribuicoes(ListaAtribuicoes listaAtribuicoes) {
        this.listaAtribuicoes = listaAtribuicoes;
    }
    
    public ModeloListaAtribuicoes() {
        this.listaAtribuicoes = new ListaAtribuicoes();
    }
    

    @Override
    public int getSize() {
        return listaAtribuicoes.tamanho();
    }

    @Override
    public Object getElementAt(int indice) {
        return listaAtribuicoes.obterAtribuiçao(indice);
    }

    public boolean addElement(Candidatura candidatura, FAE fae) {
        boolean atribuicaoAdicionado = listaAtribuicoes.adicionarAtribuição(new AtribuicaoFAE(fae, candidatura));
        if (atribuicaoAdicionado) {
            fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        }
        return atribuicaoAdicionado;
    }

    public boolean contains(AtribuicaoFAE atribuicao) {
        return listaAtribuicoes.contem(atribuicao);
    }
}
