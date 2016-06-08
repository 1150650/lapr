/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaTiposConflito;
import lapr.project.model.TipoConflito;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DetecaoConflitosController {
    
    private ListaTiposConflito listaTiposConflito;
    
    private List<TipoConflito> listaTiposConflitoAtivos;
    
    private CentroExposicoes centroExposicoes;
    
    public DetecaoConflitosController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    
    
}
