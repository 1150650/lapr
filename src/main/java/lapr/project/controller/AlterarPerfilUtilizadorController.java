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

    public AlterarPerfilUtilizadorController(CentroExposicoes ce, Utilizador utilizadorAtivo) {
        this.centroExposicoes = ce;
        this.utilizadorAtivo = utilizadorAtivo;
        this.ru = ce.getRegistoUtilizadoresNConf();
    }

    public void validaAlteracaoDados(String email, String username) {
        ru.validaAlteracaoDados(email, username);
    }

    public void alterarDados(String nome, String email, String username, String password) {
        ru.alterarDados(utilizadorAtivo, nome, email, username, password);
    }

}
