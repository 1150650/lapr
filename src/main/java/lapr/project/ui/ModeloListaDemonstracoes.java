package lapr.project.ui;

import javax.swing.AbstractListModel;
import lapr.project.model.Demonstracao;
import lapr.project.model.ListaDemonstracoes;

public class ModeloListaDemonstracoes extends AbstractListModel {

    private ListaDemonstracoes listaDemonstracoes;

    public ModeloListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

    @Override
    public int getSize() {
        return listaDemonstracoes.tamanho();
    }

    @Override
    public Object getElementAt(int indice) {
        return listaDemonstracoes.obterDemonstracao(indice);
    }

    public void addElement(Demonstracao d) {
        listaDemonstracoes.addDemonstracao(d);

    }

}
