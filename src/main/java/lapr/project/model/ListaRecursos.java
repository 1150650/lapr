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

    public boolean addRecurso(Recurso r) {
        listaRecurso.add(r);
        return true;
    }

    public Recurso obterRecurso(int indice) {
        return listaRecurso.get(indice);
    }

    public int tamanho() {
         return this.listaRecurso.size();
    }

    public int indiceDe(Recurso r) {
        return listaRecurso.indexOf(r);
    }

    public boolean removerRecurso(Recurso r) {
        listaRecurso.remove(r);
        return true;
    }
}
