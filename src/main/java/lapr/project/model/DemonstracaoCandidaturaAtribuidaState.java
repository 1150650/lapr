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
class DemonstracaoCandidaturaAtribuidaState extends DemonstracaoState {

    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaAtribuidaState(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean setCandidaturaEmAvaliacao() {
        if (valida()) {
            demonstracao.setEstado(new DemonstracaoCandidaturaAvaliacaoState(demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean valida() {
        return demonstracao.getEstado().isEstadoCandidaturasAtribuidas();
    }

    @Override
    public boolean isEstadoCandidaturasAtribuidas() {
        return true;
    }

}
