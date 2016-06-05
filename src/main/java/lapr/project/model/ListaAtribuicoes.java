/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;

/**
 *
 * @author SimãoPedro
 */
public class ListaAtribuicoes {

    /**
     * Lista de objetos Atribuicao
     */
    private List<Atribuicao> listaAtribuiçao;

    /**
     * Construtor de um Objeto do tipo lista Atribuições
     */
    public ListaAtribuicoes() {
        listaAtribuiçao = new ArrayList<>();
    }

    /**
     * Para retornar uma atribuiçao sabendo a sua posição
     *
     * @param indice atribuicao
     * @return atribuicao
     */
    public Atribuicao obterAtribuiçao(int indice) {
        return listaAtribuiçao.get(indice);
    }

    /**
     * Adicionar uma Atribuicao a Lista
     *
     * @param atribuicao atribuicao
     * @return atribuicao
     */
    public boolean adicionarAtribuição(Atribuicao atribuicao) {
        if (!listaAtribuiçao.contains(atribuicao)) {
            return listaAtribuiçao.add(atribuicao);
        }
        return false;
    }

    /**
     * Remover uma Atribuição
     *
     * @param atribuicao recebe a atribuicao a ser removida
     * @return atribuicao
     */
    public boolean removerAtribuicao(Atribuicao atribuicao) {
        return listaAtribuiçao.remove(atribuicao);
    }

    /**
     * Tamanho da Lista
     *
     * @return tamanho
     */
    public int tamanho() {
        return this.listaAtribuiçao.size();
    }

    /**
     * Descobrir um indice de uma Atribuiçao
     *
     * @param atribuicao atribuicao
     * @return atribuicao
     */
    public int indiceDe(Atribuicao atribuicao) {
        return listaAtribuiçao.indexOf(atribuicao);
    }

    /**
     * Verificar se Contem uma atribuiçao
     *
     * @param atribuicao atribuicao
     * @return atribuicao
     */
    public boolean contem(Atribuicao atribuicao) {
        return listaAtribuiçao.contains(atribuicao);
    }

    /**
     * Substituir a lista existente por outra recebida por parametro
     *
     * @param listaAtribuiçao lista
     */
    public void adicionarNovaLista(List<Atribuicao> listaAtribuiçao) {
        this.listaAtribuiçao.clear();
        this.listaAtribuiçao = listaAtribuiçao;
    }
    
    /**
     * Adiciona ao FAE as suas candidaturas para decidir
     */
    public void adicionarAtribuiçoesFAE() {
        int j;
        for (j = 0; j < listaAtribuiçao.size(); j++) {
            listaAtribuiçao.get(j).addCandidaturaFae();
        }
    }

}
