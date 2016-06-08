
package lapr.project.controller;

import javax.swing.JOptionPane;
import lapr.project.model.*;


public class AtribuirCandidaturaController {

    private Exposicao exposicaoSelecionada;

    private ListaFAE listaFae;

    private ListaCandidaturas lstCandidaturas;

    private ListaAtribuicoes lstAtribuicoes;

    public AtribuirCandidaturaController(Exposicao expo) {
        setExposicao(expo);
        setListaFAE(exposicaoSelecionada.getListaFAE());
        setListaCandidaturas(exposicaoSelecionada.getListaCandidatura());
        
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

    public String mostrarLista(int opcao) {
        MecanismoSelecionado(opcao);
        String string = new String();

        for (int i = 0; i < lstAtribuicoes.tamanho(); i++) {
            string = string + lstAtribuicoes.obterAtribuiçao(i).toString() + "\n";
            //string = String.format("%s%n%s",string, lstAtribuicoes.obterAtribuiçao(i).toString());
        }
        return string;
    }

    public int verificarIndex(String index) {
        int opcao;
        if ("Atribuir de forma Equitativa".equalsIgnoreCase(index)) {
            opcao = 0;
        } else if ("Atribuir Numero Igual de Candidaturas aos FAE".equalsIgnoreCase(index)) {
            opcao = 2;
        } else {
            opcao = 1;
        }
        return opcao;
    }

    public void atribuicoesDeFAE() {
        for(int i=0;i<lstAtribuicoes.tamanho();i++){
            FAE aux = lstAtribuicoes.obterAtribuiçao(i).getFAE();
            Atribuicao aux1 = lstAtribuicoes.obterAtribuiçao(i);
            aux.adicionarAtribuicao(aux1);
        }
    }

}
