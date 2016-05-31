
package lapr.project.model;

import javax.swing.AbstractListModel;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaExposicoes;



public class ModeloListaExposicoes extends AbstractListModel {
    
    private ListaExposicoes listaExposicoes;
    
    public ModeloListaExposicoes(ListaExposicoes listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    @Override
    public int getSize() {
        return listaExposicoes.tamanho();
    }

    @Override
    public Object getElementAt(int indice) {
        return listaExposicoes.obterExposicao(indice);
    }
    
    public void addElement(Exposicao e){
        listaExposicoes.adicionarExposicao(e);

    } 
    
    
    
}
