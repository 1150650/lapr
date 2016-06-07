package lapr.project.controller;

import lapr.project.model.Avaliacao;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaFAE;
import lapr.project.model.Utilizador;

public class DecidirCandidaturaFAEController {

    private FAE fae;

    private Candidatura candidatura;

    private Avaliacao avaliacao;

    private ListaCandidaturas lstCand;

    private ListaAvaliacoes lstAval;

    public DecidirCandidaturaFAEController(String id, Exposicao expo) {
        this.fae = expo.getListaFAE().obterFAEId(id);
        this.lstCand = fae.getListacandidatura();
    }

    public void selecionarCandidatura(Candidatura a) {
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

}
