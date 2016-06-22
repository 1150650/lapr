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
class DemonstracaoCandidaturaConflitosAlterados extends DemonstracaoState {
    
    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaConflitosAlterados(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }
    
    @Override
    public boolean setCandidaturasAtribuidas(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoCandidaturaAtribuidaState(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoConflitosCandidaturaAlterados();
    }
    
    @Override
    public boolean isEstadoConflitosCandidaturaAlterados(){
        return true;
    }
    
}
