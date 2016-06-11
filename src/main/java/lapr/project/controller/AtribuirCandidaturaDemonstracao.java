/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaFAE;
import lapr.project.model.Mecanismo;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoMecanismos;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class AtribuirCandidaturaDemonstracao {

    private RegistoExposicoes registoExposicoes;

    private CentroExposicoes centroExposicoes;

    private List<Exposicao> listaExposicao;

    private ListaFAE listaFAE;

    private List<FAE> listFAEs;
    
    private Exposicao exposicao;
    
    private ListaCandidaturas listaCandidaturas;
    
    private List<Candidatura> listCandidatura;
    
    private RegistoMecanismos registoMecanismos;
    
    private List<Mecanismo> listaMecanismos;
    
    private Mecanismo mecanismo;
    
    private ListaAtribuicoes listaAtribuicao;

    public AtribuirCandidaturaDemonstracao(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List getListaExposicoes() {
        centroExposicoes.getListaExposicoes();
        
        return listaExposicao = registoExposicoes.getListaExposicoes();

    }
    
    public List getListaFAE(Exposicao exposicao){
        this.exposicao = exposicao;
        listaFAE = this.exposicao.getListaFAE();
        return listFAEs = listaFAE.getListaFAEs();
    }
    
    public List getListaCandidatura(){
        listaCandidaturas = exposicao.getListaCandidaturas();
        return listCandidatura = listaCandidaturas.getCandidaturasSemAtribuicao();
    }
    
    public List getRegistoMecanismos(){
        registoMecanismos = centroExposicoes.getRegistoMecanismos();
        return listaMecanismos = registoMecanismos.getListaMecanismos();
    }
    
    public void selecionaMecanismo(Mecanismo mecanismo){
        this.mecanismo = mecanismo;
        listaAtribuicao = mecanismo.atribuirCandidaturasAFAE();
        
    }
    
    public boolean registaAtribuicao(){
       return exposicao.setAtribuicoes(listaAtribuicao);
    }
    
    public void setCandidaturasAtribuidas(){
        exposicao.setCandidaturasAtribuidas();
    }
    

}
