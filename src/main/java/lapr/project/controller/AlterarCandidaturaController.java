/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Representante;

/**
 *
 * @author SimãoPedro
 */
public class AlterarCandidaturaController {

    private ListaCandidaturas lstCandidaturas;

    private Candidatura candidatura;

    public AlterarCandidaturaController(Exposicao e, Representante r) {
        this.lstCandidaturas = r.getListaCandidaturasSubmetidas();

    }

    public void selecionarCandidatura(Candidatura c) {
        this.candidatura = c;
    }

    public Candidatura getCandidatura() {
        return lstCandidaturas.obterCandidatura(0);
    }
}
