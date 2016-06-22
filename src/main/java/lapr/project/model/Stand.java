/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOAO
 */
@XmlRootElement
public class Stand {

    private String descricao;

    @XmlElement
    private Candidatura candidatura;

    public Stand(String descricao) {

        setDescricao(descricao);
    }

    public Stand() {

    }

    public String getDescricao() {
        return descricao;

    }

    @XmlElement
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descricao inválida!");
        }
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
        this.candidatura = candidatura;
    }
}
