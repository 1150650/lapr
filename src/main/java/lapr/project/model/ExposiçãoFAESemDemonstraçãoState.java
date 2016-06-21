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
public class ExposiçãoFAESemDemonstraçãoState extends ExposiçãoState {

    private Exposicao m_e;

    public ExposiçãoFAESemDemonstraçãoState(Exposicao m_e) {
        this.m_e = m_e;
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoFAESemDemonstracao()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCompleta() {
        boolean verify = false;
        if (valida()) {
            m_e.setEstado(new ExposiçãoCompletaState(m_e));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoFAESemDemonstracao() {
        return true;
    }

}
