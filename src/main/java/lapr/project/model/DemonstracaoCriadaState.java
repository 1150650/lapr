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
public class DemonstracaoCriadaState extends DemonstracaoState {
    
    private Demonstracao demonstracao;
    
    public DemonstracaoCriadaState(Demonstracao demonstracao){
        this.demonstracao = demonstracao;
    }
    
    @Override
    public boolean setDemonstracaoAprovada(){
        if(valida()){
            demonstracao.setEstado(new DemonstracaoAprovadaState(demonstracao));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean valida(){
        return demonstracao.getEstado().isEstadoDemonstracaoCriada();
    }
    
    @Override
    public boolean isEstadoDemonstracaoCriada(){
        return true;
    }
    
}
