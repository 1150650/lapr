/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Utilizador;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author SimãoPedro
 */
public class ConfirmarUtilizadorController {

    /**
     * Variavél do tipo CE
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Lista com o registo de Utilizadores que se resgistaram e aguardam
     * aceitação
     */
    private RegistoUtilizadores registoUtilizadoresNConfirmado;

    /**
     * Lista com o registo de Utilizadores que se resgistaram confirmados
     */
    private RegistoUtilizadores registoUtilizadores;

    /**
     * Variavel Utilizador
     */
    private Utilizador u;

    /**
     * Construtor do objeto centro de exposições
     *
     * @param centroExposicoes
     */
    public ConfirmarUtilizadorController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
        registoUtilizadores = centroExposicoes.getRegistoUtilizadoresNConf();
        registoUtilizadoresNConfirmado = centroExposicoes.getRegistoUtilizadoresNConf();
    }

    /**
     * Retorna o registo de utilizadores que ainda não foram confirmados
     *
     * @return
     */
    public RegistoUtilizadores getRegistoUtilizadoresNConf() {
        return centroExposicoes.getRegistoUtilizadoresNConf();
    }

    /**
     * Retorna a lista de Utilizadores já registados
     *
     * @return
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return centroExposicoes.getRegistoUtilizadoresConf();
    }

    public void selecionarUtilizador(Utilizador u) {
        this.u = u;
    }

    public void confirmarUtilizador() {
        registoUtilizadores.removerUtilizador(u);
        registoUtilizadoresNConfirmado.registaUtilizador(u);
    }
}
