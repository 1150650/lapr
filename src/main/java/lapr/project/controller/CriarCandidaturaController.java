package lapr.project.controller;

import java.util.List;
import javax.swing.JList;
import lapr.project.model.Candidatura;
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
    private Candidatura c;
    private Representante r;
    
    public CriarCandidaturaController(CentroExposicoes ce, Representante r) {
        this.centroExposicoes = ce;
        this.r = r;
        
    }
    
    public RegistoExposicoes getListaExposicoes() {
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
    
    public void setDados(Candidatura candidatura, String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int nConvites, Utilizador representante) {
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
    
}
