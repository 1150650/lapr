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
public class Representante {

    /**
     * Utilizador que será FAE
     */
    private Utilizador utilizador;

    /*
    * Lista de Candidaturas que submeteu
     */
    private ListaCandidaturas listaCandidaturasSubmetidas;

    /*
    * Construtor de um Representante recebendo um Utilizador
     */
    public Representante(Utilizador u) {
        setUtilizador(u);
        listaCandidaturasSubmetidas = new ListaCandidaturas();
    }

    public Representante() {

    }

    /**
     * @return Retorna o Utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    /**
     * @param utilizador Altera o parametro utilizador
     */
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * @return the listaCandidaturasSubmetidas
     */
    public ListaCandidaturas getListaCandidaturasSubmetidas() {
        return listaCandidaturasSubmetidas;
    }

    public ListaCandidaturas getListaCandidaturasPodemSerAlteradas() {
        ListaCandidaturas lstCandPodemSerAlteradas = new ListaCandidaturas();
        for (int i = 0; i < listaCandidaturasSubmetidas.tamanho(); i++) {
            //if (listaCandidaturasSubmetidas.obterCandidatura(i).getState().isEstadoEmSubmissao()) {
                lstCandPodemSerAlteradas.adicionarCandidatura(listaCandidaturasSubmetidas.obterCandidatura(i));
            //}
        }
        return lstCandPodemSerAlteradas;
    }

    /**
     * @param listaCandidaturasSubmetidas the listaCandidaturasSubmetidas to set
     */
    public void setListaCandidaturasSubmetidas(ListaCandidaturas listaCandidaturasSubmetidas) {
        this.listaCandidaturasSubmetidas = listaCandidaturasSubmetidas;
    }

    /**
     * Adiciona a candidatura que o representante submeteu
     *
     * @param c
     */
    public void adicionarCandidatura(CandidaturaExposicao c) {
        listaCandidaturasSubmetidas.adicionarCandidatura(c);
    }

}
