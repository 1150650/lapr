package lapr.project.model;

import java.util.Date;

public class Exposicao {

    private String titulo;
    private String textoDescritivo;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    private ListaCandidaturas listaCandidaturasExposicoes,listaCandidaturasDemonstracoes ;
    private ListaDemonstracoes listaDemonstracao;
    private ListaFAE listaFAE;
    private ExposiçãoState m_state;
    private ListaOrganizadores listaOrganizadores;
    private ListaConflitos listaConflitos;
    private RegistoRepresentantes lstRep;

    public Exposicao() {
        listaCandidaturasExposicoes = new ListaCandidaturas();
        listaFAE = new ListaFAE();
    }

    public Exposicao(String titulo, String textoDescritivo, Date dataInicio, Date dataFim, String local) {
        setTitulo(titulo);
        setTextoDescritivo(textoDescritivo);
        setPeriodo(dataInicio, dataFim);
        setLocal(local);
        listaCandidaturasExposicoes = new ListaCandidaturas();
        listaFAE = new ListaFAE();
        listaDemonstracao = new ListaDemonstracoes();
        listaCandidaturasDemonstracoes=new ListaCandidaturas();
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

    public ListaCandidaturas getListaCandidaturasExposicoes() {
        return listaCandidaturasExposicoes;
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

    public final void setListaCandidaturasExposicoes(ListaCandidaturas listaCandidaturasExposicoes) {
        this.listaCandidaturasExposicoes = listaCandidaturasExposicoes;
    }

    @Override
    public String toString() {
        return String.format("Título: %s; Local: %s", titulo, local);
    }

    public void adicinarCanidatura(Candidatura d) {
        this.listaCandidaturasExposicoes.adicionarCandidatura(d);

    }

    public Candidatura[] mostrarLista() {
        Candidatura[] string = new Candidatura[listaCandidaturasExposicoes.tamanho()];

        int tamanho = listaCandidaturasExposicoes.tamanho();
        for (int i = 0; i < tamanho; i++) {

            string[i] = listaCandidaturasExposicoes.obterCandidatura(i);
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

    public ExposiçãoState getExposicaoEstado() {
        return m_state;
    }

    public void setCandidaturasAtribuidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setExposicaoCriada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setFAEDefinido() {
        return m_state.setFAEDefinido();
    }

    public void setEstado(ExposiçãoState m_state2) {
        this.m_state = m_state2;
    }

    /**
     * @return the lstRep
     */
    public RegistoRepresentantes getLstRep() {
        return lstRep;
    }

    public void adicionarRepresentante(Representante r) {
        lstRep.addRepresentante(r);
    }
    
      public ListaCandidaturas getListaCandidaturasDemonstracoes() {
        return listaCandidaturasDemonstracoes;
    }

    public void setListaCandidaturasDemonstracoes(ListaCandidaturas listaCandidaturasDemonstracoes) {
        this.listaCandidaturasDemonstracoes = listaCandidaturasDemonstracoes;
    }

    public ListaDemonstracoes getListaDemonstracao() {
        return listaDemonstracao;
    }

    public void setListaDemonstracao(ListaDemonstracoes listaDemonstracao) {
        this.listaDemonstracao = listaDemonstracao;
    }

}
