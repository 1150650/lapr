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

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroexpo;
    /**
     * Tipo de Conflito
     */
    private TipoDeConflito tipodeconflito;
    /**
     * Registo de tipo de Conflito
     */
    private RegistoTipoDeConflito listaTipoDeConflitos;

    /**
     * Construtor de DefinirTipoDeConflito
     *
     * @param centroexpo
     */
    public DefinirTpoDeConflitoController(CentroExposicoes centroexpo) {
        this.centroexpo = centroexpo;
    }

    /**
     * Retorna tipo de conflitos
     */
    public void getListaTipoDeConflitos() {
        this.listaTipoDeConflitos = this.centroexpo.getListaTipoDeConflito();
    }

    /**
     * Criar tipo de Conflito
     */
    public void criarTipoDeConflito() {
        this.tipodeconflito = new TipoDeConflito();

    }

    /**
     * Defininr tipo de Conflito
     *
     * @param descricao
     */
    public void definirTipoDeConflito(String descricao) {
        this.tipodeconflito.setDescricao(descricao);
    }

    /**
     * Registar Tipo de COnflito
     */
    public void registarTipoDeConflito() {
        this.centroexpo.getListaTipoDeConflito().adicionarTipoDeConflito(tipodeconflito);
    }
}
