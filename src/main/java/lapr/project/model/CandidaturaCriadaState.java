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
public class CandidaturaCriadaState extends CandidaturaState {

    private Candidatura candidatura;

    public CandidaturaCriadaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean valida() {
        if (candidatura.getState() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCandidaturaCriada() {
        boolean verify = false;
        if (valida()) {
            candidatura.setEstado(this);
            verify = true;
        }
        return verify;
    }

}
