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
public interface CandidaturaState {

    boolean setCriadaDefinido();

    boolean setAlterada();

    boolean setAtribuida();

    boolean setAvaliada();

    boolean setConflitoEncontrado();
    
    boolean valida();
}
