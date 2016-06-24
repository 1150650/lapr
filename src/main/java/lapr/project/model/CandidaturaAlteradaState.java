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
public class CandidaturaAlteradaState extends CandidaturaState {

    private Candidatura candidatura;

    public CandidaturaAlteradaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean valida() {
        if (candidatura.getState().isEstadoEmSubmissao()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCandidaturaEmSubmissao() {
        boolean verify = false;
        if (valida()) {
            candidatura.setEstado(new CandidaturaFechadaState(candidatura));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoAlterada() {
        return true;
    }

}
