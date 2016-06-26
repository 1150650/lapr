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
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Stand;

/**
 *
 * @author JOAO
 */
public class AceitarCandidaturaController {

    /**
     * Registo de exposicoes (Lista)
     */
    private RegistoExposicoes lstExpo;

    private CentroExposicoes ce;

    /**
     * Exposicao que vai ser selecionada
     */
    private Exposicao expo;

    /**
     * Candidatura selecionada
     */
    private Candidatura candidatura;

    /**
     * Lista demonstracoes da exposicao selecionada
     */
    private ListaCandidaturas lstcandidatura;

    private int indice;

    public AceitarCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;

    }

    /**
     * Obtem uma lista de Exposições em forma de Array
     *
     * @return listaExposicao
     */
    public Exposicao[] getListaExposicoes() {
        return this.ce.mostrarLista();
    }

    /**
     * Retorna lista candidaturas em Submissão na candidatura
     *
     * @param expo lista Candidaturas
     * @return
     */
    public ListaCandidaturas getListaCandidaturasExposicoes(Exposicao expo) {
        ListaCandidaturas lst = new ListaCandidaturas();
        ListaCandidaturas lst1 = new ListaCandidaturas();
        this.indice = this.ce.getListaExposicoes().indiceDe(expo);
        lst = this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes();
        int i;

        for (i = 0; i < lst.tamanho(); i++) {

            if (lst.obterCandidatura(i).getState().isEstadoEmSubmissao() == true) {
                lst1.adicionarCandidatura(lst.obterCandidatura(i));
            }
        }

        return lst1;

    }

    /**
     * Obtem a lista de candidaturas para demonstracao em submissao
     *
     * @param expo lista Demonstrações
     * @return
     */
    public ListaCandidaturas getListaCandidaturasDemonstracoes(Exposicao expo) {
        ListaCandidaturas lst = new ListaCandidaturas();
        ListaCandidaturas lst1 = new ListaCandidaturas();
        this.indice = this.ce.getListaExposicoes().indiceDe(expo);
        lst = this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes();
        int i;

        for (i = 0; i < lst.tamanho(); i++) {

            if (lst.obterCandidatura(i).getState().isEstadoEmSubmissao() == true) {
                lst1.adicionarCandidatura(lst.obterCandidatura(i));
            }
        }

        return lst1;

    }

    /**
     * Aceita a Candidatura a uma demonstracao e adiciona o estado Aceite a
     * mesma
     *
     * @param c Candidatura que foi Aceite
     */
    public void aceitarCandidaturaDemonstracao(Candidatura c) {
        this.candidatura = c;
        int i = this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes().indiceDe(candidatura);
        this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes().obterCandidatura(i).getState().isEstadoAceite();
    }

    /**
     * Aceita candidatura a uma Exposicao e altera o estado para Aceite
     *
     * @param c candidatura que foi Aceite
     */
    public void aceitarCandidaturaExposicao(Candidatura c) {
        this.candidatura = c;
        int i = this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().indiceDe(candidatura);
        this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().obterCandidatura(i).getState().isEstadoAceite();
    }

    /**
     * Retorna a Lista de Stands em Array
     *
     * @return Stands
     */
    public Stand[] getListaStands() {
        return this.ce.mostrarListaStand();
    }

    /**
     * Adiciona Stand a Candidatura
     *
     * @param s stand que vai ser adicionado a candidatura
     */
    public void adicionarStandCandidaturaExposciao(Stand s) {

        int i = this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().indiceDe(candidatura);
        this.ce.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().obterCandidatura(i).setStand(s);
        ;
    }

}
