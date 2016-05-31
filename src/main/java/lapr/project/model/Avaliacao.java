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
public final class Avaliacao {

    /**
     * Avaliacao da Candidatura
     */
    private String avaliacao;

    /**
     * Justificacao da Candidatura
     */
    private String justificacao;

    /**
     * Avaliacao por omissao
     */
    private static final String AVALIACAO_POR_OMISSAO = "Sem Avaliacao";

    /**
     * Justificacao por omissao
     */
    private static final String JUSTIFICACAO_POR_OMISSAO = "Sem Justificação";

    /**
     * Construtor sem Parametros
     *
     * @param avaliacao avaliacao submetida pelo fae
     * @param justificacao Justificação da decisão
     */
    public Avaliacao(String avaliacao, String justificacao) {
        setAvaliacao(avaliacao);
        setJustificacao(justificacao);
    }

    /**
     * Construtor sem Parametros
     */
    public Avaliacao() {
        setAvaliacao(AVALIACAO_POR_OMISSAO);
        setJustificacao(JUSTIFICACAO_POR_OMISSAO);
    }

    /**
     * Definir avaliacao
     *
     * @param avaliacao avaliacao
     */
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setJustificacao(String justificacao) {
        if (justificacao == null || justificacao.trim().isEmpty()) {
            throw new IllegalArgumentException("É necessário uma justificação da decisão tomada");
        }
        this.justificacao = justificacao;
    }

    /**
     * @return the avaliacao
     */
    public String getAvaliacao() {
        return avaliacao;
    }

    /**
     * @return the justificacao
     */
    public String getJustificacao() {
        return justificacao;
    }

    /**
     * Status da a candidatura
     *
     * @return string
     */
    public String toString() {
        return "Avaliação: " + avaliacao + "\n Justificação: " + justificacao;
    }
}
