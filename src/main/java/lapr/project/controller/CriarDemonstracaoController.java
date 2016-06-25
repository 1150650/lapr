/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author JOAO
 */
public class CriarDemonstracaoController {
      private RegistoExposicoes registoExposicoes;
     private CentroExposicoes centroExposicoes;
     private Demonstracao demonstracao;

    private Exposicao exposicao;
    
    public CriarDemonstracaoController(CentroExposicoes centroexpo ){
        this.centroExposicoes=centroexpo ;
    }
    
    public void selecionarExposicao (Exposicao exposicao){
        this.exposicao=exposicao;
    }
    
    public void novaDemonstracao (){
        demonstracao=new Demonstracao();
    }
    
    
    public void setDados (String Descricao){
        demonstracao.setDescricao(Descricao);
    }
     
    
    public ListaRecursos getListaRecursos (){
       return centroExposicoes.getRegistoRecursos();
    }
    public void adicionarRecurso (Recurso r){
        demonstracao.addRecurso(r);
    }
    
    public void validaRegistaDemonstracao (){
        exposicao.getListaDemonstracoes().addDemonstracao(demonstracao);
    }
    
  

    public Exposicao[] getListaExposicoes() {
       return this.centroExposicoes.getArrayExposicao();
    }
}
