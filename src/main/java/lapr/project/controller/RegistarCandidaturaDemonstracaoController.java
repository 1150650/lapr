/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class RegistarCandidaturaDemonstracaoController {

    /**
     * Registo de Exposicao
     */
    private RegistoExposicoes registoExposicoes;

    /**
     * List do tipo Exposicao
     */
    private List<Exposicao> listaExposicoes;

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Exposicao
     */
    private Exposicao exposicao;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas listaCandidaturas;

    /**
     * Candidatura a Exposicao
     */
    private CandidaturaExposicao candidaturaExposicao;

    /**
     * Lista de Demonstracoes
     */
    private ListaDemonstracoes listaDemonstracoesComInteresse;

    /**
     * Candidatura a Demonstracao
     */
    private CandidaturaDemonstracao candidaturaDemo;

    /**
     * Representante
     */
    private Representante representante;
    /**
     * Utilizador F
     */
    private Utilizador u;

    /**
     * Construtor do Controller
     *
     * @param centroExposicoes
     * @param u
     */
    public RegistarCandidaturaDemonstracaoController(CentroExposicoes centroExposicoes, Utilizador u) {
        this.centroExposicoes = centroExposicoes;
        this.u = u;
    }

    /**
     * Retorna Array Lista Exposicaos
     *
     * @return
     */
    public Exposicao[] getListaExposicoes() {
        return this.centroExposicoes.mostrarLista();
    }

    /**
     * Retorna Lista Candidaturas
     *
     * @param expo Exposicao
     * @return
     */
    public ListaCandidaturas getListaCandidaturas(Exposicao expo) {
        this.exposicao = expo;
        this.representante = this.exposicao.getListaRepresentantes().obterRepresentantePorU(u);
        return listaCandidaturas = representante.getListaCandidaturasExposicao();
    }

    /**
     * Altera Candidatura a Exposicao
     *
     * @param candidaturaExposicao
     */
    public void setCandidaturaExposicao(CandidaturaExposicao candidaturaExposicao) {
        this.candidaturaExposicao = candidaturaExposicao;
    }

    /**
     * Array Lista de Demonstracao
     *
     * @return Array List de Demosntracao
     */
    public Demonstracao[] getListaDemonstracoesCInteresse() {
        return candidaturaExposicao.mostrarlistDemons();
    }

    /**
     * Adiciona a candidatura a Demonstracao
     */
    public void addCandidaturaDemonstracao() {
        exposicao.getListaCandidaturasDemonstracoes().adicionarCandidatura(candidaturaDemo);
        representante.getListaCandidaturasDemonstracao().adicionarCandidatura(candidaturaDemo);
    }

    /**
     * Returna Candidatura a Demonstracaos
     *
     * @param candidaturaExposicao
     * @return
     */
    public CandidaturaDemonstracao newCandidaturaDemo(CandidaturaExposicao candidaturaExposicao) {
        candidaturaDemo = exposicao.getListaCandidaturasExposicoes().newCandidaturaDemo(candidaturaExposicao);
        return candidaturaDemo;
    }

    /**
     * Altera o Parametro demonstracao
     *
     * @param demonstracao
     */
    public void setDemonstracao(Demonstracao demonstracao) {
        candidaturaDemo.setDemonstracao(demonstracao);
    }

}
