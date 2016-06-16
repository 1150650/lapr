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

    public String getUtilizadorInfo(String username) {
        this.utilizadorAtivo=utilizadorAtivo;
    }

}
