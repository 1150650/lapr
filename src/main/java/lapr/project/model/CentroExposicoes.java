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

    /**
     * Lista de Stands de CE
     */
    private ListaStands listaStands;

    /**
     * Registo de tipo Conflitos
     */
    private RegistoTipoDeConflito listaTipoDeConflito;

    /**
     * Registo Utilizadores
     */
    private RegistoUtilizadores registoUtilizadoresNConf;

    /**
     * Registo de Utilizadores nao confirmados
     */
    private RegistoUtilizadores registoUtilizadoresConf;

    /**
     * Lista Recursos
     */
    private ListaRecursos listarecursos;

    /**
     * Registo de Mecanismos
     */
    private RegistoMecanismos registoMecanismos;

    /**
     * Lista de Demonstracoes
     */
    private ListaDemonstracoes registoDemonstracoes;

    /**
     * Lista de Gestores
     */
    private ListaGestores listaGestores;

    /**
     * Lista de KeyWords
     */
    private ListaKeywords lstkeyword;

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
        this.registoDemonstracoes = new ListaDemonstracoes();
        this.registoMecanismos = new RegistoMecanismos();
        this.lstkeyword = new ListaKeywords();
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

    /**
     * Retorna Lista de Stands
     *
     * @return lista de Stands
     */
    public ListaStands getListastands() {
        return listaStands;
    }

    /**
     * Retorna Registo de Tipo de Conflitos
     *
     * @return Registo de Tipo de Conflito
     */
    public RegistoTipoDeConflito getListaTipoDeConflito() {
        return listaTipoDeConflito;
    }

    /**
     * Retorna Registo de Utilizadores
     *
     * @return Lista de Utilizadores confirmados
     */
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

    /**
     * Retorna Registo Mecanismos
     *
     * @return
     */
    public RegistoMecanismos getRegistoMecanismos() {
        return registoMecanismos;
    }

    /**
     * Lista Demonstracoes
     *
     * @return lista Demonstracoes
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return registoDemonstracoes;
    }

    /**
     * Retorna Lista Recursos
     *
     * @return lista Recursos
     */
    public ListaRecursos getRegistoRecursos() {
        return listarecursos;
    }

    /**
     * Retorna Lista Gestores
     *
     * @return lista Gestores
     */
    public ListaGestores getListaGestores() {
        return listaGestores;
    }

    /**
     * Retorn Lista de Stand em Array List
     *
     * @return lista de Stand
     */
    public Stand[] mostrarListaStand() {
        Stand[] string = new Stand[listaStands.tamanho()];

        int tamanho = listaStands.tamanho();
        for (int i = 0; i < tamanho; i++) {

            string[i] = listaStands.obterStand(i);
        }
        return string;
    }

    /**
     * Retorna Registo de Exposicoes
     *
     * @return lista de exposicoes
     */
    public RegistoExposicoes getRegistoExposicoesConflitosAlterados() {
        RegistoExposicoes lstExposicaoComConflitosAlterados = new RegistoExposicoes();
        for (int i = 0; i <= listaExposicoes.tamanho(); i++) {
            if (listaExposicoes.obterExposicao(i).getExposicaoEstado().isEstadoConflitosAlterados()) {
                lstExposicaoComConflitosAlterados.adicionarExposicao(listaExposicoes.obterExposicao(i));
            }
        }
        return lstExposicaoComConflitosAlterados;
    }

    /**
     * Retorna Lista de Stand
     *
     * @return lista de Stands
     */
    public ListaStands getListaStands() {
        return listaStands;
    }

    /**
     * Altera Lista de Stand
     *
     * @param listaStands Lista de Stand
     */
    @XmlElement
    public void setListaStands(ListaStands listaStands) {
        this.listaStands = listaStands;
    }

    /**
     * Retorna Lista de Recursos
     *
     * @return lista de Recursos
     */
    public ListaRecursos getListarecursos() {
        return listarecursos;
    }

    /**
     * Altera a lista de Recursos
     *
     * @return Lista Recursos
     */
    @XmlElement
    public void setListarecursos(ListaRecursos listarecursos) {
        this.listarecursos = listarecursos;
    }

    /**
     * Retorna Lista de Demonstracoes
     *
     * @return Lista Demonstracoes
     */
    public ListaDemonstracoes getRegistoDemonstracoes() {
        return registoDemonstracoes;
    }

    /**
     * Altera o Registo de Demonstracoes
     *
     * @param registoDemonstracoes lista demonstracoes
     */
    @XmlElement
    public void setRegistoDemonstracoes(ListaDemonstracoes registoDemonstracoes) {
        this.registoDemonstracoes = registoDemonstracoes;
    }

    /**
     * Altera o Parametro Lista de Exposicao
     *
     * @param listaExposicoes
     */
    @XmlElement
    public void setListaExposicoes(RegistoExposicoes listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    /**
     * Altera o Parametro registo de conflitos
     *
     * @param listaTipoDeConflito registos de Conflitos
     */
    @XmlElement
    public void setListaTipoDeConflito(RegistoTipoDeConflito listaTipoDeConflito) {
        this.listaTipoDeConflito = listaTipoDeConflito;
    }

    /**
     * Altera o Parametro registo de nao confirmados
     *
     * @param registoUtilizadoresNConf
     */
    @XmlElement
    public void setRegistoUtilizadoresNConf(RegistoUtilizadores registoUtilizadoresNConf) {
        this.registoUtilizadoresNConf = registoUtilizadoresNConf;
    }

    /**
     * Altera o Parametro registo de Confirmados
     *
     * @param registoUtilizadoresConf
     */
    @XmlElement
    public void setRegistoUtilizadoresConf(RegistoUtilizadores registoUtilizadoresConf) {
        this.registoUtilizadoresConf = registoUtilizadoresConf;
    }

    /**
     * Altera o Parametro Registos de Mecanismos
     *
     * @param registoMecanismos registo mecanismo
     */
    @XmlElement
    public void setRegistoMecanismos(RegistoMecanismos registoMecanismos) {
        this.registoMecanismos = registoMecanismos;
    }

    /**
     * Altera o Parametro Lista Gestores
     *
     * @param registoMecanismos registo gestores
     */
    @XmlElement
    public void setListaGestores(ListaGestores listaGestores) {
        this.listaGestores = listaGestores;
    }

    /**
     * Retorna a lista de Keywords
     *
     * @return Lista de Keywords
     */
    public ListaKeywords getLstkeyword() {
        return lstkeyword;
    }

    /**
     * Altera o Parametro Keyword
     *
     * @param lstkeyword Lista de Keywords
     */
    @XmlElement
    public void setLstkeyword(ListaKeywords lstkeyword) {
        this.lstkeyword = lstkeyword;
    }

}
