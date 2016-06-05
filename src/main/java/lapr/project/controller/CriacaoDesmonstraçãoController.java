/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;

/**
 *
 * @author JOAO
 */
public class CriacaoDesmonstraçãoController {
     private CentroExposicoes centroExposicoes;
    private Exposicao expo;
    private Demonstracao demonstracao ;
    
    public CriacaoDesmonstraçãoController (CentroExposicoes centroExpo){
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
    
    
}
