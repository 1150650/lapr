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

    CandidaturaAlteradaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setAtribuida() {
        if(valida()){
            candidatura.setEstado(new CandidaturaAtribuidaState(candidatura));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return candidatura.getState().isEstadoAlterada();
    }

    @Override
    public boolean isEstadoAlterada() {
        return true;
    }

}
