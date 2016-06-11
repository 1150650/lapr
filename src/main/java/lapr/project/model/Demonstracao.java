/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author JOAO
 */
public class Demonstracao {

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

    /**
     * Cria uma instancia de Demonstracao
     */
    public Demonstracao() {
        Codigo = codigo;
        descricao = "";
        listalRecursos = new ListaRecursos();
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
    public ListaRecursos getListalRecursos() {
        return listalRecursos;
    }

    public String getDados() {
        return descricao;
    }

    /**
     * Metodo que altera a descricao da demonstracao
     *
     * @param descricao - a nova descricao da demonstracao
     */
    public void setDados(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Metodo que altera a lista de recursos da demonstracao
     *
     * @param r - a nova lista de recursos da demonstracao
     */
    public void setRecurso(Recurso r) {
        getListalRecursos().addRecurso(r);
    }

    /**
     * Metodo que altera o codigo da demonstracao
     *
     * @param Codigo - o novo condigo da demonstracao
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * Metodo que retorna uma descricao textual da demonstracao
     *
     * @return descricao da demonstracao
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
