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

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas listaCandidaturas;

    /**
     * Lista de Demonstracoes
     */
    private ListaDemonstracoes lstDemo;

    /**
     * Exposicao
     */
    private Exposicao exposicaoSelecionada;

    /**
     * Candidatura a Exposicao
     */
    private CandidaturaExposicao c;

    /**
     * Representante
     */
    private Representante r;

    /**
     * Utilizador
     */
    private Utilizador u;

    /**
     * Construtor do Controller
     *
     * @param ce
     * @param u
     */
    public CriarCandidaturaExposicaoController(CentroExposicoes ce, Utilizador u) {
        this.centroExposicoes = ce;
        this.u = u;

    }

    /**
     * Retorna o Registo de Exposicoes
     *
     * @return lista de Exposicoes
     */
    public RegistoExposicoes getListaExposicoes() {
        return centroExposicoes.getListaExposicoes();
    }

    /**
     * Seleciona a Exposicao
     *
     * @param e Exposicao
     */
    public void selecionaExposicao(Exposicao e) {
        exposicaoSelecionada = e;
        this.r = verificarRepresentante();
        this.lstDemo = exposicaoSelecionada.getListaDemonstracoes();
        this.listaCandidaturas = exposicaoSelecionada.getListaCandidaturasExposicoes();
    }

    /**
     * Criar uma nova candidatura
     */
    public void novaCandidatura() {
        c = new CandidaturaExposicao();
    }

    /**
     * Altera os Parametros para os parametros recebidos
     *
     * @param nomeEmpresa
     * @param morada
     * @param telemovel
     * @param areaPretendida
     * @param produtos
     * @param nConvites
     * @param Keywords
     */
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

    /**
     * Adiciona a Candidatura a desvidas Referenciass
     */
    public void adicionarCandidatura() {
        c.setCandidaturaEmSubmissao();
        this.exposicaoSelecionada.adicionarCandidatura(c);
        this.exposicaoSelecionada.adicionarRepresentante(r);
        this.r.getListaCandidaturasSubmetidas().adicionarCandidatura(c);
    }

    /**
     * Retorna o Representante com Base no Utilizador
     *
     * @return Representante
     *
     */
    private Representante verificarRepresentante() {
        return exposicaoSelecionada.getListaRepresentantes().obterRepresentantePorU(u);
    }

    /**
     * Retorna o Representante
     *
     * @return Representante
     */
    public Representante getRepresentante() {
        return r;
    }

    /**
     * Retorna a Lista de Candidaturas
     *
     * @return Lista de Candidaturas
     */
    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Retorna a lista de Demonstracoes
     *
     * @return lista Demonstracoes
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return lstDemo;
    }

    /**
     * Retorna a Exposicao Selecionada
     *
     * @return Exposicao
     */
    public Exposicao getExposicaoSelecionada() {
        return exposicaoSelecionada;
    }
    
    /**
     * Retorna a Candidatura a Exposicao Criada
     * @return candidatura Criada
     */
    public CandidaturaExposicao getCandidaturaCriada() {
        return c;
    }
}
