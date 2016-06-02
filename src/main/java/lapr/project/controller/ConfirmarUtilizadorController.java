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

    private CentroExposicoes centroExposicoes;
    private RegistoUtilizadores registoUtilizadoresNConfirmado;
    private RegistoUtilizadores registoUtilizadores;
    private Utilizador u;

    public ConfirmarUtilizadorController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
        registoUtilizadores = getRegistoUtilizadoresNConf();
        registoUtilizadoresNConfirmado = getRegistoUtilizadores();
    }

    public RegistoUtilizadores getRegistoUtilizadoresNConf() {
        return centroExposicoes.getRegistoUtilizadoresNConf();
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return centroExposicoes.getRegistoUtilizadores();
    }

    public void selecionarUtilizador(Utilizador u) {
        this.u = u;
    }
    
    public void removeRegistoNConf(Utilizador u){
        registoUtilizadoresNConfirmado.removerUtilizador(u);
    }
    
    public void addUtilizador(Utilizador u){
        registoUtilizadores.registaUtilizador(u);
    }
}
