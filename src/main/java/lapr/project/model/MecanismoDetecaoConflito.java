/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class MecanismoDetecaoConflito {

    private Exposicao exposicao;

    private ListaFAE listaFAE;

    private List<FAE> listFAE;

    private ListaCandidaturas listaCandidaturas;

    private List<Candidatura> listCandidaturas;

    private ListaConflitos listaConflitos;

    public void detectConflitos() {
        listaFAE = exposicao.getListaFAE();
        listFAE = listaFAE.getListaFAEs();
        listaCandidaturas = exposicao.getListaCandidaturasExposicoes();
        listCandidaturas = listaCandidaturas.getListaCandidaturas();
        listaConflitos = exposicao.getListaConflitos();
        for (FAE fae : listFAE) {
            for (Candidatura candidatura : listCandidaturas) {
                if (isConflito(fae, candidatura)) {
                    listaConflitos.registarConflito(fae, candidatura);
                }
            }
        }

    }

    public boolean isConflito(FAE fae, Candidatura candidatura) {
        return false;
    }

}
