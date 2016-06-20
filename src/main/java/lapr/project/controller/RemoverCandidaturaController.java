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
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author JOAO
 */
public class RemoverCandidaturaController {

    private CentroExposicoes centroexpo;
    private Exposicao expo;
    private int indice;

    public RemoverCandidaturaController(CentroExposicoes centroexpo) {

        this.centroexpo = centroexpo;

    }

    public Exposicao[] getListaExposicoes() {
        return this.centroexpo.mostrarLista();
    }

    public ListaCandidaturas getListaCandidaturasExposicoes(Exposicao expo) {
        this.indice = this.centroexpo.getListaExposicoes().indiceDe(expo);
        return this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes();
        
        
    }
    public ListaCandidaturas getListaCandidaturasDemonstracoes(Exposicao expo) {
        this.indice = this.centroexpo.getListaExposicoes().indiceDe(expo);
        return this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes();
        
        
    }

    public void removerCandidaturaExposicao(Candidatura c) {
        this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().removerCandidatura(c);
    }
    
    public void removerCandidaturaDemonstracao(Candidatura c) {
        this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes().removerCandidatura(c);
    }

}
