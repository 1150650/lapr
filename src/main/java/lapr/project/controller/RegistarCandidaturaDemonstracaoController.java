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

    public RegistarCandidaturaDemonstracaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas = representante.getListaCandidaturasSubmetidas();
    }

    public void setCandidaturaExposicao(CandidaturaExposicao candidaturaExposicao) {
        this.candidaturaExposicao = candidaturaExposicao;
    }

    public CandidaturaExposicao setCandidaturaExposicao() {
        return candidaturaExposicao;
    }

    public ListaDemonstracoes getListaDemonstracoesCInteresse() {
        return candidaturaExposicao.getDemonstracoesComInteresse();
    }
    
    public void addCandidaturaDemonstracao(){
        representante.getListaCandidaturasDemonstracao().adicionarCandidatura(candidaturaDemo);
    }

    public CandidaturaDemonstracao newCandidaturaDemo(CandidaturaExposicao candidaturaExposicao) {
        candidaturaDemo = exposicao.getListaCandidaturasExposicoes().newCandidaturaDemo(candidaturaExposicao);
        return candidaturaDemo;
    }
        
    public void setDemonstracao(Demonstracao demonstracao){
        candidaturaDemo.setDemonstracao(demonstracao);
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Representante getRepresentante() {
        return representante;
    }

}
