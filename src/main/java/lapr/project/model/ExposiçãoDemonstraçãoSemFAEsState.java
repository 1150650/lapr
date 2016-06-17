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
class ExposiçãoDemonstraçãoSemFAEsState extends ExposiçãoState {
    
      Exposicao m_e;

    public ExposiçãoDemonstraçãoSemFAEsState(Exposicao e) {
        m_e = e;
    }

    @Override
    public boolean setFAEDefinido() {
        if (valida()) {
            m_e.setEstado(new ExposiçãoCompletaState(m_e));
            return true;
        } else {
            return false;
        }
    }

    public boolean valida() {
        if (m_e.getExposicaoEstado() instanceof ExposiçãoDemonstraçãoSemFAEsState) {
            return true;
        } else {
            return false;
        }

    }

}
