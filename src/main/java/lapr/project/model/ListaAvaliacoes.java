/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import pprog.model.Avaliacao;

/**
 *
 * @author Simão
 */
public class ListaAvaliacoes {

    /**
     * Lista de objetos Atribuicao
     */
    private List<Avaliacao> listaAvaliacao;

    /**
     * Construtor de um objeto do tipo Lista de Avaliacoes
     */
    public ListaAvaliacoes() {
        listaAvaliacao = new ArrayList<>();
    }

    /**
     * Adicionar uma nova Avaliacao
     *
     * @param avaliacao avaliacao
     * @return avalicao
     */
    public boolean addAvaliacao(Avaliacao avaliacao) {
        if (!listaAvaliacao.contains(avaliacao)) {
            return listaAvaliacao.add(avaliacao);
        }
        return false;
    }

    /**
     * Remover a Avaliacao fornecida
     *
     * @param avaliacao que irá ser removida
     * @return avaliacao
     */
    public boolean removerAvaliacao(Avaliacao avaliacao) {
        return listaAvaliacao.remove(avaliacao);
    }

    /**
     * Retorna uma Avaliacao com base na sua posicao na Lista
     *
     * @param indice indeice
     * @return avaliacao
     */
    public Avaliacao obterAvaliacao(int indice) {
        return listaAvaliacao.get(indice);
    }

    /**
     * Tamanho da lista de Avaliacoes
     *
     * @return tamanho
     */
    public int tamanho() {
        return this.listaAvaliacao.size();
    }

    /**
     * Retorna o indice de uma avaliacao fornecida
     *
     * @param avaliacao avaliacao
     * @return indice
     */
    public int indiceDe(Avaliacao avaliacao) {
        return listaAvaliacao.indexOf(avaliacao);
    }
    
    public void adicionarAvaliacao(Avaliacao avaliacao){
        listaAvaliacao.add(avaliacao);
    }
    

}
