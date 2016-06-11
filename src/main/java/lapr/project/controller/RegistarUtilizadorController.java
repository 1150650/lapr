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

    private CentroExposicoes centroExposicoes;
    private RegistoUtilizadores ru;
    private Utilizador u;

    public RegistarUtilizadorController(CentroExposicoes ce) {
        this.centroExposicoes = ce;
    }

    public void getRegistoUtilizadores() {
        ru = centroExposicoes.getRegistoUtilizadoresNConf();
    }

    public void criarUtilizador(String nome, String email, String username, String password) {
        getRegistoUtilizadores();
        u = ru.criarUtilizador(nome, email, username, password);
    }

    public void registaUtilizador() {
        ru.registaUtilizador(u);
    }

}
