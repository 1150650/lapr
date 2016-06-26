/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class Conflito {

    /**
     * FAE
     */
    private FAE fae;

    /**
     * Candidatura
     */
    private Candidatura candidatura;

    /**
     * Construtor de um Conflitos
     *
     * @param fae
     * @param candidatura
     */
    Conflito(FAE fae, Candidatura candidatura) {
        this.fae = fae;
        this.candidatura = candidatura;
    }

    /**
     * Construtor de Conflito
     */
    Conflito() {
    }

    /**
     * Retorna um FAE
     *
     * @return fae
     */
    public FAE getFae() {
        return fae;
    }

    /**
     * Altera o FAE
     *
     * @param fae fae novo
     */
    public void setFae(FAE fae) {
        this.fae = fae;
    }

    /**
     * Retorna Candidatura
     *
     * @return Candidatura
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Altera o Parametro Candidatura
     *
     * @param candidatura candidatura
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

}
