/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
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
    
    public Recurso newRecurso(String recurso){
        registoRecursos = centroExposicoes.getRegistoRecursos();
        return this.recurso = registoRecursos.criarRecurso(recurso);
    }
    
    public void addRecurso(Recurso recurso){
        registoRecursos.addRecurso(recurso);
    }
    
    public List getListaRecursos(){
        return registoRecursos.getListaRecursos();
    }
    
    public ListaRecursos getRegistoRecursos(){
        return registoRecursos;
    }
    
    
}
