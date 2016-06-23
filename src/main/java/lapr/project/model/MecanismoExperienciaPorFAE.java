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
public class MecanismoExperienciaPorFAE implements Mecanismo {

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
    public MecanismoExperienciaPorFAE(ListaCandidaturas lstc, ListaFAE lstf) {
        this.lstCand = lstc;
        this.lstFAE = lstFAE;
    }

    /**
     * Atribuições geradas consoante a experiencia do FAE
     *
     * @return listaAtribuições
     */
    @Override
    public ListaAtribuicoes atribuirCandidaturasAFAE(ListaCandidaturas lstc, ListaFAE lstf) {
        this.lstCand = lstc;
        this.lstFAE = lstf;
        ListaAtribuicoes listaAtribuiçao = new ListaAtribuicoes();
        lstFAE.ordenarListaFAE();
        int nFaes = lstFAE.tamanho();
        int nCandidaturas = lstCand.tamanho();
        int j = 0;
        int nFaeExperientes = (int) 2 * nFaes / 3;
        int k = nFaeExperientes + 1;
        int nCandidaturasFaeExperientes = (int) 2 * nCandidaturas / 3;
        for (int i = 0; i < nCandidaturasFaeExperientes; i++) {
            listaAtribuiçao.adicionarAtribuição(new AtribuicaoFAE(lstFAE.obterFAE(j), lstCand.obterCandidatura(i)));
            j++;
            if (j == nFaeExperientes) {
                j = 0;
            }
        }
        for (int i = nCandidaturasFaeExperientes + 1; i < nCandidaturas; i++) {
            listaAtribuiçao.adicionarAtribuição(new AtribuicaoFAE(lstFAE.obterFAE(k), lstCand.obterCandidatura(i)));
            k++;
            if (k == nFaes) {
                k = nFaeExperientes + 1;
            }
        }
        return listaAtribuiçao;
    }
}
