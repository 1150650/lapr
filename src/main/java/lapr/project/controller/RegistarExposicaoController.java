/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import java.util.Timer;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class RegistarExposicaoController {

     private CentroExposicoes centroExposicoes;

    private Exposicao exposicao;
    
    public RegistarExposicaoController(CentroExposicoes centroexpo ){
        this.centroExposicoes=centroexpo ;
    }
    
    public void novaExposicao (){
        this.exposicao=centroExposicoes.getListaExposicoes().novaExposicao();
    }
    
    public void setDados (String titulo ,String textoDescritivo,Date dataInicio,Date dataFim,String local){
        exposicao.setLocal(local);
        exposicao.setPeriodo(dataInicio, dataFim);
        exposicao.setTextoDescritivo(textoDescritivo);
        exposicao.setTitulo(titulo);
    }
    
    public RegistoUtilizadores getListaUtilizadores (){
       return this.centroExposicoes.getRegistoUtilizadoresConf();
    }
    
    public void adicionarOrganizador (Utilizador selecionado){
        Organizador u =new Organizador (selecionado);
        exposicao.getListaOrganizadores().adicionarOrganizador(u);
    }
    
    public void RegistaExposicao (){
        centroExposicoes.getListaExposicoes().adicionarExposicao(exposicao);
    }
    
    public void setEstadoExposicaoCriada (){
        exposicao.setExposicaoCriada();
        
         
        
    }
    
    
}
