
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class RegistoExposicoes {
    
    private List<Exposicao> listaExposicoes;


    public RegistoExposicoes() {
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
    
    public List getExposicoesOrganizador(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
