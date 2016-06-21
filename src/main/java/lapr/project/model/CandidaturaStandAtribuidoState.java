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
public class CandidaturaStandAtribuidoState extends CandidaturaState {

    private Candidatura candidatura;
    
    public CandidaturaStandAtribuidoState(Candidatura candidatura){
        this.candidatura = candidatura;
    }

    @Override
    public boolean isEstadoStandAtribuido() {
        return true;
    }

}
