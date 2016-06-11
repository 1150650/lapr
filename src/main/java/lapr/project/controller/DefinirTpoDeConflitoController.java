/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoTipoDeConflito;
import lapr.project.model.TipoDeConflito;

/**
 *
 * @author JOAO
 */
public class DefinirTpoDeConflitoController {

    private CentroExposicoes centroexpo;
    private TipoDeConflito tipodeconflito;
    private RegistoTipoDeConflito listaTipoDeConflitos;

    public DefinirTpoDeConflitoController(CentroExposicoes centroexpo) {
        this.centroexpo = centroexpo;
    }

    public void getListaTipoDeConflitos() {
        this.listaTipoDeConflitos = this.centroexpo.getListaTipoDeConflito();
    }

    public void criarTipoDeConflito() {
        this.tipodeconflito = new TipoDeConflito();

    }

    public void definirTipoDeConflito(String descricao) {
        this.tipodeconflito.setDescricao(descricao);
    }

    public void registarTipoDeConflito() {
        this.centroexpo.getListaTipoDeConflito().adicionarTipoDeConflito(tipodeconflito);
    }
}
