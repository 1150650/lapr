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
public class Stand {

    private String descricao;

    private Candidatura candidatura;

    public Stand() {

    }

    public String getDescricao() {
        return descricao;

    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format("Stand com a localização : " + descricao);
    }

    public boolean hasCandidatura() {
        if (candidatura == null) {
            return false;
        } else {
            return true;
        }
    }

    void addCandidatura(Candidatura candidatura) {
        this.candidatura=candidatura;
    }
}
