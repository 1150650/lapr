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
class DemonstracaoCandidaturaAvaliacaoState extends DemonstracaoState {

    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaAvaliacaoState(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean setCandidaturaNaoAvaliada() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoCandidaturaNaoAvaliadaState(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean setCandidaturaAvaliada() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoCandidaturaAvaliadaState(demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return demonstracao.getEstado().isEstadoCandidaturaEmAvaliacao();
    }

    @Override
    public boolean isEstadoCandidaturaEmAvaliacao() {
        return true;
    }

}
