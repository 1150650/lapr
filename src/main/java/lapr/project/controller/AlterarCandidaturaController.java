/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Representante;

/**
 *
 * @author SimãoPedro
 */
public class AlterarCandidaturaController {

    /**
     * Lista Candidaturas do Representante
     */
    private ListaCandidaturas lstCandidaturas;

    /**
     * Centro de exposicoes
     */
    private CentroExposicoes ce;

    /**
     * Candidatura que irá ser alterada
     */
    private CandidaturaExposicao candidatura;

    /**
     * Nova Candidatura
     */
    private CandidaturaExposicao novaCandidatura;

    /**
     * Construtor do controller a receber o representante
     *
     * @param r
     */
    public AlterarCandidaturaController(Representante r, CentroExposicoes ce) {
        this.lstCandidaturas = r.getListaCandidaturasSubmetidas();
        this.ce = ce;
    }

    /**
     * Seleciona a candidatura escolhida
     *
     * @param c
     */
    public void selecionarCandidatura(CandidaturaExposicao c) {
        this.candidatura = c;
    }

    /**
     * Obtem a informação da candidatura
     *
     * @return
     */
    public String getCandidaturaInfo() {
        return candidatura.apresentarDados();
    }

    /**
     * Valida os novos dados da candidatura para ver se pode alterar
     *
     * @return
     */
    public boolean validarNovosDadosGlobal() {
        return lstCandidaturas.validaCandidatura(novaCandidatura);
    }

    /**
     * Alterar os dados da candidatura
     *
     * @param nomeEmpresa
     * @param morada
     * @param telemovel
     * @param areaPretendida
     * @param produtos
     * @param quantidadeConvites
     */
    public void novaCandidatura(String nomeEmpresa, String morada, int telemovel, float areaExposicao, String produtos, int nConvites) {
        CandidaturaExposicao c = new CandidaturaExposicao(nomeEmpresa, morada, telemovel, areaExposicao, produtos, nConvites);
    }

    public CandidaturaExposicao getCandidaturaSelecionada() {
        return candidatura;
    }

    public void alterarDadosCandidatura() {
        this.candidatura = novaCandidatura;
    }
}
