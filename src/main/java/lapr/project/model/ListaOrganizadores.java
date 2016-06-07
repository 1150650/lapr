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
public class ListaOrganizadores {

    private List<Organizador> listaOrganizadores;

    public ListaOrganizadores() {
        listaOrganizadores = new ArrayList<Organizador>();
    }

    public Organizador obterFAE(int indice) {
        return listaOrganizadores.get(indice);
    }

    public boolean adicionarFAE(Organizador organizador) {
        if (!listaOrganizadores.contains(organizador)) {
            return listaOrganizadores.add(organizador);
        }
        return false;
    }

    public boolean removerFAE(Organizador organizador) {
        return listaOrganizadores.remove(organizador);
    }

    public int tamanho() {
        return this.listaOrganizadores.size();
    }

    public int indiceDe(Organizador organizador) {
        return listaOrganizadores.indexOf(organizador);
    }

    public boolean isUserOrganizador(Utilizador utilizador) {
        if (listaOrganizadores.contains(utilizador)) {
            return true;
        } else {
            return false;
        }
    }

}
