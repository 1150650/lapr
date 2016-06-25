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
    private RegistoExposicoes listaExposicoes;

    private ListaStands listaStands;

    private RegistoTipoDeConflito listaTipoDeConflito;

    private RegistoUtilizadores registoUtilizadoresNConf;

    private RegistoUtilizadores registoUtilizadoresConf;

    private ListaRecursos listarecursos;

    private RegistoMecanismos registoMecanismos;

    private ListaDemonstracoes registoDemonstracoes;
    
    private ListaGestores listaGestores;
    
    private ListaKeywords lstkeyword ;

   
    

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
        this.lstkeyword=new ListaKeywords();
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

  @XmlElement
    public void setListaStands(ListaStands listaStands) {
        this.listaStands = listaStands;
    }

    public ListaRecursos getListarecursos() {
        return listarecursos;
    }

    @XmlElement
    public void setListarecursos(ListaRecursos listarecursos) {
        this.listarecursos = listarecursos;
    }

    public ListaDemonstracoes getRegistoDemonstracoes() {
        return registoDemonstracoes;
    }

    @XmlElement
    public void setRegistoDemonstracoes(ListaDemonstracoes registoDemonstracoes) {
        this.registoDemonstracoes = registoDemonstracoes;
    }
    
    @XmlElement
    public void setListaExposicoes(RegistoExposicoes listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    @XmlElement
    public void setListaTipoDeConflito(RegistoTipoDeConflito listaTipoDeConflito) {
        this.listaTipoDeConflito = listaTipoDeConflito;
    }

    @XmlElement
    public void setRegistoUtilizadoresNConf(RegistoUtilizadores registoUtilizadoresNConf) {
        this.registoUtilizadoresNConf = registoUtilizadoresNConf;
    }

    @XmlElement
    public void setRegistoUtilizadoresConf(RegistoUtilizadores registoUtilizadoresConf) {
        this.registoUtilizadoresConf = registoUtilizadoresConf;
    }

    @XmlElement
    public void setRegistoMecanismos(RegistoMecanismos registoMecanismos) {
        this.registoMecanismos = registoMecanismos;
    }

    @XmlElement
    public void setListaGestores(ListaGestores listaGestores) {
        this.listaGestores = listaGestores;
    }
     public ListaKeywords getLstkeyword() {
        return lstkeyword;
    }

     @XmlElement
    public void setLstkeyword(ListaKeywords lstkeyword) {
        this.lstkeyword = lstkeyword;
    }

}
