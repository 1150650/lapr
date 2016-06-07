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
    private String utilizador;

    private ListaCandidaturas listacandidatura ;
    
    private ListaAtribuicoes listaAtribuicoes;
    
    
    public Organizador() {
        listacandidatura=new ListaCandidaturas();
        listaAtribuicoes= new ListaAtribuicoes();
        this.utilizador=getUtilizador();
    }

    /**
     * @return the utilizador
     */
    public String getUtilizador() {
        return utilizador;
    }

    /**
     * Altera a String Utilizador para a recebida
     *
     * @param utilizador Stirng utilizador
     */
    public void setUtilizador(String utilizador) {
        if (utilizador == null || utilizador.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Utilizador inválido");
        }
        this.utilizador = utilizador;
    }
}
