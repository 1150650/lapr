package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

public class CriarCandidaturaExposicaoController {

    private CentroExposicoes centroExposicoes;

    private ListaCandidaturas listaCandidaturas;

    private ListaDemonstracoes lstDemo;

    private Exposicao exposicaoSelecionada;

    private CandidaturaExposicao c;

    private Representante r;

    private Utilizador u;

    public CriarCandidaturaExposicaoController(CentroExposicoes ce, Utilizador u) {
        this.centroExposicoes = ce;
        this.u = u;

    }

    public RegistoExposicoes getListaExposicoes() {
        return centroExposicoes.getListaExposicoes();
    }

    public void selecionaExposicao(Exposicao e) {
        exposicaoSelecionada = e;
        this.r = verificarRepresentante();
        this.lstDemo = exposicaoSelecionada.getListaDemonstracoes();
        this.listaCandidaturas = exposicaoSelecionada.getListaCandidaturasExposicoes();
    }

    public void novaCandidatura() {
        c = new CandidaturaExposicao();
    }

    public void setDados(String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int nConvites, String[] Keywords) {
        this.c.setNomeEmpresa(nomeEmpresa);
        this.c.setMorada(morada);
        this.c.setTelemovel(telemovel);
        this.c.setAreaPretendida(areaPretendida);
        this.c.setProdutos(produtos);
        this.c.setQuantidadeConvites(nConvites);
        this.c.setKEYWORDS(Keywords);
        centroExposicoes.getLstkeyword().addKey(Keywords);

    }

    public void adicionarCandidatura() {
        c.setCandidaturaEmSubmissao();
        this.exposicaoSelecionada.adicionarCandidatura(c);
        this.r.getListaCandidaturasExposicao().adicionarCandidatura(c);
    }

    private Representante verificarRepresentante() {
        return exposicaoSelecionada.getListaRepresentantes().obterRepresentantePorU(u);
    }

    /**
     * @return the r
     */
    public Representante getRepresentante() {
        return r;
    }

    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return lstDemo;
    }

    public Exposicao getExposicaoSelecionada() {
        return exposicaoSelecionada;
    }

    public CandidaturaExposicao getCandidaturaCriada() {
        return c;
    }
}
