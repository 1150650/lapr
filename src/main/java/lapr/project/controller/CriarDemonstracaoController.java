/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author JOAO
 */
public class CriarDemonstracaoController {

    /**
     * Lista de Exposicoes
     */
    private RegistoExposicoes registoExposicoes;
    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;
    /**
     * Demonstração
     */
    private Demonstracao demonstracao;

    /**
     * Exposicao
     */
    private Exposicao exposicao;

    /**
     * Criar Construtor de Demonstrações
     *
     * @param centroexpo
     */
    public CriarDemonstracaoController(CentroExposicoes centroexpo) {
        this.centroExposicoes = centroexpo;
    }

    /**
     * Seleciona Exposicaos
     *
     * @param exposicao
     */
    public void selecionarExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    /**
     * Nova Demonstracaos
     */
    public void novaDemonstracao() {
        demonstracao = new Demonstracao();
    }

    /**
     * Altera a descrição
     *
     * @param Descricao
     */
    public void setDados(String Descricao) {
        demonstracao.setDescricao(Descricao);
    }

    /**
     * Retorna a Lista de Recursos
     *
     * @return Lista de Recursos
     */
    public ListaRecursos getListaRecursos() {
        return centroExposicoes.getRegistoRecursos();
    }

    /**
     * Adiciona um Recurso
     *
     * @param r Recurso
     */
    public void adicionarRecurso(Recurso r) {
        demonstracao.addRecurso(r);
    }

    /**
     * Valida e Regist a Demonsração
     */
    public void validaRegistaDemonstracao() {
        demonstracao.setDemonstracaoCriada();
        exposicao.getListaDemonstracoes().addDemonstracao(demonstracao);
    }

    /**
     * Retorna Array de Exposicao
     *
     * @return array Exposicao
     */
    public Exposicao[] getListaExposicoes() {
        return this.centroExposicoes.getArrayExposicao();
    }
}
