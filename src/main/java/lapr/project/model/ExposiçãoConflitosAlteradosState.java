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
public class ExposiçãoConflitosAlteradosState extends ExposiçãoState {

    private Exposicao m_e;

    public ExposiçãoConflitosAlteradosState(Exposicao m_e) {
        this.m_e = m_e;
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoConflitosAlterados()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        boolean verify = false;
        if (valida()) {
            m_e.setEstado(new ExposiçãoCandidaturasAtribuidasState(m_e));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoConflitosAlterados() {
        return true;
    }

}
