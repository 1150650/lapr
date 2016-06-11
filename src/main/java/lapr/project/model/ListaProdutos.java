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
 * @author SimãoPedro
 */
class ListaProdutos {

    /**
     * Lista de objetos Atribuicao
     */
    private List<Produto> lstProdutos;

    /**
     * Construtor de um Objeto do tipo lista Atribuições
     */
    public ListaProdutos() {
        lstProdutos = new ArrayList<>();
    }

    /**
     * Adicionar produtos a lista
     *
     * @param e
     */
    public void addProduto(Produto e) {
        lstProdutos.add(e);
    }

    /**
     * Verifica se o produto já existe
     *
     * @param e
     * @return
     */
    public boolean validaProduto(Produto e) {
        if (lstProdutos.contains(e)) {
            return false;
        }
        return true;
    }
}
