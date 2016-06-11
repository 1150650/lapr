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
public interface ExposiçãoState {

    boolean setCriadoDefinido();

    boolean setFAEDefinido();

    boolean setDemonstraçãoDefinido();

    boolean setCompleta();

    boolean setCandidaturasAbertas();

    boolean setCandidaturasFechadas();

    boolean setCandidaturasAvaliadas();

    boolean setConflitosDetetados();

    boolean setConflitosAlterados();

    boolean setConflitosAtribuidas();

    boolean valida();

    public boolean setCandidaturasAtribuidas();

}
