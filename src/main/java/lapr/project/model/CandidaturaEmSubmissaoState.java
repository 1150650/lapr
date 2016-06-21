/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
class CandidaturaEmSubmissaoState extends CandidaturaState {

    private Candidatura candidatura;

    public CandidaturaEmSubmissaoState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setCandidaturaFechada() {
        if (valida()) {
            candidatura.setEstado(new CandidaturaFechadaState(candidatura));
            return true;
        } else {
            return false;
        }
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
    public boolean isEstadoEmSubmissao() {
        return true;
    }

    @Override
    public boolean setCandidaturaRetirada() {
        boolean verify = false;
        if (valida()) {
            candidatura.setEstado(new CandidaturaRetiradaState(candidatura));
            verify = true;
        }
        return verify;
    }

}
