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

    public Candidatura[] getListaCandidaturas(Exposicao expo) {
        this.indice = this.centroexpo.getListaExposicoes().indiceDe(expo);
        return this.centroexpo.getListaExposicoes().obterExposicao(indice).mostrarLista();
    }

    public void removerCandidatura(Candidatura c) {
        this.centroexpo.getListaExposicoes().obterExposicao(indice).adicinarCanidatura(c);
    }

}
