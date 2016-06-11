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

    private CentroExposicoes centroExposicoes;
    private Exposicao exposicao;
    private ListaStands listaStands;
    private ListaCandidaturas listaCandidaturas;
    private RegistoExposicoes registoExposicoes;
    private Candidatura candidatura;
    private Stand stand;

    public AtribuirStandCandidaturasAceitesController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List getExposicoesOrganizador(Utilizador utilizador) {
        return registoExposicoes.getExposicoesOrganizador(utilizador);
    }

    public List getCandidaturasAceites(Exposicao exposicao) {
        this.exposicao = exposicao;
        listaCandidaturas = this.exposicao.getListaCandidaturas();
        return listaCandidaturas.getCandidaturasAceites();
    }

    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    public List getListaStandsDisponiveis() {
        this.listaStands = centroExposicoes.getListastands();
        return listaStands.getListaStandsDisponiveis();
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void registaStandCandidatura() {
        listaStands.registaStandCandidatura(stand, candidatura);
    }
    
    public boolean setCandidaturaStandAtribuido(){
        return candidatura.setCandidaturaStandAtribuido();
    }

    public boolean setCandidaturaStandAtribuido() {
        return candidatura.setCandidaturaStandAtribuido();
    }

}
