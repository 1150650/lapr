/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
class DemonstracaoCandidaturaAvaliadaState extends DemonstracaoState {

    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaAvaliadaState(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean setCandidaturaAceite() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoCandidaturaAceite(demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCandidaturaAvaliada() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoCandidaturaRejeitada(demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return demonstracao.getEstado().isEstadoCandidaturaAvaliada();
    }

    @Override
    public boolean isEstadoCandidaturaAvaliada() {
        return true;
    }

}
