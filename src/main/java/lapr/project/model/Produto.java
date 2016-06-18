/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author SimãoPedro
 */
public class Produto {

    private String designacao;

    /**
     * Construtor de um produto
     *
     * @param designacao
     */
    public Produto(String designacao) {
        setDesignacao(designacao);
    }

    Produto() {
        
    }

    /**
     * Altera a designacao do produto
     *
     * @param designacao
     */
    public void setDesignacao(String designacao) {
        if (designacao == null || designacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Designação vazia!");
        }
        this.designacao = designacao;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }
}
