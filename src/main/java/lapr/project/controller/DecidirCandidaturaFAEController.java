package lapr.project.controller;

import lapr.project.model.Avaliacao;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaAtribuicoes;

/**
 *
 * @author Diogo
 */
public class DecidirCandidaturaFAEController {

    private Avaliacao decisao;
    private CentroExposicoes ce;
    private Candidatura c;
    private ListaAtribuicoes listaAtribuicoes;

    public DecidirCandidaturaFAEController(CentroExposicoes centroexpo) {
        this.ce = centroexpo;
    }

  //  public void candidaturaSelecionada(Candidatura canditura) {
  //      this.c = canditura;
  //  }

    public void selecionarCandidatura(Candidatura candidatura) {
        this.c = candidatura;
    }

    public void guardarDecisao(String decisao, String justificacao) {
        this.decisao.setAvaliacao(decisao);
        this.decisao.setJustificacao(justificacao);
    }

    public void novaDecisao(Avaliacao decisao) {
        this.decisao = decisao;

    }

    public void guardarAvaliacao() {
        this.c.getListaAvaliacoes().addAvaliacao(decisao);
    }
    
    
}
