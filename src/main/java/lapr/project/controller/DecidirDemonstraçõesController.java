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
    public void selecionarExposicao(Exposicao e) {
        this.expo = e;
    }

    /**
     * vai buscar a lista de demonstraçoes da expo selecionada
     */
    public void getListaDemonstracoes() {
        this.lstDemo = expo.getListaDemonstracoes();
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
        return demonstraccao.toString();
    }

    /**
     * Altera o estado da demonstracao ara para aberta a candidaturas
     *
     * @return
     */
    public boolean setDemonstracaoAberta() {
        return demonstraccao.setDemonstracaoAberta();
    }

    /**
     * Altera o estado da exposicao para demonstracoes definidas
     *
     * @return
     */
    public boolean setExposicaoDemonstracaoDefinidas() {
        return expo.getExposicaoEstado().setExposicaoDemonstracaoDefinidas();
    }

}
