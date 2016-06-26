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
    private boolean avaliacao;

    /**
     * Vetor de inteiros relativamente as perguntas feitas ao FAE
     */
    private int[] conhecimentoFAE;

    /**
     * Justificacao da Candidatura
     */
    private String justificacao;

    /**
     * Avaliacao por omissao
     */
    private static final boolean AVALIACAO_POR_OMISSAO = false;

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
    public Avaliacao(boolean avaliacao, String justificacao, int[] conhecimentosFAE) {
        setAvaliacao(avaliacao);
        setJustificacao(justificacao);
        setConhecimentosFAE(conhecimentosFAE);
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
    public void setAvaliacao(boolean avaliacao) {
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
    public boolean getAvaliacao() {
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
    
    /**
     * Set dos Conhecimentos FAE
     * @param conhecimentosFAE Conhecimentos FAe
     */
    public void setConhecimentosFAE(int[] conhecimentosFAE) {
        this.conhecimentoFAE = conhecimentosFAE;
    }
    
    /**
     * Obter Conhecimentos FAE
     * @return int[]
     */
    public int[] getConhecimentosFAE() {
        return conhecimentoFAE;
    }

}
