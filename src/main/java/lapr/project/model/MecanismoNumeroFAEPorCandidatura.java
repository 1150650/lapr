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
public class MecanismoNumeroFAEPorCandidatura implements Mecanismo {

    /**
     * Lista de Candidaturas para fazer atribuição
     */
    private ListaCandidaturas lstCand;

    /**
     * Lista de FAE para fazer atribuição
     */
    private ListaFAE lstFAE;

    /**
     * Parametro recebido que indica o numero de FAEs que cada candidatura deve
     * ter
     */
    private int nFAEPCand;

    /**
     * Construtor do objeto mecanismo que distribui as candidaturas pelos FAE
     * consoante um numero pedido pelo utilizador
     *
     * @param lstc
     * @param lstf
     */
    public MecanismoNumeroFAEPorCandidatura(ListaCandidaturas lstc, ListaFAE lstf, int nFAEPorCandidatura) {
        this.lstCand = lstc;
        this.lstFAE = lstFAE;
        this.nFAEPCand = nFAEPorCandidatura;
    }

    /**
     * Implementação da interface Mecanismo que devolve uma lista de aribuições
     *
     * @return
     */
    @Override
    public ListaAtribuicoes atribuirCandidaturasAFAE() {
        ListaAtribuicoes listaAtribuiçao = new ListaAtribuicoes();
        for (int i = 0; i < lstCand.tamanho(); i++) {
            for (int j = 0; j < nFAEPCand; j++) {
                listaAtribuiçao.adicionarAtribuição(new Atribuicao(lstFAE.obterFAE(gerarFAE(lstFAE)), lstCand.obterCandidatura(i)));
            }
        }
        return listaAtribuiçao;
    }

    /**
     * Gera um numero aleatorio comprimido entre a lista de FAEs precisa de
     * atenÇÃO
     *
     * @param lstFAE
     * @return
     */
    private int gerarFAE(ListaFAE lstFAE) {
        int posicao = (int) (Math.random() * 100);
        while (posicao > lstFAE.tamanho() - 1) {
            posicao = (int) (Math.random() * 100);
        }
        return posicao;
    }

}
