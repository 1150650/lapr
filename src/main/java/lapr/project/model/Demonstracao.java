/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Node;

/**
 *
 * @author JOAO
 */
@XmlRootElement
public class Demonstracao implements Exportable, Importable<Demonstracao> {

    /**
     * o codigo da demonstracao
     */
    private int Codigo;

    /**
     * a descricao da demonstracao
     */
    private String descricao;

    /**
     * a lista de recursos da demonstracao
     */
    private ListaRecursos listalRecursos;

    /**
     * o nº da demonstracao
     */
    private static int codigo = 1;

    private DemonstracaoState state;

    /**
     * Cria uma instancia de Demonstracao
     */
    public Demonstracao(String descricao) {
        Codigo = codigo;
        setDescricao(descricao);
        listalRecursos = new ListaRecursos();
        codigo++;
    }

    public Demonstracao() {
        listalRecursos = new ListaRecursos();
        Codigo = codigo;
        codigo++;
    }

    /**
     * Metodo que retorna o codigo da demonstracao
     *
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Metodo que retorna a descricao da demonstracao
     *
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Metodo que retorna a lista de recursos da exposicao
     *
     * @return the listalRecursos
     */
    @XmlElement
    public ListaRecursos getListalRecursos() {
        return listalRecursos;
    }

    /**
     * Metodo que altera a descricao da demonstracao
     *
     * @param descricao - a nova descricao da demonstracao
     */
    @XmlElement
    public void setDescricao(String descricao) {
        if (!descricao.equalsIgnoreCase("")) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("Insira uma descrição");
        }
    }

    /**
     * Metodo que altera a lista de recursos da demonstracao
     *
     * @param r - a nova lista de recursos da demonstracao
     */
    public void addRecurso(Recurso r) {
        listalRecursos.addRecurso(r);
    }

    @Override
    public String toString() {
        return "Demonstração:" + descricao + "   " + Codigo;
    }

    /**
     * Metodo que altera o codigo da demonstracao
     *
     * @param Codigo - o novo condigo da demonstracao
     */
    @XmlElement
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public Node exportContentToXMLNode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Demonstracao importContentFromXMLNode(Node node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DemonstracaoState getEstado() {
        return state;
    }

    public void setEstado(DemonstracaoState state) {
        this.state = state;
    }

    public boolean setDemonstracaoCriada() {
        return state.setDemonstracaoCriada();
    }

    public boolean setDemonstracaoAbertaCandidaturas() {
        return state.setAbertaACandidaturas();
    }

    public boolean setDemonstracaoCandidaturaAceite() {
        return state.setCandidaturaAceite();
    }

    public boolean setDemonstracaoCandidaturaAvaliada() {
        return state.setCandidaturaAvaliada();
    }

    public boolean setDemonstracaoCandidaturaEmAvaliacao() {
        return state.setCandidaturaEmAvaliacao();
    }

    public boolean setDemonstracaoCandidaturaNaoAvaliada() {
        return state.setCandidaturaNaoAvaliada();
    }

    public boolean setCandidaturaRejeitada() {
        return state.setCandidaturaRejeitada();
    }

    public boolean setCandidaturaRetirada() {
        return state.setCandidaturaRetirada();
    }

    public boolean setCandidaturasAtribuidas() {
        return state.setCandidaturasAtribuidas();
    }

    public boolean setCandidaturasEmSubmissao() {
        return state.setCandidaturasEmSubmissao();
    }

    public boolean setConflitosCandidaturaAlterados() {
        return state.setConflitosCandidaturaAlterados();
    }

    public boolean setConflitosCandidaturaDetetados() {
        return state.setConflitosCandidaturaDetetados();
    }

    public boolean setDemonstracaoAprovada() {
        return state.setDemonstracaoAprovada();
    }

    public boolean setDemonstracaoFechadaACandidaturas() {
        return state.setFechadaACandidaturas();
    }

}
