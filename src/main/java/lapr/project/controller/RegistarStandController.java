/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Stand;

/**
 *
 * @author JOAO
 */
public class RegistarStandController {

    private CentroExposicoes centroexpo;
    private Stand stand;

    public RegistarStandController(CentroExposicoes centroexpo) {
        this.centroexpo = centroexpo;
    }

    public void criarStand() {
        this.stand = new Stand();

    }

    public void setDadosStand(String descricao) {
        this.stand.setDescricao(descricao);
    }

    public void registarStand() {
        this.centroexpo.getListastands().adicionarStand(stand);
    }

}
