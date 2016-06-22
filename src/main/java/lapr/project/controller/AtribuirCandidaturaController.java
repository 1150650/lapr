package lapr.project.controller;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JD;
import lapr.project.model.*;

public class AtribuirCandidaturaController {

    private Exposicao expo;

    private ListaFAE listaFae;

    private RegistoExposicoes lstExpo;

    private CentroExposicoes ce;

    private ListaCandidaturas lstCandidaturas;

    private ListaAtribuicoes lstAtribuicoes;

    private Mecanismo m;

    public AtribuirCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
        this.lstExpo = ce.getListaExposicoes();
    }

    public void selecionarExposicao(Exposicao expo) {
        this.expo = expo;
    }

    public void getListaFAE() {
        this.listaFae = expo.getListaFAE();
    }

    public void getListaCandidatura() {
        this.expo.getListaCandidaturasExposicoes();
    }

    public Exposicao getExposicaoSelecionada() {
        return expo;
    }

    public ListaFAE getListaFAESelecionada() {
        return listaFae;
    }

    public ListaCandidaturas getlstCandidaturas() {
        return lstCandidaturas;
    }

    public void selecionarMecanismo(int indice) {
        if (indice == 1) {
            m = new MecanismoCargaEquitativaPorFAE(lstCandidaturas, listaFae);
        } else if (indice == 2) {
            m = new MecanismoExperienciaPorFAE(lstCandidaturas, listaFae);
        } else if (indice == 3) {
            int nPorfae = Integer.parseInt(JOptionPane.showInputDialog("Numero de Candidaturas por Fae"));
            m = new MecanismoNumeroFAEPorCandidatura(lstCandidaturas, listaFae, nPorfae);
        }
    }

    public void registaAtribuições() {
        expo.setAtribuicoes(getLstAtribuicoes());
        for (int j = 0; j < lstAtribuicoes.tamanho(); j++) {
            lstAtribuicoes.obterAtribuiçao(j).getFAE().adicionarCandidatura(lstAtribuicoes.obterAtribuiçao(j).getCandidatura());
            lstAtribuicoes.obterAtribuicao(j).getFAE().aumentarExperienciaFAE();
            lstAtribuicoes.obterAtribuiçao(j).getCandidatura().getState().setAtribuida();
        }
        expo.getExposicaoEstado().setCandidaturasAtribuidas();
    }

    /**
     * @return the lstAtribuicoes
     */
    public ListaAtribuicoes getLstAtribuicoes() {
        return lstAtribuicoes;
    }

}
