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
public class CandidaturaFechadaState extends CandidaturaState {

    private Candidatura candidatura;

    CandidaturaFechadaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setConflitosDetetados() {
        if (valida()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean valida() {
        if (candidatura.getState().isEstadoFechada()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isEstadoFechada(){
        return true;
    }

}
