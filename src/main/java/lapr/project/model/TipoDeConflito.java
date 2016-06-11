/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author JOAO
 */
public class TipoDeConflito {

    private String descricao;

    public TipoDeConflito(String descricao) {
        setDescricao(descricao);

    }

    public TipoDeConflito() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoDeConflito{" + "descricao=" + descricao + '}';
    }

}
