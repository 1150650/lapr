/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class ListaConflitos {

    private List<Conflito> listaConflito;

    public ListaConflitos() {
        listaConflito = new ArrayList<Conflito>();
    }

    public void registarConflito(FAE fae, Candidatura candidatura) {
        Conflito conflito = new Conflito(fae, candidatura);
        listaConflito.add(conflito);
    }

}
