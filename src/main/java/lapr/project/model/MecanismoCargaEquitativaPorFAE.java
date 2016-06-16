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
public class MecanismoCargaEquitativaPorFAE implements Mecanismo {

    /**
     * Lista de Candidaturas para fazer atribuição
     */
    private ListaCandidaturas lstCand;

    /**
     * Lista de FAE para fazer atribuição
     */
    private ListaFAE lstFAE;

    /**
     * Construtor do objeto mecanismo que distribui as candidaturas pelos FAE s
     * de forma equitativa
     *
     * @param lstc
     * @param lstf
     */
    public MecanismoCargaEquitativaPorFAE(ListaCandidaturas lstc, ListaFAE lstf) {
        this.lstCand = lstc;
        this.lstFAE = lstFAE;
    }

    /**
     * Implementação da interface mecanismo que devolve a lista de Atribuições
     * geradas
     *
     * @return
     */
    @Override
    public ListaAtribuicoes atribuirCandidaturasAFAE() {
        ListaAtribuicoes lstAtrib = new ListaAtribuicoes();
        int j = 0;
        for (int i = 0; i < lstCand.tamanho(); i++) {
            lstAtrib.adicionarAtribuição(new Atribuicao(lstFAE.obterFAE(j), lstCand.obterCandidatura(i)));
            j++;
            if (j == lstFAE.tamanho()) {
                j = 0;
            }
        }
        return lstAtrib;
    }

}
