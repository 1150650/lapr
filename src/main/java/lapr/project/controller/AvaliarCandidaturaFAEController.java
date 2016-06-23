package lapr.project.controller;

import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.FAE;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.ListaCandidaturas;

public class AvaliarCandidaturaFAEController {

    private FAE fae;

    private CandidaturaExposicao candidatura;

    private Avaliacao avaliacao;

    private ListaCandidaturas lstCand;

    private ListaAvaliacoes lstAval;

    public AvaliarCandidaturaFAEController(CentroExposicoes ce, FAE fae) {
        this.fae = fae;
        this.lstCand = fae.getListacandidatura();
    }

    public void selecionarCandidatura(CandidaturaExposicao a) {
        this.candidatura = a;
    }

    public String getInfo() {
        return candidatura.apresentarDados();
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

}
