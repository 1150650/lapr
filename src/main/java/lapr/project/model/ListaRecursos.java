/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;

/**
 *
 * @author JOAO
 */
public class ListaRecursos {

    /**
     * A lista de recursos da exposicao
     */
    private ArrayList<Recurso> listaRecurso;

    /**
     * Cria uma instancia de ListaRecursos
     */
    public ListaRecursos() {
        listaRecurso = new ArrayList<>();
    }

    public Recurso criarRecurso() {
        Recurso r = new Recurso();
        return r;
    }

    public void addRecurso(Recurso r) {
        listaRecurso.add(r);
    }

    public Recurso obterRecurso(int indice) {
        return listaRecurso.get(indice);
    }
}
