/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DefinirRecursosController {
    
    private CentroExposicoes centroExposicoes;
    private ListaRecursos registoRecursos;
    private Recurso recurso;
    
    public DefinirRecursosController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    public void newRecurso(){
        registoRecursos = centroExposicoes.getRegistoRecursos();
        recurso = registoRecursos.criarRecurso();
    }
    
    public void addRecurso(){
        registoRecursos.addRecurso(recurso);
    }
    
    
    
}
