package lapr.project.controller;

import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Utilizador;

public class AvaliarCandidaturaFAEController {

    /**
     * Fae
     */
    private FAE fae;

    /**
     * Utilizador
     */
    private Utilizador u;

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes ce;

    /**
     * Candidatura
     */
    private Candidatura candidatura;

    /**
     * Avaliacao
     */
    private Avaliacao avaliacao;

    /**
     * Exposicao
     */
    private Exposicao expo;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas lstCand;

    /**
     * Lista de Candidaturass
     */
    private ListaAvaliacoes lstAval;

    /**
     * Construtor de Avaliar Candidura controller
     *
     * @param ce Centro de Exposicoes
     * @param u Utilizador
     */
    public AvaliarCandidaturaFAEController(CentroExposicoes ce, Utilizador u) {
        this.ce = ce;
        this.u = u;
        fae = new FAE();
    }

    /**
     * Seleciona a Candidaturas
     *
     * @param a Candidatura Nova
     */
    public void selecionarCandidatura(Candidatura a) {
        this.candidatura = a;
        getListaAvaliacoes();
    }

    /**
     * Seleciona a Exposicao
     *
     * @param e Exposicaos
     */
    public void selecionarExposicao(Exposicao e) {
        this.expo = e;
        this.fae = expo.getListaFAE().obterFAEPorUtilizador(u);
    }

    /**
     * Retorna uma String Com a Informacao da Candidatura
     *
     * @return
     */
    public String getInfo() {
        return candidatura.toString();
    }

    /**
     * Retorna Lista de Avaliacoes
     */
    public void getListaAvaliacoes() {
        this.lstAval = candidatura.getListaAvaliacoes();
    }

    /**
     * Adiciona a Avaliacao do FAe
     *
     * @param conhecimentoFAE
     */
    public void setFAEAvaliacao(int[] conhecimentoFAE) {
        avaliacao.setConhecimentosFAE(conhecimentoFAE);
    }

    /**
     * Adiciona a Avaliacao a Lista
     *
     * @param a Avaliacao
     */
    public void adicionarAvaliacao(Avaliacao a) {
        lstAval.addAvaliacao(avaliacao);
    }

    /**
     * Retorna a lista de Candidatura Selecionada
     *
     * @return candidatura Selecionada
     */
    public Candidatura candidaturaSelecionada() {
        return candidatura;
    }

    /**
     * Retorn FAE
     *
     * @return FAE
     */
    public FAE getFAE() {
        return fae;
    }

}
