
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ListaExposicoes {
    
    private List<Exposicao> listaExposicoes;


    public ListaExposicoes() {
        listaExposicoes = new ArrayList <>();
    }
    
    public void adicionarExposicao(Exposicao e){
        listaExposicoes.add(e);
    }
    
    public int tamanho() {
        return this.listaExposicoes.size();
    }
    
    public Exposicao obterExposicao(int indice) {
        return listaExposicoes.get(indice);
    }
    
    public List<Exposicao> getListaExposicoes() {
        return new ArrayList(listaExposicoes);
    }
    
    public Exposicao[] getArray() {
        return listaExposicoes.toArray( new Exposicao[listaExposicoes.size()] );
    }
   
    
}
