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
class DemonstracaoCandidaturaRetiradaState extends DemonstracaoState {
    
    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaRetiradaState(Demonstracao demonstracao) {
    }
    
    public boolean isEstadoCandidaturaRetirada(){
        return true;
    }
    
}
