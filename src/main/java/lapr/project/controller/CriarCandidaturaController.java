package lapr.project.controller;

import java.util.List;
import javax.swing.JList;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

public class CriarCandidaturaController {

    private CentroExposicoes centroExposicoes;

    private ListaCandidaturas listaCandidaturas;

    private Exposicao exposicaoSelecionada;

    private CandidaturaExposicao c;

    private Representante r;

    public CriarCandidaturaController(CentroExposicoes ce, Utilizador u) {
        this.centroExposicoes = ce;

    }

    public RegistoExposicoes getListaExposicoes() {
        return centroExposicoes.getListaExposicoes();
    }

    public void selecionaExposicao(Exposicao e) {
        exposicaoSelecionada = e;
        this.r = verificarRepresentante();
    }

    public void getListaCandidaturas() {
        listaCandidaturas = exposicaoSelecionada.getListaCandidaturas();
    }

    public void novaCandidatura() {
        listaCandidaturas.novaCandidatura();
    }

    public void setDados(CandidaturaExposicao candidatura, String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int nConvites) {
        this.c = candidatura;
        this.c.setNomeEmpresa(nomeEmpresa);
        this.c.setMorada(morada);
        this.c.setTelemovel(telemovel);
        this.c.setAreaPretendida(areaPretendida);
        this.c.setProdutos(produtos);
        this.c.setQuantidadeConvites(nConvites);

    }

    public void adicionarCandidatura() {
        this.exposicaoSelecionada.adicinarCanidatura(c);
        this.r.adicionarCandidatura(c);
    }

    public void criarListaCandidaturas() {
        listaCandidaturas = new ListaCandidaturas();
    }

    private Representante verificarRepresentante() {
        return exposicaoSelecionada.getLstRep().obterRepresentantePorU(u);
    }

    /**
     * @return the r
     */
    public Representante getRepresentante() {
        return r;
    }

}
