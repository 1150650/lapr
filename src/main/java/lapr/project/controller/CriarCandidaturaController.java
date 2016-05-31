package lapr.project.controller;

import java.util.List;
import javax.swing.JList;
import pprog.model.Candidatura;
import pprog.model.CentroExposicoes;
import pprog.model.Exposicao;
import pprog.model.ListaCandidaturas;
import pprog.model.ListaExposicoes;

public class CriarCandidaturaController {

    private CentroExposicoes centroExposicoes;
    private ListaCandidaturas listaCandidaturas;
    private Exposicao exposicaoSelecionada;
    private Candidatura c;

    public CriarCandidaturaController(CentroExposicoes ce) {
        this.centroExposicoes = ce;

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

    public void setDados(Candidatura candidatura, String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int nConvites) {
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
    }

    public void criarListaCandidaturas() {
        listaCandidaturas = new ListaCandidaturas();
    }


}
