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

/**
 *
 * @author JOAO
 */
public class RemoverCandidaturaController {

    private CentroExposicoes centroexpo;
    private Exposicao expo;
    private int indice;

    public RemoverCandidaturaController(CentroExposicoes centroexpo) {

        this.centroexpo = centroexpo;

    }

    public Exposicao[] getListaExposicoes() {
        return this.centroexpo.mostrarLista();
    }

    public ListaCandidaturas getListaCandidaturasExposicoes(Exposicao expo) {
        ListaCandidaturas lst = new ListaCandidaturas();
        ListaCandidaturas lst1 = new ListaCandidaturas();
        this.indice = this.centroexpo.getListaExposicoes().indiceDe(expo);
        lst=this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes();
        int i;
        
        for (i=0; i<lst.tamanho();i++){
            
            if(lst.obterCandidatura(i).getState().isEstadoEmSubmissao()==true){
                lst1.adicionarCandidatura(lst.obterCandidatura(i));
            }
        }
        
        
        
        return lst1;
        
    }
    
    
    public ListaCandidaturas getListaCandidaturasDemonstracoes(Exposicao expo) {
        ListaCandidaturas lst = new ListaCandidaturas();
        ListaCandidaturas lst1 = new ListaCandidaturas();
        this.indice = this.centroexpo.getListaExposicoes().indiceDe(expo);
        lst=this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes();
        int i;
        
        for (i=0; i<lst.tamanho();i++){
            
            if(lst.obterCandidatura(i).getState().isEstadoEmSubmissao()==true){
                lst1.adicionarCandidatura(lst.obterCandidatura(i));
            }
        }
        
        
        
        return lst1;
        
    }

    public void removerCandidaturaExposicao(Candidatura c) {
        this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasExposicoes().removerCandidatura(c);
    }
    
    public void removerCandidaturaDemonstracao(Candidatura c) {
        this.centroexpo.getListaExposicoes().obterExposicao(indice).getListaCandidaturasDemonstracoes().removerCandidatura(c);
    }

}
