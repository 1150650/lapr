/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaExposicoes;

/**
 *
 * @author JOAO
 */
public class RemoverCandidaturaController {
    private CentroExposicoes centroexpo ;
    private Exposicao expo;
    private int indice ;
    
    
    public RemoverCandidaturaController(CentroExposicoes centroexpo){
        
        this.centroexpo=centroexpo;

    }
    
    public ListaExposicoes getListaExposicoes (){
        return this.centroexpo.getListaExposicoes();
    }
    
    public ListaCandidaturas getListaCandidaturas (int indice){
        this.indice=indice;
        return this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidatura();
    }
    
    public void removerCandidatura (Candidatura c){
         this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidatura().removerCandidatura(c);
    }
    
    
    
    
    
}
