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
public class Organizador {

    /**
     * String com o nome de utilizador
     */
    private Utilizador utilizador;

    private ListaCandidaturas listacandidatura;

    private ListaAtribuicoes listaAtribuicoes;

    public Organizador(Utilizador utilizador) {
        setUtilizador(utilizador);
        listacandidatura = new ListaCandidaturas();
        listaAtribuicoes = new ListaAtribuicoes();
       
    }
    
    public Organizador() {
       
    }
    

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    /**
     * Altera a String Utilizador para a recebida
     *
     * @param utilizador Stirng utilizador
     */
    public void setUtilizador(Utilizador utilizador) {
        if (utilizador == null || utilizador.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Utilizador inválido");
        }
        this.utilizador = utilizador;
    }
}
