/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author SimãoPedro
 */
public class DecidirDemonstraçõesController {

    /**
     * Registo de exposicoes (Lista)
     */
    private RegistoExposicoes lstExpo;

    private CentroExposicoes ce;

    /**
     * Exposicao que vai ser selecionada
     */
    private Exposicao expo;

    /**
     * Demonstracao selecionada
     */
    private Demonstracao demonstraccao;

    /**
     * Lista demonstracoes da exposicao selecionada
     */
    private ListaDemonstracoes lstDemo;

    /**
     * Construtor do controller recebendo CE como parametro
     *
     * @param ce
     */
    public DecidirDemonstraçõesController(CentroExposicoes ce) {
        this.lstExpo = ce.getListaExposicoes();
    }

    /**
     * Exposição selecionada
     *
     * @param e
     */
    public void selecionarExposicao(Exposicao e) throws Exception {
        this.expo = e;
        validarExposicao();
        
    }

    /**
     * vai buscar a lista de demonstraçoes da expo selecionada
     */
    public void getListaDemonstracoes() {
        this.setLstDemo(getExpo().getListaDemonstracoes());
    }

    /**
     * Seleciona a demonstração que irá ser deccidida
     *
     * @param demo
     */
    public void selecionarDemonstracao(Demonstracao demo) {
        this.demonstraccao = demo;
    }

    /**
     * Apresenta os dados da demonstracoes
     *
     * @return
     */
    public String apresentarDados() {
        return getDemonstraccao().toString();
    }

    /**
     * Altera o estado da demonstracao ara para aberta a candidaturas
     *
     * @return
     */
    public boolean setDemonstracaoAberta() {
        return getDemonstraccao().setDemonstracaoCriada();
    }

    /**
     * Altera o estado da exposicao para demonstracoes definidas
     *
     * @return
     */
    public boolean setExposicaoDemonstracaoDefinidas() {
        return getExpo().getExposicaoEstado().setDemonstracoesSemFAE();
    }

    /**
     * @return the lstDemo
     */
    public ListaDemonstracoes getLstDemo() {
        return lstDemo;
    }

    /**
     * @param lstDemo the lstDemo to set
     */
    public void setLstDemo(ListaDemonstracoes lstDemo) {
        this.lstDemo = lstDemo;
    }

    /**
     * @return the demonstraccao
     */
    public Demonstracao getDemonstraccao() {
        return demonstraccao;
    }

    /**
     * @return the expo
     */
    public Exposicao getExpo() {
        return expo;
    }

    private void validarExposicao() throws Exception {
        if(!expo.getExposicaoEstado().isEstadoStandConfirmado()){
            throw new Exception("Esta Exposição ainda não pode ser Definidas as Demonstrações");
        }
    }
}
