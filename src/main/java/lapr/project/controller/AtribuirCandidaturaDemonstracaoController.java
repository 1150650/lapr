/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaFAE;
import lapr.project.model.Mecanismo;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoMecanismos;
import lapr.project.model.Representante;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class AtribuirCandidaturaDemonstracaoController {

    /**
     * Registo de Exposições
     */
    private RegistoExposicoes registoExposicoes;

    /**
     * Centro de Exposicoes
     */
    private CentroExposicoes centroExposicoes;

    /**
     * Lista de Exposicoes do tipo List
     */
    private List<Exposicao> listaExposicao;

    /**
     * Lista de FAE do tipo List
     */
    private ListaFAE listaFAE;

    /**
     * Lista de FAE do tipo List
     */
    private List<FAE> listFAEs;

    /**
     * Exposicao
     */
    private Exposicao exposicao;

    /**
     * Lista de Candidaturas
     */
    private ListaCandidaturas listaCandidaturas;

    /**
     * Lista de Mecanismos
     */
    private RegistoMecanismos registoMecanismos;

    /**
     * Lista de Mecanismos tipo List
     */
    private List<Mecanismo> listaMecanismos;

    /**
     * Mecanismo
     */
    private Mecanismo mecanismo;

    /**
     * Lista de Atribuicoes
     */
    private ListaAtribuicoes listaAtribuicao;

    /**
     * Representante
     */
    private Representante representante;

    /**
     * Construtor de Controller
     *
     * @param centroExposicoes Centro de Exposicoes
     */
    public AtribuirCandidaturaDemonstracaoController(CentroExposicoes centroExposicoes) {
        this.centroExposicoes = centroExposicoes;
    }

    /**
     * Altera o Parametro Representante
     *
     * @param representante novo Representantes
     */
    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    /**
     * Retorna Lista de FAE do tipo LiST
     *
     * @param exposicao Exposicao
     * @return List de FAE
     */
    public List getListaFAE(Exposicao exposicao) {
        this.exposicao = exposicao;
        listaFAE = this.exposicao.getListaFAE();
        return listFAEs = listaFAE.getListaFAEs();
    }

    /**
     * Retorna Lista de Candidaturas
     *
     * @return Lista de Candidaturas
     */
    public ListaCandidaturas getListaCandidatura() {
        listaCandidaturas = representante.getListaCandidaturasDemonstracao();
        return listaCandidaturas;
    }

    /**
     * Retorna Lista de Mecanismos
     *
     * @return list de Mecanismos
     */
    public List getRegistoMecanismos() {
        registoMecanismos = centroExposicoes.getRegistoMecanismos();
        return listaMecanismos = registoMecanismos.getListaMecanismos();
    }

    /**
     * Selecionar o Mecanismo
     *
     * @param mecanismo Mecanismo
     */
    public void selecionaMecanismo(Mecanismo mecanismo) {
        this.mecanismo = mecanismo;
        listaAtribuicao = mecanismo.atribuirCandidaturasAFAE(listaCandidaturas, listaFAE);

    }

    /**
     * Regista as Atribuições
     */
    public void registaAtribuicao() {
        exposicao.setAtribuicoes(listaAtribuicao);
    }

    /**
     * Altera estado da Exposição
     */
    public void setCandidaturasAtribuidas() {
        exposicao.setExposicaoCandidaturasAtribuidas();
    }

}
