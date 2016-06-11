package lapr.project.model;

import java.util.Date;

public class Exposicao {

    private String titulo;
    private String textoDescritivo;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    private ListaCandidaturas listaCandidaturas;
    private ListaDemonstracoes listaDemonstracao;
    private ListaFAE listaFAE;
    private ExposiçãoState m_state;
    private ListaOrganizadores listaOrganizadores;
    private ListaConflitos listaConflitos;

    public Exposicao() {
        listaCandidaturas = new ListaCandidaturas();
        listaFAE = new ListaFAE();
    }

    public Exposicao(String titulo, String textoDescritivo, Date dataInicio, Date dataFim, String local) {
        setTitulo(titulo);
        setTextoDescritivo(textoDescritivo);
        setPeriodo(dataInicio, dataFim);
        setLocal(local);
        listaCandidaturas = new ListaCandidaturas();
        listaFAE = new ListaFAE();
        listaDemonstracao = new ListaDemonstracoes();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTextoDescritivo() {
        return textoDescritivo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public String getLocal() {
        return local;
    }

    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracao;
    }

    public ListaFAE getListaFAE() {
        return listaFAE;
    }

    public final void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido!");
        }
        this.titulo = titulo;
    }

    public final void setTextoDescritivo(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Justificação inválida!");
        }
        this.textoDescritivo = texto;
    }

    public final void setPeriodo(Date dataInicio, Date dataFim) {
        if (dataInicio.after(dataFim) || dataInicio.equals(dataFim)) {
            throw new IllegalArgumentException("A data de Início deve ser anterior à data de Fim!");
        }
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public final void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
            throw new IllegalArgumentException("Local inválido!");
        }
        this.local = local;
    }

    public final void setListaCandidaturas(ListaCandidaturas listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    @Override
    public String toString() {
        return String.format("Título: %s; Local: %s", titulo, local);
    }

    public void adicinarCanidatura(Candidatura d) {
        this.listaCandidaturas.adicionarCandidatura(d);

    }

    public Candidatura[] mostrarLista() {
        Candidatura[] string = new Candidatura[listaCandidaturas.tamanho()];

        int tamanho = listaCandidaturas.tamanho();
        for (int i = 0; i < tamanho; i++) {

            string[i] = listaCandidaturas.obterCandidatura(i);
        }
        return string;
    }

    public ListaOrganizadores getListaOrganizadores() {
        return listaOrganizadores;
    }

    ListaConflitos getListaConflitos() {
        return listaConflitos;
    }

    public boolean setAtribuicoes(ListaAtribuicoes listaAtribuicao) {
        return validaAtribuicao();
    }

    private boolean validaAtribuicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setCandidaturasAtribuidas() {
        return m_state.setCandidaturasAtribuidas();
    }
}
