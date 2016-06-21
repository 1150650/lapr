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

    private CandidaturaDemonstracao candidatura;

    private ListaDemonstracoes registoDemonstracoes;
    
    private List<Demonstracao> listaDemonstracoes;
    
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
        listaCandidaturas = exposicao.getListaCandidaturasDemonstracoes();
        candidatura = (CandidaturaDemonstracao) listaCandidaturas.novaCandidatura();
    }

    public List getListaDemonstracoes() {
        registoDemonstracoes = centroExposicoes.getListaDemonstracoes();
        return listaDemonstracoes = registoDemonstracoes.getListalDemonstracao();
    }
    
    public void guardaDadosCandidatura(String morada, Demonstracao demonstracao, String nomeEmpresa, int telemovel, int quantidadeConvites, String produto){
        candidatura.setMorada(morada);
        candidatura.setDemonstracao(demonstracao);
        candidatura.setNomeEmpresa(nomeEmpresa);
        candidatura.setTelemovel(telemovel);
        candidatura.setQuantidadeConvites(quantidadeConvites);
        candidatura.setProdutos(produto);
        
    }
    
    public void registaCandidatura(){
        listaCandidaturas.adicionarCandidatura(candidatura);
    }
    
    
    public void setCandidaturaEmSubmissao(){
        candidatura.setCandidaturaEmSubmissao();
    }

}
