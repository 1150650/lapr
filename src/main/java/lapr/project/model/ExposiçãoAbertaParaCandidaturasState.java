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
public class ExposiçãoAbertaParaCandidaturasState extends ExposiçãoState {

    private Exposicao m_e;

    public ExposiçãoAbertaParaCandidaturasState(Exposicao m_e) {
        this.m_e = m_e;
    }

    @Override
    public boolean valida() {
        if (m_e.getExposicaoEstado().isEstadoAbertaParaCandidaturas()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        boolean verify = false;
        if (valida()) {
            m_e.setEstado(new ExposiçãoCandidaturasFechadasState(m_e));
            verify = true;
        }
        return verify;
    }

    @Override
    public boolean isEstadoAbertaParaCandidaturas() {
        return true;
    }

}
