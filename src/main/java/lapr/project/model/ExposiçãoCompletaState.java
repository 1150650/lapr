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
public class ExposiçãoCompletaState extends ExposiçãoState {

    private Exposicao m_e;

    public ExposiçãoCompletaState(Exposicao m_e) {
        this.m_e = m_e;
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoCompleta()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setExposicaoAbertaParaCandidaturas() {
        boolean verify = false;
        if (valida()) {
            m_e.setEstado(new ExposiçãoAbertaParaCandidaturasState(m_e));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoCompleta() {
        return true;
    }

}
