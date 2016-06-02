package lapr.project.model;

import java.util.Date;
import java.util.List;
import javax.swing.JList;

public class CentroExposicoes {

    /**
     * Criação de instância da lista de exposições
     */
    private ListaExposicoes listaExposicoes;

    /**
     * Criação de uma instância de uma JList
     */
    private JList JListExposicoes;
    
    private ListaStands listaStands;
    
    private RegistoUtilizadores listaUtilizadores;
    
/**
 * Contrutor do centro de exposicoes
 */
    public CentroExposicoes() {
        this.listaExposicoes = new ListaExposicoes();
this.listaStands= new ListaStands ();
    }
    
/**
 * Retorna a lista de exposições do centro de exposições
 * @return lista de exposições
 */
    public ListaExposicoes getListaExposicoes() {
        return listaExposicoes;
    }

    /**
     * Retorna um array de exposições com as exposições de centro de exposições
     * @return arrray das exposições
     */
    public Exposicao[] getArrayExposicao() {
        return listaExposicoes.getArray();
    }

    /**
     * Retorna a JList da lista de exposições
     * @return a JList da lista de exposições
     */
    public JList getJListExposicoes() {
        return JListExposicoes;
    }
    
    public RegistoUtilizadores getRegistoUtilizadores(){
        return listaUtilizadores;
    }

    /**
     * Acede aos indices de cada exposição e preenche cada exposição num array
     * @return o array com as exposições
     */
    public Exposicao[] mostrarLista() {
        Exposicao[] string = new Exposicao[listaExposicoes.tamanho()];

        int tamanho = listaExposicoes.tamanho();
        for (int i = 0; i < tamanho; i++) {

            string[i] = listaExposicoes.obterExposicao(i);
        }
        return string;
    }

}
