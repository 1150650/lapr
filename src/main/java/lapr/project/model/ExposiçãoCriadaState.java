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
public class ExposiçãoCriadaState extends ExposiçãoState {

    Exposicao m_e;

    public ExposiçãoCriadaState(Exposicao e) {
        m_e = e;
    }

    @Override
    public boolean setFAEDefinido() {
        if (valida()) {
            m_e.setEstado(new ExposiçãoFAESemDemonstraçãoState(m_e));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoCriada()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isEstadoCriada() {
        return true;
    }

}
