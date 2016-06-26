/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import java.util.Timer;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class RegistarExposicaoController {

    /**
     * Centor de Exposicao
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Exposicao
     */
    private Exposicao exposicao;

    /**
     * Criar Controller Registar Exposicao
     *
     * @param centroexpo Centro de Exposicao
     */
    public RegistarExposicaoController(CentroExposicoes centroexpo) {
        this.centroExposicoes = centroexpo;
    }

    /**
     * Criar Nova Exposicao
     */
    public void novaExposicao() {
        this.exposicao = centroExposicoes.getListaExposicoes().novaExposicao();
    }

    /**
     * Altera os Dados da Exposicao
     *
     * @param titulo
     * @param textoDescritivo
     * @param dataInicio
     * @param dataFim
     * @param local
     */
    public void setDados(String titulo, String textoDescritivo, Date dataInicio, Date dataFim, String local) {
        exposicao.setLocal(local);
        exposicao.setPeriodo(dataInicio, dataFim);
        exposicao.setTextoDescritivo(textoDescritivo);
        exposicao.setTitulo(titulo);
    }

    /**
     * Regista os Utilizadores
     *
     * @return lista Utilizadores
     */
    public RegistoUtilizadores getListaUtilizadores() {
        return this.centroExposicoes.getRegistoUtilizadoresConf();
    }

    /**
     * Adiciona Organizador
     *
     * @param selecionado Utilizador
     */
    public void adicionarOrganizador(Utilizador selecionado) {
        Organizador u = new Organizador(selecionado);
        exposicao.getListaOrganizadores().adicionarOrganizador(u);
    }

    /**
     * Regista Exposicao
     */
    public void RegistaExposicao() {
        centroExposicoes.getListaExposicoes().adicionarExposicao(exposicao);
    }

    /**
     * Altera o Estado de exposicaos
     */
    public void setEstadoExposicaoCriada() {
        exposicao.setExposicaoCriada();

    }

}
