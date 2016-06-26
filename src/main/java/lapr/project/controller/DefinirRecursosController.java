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

    /**
     * Centro de Exposicao
     */
    private CentroExposicoes centroExposicoes;
    /**
     * Lista de Recursos
     */
    private ListaRecursos registoRecursos;
    /**
     * Recurso
     */
    private Recurso recurso;

    /**
     * Construtor de Definir Recursos
     *
     * @param centroExposicoes
     */
    public DefinirRecursosController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Novo Recurso
     *
     * @param recurso
     * @return
     */
    public Recurso newRecurso(String recurso) {
        registoRecursos = centroExposicoes.getRegistoRecursos();
        return this.recurso = registoRecursos.criarRecurso(recurso);
    }

    /**
     * Adiciona Recurso a Lista
     *
     * @param recurso
     */
    public void addRecurso(Recurso recurso) {
        registoRecursos.addRecurso(recurso);
    }

    /**
     * Retorna Lista de Recursos
     *
     * @return
     */
    public List getListaRecursos() {
        return registoRecursos.getListaRecursos();
    }

    /**
     * Retorna Lista de Recursos
     *
     * @return
     */
    public ListaRecursos getRegistoRecursos() {
        return registoRecursos;
    }

}
