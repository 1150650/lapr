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
public class ConsultarCandidaturasRetiradasController {

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Exposicao
     */
    private Exposicao exposicao;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas registoCandidaturas;

    /**
     * List de Candidaturas
     */
    private List listaCandidaturas;

    /**
     * Controller de Candidaturas Retiradsas
     *
     * @param centroExposicoes Centro de Exposicoes
     */
    public ConsultarCandidaturasRetiradasController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Retorna Array de Exposicao
     *
     * @return Array Exposicao
     */
    public Exposicao[] getListaExposicoes() {
        return this.centroExposicoes.mostrarLista();
    }

    /**
     * Retorna a lista Candidaturas
     *
     * @param exposicao
     * @return Lista de Candidaturass
     */
    public ListaCandidaturas getListaCandidaturasExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
        return registoCandidaturas = this.exposicao.getLstCandidaturasExposicaoRemovidas();

    }

    /**
     * Retorna Lista de CAndidaturas a Demonstracao Removidas
     *
     * @param exposicao
     * @return Lista de Candidaturas que foram Removidas
     */
    public ListaCandidaturas getListaCandidaturasDemonstracao(Exposicao exposicao) {
        this.exposicao = exposicao;
        return registoCandidaturas = this.exposicao.getLstCandidaturasDemonstracaoRemovidas();

    }

}
