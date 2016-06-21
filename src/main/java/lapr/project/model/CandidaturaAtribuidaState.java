/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author SimãoPedro
 */
public class CandidaturaAtribuidaState extends CandidaturaState {

    private Candidatura candidatura;

    CandidaturaAtribuidaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setCandidaturaEmAvaliacao() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaEmAvaliacaoState(candidatura));
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean valida() {
        return candidatura.getState().isEstadoAtribuida();
    }

    @Override
    public boolean isEstadoAtribuida() {
        return true;
    }

}
