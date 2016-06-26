/*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class AtribuirStandCandidaturasAceitesController {

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;
    /**
     * Exposicao
     */
    private Exposicao exposicao;
    /**
     * Lista de Stands
     */
    private ListaStands listaStands;
    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas listaCandidaturas;
    /**
     * Registo de Exposicoes
     */
    private RegistoExposicoes registoExposicoes;
    /**
     * Candidatura
     */
    private Candidatura candidatura;
    /**
     * Stand
     */
    private Stand stand;

    /**
     * Construtor do Controller
     *
     * @param centroExposicoes Centor de Exposicoes
     */
    public AtribuirStandCandidaturasAceitesController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Retorna uma List de Exposicoes com base no Organizador
     *
     * @param utilizador
     * @return Lista
     */
    public List getExposicoesOrganizador(Utilizador utilizador) {
        return registoExposicoes.getExposicoesOrganizador(utilizador);
    }

    /**
     * Retorna Lista de Candidaturas Aceites de Uma exposição
     *
     * @param exposicao Exposicao
     * @return Lista
     */
    public List getCandidaturasAceites(Exposicao exposicao) {
        this.exposicao = exposicao;
        listaCandidaturas = this.exposicao.getListaCandidaturasExposicoes();
        return listaCandidaturas.getCandidaturasAceites();
    }

    /**
     * Altera o Parametro Candidaturas
     *
     * @param candidatura Candidatura Nova
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * Retorna Lista de Stands que podem ser Usados
     *
     * @return List Stands
     */
    public List getListaStandsDisponiveis() {
        this.listaStands = centroExposicoes.getListastands();
        return listaStands.getListaStandsDisponiveis();
    }

    /**
     * Altera o parametro Stand
     *
     * @param stand novo Stand
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    /**
     * Regista o Stand
     */
    public void registaStandCandidatura() {
        listaStands.registaStandCandidatura(stand, candidatura);
    }

    /**
     * Altera o Estado de Candidatura para Stand Atribuido
     *
     * @return boolean
     */
    public boolean setCandidaturaStandAtribuido() {
        return candidatura.setCandidaturaStandAtribuido();
    }
}
