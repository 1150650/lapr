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
public class ExposiçãoCandidaturasFechadasState extends ExposiçãoState {

    private Exposicao m_e;

    public ExposiçãoCandidaturasFechadasState(Exposicao m_e) {
        this.m_e = m_e;
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoCandidaturasFechadas()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setExposicaoCandidaturasConflitosDetetados() {
        boolean verify = false;
        if (valida()) {
            m_e.setEstado(new ExposiçãoComConflitosDetetadosState(m_e));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoCandidaturasFechadas() {
        return true;
    }

}
