/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;

/**
 *
 * @author SimãoPedro
 */
public class AlterarCandidaturaController {

    private ListaCandidaturas lstCandidaturas;

    private Candidatura c;

    public AlterarCandidaturaController(ListaCandidaturas lstCandidaturas, Candidatura c) {
        this.lstCandidaturas = lstCandidaturas;
        this.c = getCandidatura();
    }

    private Candidatura getCandidatura() {
        return lstCandidaturas.obterCandidatura(0);
    }
}
