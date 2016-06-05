package lapr.project.controller;

import java.util.List;
import javax.swing.JList;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaExposicoes;
import lapr.project.model.Utilizador;


public class CriarCandidaturaController {

    private CentroExposicoes centroExposicoes;
    private ListaCandidaturas listaCandidaturas;
    private Exposicao exposicaoSelecionada;
    private Candidatura c;
    private Utilizador u;

    public CriarCandidaturaController(CentroExposicoes ce, Utilizador u) {
        this.centroExposicoes = ce;
        this.u=u;

    }

    public ListaExposicoes getListaExposicoes() {
        return centroExposicoes.getListaExposicoes();
    }

    public void selecionaExposicao(Exposicao e) {
        exposicaoSelecionada = e;
    }

    public void getListaCandidaturas() {
        listaCandidaturas = exposicaoSelecionada.getListaCandidaturas();
    }

    public void novaCandidatura() {
        c = listaCandidaturas.novaCandidatura();
    }

    public void setDados(Candidatura candidatura, String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int nConvites,Utilizador representante) {
        this.c = candidatura;
        this.c.setNomeEmpresa(nomeEmpresa);
        this.c.setMorada(morada);
        this.c.setTelemovel(telemovel);
        this.c.setAreaPretendida(areaPretendida);
        this.c.setProdutos(produtos);
        this.c.setQuantidadeConvites(nConvites);
        this.c.setRepresentante(representante);

    }

    public void adicionarCandidatura() {
        this.exposicaoSelecionada.adicinarCanidatura(c);
    }

    public void criarListaCandidaturas() {
        listaCandidaturas = new ListaCandidaturas();
    }


}
