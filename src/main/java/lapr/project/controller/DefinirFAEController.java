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

    /**
     * Registo de Exposicoes
     */
    private RegistoExposicoes registoExposicoes;

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroExposicoes;
    /**
     * Registo de Utilizadores
     */
    private RegistoUtilizadores registoUtilizadores;
    /**
     * List de Exposicoes
     */
    private List<Exposicao> listaExposicoes;
    /**
     * List de Utilizadores
     */
    private List<Utilizador> listaUtilizadores;
    /**
     * Exposicao
     */
    private Exposicao exposicao;
    /**
     * Lista de FAE
     */
    private ListaFAE listaFAE;
    /**
     * Lista de Organizadores
     */
    private ListaOrganizadores listaOrganizadores;
    /**
     * Lista de FAE
     */
    private FAE fae;

    /**
     * Controller FAE
     *
     * @param centroExposicoes
     */
    public DefinirFAEController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Retorna List de Exposicao de um Organizador
     *
     * s@param utilizador
     *
     * @return List de Exposicoes
     */
    public List<Exposicao> getExposicoesOrganizador(Utilizador utilizador) {
        registoExposicoes = centroExposicoes.getListaExposicoes();
        listaExposicoes = registoExposicoes.getExposicoesOrganizador(utilizador);
        return listaExposicoes;
    }

    /**
     * Retorna Lista de Utilizadores
     *
     * @return
     */
    public List getListaUtilizadores() {
        listaUtilizadores = registoUtilizadores.getRegistoUtilizadores();
        return listaUtilizadores;
    }

    /**
     * Registo de Utilizadores
     *
     * @return registo de Utilizadores
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return registoUtilizadores;
    }

    /**
     * Retorna um FAE com base no Organizador
     *
     * @param utilizador
     * @param id
     * @return FAE
     */
    public FAE addFAE(Utilizador utilizador, String id) {
        listaFAE = this.exposicao.getListaFAE();
        listaOrganizadores = this.exposicao.getListaOrganizadores();
        if (!this.exposicao.getListaOrganizadores().isUserOrganizador(utilizador)) {
            fae = listaFAE.addFAE(utilizador, id);
        }
        return fae;
    }

    /**
     * Regista FAE
     *
     * @param fae
     */
    public void registaFAE(FAE fae) {
        listaFAE.registaFAE(fae);
    }

    /**
     * Altera o Estado de exposicao
     *
     * @return boolean
     */
    public boolean setFAEDefinido() {
        return exposicao.setExposicaoFAESemDemonstracoes();
    }

    /**
     * Altera Exposicao por uma Recebida por parametro
     *
     * s * @param exposicao
     */
    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    /**
     * Obtem Exposicao
     *
     * @return
     */
    public Exposicao getExposicao() {
        return exposicao;
    }

}
