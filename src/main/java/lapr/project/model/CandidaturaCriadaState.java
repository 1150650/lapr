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
public class CandidaturaCriadaState implements CandidaturaState {

    private Candidatura candidatura;

    public CandidaturaCriadaState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    @Override
    public boolean setCriadaDefinido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAlterada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAtribuida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAvaliada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setConflitoEncontrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public boolean setStandsAtribuidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAceite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
