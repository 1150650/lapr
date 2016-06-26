/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.MecanismoDetecaoConflito;
import lapr.project.model.RegistoTipoDeConflito;
import lapr.project.model.TipoDeConflito;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DetecaoConflitosController {

    /**
     * Registo de tipo de Conflitos
     */
    private RegistoTipoDeConflito listaTiposConflito;

    /**
     * List do tipo conflito
     */
    private List<TipoDeConflito> listaTiposConflitoAtivos;

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Mecanismos de Detecao de Conflitos
     */
    private MecanismoDetecaoConflito mecanismoDetecao;

    /**
     * COntroller de Detecao de Conflitos
     *
     * @param centroExposicoes
     */
    public DetecaoConflitosController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Deteta Conflitos
     */
    public void detecaoConflitosExposicao() {
        listaTiposConflito = centroExposicoes.getListaTipoDeConflito();
        listaTiposConflitoAtivos = listaTiposConflito.getTiposConflitoAtivos();
        mecanismoDetecao.detectConflitosExposicao();
    }

    /**
     * Detete conflitos a demonstracao
     */
    public void detecaoConflitosDemonstracao() {
        listaTiposConflito = centroExposicoes.getListaTipoDeConflito();
        listaTiposConflitoAtivos = listaTiposConflito.getTiposConflitoAtivos();
        mecanismoDetecao.detectConflitosDemonstracao();
    }

}
