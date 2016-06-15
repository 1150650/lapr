/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Organizador;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class CriarDemonstraçãoController {
      private RegistoExposicoes registoExposicoes;
     private CentroExposicoes centroExposicoes;
     private Demonstracao demonstracao;

    private Exposicao exposicao;
    
    public CriarDemonstraçãoController(CentroExposicoes centroexpo ){
        this.centroExposicoes=centroexpo ;
    }
    
    public void selecionarExposicao (Exposicao exposicao){
        this.exposicao=exposicao;
    }
    
    public void novaExposicao (){
        demonstracao=exposicao.getListaDemonstracoes().criacaoDemonstracao();
    }
    
    public void validaDados (){
        
    }
    
    public void setDados (String Descricao){
        demonstracao.setDados(Descricao);
    }
     
    
    public ListaRecursos getListaRecursos (){
       return centroExposicoes.getRegistoRecursos();
    }
    public void adicionarRecurso (Recurso r){
        demonstracao.setRecurso(r);
    }
    
    public void validaRegistaDemonstracao (){
        exposicao.getListaDemonstracoes().addDemonstracao(demonstracao);
    }
    
    public void setEstadoDemonstracaoCriada (){
        exposicao.setExposicaoCriada();
    }
}
