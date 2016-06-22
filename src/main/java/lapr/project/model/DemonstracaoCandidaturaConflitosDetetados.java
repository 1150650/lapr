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
class DemonstracaoCandidaturaConflitosDetetados extends DemonstracaoState {
    
    private Demonstracao demonstracao;

    public DemonstracaoCandidaturaConflitosDetetados(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }
    
    @Override
    public boolean setConflitosCandidaturaAlterados(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoCandidaturaConflitosAlterados(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoConflitosCandidaturaDetetados();
    }
    
    @Override
    public boolean isEstadoConflitosCandidaturaDetetados(){
        return true;
    }
    
}
