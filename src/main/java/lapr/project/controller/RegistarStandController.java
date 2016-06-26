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

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroexpo;
    /**
     * Stand
     */
    private Stand stand;

    /**
     * Construtor do Controller
     *
     * @param centroexpo Centro de Exposicaos
     */
    public RegistarStandController(CentroExposicoes centroexpo) {
        this.centroexpo = centroexpo;
    }

    /**
     * Cria Stand
     */
    public void criarStand() {
        this.stand = new Stand();

    }

    /**
     * Altera dados de Stand ( Descrição)
     *
     * @param descricao Descricaos
     */
    public void setDadosStand(String descricao) {
        this.stand.setDescricao(descricao);
    }

    /**
     * Regista o Stand
     */
    public void registarStand() {
        this.centroexpo.getListastands().adicionarStand(stand);
    }

}
