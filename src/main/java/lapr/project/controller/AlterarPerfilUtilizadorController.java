/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author Diogo
 */
public class AlterarPerfilUtilizadorController {

    private CentroExposicoes centroExposicoes;
    private RegistoUtilizadores ru;
    private Utilizador utilizadorAtivo;

    public AlterarPerfilUtilizadorController(CentroExposicoes ce) {
        this.centroExposicoes = ce;
    }

    public boolean validaAlteracaoDados(String email, String username) {
        boolean valida = ru.validaAlteracaoDados(email, username);
        return valida;
    }
    
    public void alterarDados(String nome, String email, String username, String password){
        ru.alterarDados(utilizadorAtivo, nome, email, username, password);
    }

}
