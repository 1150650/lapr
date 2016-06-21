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
public class CandidaturaEmAvaliacaoState extends CandidaturaState {
    
    private Candidatura candidatura;

    CandidaturaEmAvaliacaoState(Candidatura candidatura) {
        this.candidatura = candidatura;
    }
    
    @Override
    public boolean setNaoAvaliada(){
        if(valida()){
            candidatura.setEstado(new CandidaturaNaoAvaliadaState(candidatura));
            return true;
        }else
            return false;
    }
    
    @Override
    public boolean setAvaliada(){
        if(valida()){
           candidatura.setEstado(new CandidaturaAvaliadaState(candidatura));
           return true;
        } 
        return false;
    }
    
    @Override
    public boolean valida(){
        return candidatura.getState().isEstadoEmAvaliacao();
    }
    
    @Override
    public boolean isEstadoEmAvaliacao(){
        return true;
    }
    
}
