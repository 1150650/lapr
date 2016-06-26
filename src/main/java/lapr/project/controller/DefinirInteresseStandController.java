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
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class DefinirInteresseStandController {
       private CentroExposicoes centroexpo;
    private Exposicao expo;
    private int indice;
    private Representante r;
    private Utilizador u;

    public DefinirInteresseStandController(CentroExposicoes centroexpo,Utilizador u) {

        this.centroexpo = centroexpo;
        this.u=u;
       
        

    }

    public Exposicao[] getListaExposicoes() {
        return this.centroexpo.mostrarLista();
    }
    
     public ListaCandidaturas getListaCandidaturasExposicoes(Exposicao expo) {
        this.expo=expo;
        this.indice=centroexpo.getListaExposicoes().indiceDe(expo);
         this.r = this.expo.getListaRepresentantes().obterRepresentantePorU(u);
        ListaCandidaturas lst = new ListaCandidaturas();
        ListaCandidaturas lst1 = new ListaCandidaturas();
        
        lst=r.getListaCandidaturasExposicao();
        int i;
        
        for (i=0; i<lst.tamanho();i++){
            
            if(lst.obterCandidatura(i).getState().isEstadoStandAtribuido()){
                lst1.adicionarCandidatura(lst.obterCandidatura(i));
            }
        }
        
        
        
        return lst1;
     }
     
     public void aceitarStand (Candidatura candidatura){
         int i = this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().indiceDe(candidatura);
            this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().obterCandidatura(i).setCandidaturaStandAtribuido();
     }
}