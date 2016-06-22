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
class DemonstracaoAprovadaState extends DemonstracaoState{

    private Demonstracao demonstracao;
    
    public DemonstracaoAprovadaState(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }
    
    @Override
    public boolean setAbertaACandidaturas(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoEmSubmissaoCandidaturaState(demonstracao));
            return true;
        }else 
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoAbertaACandidaturas();
    }
    
    @Override
    public boolean isEstadoDemonstracaoAprovada(){
        return true;
    }
    
}
