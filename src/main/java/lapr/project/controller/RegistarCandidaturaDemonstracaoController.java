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
public class RegistarCandidaturaDemonstracaoController {

    private RegistoExposicoes registoExposicoes;

    private List<Exposicao> listaExposicoes;

    private CentroExposicoes centroExposicoes;

    private Exposicao exposicao;

    private ListaCandidaturas listaCandidaturas;

    private Candidatura candidatura;
    
    private List<Demonstracao> listaDemonstracoesComInteresse;
    
    private CandidaturaDemonstracao candidaturaDemo;
    
    public RegistarCandidaturaDemonstracaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public List getListaExposicoes() {
        registoExposicoes = centroExposicoes.getListaExposicoes();
        listaExposicoes = registoExposicoes.getListaExposicoes();
        return listaExposicoes;

    }

    public void selecionaExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
        listaCandidaturas = exposicao.getListaCandidaturasExposicoes();
    }
    
    public List selecionaCandidatura(Candidatura Candidatura){
        this.candidatura = candidatura;
        return listaDemonstracoesComInteresse = candidatura.getListaDemonstracoesComInteresse();
    }
    
    public void newCandidaturaDemo(){
        candidaturaDemo = listaCandidaturas.newCandidaturaDemo(candidatura);
    }
    
    public void guardaDadosCandidatura(Demonstracao demonstracao){
        candidaturaDemo.setDemonstracao(demonstracao);
    }
    
    public void registaCandidatura(){
        listaCandidaturas.adicionarCandidatura(candidaturaDemo);
    }
    
    public void setCandidaturaEmSubmissao(){
        candidatura.setCandidaturaEmSubmissao();
    }
    
}
