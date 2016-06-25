package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CentroExposicoes")
public class CentroExposicoes {

    /**
     * Criação de instância da lista de exposições
     */
    @XmlElement
    private RegistoExposicoes listaExposicoes;

   

    @XmlElement
    private ListaStands listaStands;

  

    @XmlElement
    private RegistoTipoDeConflito listaTipoDeConflito;

    @XmlElement
    private RegistoUtilizadores registoUtilizadoresNConf;

    @XmlElement
    private RegistoUtilizadores registoUtilizadoresConf;

    @XmlElement
    private ListaRecursos listarecursos;

    @XmlElement
    private RegistoMecanismos registoMecanismos;

    @XmlElement
    private ListaDemonstracoes registoDemonstracoes;
    
    @XmlElement
    private ListaGestores listaGestores;

    

    /**
     * Contrutor do centro de exposicoes
     */
    public CentroExposicoes() {
        this.listaExposicoes = new RegistoExposicoes();
        this.listaStands = new ListaStands();
        this.listaTipoDeConflito = new RegistoTipoDeConflito();
        this.listarecursos = new ListaRecursos();
        this.registoUtilizadoresConf = new RegistoUtilizadores();
        this.registoUtilizadoresNConf = new RegistoUtilizadores();
        this.listaGestores = new ListaGestores();
        this.registoDemonstracoes=new ListaDemonstracoes ();
        this.registoMecanismos=new RegistoMecanismos ();
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

    public ListaRecursos getRegistoRecursos() {
        return listarecursos;
    }
    
    public ListaGestores getListaGestores(){
        return listaGestores;
    }

    public Stand[] mostrarListaStand() {
        Stand[] string = new Stand[listaStands.tamanho()];

        int tamanho = listaStands.tamanho();
        for (int i = 0; i < tamanho; i++) {

            string[i] = listaStands.obterStand(i);
        }
        return string;
    }

    public RegistoExposicoes getRegistoExposicoesConflitosAlterados() {
        RegistoExposicoes lstExposicaoComConflitosAlterados = new RegistoExposicoes();
        for (int i = 0; i <= listaExposicoes.tamanho(); i++) {
            if (listaExposicoes.obterExposicao(i).getExposicaoEstado().isEstadoConflitosAlterados()) {
                lstExposicaoComConflitosAlterados.adicionarExposicao(listaExposicoes.obterExposicao(i));
            }
        }
        return lstExposicaoComConflitosAlterados;
    }
  public ListaStands getListaStands() {
        return listaStands;
    }

    public void setListaStands(ListaStands listaStands) {
        this.listaStands = listaStands;
    }

    public ListaRecursos getListarecursos() {
        return listarecursos;
    }

    public void setListarecursos(ListaRecursos listarecursos) {
        this.listarecursos = listarecursos;
    }

    public ListaDemonstracoes getRegistoDemonstracoes() {
        return registoDemonstracoes;
    }

    public void setRegistoDemonstracoes(ListaDemonstracoes registoDemonstracoes) {
        this.registoDemonstracoes = registoDemonstracoes;
    }
    public void setListaExposicoes(RegistoExposicoes listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    public void setListaTipoDeConflito(RegistoTipoDeConflito listaTipoDeConflito) {
        this.listaTipoDeConflito = listaTipoDeConflito;
    }

    public void setRegistoUtilizadoresNConf(RegistoUtilizadores registoUtilizadoresNConf) {
        this.registoUtilizadoresNConf = registoUtilizadoresNConf;
    }

    public void setRegistoUtilizadoresConf(RegistoUtilizadores registoUtilizadoresConf) {
        this.registoUtilizadoresConf = registoUtilizadoresConf;
    }

    public void setRegistoMecanismos(RegistoMecanismos registoMecanismos) {
        this.registoMecanismos = registoMecanismos;
    }

    public void setListaGestores(ListaGestores listaGestores) {
        this.listaGestores = listaGestores;
    }
}
