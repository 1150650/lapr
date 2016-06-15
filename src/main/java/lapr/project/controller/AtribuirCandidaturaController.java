package lapr.project.controller;

import javax.swing.JOptionPane;
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
        this.expo.getListaCandidaturas();
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
        if(indice==0){
            m=new MecanismoCargaEquitativaPorFAE(lstCandidaturas, listaFae);
        }
        else if(indice==1){
            m=new MecanismoExperienciaPorFAE(lstCandidaturas, listaFae);
        }
        else if(indice==2){
            m=new MecanismoNumeroFAEPorCandidatura(lstCandidaturas, listaFae);
        }
    }

    public boolean registaAtribuições() {
        expo.setAtribuicoes(getLstAtribuicoes());
        return expo.getExposicaoEstado().setCandidaturasAtribuidas();
    }

    /**
     * @return the lstAtribuicoes
     */
    public ListaAtribuicoes getLstAtribuicoes() {
        return lstAtribuicoes;
    }
    
    

}
