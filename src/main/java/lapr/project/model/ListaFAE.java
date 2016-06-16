
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lapr.project.model.FAE;

/**
 *
 * @author SimãoPedro
 */
public class ListaFAE {

    /**
     * Lista de objetos Atribuicao
     */
    private ArrayList<FAE> listaFAE;

    /**
     * Construtor de uma lista de objetos do tipo FAE
     */
    public ListaFAE() {
        listaFAE = new ArrayList<>();
    }

    /**
     * Obter um FAE com base no indice
     *
     * @param indice posicao na lista
     * @return FAE do indice
     */
    public FAE obterFAE(int indice) {
        return listaFAE.get(indice);
    }

    /**
     * Adiciona um FAE fornecido a Lista
     *
     * @param fae FAE
     * @return booleano
     */
    public boolean adicionarFAE(FAE fae) {
        if (!listaFAE.contains(fae)) {
            return listaFAE.add(fae);
        }
        return false;
    }

    /**
     * Remove um FAE fornecido
     *
     * @param FAE fae
     * @return booleano
     */
    public boolean removerFAE(FAE fae) {
        return listaFAE.remove(fae);
    }

    /**
     * Tamanho da lista de FAE
     *
     * @return tamanho
     */
    public int tamanho() {
        return this.listaFAE.size();
    }

    /**
     * Indice de uma FAE
     *
     * @param FAE fae
     * @return indice
     */
    public int indiceDe(FAE fae) {
        return listaFAE.indexOf(fae);
    }

    public ArrayList<FAE> ordenarListaFAE() {
        ArrayList<FAE> listaFae = listaFAE;
        Collections.sort(listaFAE);
        return listaFae;
    }

    public FAE obterFAEId(String identificador) {
        int i;

        FAE FAESelecionado = obterFAE(0);
        for (i = 0; i < tamanho(); i++) {
            FAESelecionado = obterFAE(i);
            if (identificador.equalsIgnoreCase(FAESelecionado.getUtilizador().getEmail())) {
                i = tamanho();

            }

        }

        return FAESelecionado;
    }

    public List getListaFAEs() {
        return listaFAE;
    }

    public FAE addFAE(Utilizador utilizador, String id) {
        FAE fae = new FAE(utilizador, id);
        return fae;
    }

    public void registaFAE(FAE fae) {
        if (validaMembroFAE(fae)) {
            addMembroFAE(fae);
        }

    }

    private void addMembroFAE(FAE fae) {
        listaFAE.add(fae);
    }

    private boolean validaMembroFAE(FAE fae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
