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
public class ConsultarCandidaturasRetiradasController {
    
    private CentroExposicoes centroExposicoes;
    
    private Exposicao exposicao;
    
    private ListaCandidaturas registoCandidaturas;
    
    private List listaCandidaturas;
    
    public ConsultarCandidaturasRetiradasController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    public Exposicao[] getListaExposicoes() {
        return this.centroExposicoes.mostrarLista();
    }
    
    public ListaCandidaturas getListaCandidaturasExposicao(Exposicao exposicao){
        this.exposicao=exposicao;
        return registoCandidaturas = this.exposicao.getLstCandidaturasExposicaoRemovidas();
        
    }
    
    public ListaCandidaturas getListaCandidaturasDemonstracao(Exposicao exposicao){
        this.exposicao=exposicao;
        return registoCandidaturas = this.exposicao.getLstCandidaturasDemonstracaoRemovidas();
        
    }
    
}
