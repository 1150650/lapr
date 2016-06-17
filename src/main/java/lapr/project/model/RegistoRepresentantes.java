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
 * @author Simão Pedro
 */
public class RegistoRepresentantes {

    /**
     * Lista de objetos Atribuicao
     */
    private List<Representante> lstRepresentante;

    /**
     * Construtor de um Objeto do tipo lista Atribuições
     */
    public RegistoRepresentantes() {
        lstRepresentante = new ArrayList<>();
    }

    /**
     * Adicionar produtos a lista
     *
     * @param e
     */
    public void addRepresentante(Representante r) {
        lstRepresentante.add(r);
    }

    /**
     * Verifica se o produto já existe
     *
     * @param e
     * @return
     */
    public boolean validaProduto(Representante r) {
        if (lstRepresentante.contains(r)) {
            return false;
        }
        return true;
    }

    public Representante obterRepresentantePorU(Utilizador u) {
        for (int i = 0; i < lstRepresentante.size(); i++) {
            if (lstRepresentante.get(i).getUtilizador().equals(u));
            return lstRepresentante.get(i);
        }
        return null;
    }
}
