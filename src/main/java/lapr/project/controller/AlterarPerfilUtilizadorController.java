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

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Lista com os Utilizadores
     */
    private RegistoUtilizadores ru;

    /**
     * Utilizador ativo
     */
    private Utilizador utilizadorAtivo;

    /**
     * Contrutor do Controller
     *
     * @param ce Centro exposicoes recebidos por parametro
     * @param utilizadorAtivo utilizador ativo recebido por parametro
     */
    public AlterarPerfilUtilizadorController(CentroExposicoes ce, Utilizador utilizadorAtivo) {
        this.centroExposicoes = ce;
        this.utilizadorAtivo = utilizadorAtivo;
        this.ru = ce.getRegistoUtilizadoresNConf();
    }

    /**
     * Valida os novos dados
     *
     * @param email
     * @param username
     */
    public void validaAlteracaoDados(String email, String username) {
        ru.validaAlteracaoDados(utilizadorAtivo, email, username);
    }

    /**
     * Altera os dados
     *
     * @param nome
     * @param email
     * @param username
     * @param password
     */
    public void alterarDados(String nome, String email, String username, String password) {
        ru.alterarDados(utilizadorAtivo, nome, email, username, password);
    }

}
