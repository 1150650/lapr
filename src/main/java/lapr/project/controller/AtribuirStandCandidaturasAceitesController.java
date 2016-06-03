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
 
    
    public AtribuirStandCandidaturasAceitesController(CentroExposicoes centroExposicoes, Exposicao exposicao){
        this.centroExposicoes = centroExposicoes;
        this.exposicao = exposicao;
        listaCandidaturas = exposicao.getListaCandidatura();
        listaStands = centroExposicoes.getListaStands();
        registoExposicoes = centroExposicoes.getRegistoExposicoes();
    }

    public List getExposicoesOrganizador(int index) {
        Utilizador utilizador = centroExposicoes.getRegistoUtilizadores().obterUtilizador(index);
        return registoExposicoes.getExposicoesOrganizador(utilizador);
    }

    public List getCandidaturasAceites(Exposicao exposicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCandidatura(Candidatura candidatura) {

    }

    public List getListaStandsDisponiveis(Exposicao exposicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setStand(Stand stand){
        
    }
    
    public void registaStandCandidatura(){
        
    }

}
