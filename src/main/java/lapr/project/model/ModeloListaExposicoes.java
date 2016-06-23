package lapr.project.model;

import javax.swing.AbstractListModel;

public class ModeloListaExposicoes extends AbstractListModel {

    private RegistoExposicoes listaExposicoes;

    public ModeloListaExposicoes(RegistoExposicoes listaExposicoes) {
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

    public void addElement(Exposicao e) {
        listaExposicoes.adicionarExposicao(e);

    }

}
