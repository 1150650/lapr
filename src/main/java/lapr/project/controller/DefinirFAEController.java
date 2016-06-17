/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DefinirFAEController {

    private RegistoExposicoes registoExposicoes;
    private CentroExposicoes centroExposicoes;
    private RegistoUtilizadores registoUtilizadores;
    private List<Exposicao> listaExposicoes;
    private List<Utilizador> listaUtilizadores;
    private Exposicao exposicao;
    private ListaFAE listaFAE;
    private ListaOrganizadores listaOrganizadores;
    private FAE fae;

    public DefinirFAEController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List getExposicoesOrganizador(Utilizador utilizador) {
        listaExposicoes = registoExposicoes.getExposicoesOrganizador(utilizador);
        return listaExposicoes;
    }

    public List getListaUtilizadores() {
        listaUtilizadores = registoUtilizadores.getRegistoUtilizadores();
        return listaUtilizadores;
    }

    public void addFAE(Utilizador utilizador, Exposicao exposicao, String id) {
        this.exposicao = exposicao;
        listaFAE = this.exposicao.getListaFAE();
        listaOrganizadores = this.exposicao.getListaOrganizadores();
        if (!this.exposicao.getListaOrganizadores().isUserOrganizador(utilizador)) {
            fae = listaFAE.addFAE(utilizador, id);
        }
    }

    public void registaFAE() {
        listaFAE.registaFAE(fae);
    }
    
    public boolean setFAEDefinido(){
        return exposicao.setFAEDefinido();
    }
    
}
