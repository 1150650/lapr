package lapr.project.model;

import java.util.Date;
import java.util.List;
import javax.swing.JList;

public class CentroExposicoes {

    /**
     * Criação de instância da lista de exposições
     */
    private RegistoExposicoes listaExposicoes;

    /**
     * Criação de uma instância de uma JList
     */
    private JList JListExposicoes;

    private ListaStands listaStands;

    private RegistoTipoDeConflito listaTipoDeConflito;

    private RegistoUtilizadores registoUtilizadoresNConf;

    private RegistoUtilizadores registoUtilizadoresConf;

    private ListaRecursos listarecursos;
    
    private RegistoMecanismos registoMecanismos;
    
    private ListaDemonstracoes registoDemonstracoes;
    
    private ListaRecursos registoRecursos;

    /**
     * Contrutor do centro de exposicoes
     */
    public CentroExposicoes() {
        this.listaExposicoes = new RegistoExposicoes();
        this.listaStands = new ListaStands();
        this.listaTipoDeConflito = new RegistoTipoDeConflito();
        this.listarecursos = new ListaRecursos();
        this.registoUtilizadoresConf=new RegistoUtilizadores();
        this.registoUtilizadoresNConf=new RegistoUtilizadores();
    }

    /**
     * Retorna a lista de exposições do centro de exposições
     *
     * @return lista de exposições
     */
    public RegistoExposicoes getListaExposicoes() {
        return listaExposicoes;
    }

    /**
     * Retorna um array de exposições com as exposições de centro de exposições
     *
     * @return arrray das exposições
     */
    public Exposicao[] getArrayExposicao() {
        return listaExposicoes.getArray();
    }

    public ListaStands getListastands() {
        return listaStands;
    }

    public RegistoTipoDeConflito getListaTipoDeConflito() {

        return listaTipoDeConflito;
    }

    /**
     * Retorna a JList da lista de exposições
     *
     * @return a JList da lista de exposições
     */
    public JList getJListExposicoes() {
        return JListExposicoes;
    }

    public RegistoUtilizadores getRegistoUtilizadoresConf() {
        return registoUtilizadoresConf;
    }

    /**
     * Acede aos indices de cada exposição e preenche cada exposição num array
     *
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

    /**
     * Retorna o registo de Utilizadores que ainda não foram confirmados
     *
     * @return
     */
    public RegistoUtilizadores getRegistoUtilizadoresNConf() {
        return registoUtilizadoresNConf;
    }

    public RegistoMecanismos getRegistoMecanismos() {
        return registoMecanismos;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return registoDemonstracoes;
    }
    
    public ListaRecursos getRegistoRecursos(){
        return listarecursos;
    }


}
