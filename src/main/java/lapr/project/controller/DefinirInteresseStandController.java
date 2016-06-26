/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class DefinirInteresseStandController {

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroexpo;
    /**
     * Exposicao
     */
    private Exposicao expo;
    /**
     * indice
     */
    private int indice;
    /**
     * Representante
     */
    private Representante r;
    /**
     * Utilizador
     */
    private Utilizador u1;

    /**
     * Construtor do Controller Definir Interesse Stand
     *
     * @param centroexpo Centro Exposicoes
     * @param u Utilizador
     */
    public DefinirInteresseStandController(CentroExposicoes centroexpo, Utilizador u) {

        this.centroexpo = centroexpo;
        this.u1 = u;

    }

    /**
     * Retorna Array List de Exposicoes
     *
     * @return Array de Exposicao
     */
    public Exposicao[] getListaExposicoes() {
        return this.centroexpo.mostrarLista();
    }

    /**
     * Retorna Lista de Candidaturas
     *
     * @param expo Exposicao
     * @return Lista de Candidaturas
     */
    public ListaCandidaturas getListaCandidaturasExposicoes(Exposicao expo) {
        this.expo = expo;
        this.indice = centroexpo.getListaExposicoes().indiceDe(expo);
        this.r = this.expo.getListaRepresentantes().obterRepresentantePorU(u1);
        ListaCandidaturas lstcandi = new ListaCandidaturas();
        ListaCandidaturas lst21 = new ListaCandidaturas();

        lstcandi = r.getListaCandidaturasExposicao();
        int i;

        for (i = 0; i < lstcandi.tamanho(); i++) {

            if (lstcandi.obterCandidatura(i).getState().isEstadoStandAtribuido()) {
                lst21.adicionarCandidatura(lstcandi.obterCandidatura(i));
            }
        }

        return lst21;
    }

    /**
     * Aceita Stand
     *
     * @param candidatura Candidatura
     */
    public void aceitarStand(Candidatura candidatura) {
        int i = this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().indiceDe(candidatura);
        this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().obterCandidatura(i).setCandidaturaStandAtribuido();
    }
}
