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
public class RegistarUtilizadorController {

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroExposicoes;
    /**
     * Registo de Utilizadores
     */
    private RegistoUtilizadores ru;
    /**
     * Utilizador
     */
    private Utilizador u;

    /**
     * Construtor do Registar Utilizador Controller
     *
     * @param ce Centro Exposicao
     */
    public RegistarUtilizadorController(CentroExposicoes ce) {
        this.centroExposicoes = ce;
    }

    /**
     * Vai buscar a Centro de Exposicao o Registo de N COnfirmados
     */
    public void getRegistoUtilizadores() {
        ru = centroExposicoes.getRegistoUtilizadoresNConf();
    }

    /**
     * Criar Utilizador
     *
     * @param nome Nome
     * @param email Email
     * @param username Username
     * @param password Password
     */
    public void criarUtilizador(String nome, String email, String username, String password) {
        getRegistoUtilizadores();
        u = ru.criarUtilizador(nome, email, username, password);
    }

    /**
     * RegistaUtilizador
     */
    public void registaUtilizador() {
        ru.registaUtilizador(u);
    }

}
