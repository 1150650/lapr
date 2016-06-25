package lapr.project.controller;

import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Utilizador;

public class AvaliarCandidaturaFAEController {

    private FAE fae;

    private Utilizador u;

    private CentroExposicoes ce;

    private CandidaturaExposicao candidatura;

    private Avaliacao avaliacao;

    private Exposicao expo;

    private ListaCandidaturas lstCand;

    private ListaAvaliacoes lstAval;

    public AvaliarCandidaturaFAEController(CentroExposicoes ce, Utilizador u) {
        this.ce = ce;
        this.u = u;
    }

    public void selecionarCandidatura(CandidaturaExposicao a) {
        this.candidatura = a;
    }

    public void selecionarExposicao(Exposicao e) {
        this.expo = expo;
        this.fae = expo.getListaFAE().obterFAEPorUtilizador(u);
    }

    public String getInfo() {
        return candidatura.toString();
    }

    public void getListaAvaliacoes() {
        this.lstAval = candidatura.getListaAvaliacoes();
    }

    public void novaAvaliacao(boolean avaliacao, String justificacao) {
        this.avaliacao = new Avaliacao(avaliacao, justificacao);
    }

    public void setFAEAvaliacao(int[] conhecimentoFAE) {
        avaliacao.setConhecimentosFAE(conhecimentoFAE);
    }

    public void adicionarAvaliacao(Avaliacao a) {
        lstAval.addAvaliacao(avaliacao);
    }

    public CandidaturaExposicao candidaturaSelecionada() {
        return candidatura;
    }

    public FAE getFAE() {
        return fae;
    }

}
