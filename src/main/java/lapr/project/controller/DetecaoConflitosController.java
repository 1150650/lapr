/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.MecanismoDetecaoConflito;
import lapr.project.model.RegistoTipoDeConflito;
import lapr.project.model.TipoDeConflito;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DetecaoConflitosController {

    private RegistoTipoDeConflito listaTiposConflito;

    private List<TipoDeConflito> listaTiposConflitoAtivos;

    private CentroExposicoes centroExposicoes;
    
    private MecanismoDetecaoConflito mecanismoDetecao;

    public DetecaoConflitosController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }
    
    public void detecaoConflitosExposicao(){
        listaTiposConflito = centroExposicoes.getListaTipoDeConflito();
        listaTiposConflitoAtivos = listaTiposConflito.getTiposConflitoAtivos();
        mecanismoDetecao.detectConflitosExposicao();
    }
    
     public void detecaoConflitosDemonstracao(){
        listaTiposConflito = centroExposicoes.getListaTipoDeConflito();
        listaTiposConflitoAtivos = listaTiposConflito.getTiposConflitoAtivos();
        mecanismoDetecao.detectConflitosDemonstracao();
    }

}
