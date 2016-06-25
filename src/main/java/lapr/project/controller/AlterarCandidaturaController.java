/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

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

    private Exposicao expo;

    private Representante r;

    private Utilizador u;

    /**
     * Construtor do controller a receber o representante
     *
     * @param r
     */
    public AlterarCandidaturaController(Utilizador u, CentroExposicoes ce) {
        this.ce = ce;
        this.u = u;
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
     * Valida os novos dados da candidatura para ver se pode alterar
     *
     * @return
     */
    public boolean validarNovosDadosGlobal() {
        return lstCandidaturas.validaCandidatura(getCandidaturaAlterada());
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
        novaCandidatura = new CandidaturaExposicao(nomeEmpresa, morada, telemovel, areaExposicao, produtos, nConvites);
    }

    public CandidaturaExposicao getCandidaturaSelecionada() {
        return candidatura;
    }

    public void alterarDadosCandidatura() {
        getCandidaturaAlterada().getState().setAlterada();
        expo.getListaCandidaturasExposicoes().removerCandidatura(candidatura);
        r.getListaCandidaturasSubmetidas().removerCandidatura(candidatura);
        this.candidatura = novaCandidatura;
        r.getListaCandidaturasSubmetidas().adicionarCandidatura(candidatura);
        expo.getListaCandidaturasExposicoes().adicionarCandidatura(candidatura);
    }

    public void selecionaExposicao(Exposicao expo) {
        this.expo = expo;
        this.r = this.expo.getListaRepresentantes().obterRepresentantePorU(u);
        this.lstCandidaturas = r.getListaCandidaturasPodemSerAlteradas();
    }

    public ListaCandidaturas getListaCandidaturas() {
        return lstCandidaturas;
    }

    /**
     * @return the novaCandidatura
     */
    public CandidaturaExposicao getCandidaturaAlterada() {
        return novaCandidatura;
    }
}
