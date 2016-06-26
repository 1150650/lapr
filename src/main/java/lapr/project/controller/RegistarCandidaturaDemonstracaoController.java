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

    private CandidaturaExposicao candidaturaExposicao;

    private ListaDemonstracoes listaDemonstracoesComInteresse;

    private CandidaturaDemonstracao candidaturaDemo;

    private Representante representante;
    private  Utilizador u;

    public RegistarCandidaturaDemonstracaoController(CentroExposicoes centroExposicoes, Utilizador u) {
        this.centroExposicoes = centroExposicoes;
        this.u=u;
    }

    
     public Exposicao[] getListaExposicoes() {
        return this.centroExposicoes.mostrarLista();
    }
     
     
    public ListaCandidaturas getListaCandidaturas(Exposicao expo) {
        this.exposicao=expo ;
        this.representante = this.exposicao.getListaRepresentantes().obterRepresentantePorU(u);
        return listaCandidaturas = representante.getListaCandidaturasExposicao();
    }

    public void setCandidaturaExposicao(CandidaturaExposicao candidaturaExposicao) {
        this.candidaturaExposicao = candidaturaExposicao;
    }

  
    public Demonstracao[] getListaDemonstracoesCInteresse() {
        return candidaturaExposicao.mostrarlistDemons();
    }
    
    public void addCandidaturaDemonstracao(){
        exposicao.getListaCandidaturasDemonstracoes().adicionarCandidatura(candidaturaDemo);    
        representante.getListaCandidaturasDemonstracao().adicionarCandidatura(candidaturaDemo);
    }

    public CandidaturaDemonstracao newCandidaturaDemo(CandidaturaExposicao candidaturaExposicao) {
        candidaturaDemo = exposicao.getListaCandidaturasExposicoes().newCandidaturaDemo(candidaturaExposicao);
        return candidaturaDemo;
    }
        
    public void setDemonstracao(Demonstracao demonstracao){
        candidaturaDemo.setDemonstracao(demonstracao);
    }

   

}
