/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Simão
 */
public class Atribuicao {

    /**
     * Variavel do tipo FAE a receber
     */
    private FAE FAE;

    /**
     * Candaidatura Atribuida a 1 FAE
     */
    private Candidatura candidatura;

    /**
     * Construtor de uma Atribuição sem receer parametros
     */
    public Atribuicao() {
    }

    /**
     * Construtor de uma Atribuição recebendo os parametros
     *
     * @param FAE Fae que será responsável por a candidatura em questão
     * @param candidatura candidatura que será atribuida a um FAE
     */
    public Atribuicao(FAE FAE, Candidatura candidatura) {
        setFAE(FAE);
        setCandidatura(candidatura);
    }

    /**
     * Alterar o Parametro FAE atribuido a uma candidatura
     *
     * @param fae FAE que irá ser a nossa nova variavel FAE
     */
    public void setFAE(FAE fae) {
        this.FAE = fae;
    }

    /**
     * Alterar o Parametro Candidatura na Atribuição de um FAE a um Candidatura
     *
     * @param candidatura candidatura que irá ser a nova variavel Candidatura
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * @return the FAE
     */
    public FAE getFAE() {
        return FAE;
    }

    /**
     * @return the candidatura
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Devolve uma String com a Atribuição
     *
     * @return atribuiçao
     */
    @Override
    public String toString() {
        return candidatura.toString() + "  ----->  " + FAE.toString();
    }
    
    public void addCandidaturaFae() {
        this.FAE.getListacandidatura().adicionarCandidatura(candidatura);
    }
}
