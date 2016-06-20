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
public class CandidaturaAbertaState extends CandidaturaState {

    private Candidatura candidatura;

    public CandidaturaAbertaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean valida() {
        if (candidatura.getState().isEstadoAberta()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCandidaturaEmSubmissao() {
        boolean verify = false;
        if (valida()) {
            candidatura.setEstado(new CandidaturaEmSubmissaoState(candidatura));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoAberta() {
        return true;
    }

}
