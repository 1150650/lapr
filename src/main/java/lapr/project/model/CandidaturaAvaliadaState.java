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
public class CandidaturaAvaliadaState extends CandidaturaState {
    
    private Candidatura candidatura;
    
    public CandidaturaAvaliadaState(Candidatura candidatura){
        this.candidatura = candidatura;
    }

    @Override
    public boolean setAvaliada() {
        boolean verify = false;
        if (valida()) {
            candidatura.setEstado(this);
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean valida() {
         if (candidatura.getState().isEstadoAvaliada()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEstadoAvaliada() {
        return true;
    }
}
