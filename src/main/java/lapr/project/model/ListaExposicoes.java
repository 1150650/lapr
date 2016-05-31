
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ListaExposicoes {
    
    private List<Exposicao> listaExposicoes;
   // private ListaCandidaturas lstCandidaturas = new ListaCandidaturas();

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
    
   // public List<Exposicao> criarListaExposicoesTeste(){
        //Exposicao expo1 = new Exposicao("Expo1", "Para todos", new Date(2016, 05, 24), new Date(2016, 06, 24), "Porto", lstCandidaturas);
       // Exposicao expo2 = new Exposicao("Expo2", "Para ninguem", new Date(2016, 05, 24), new Date(2016, 06, 24), "Lisbos", lstCandidaturas);
       // Exposicao expo3 = new Exposicao("Expo3", "Para si", new Date(2016, 05, 24), new Date(2016, 06, 24), "Algarve", lstCandidaturas);
       // List<Exposicao> listaExpo = new ArrayList<Exposicao>();
        //listaExpo.add(expo1);
       // listaExpo.add(expo2);
       // listaExpo.add(expo3);
       // return listaExpo;
   // }
    
}
