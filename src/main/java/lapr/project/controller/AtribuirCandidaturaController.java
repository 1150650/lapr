package lapr.project.controller;

import javax.swing.JOptionPane;
import lapr.project.model.*;

//REVER
public class AtribuirCandidaturaController {

    private Exposicao exposicaoSelecionada;

    private ListaFAE listaFae;

    private ListaCandidaturas lstCandidaturas;

    private ListaAtribuicoes lstAtribuicoes;

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

    /*
    public void mecanismoSelecionado(int indice) {
        lstAtribuicoes = new ListaAtribuicoes();
        if (indice == 0) {
            lstAtribuicoes.CargaEquitativaPorFAE(lstCandidaturas, listaFae);
        }
        if (indice == 1) {
            lstAtribuicoes.ExperienciaPorFAE(lstCandidaturas, listaFae);
        }
        if (indice == 2) {
            int nPorfae = Integer.parseInt(JOptionPane.showInputDialog("Numero de Candidaturas por Fae"));
            lstAtribuicoes.NumeroFAEporCandidatura(lstCandidaturas, listaFae, nPorfae);
        }
    }
     */
    
}
