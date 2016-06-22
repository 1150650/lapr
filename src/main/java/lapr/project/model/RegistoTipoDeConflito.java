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
 * @author JOAO
 */
@XmlRootElement
public class RegistoTipoDeConflito {

    @XmlElement (name = "Conflito")
    private List<TipoDeConflito> listaTipoDeConflito;

    public RegistoTipoDeConflito() {
        listaTipoDeConflito = new ArrayList<>();
    }

    public void adicionarTipoDeConflito(TipoDeConflito e) {
        listaTipoDeConflito.add(e);
    }

    public int tamanho() {
        return this.listaTipoDeConflito.size();
    }

    public TipoDeConflito obterTipoDeConflito(int indice) {
        return listaTipoDeConflito.get(indice);
    }

    public List<TipoDeConflito> getListaTipoDeConflito() {
        return new ArrayList(listaTipoDeConflito);
    }

    public TipoDeConflito[] getArray() {
        return listaTipoDeConflito.toArray(new TipoDeConflito[listaTipoDeConflito.size()]);
    }

    public TipoDeConflito novoTipoDeConflito() {
        return new TipoDeConflito();
    }

    public List<TipoDeConflito> getTiposConflitoAtivos() {
        List<TipoDeConflito> tiposConflitoAtivos = new ArrayList<TipoDeConflito>();
        for (TipoDeConflito t : listaTipoDeConflito) {
            if (t.isConflitoAtivo()) {
                tiposConflitoAtivos.add(t);
            }
        }
        return tiposConflitoAtivos;
    }
}
