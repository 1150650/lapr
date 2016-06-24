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
public class CandidaturaConflitosDetetadosState extends CandidaturaState {

    private Candidatura candidatura;

    CandidaturaConflitosDetetadosState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setAlterada() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaAlteradaState(candidatura));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return candidatura.getState().isEstadoConflitosDetetados();
    }

    @Override
    public boolean isEstadoConflitosDetetados() {

        return true;
    }

}
