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
public class CandidaturaAceiteState extends CandidaturaState {
    
    private Candidatura candidatura;
    
    public CandidaturaAceiteState(Candidatura candidatura){
        this.candidatura=candidatura;
    }
    
    @Override
    public boolean setStandsAtribuidos(){
        if(valida()){
            candidatura.setEstado(new CandidaturaStandAtribuidoState(candidatura));
            return true;
        }else
            return false;
        
    }
    
    @Override 
    public boolean valida(){
        return candidatura.getState().isEstadoAceite();
    }

    @Override
    public boolean isEstadoAceite() {
        return true;
    }

}
