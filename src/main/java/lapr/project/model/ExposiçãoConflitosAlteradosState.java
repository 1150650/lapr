/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author SimãoPedro
 */
public class ExposiçãoConflitosAlteradosState extends ExposiçãoState {
    
    private ExposiçãoCandidaturasAtribuidasState m_state2;

    public ExposiçãoConflitosAlteradosState(Exposicao m_estado) {
    }

    @Override
    public boolean valida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        boolean verify = valida();
        m_state2 = new ExposiçãoCandidaturasAtribuidasState();
        return verify;
    }

}
