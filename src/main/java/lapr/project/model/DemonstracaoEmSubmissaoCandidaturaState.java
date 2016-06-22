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
class DemonstracaoEmSubmissaoCandidaturaState extends DemonstracaoState {
    
    private Demonstracao demonstracao;

    public DemonstracaoEmSubmissaoCandidaturaState(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }
    
    @Override
    public boolean setFechadaACandidaturas(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoFechadaACandidaturaState(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean setCandidaturaRetirada(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoCandidaturaRetiradaState(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoCandidaturasEmSubmissao();
    }
    
    @Override
    public boolean isEstadoCandidaturasEmSubmissao(){
        return true;
    }
    
}
