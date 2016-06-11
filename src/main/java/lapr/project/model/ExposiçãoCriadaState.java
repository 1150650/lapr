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
public class ExposiçãoCriadaState implements ExposiçãoState {

    Exposicao m_e;

    public ExposiçãoCriadaState(Evento e) {
        m_e = e;
    }

    public boolean SetCriadoDefinido() {
        return false;
    }

    public boolean SetDemonstraçãoDefinido() {
        if (valida1()) {
            m_e.setEstado(new ExposiçãoDemonstraçãoSemFAEsState(m_e));
            return true;
        } else {
            return false;
        }
    }

    public boolean SetFAEDefinido() {
        if (valida2()) {
            m_e.setEstado(new ExposiçãoFAESemDemonstraçãoState(m_e));
            return true;
        } else {
            return false;
        }
    }

    private boolean valida1() {
    }

    private boolean valida2() {

    }

    @Override
    public boolean setCriadoDefinido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setFAEDefinido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setDemonstraçãoDefinido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCompleta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCandidaturasAbertas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCandidaturasFechadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setConflitosDetetados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setConflitosAlterados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setConflitosAtribuidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean valida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
