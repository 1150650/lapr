/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Recurso;

/**
 *
 * @author JOAO
 */
public class CriacaoDesmonstracaoController {
     private CentroExposicoes centroExposicoes;
    private Exposicao expo;
    private Demonstracao demonstracao ;
    
    public CriacaoDesmonstracaoController (CentroExposicoes centroExpo){
        this.centroExposicoes=centroExpo ;
    }
    
    
    
    
    public Exposicao[] getListaExposicoes (){
        return this.centroExposicoes.mostrarLista();
    }
    
    public void expoSelecionada(Exposicao expo){
        this.expo=expo ;
    }
    
    
    public void criarDemonstração (){
        this.demonstracao= expo.getListaDemonstracoes().criacaoDemonstracao();
    }
    
    public void setDemonstracao (String descricao){
        this.demonstracao.setDados(descricao);
    }
    
    public void addRecurso (Recurso r){
        demonstracao.setRecurso(r);
    }
    
    public void addDemonstracao (){
         int indice=this.centroExposicoes.getListaExposicoes().indiceDe(expo);
        this.centroExposicoes.getListaExposicoes().obterExposicao(indice).getListaDemonstracoes().addDemonstracao(demonstracao);
        
    }
}
