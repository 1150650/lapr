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
class DemonstracaoFechadaACandidaturaState extends DemonstracaoState {

    private Demonstracao demonstracao;

    public DemonstracaoFechadaACandidaturaState(Demonstracao demonstracao) {
        this.demonstracao=demonstracao;
    }
    
    @Override
    public boolean setConflitosCandidaturaDetetados(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoCandidaturaConflitosDetetados(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoFechadaACandidaturas();
    }
    
    @Override
    public boolean isEstadoFechadaACandidaturas(){
        return true;
    }

}
