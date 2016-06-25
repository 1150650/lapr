/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
@XmlRootElement
public class ListaOrganizadores {

    @XmlElement(name = "Organizador")
    private List<Organizador> listaOrganizadores;

    public ListaOrganizadores() {
        listaOrganizadores = new ArrayList<Organizador>();
    }

    public Organizador obterOrganizador(int indice) {
        return listaOrganizadores.get(indice);
    }

    public boolean adicionarOrganizador(Organizador organizador) {
        if (!listaOrganizadores.contains(organizador)) {
            return listaOrganizadores.add(organizador);
        }
        return false;
    }

    public boolean removerOrganizador(Organizador organizador) {
        return listaOrganizadores.remove(organizador);
    }

    public int tamanho() {
        return this.listaOrganizadores.size();
    }

    public int indiceDe(Organizador organizador) {
        return listaOrganizadores.indexOf(organizador);
    }

    public boolean isUserOrganizador(Utilizador utilizador) {
        boolean validator = false;
        for (Organizador o : listaOrganizadores) {
            if (o.getUtilizador().getUsername().equals(utilizador.getUsername())) {
                validator = true;
                break;
            } else {
                validator = false;
            }
        }
   
        return validator;
    }

    public List getListaOrganizadores() {
        return listaOrganizadores;
    }

}
