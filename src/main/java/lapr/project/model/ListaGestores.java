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
 * @author Diogo
 */
@XmlRootElement
public class ListaGestores {
    
    @XmlElement(name = "Gestor")
    private List<Gestor> listaGestores;
    
     public ListaGestores() {
        listaGestores = new ArrayList<Gestor>();
    }
     
     public Gestor obterGestor(int indice) {
        return listaGestores.get(indice);
    }
     
     public int tamanho() {
        return this.listaGestores.size();
    }
     
     public List getListaGestores() {
        return listaGestores;
    }
     
    public boolean adicionarGestor(Gestor gestor) {
        return listaGestores.add(gestor);
    }
    
}
