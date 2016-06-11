package lapr.project.controller;

import javax.swing.JOptionPane;
import lapr.project.model.*;

public class AtribuirCandidaturaController {

    private Exposicao exposicaoSelecionada;

    private ListaFAE listaFae;

    private ListaCandidaturas lstCandidaturas;

    private ListaAtribuicoes lstAtribuicoes;

    private Mecanismo m;

    public AtribuirCandidaturaController(Exposicao expo) {
        setExposicao(expo);
        setListaFAE(exposicaoSelecionada.getListaFAE());
        setListaCandidaturas(exposicaoSelecionada.getListaCandidaturas());

    }

    private void setExposicao(Exposicao expo) {
        this.exposicaoSelecionada = expo;
    }

    private void setListaFAE(ListaFAE listaFAE) {
        this.listaFae = listaFAE;
    }

    private void setListaCandidaturas(ListaCandidaturas listaCandidatura) {
        this.lstCandidaturas = listaCandidatura;
    }

    public Exposicao getExposicaoSelecionada() {
        return exposicaoSelecionada;
    }

    public ListaFAE getListaFAESelecionada() {
        return listaFae;
    }

    public ListaCandidaturas getlstCandidaturas() {
        return lstCandidaturas;
    }

    public void selecionarMecanismo(int indice) {

    }

}
