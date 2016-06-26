package lapr.project.controller;

import javax.swing.JOptionPane;
import lapr.project.model.*;

public class AtribuirCandidaturaController {

    /**
     * Exposicao
     */
    private Exposicao expo;

    /**
     * Lista de FAE
     */
    private ListaFAE listaFae;

    /**
     * Lista de Exposicoes do Centro
     */
    private RegistoExposicoes lstExpo;

    /**
     * Cento de Exposicoes
     */
    private CentroExposicoes ce;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas lstCandidaturas;

    /**
     * Lista de Atribuicoes
     */
    private ListaAtribuicoes lstAtribuicoes;

    /**
     * Mecanismos possiveis
     */
    private Mecanismo m;

    /**
     * Construtor do Controller
     *
     * @param ce Centro de Exposicoes
     */
    public AtribuirCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
        this.lstExpo = ce.getListaExposicoes();
        this.lstAtribuicoes = new ListaAtribuicoes();
    }

    /**
     * Seleciona a Exposicao
     *
     * @param expo
     */
    public void selecionarExposicao(Exposicao expo) {
        this.expo = expo;
        this.listaFae = getListaFAE();
        this.lstCandidaturas = getListaCandidatura();
    }

    /**
     * Retorna Lista de FAE
     *
     * @return Lista de FAE
     */
    public ListaFAE getListaFAE() {
        return expo.getListaFAE();
    }

    /**
     * Retorna a lista de Candidaturas
     *
     * @return lista Candidaturas
     */
    public ListaCandidaturas getListaCandidatura() {
        return expo.getListaCandidaturasExposicoes();
    }

    /**
     * Retorna a Exposicao selecionada
     *
     * @return exposicao
     */
    public Exposicao getExposicaoSelecionada() {
        return expo;
    }

    /**
     * Retorna Lista de FAE
     *
     * @return lista de FAE
     */
    public ListaFAE getListaFAESelecionada() {
        return listaFae;
    }

    /**
     * Retorna Lista de Candidaturas
     *
     * @return lista Candidaturas
     */
    public ListaCandidaturas getlstCandidaturas() {
        return lstCandidaturas;
    }

    /**
     * Selecionar Mecanismo
     *
     * @param indice opcao de mecanismo
     */
    public void selecionarMecanismo(int indice) {
        if (indice == 1) {
            m = new MecanismoCargaEquitativaPorFAE(lstCandidaturas, listaFae);
        } else if (indice == 2) {
            m = new MecanismoExperienciaPorFAE(lstCandidaturas, listaFae);
        } else if (indice == 3) {
            int nPorfae = Integer.parseInt(JOptionPane.showInputDialog("Numero de Candidaturas por Fae"));
            m = new MecanismoNumeroFAEPorCandidatura(lstCandidaturas, listaFae, nPorfae);
        }
    }

    /**
     * Regista Atribuicoes Novas
     */
    public void registaAtribuições() {
        expo.setAtribuicoes(lstAtribuicoes);
        for (int j = 0; j < lstAtribuicoes.tamanho(); j++) {
            lstAtribuicoes.obterAtribuiçao(j).getFAE().adicionarCandidatura(lstAtribuicoes.obterAtribuiçao(j).getCandidatura());
            lstAtribuicoes.obterAtribuicao(j).getFAE().aumentarExperienciaFAE();
            lstAtribuicoes.obterAtribuiçao(j).getCandidatura().getState().setAtribuida();
        }
        expo.getExposicaoEstado().setExposicaoCandidaturasAtribuidas();
    }

    /**
     * Retorna Lista de Atribuicoes
     *
     * @return lista de Atribuicoes
     */
    public ListaAtribuicoes getLstAtribuicoes() {
        return lstAtribuicoes;
    }

    /**
     * Atribui as Atribuições a exposição
     */
    public void atribuir() {
        lstAtribuicoes = m.atribuirCandidaturasAFAE(lstCandidaturas, listaFae);
    }

}
