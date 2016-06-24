package lapr.project.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Exposicao")
public class Exposicao {

    private String titulo;
    private String textoDescritivo;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    private ListaCandidaturas listaCandidaturasExposicoes, listaCandidaturasDemonstracoes;
    private ListaDemonstracoes listaDemonstracao;
    @XmlElement
    private ListaFAE listaFAE;
    @XmlElement
    private ExposiçãoState m_state;
    @XmlElement
    private ListaOrganizadores listaOrganizadores;
    @XmlElement
    private ListaConflitos listaConflitos;
    private ListaAtribuicoes lstAtribuicoes;
    @XmlElement
    private RegistoRepresentantes listaRepresentantes;

    public Exposicao() {
        listaCandidaturasExposicoes = new ListaCandidaturas();
        listaFAE = new ListaFAE();
        listaDemonstracao = new ListaDemonstracoes();
        listaCandidaturasDemonstracoes = new ListaCandidaturas();
        listaRepresentantes = new RegistoRepresentantes();
        listaOrganizadores = new ListaOrganizadores();
        lstAtribuicoes = new ListaAtribuicoes();
        m_state = new ExposiçãoCriadaState(this);
    }

    public Exposicao(String titulo, String textoDescritivo, Date dataInicio, Date dataFim, String local) {
        setTitulo(titulo);
        setTextoDescritivo(textoDescritivo);
        setPeriodo(dataInicio, dataFim);
        setLocal(local);
        listaCandidaturasExposicoes = new ListaCandidaturas();
        listaFAE = new ListaFAE();
        listaDemonstracao = new ListaDemonstracoes();
        listaCandidaturasDemonstracoes = new ListaCandidaturas();
        listaRepresentantes = new RegistoRepresentantes();
        listaOrganizadores = new ListaOrganizadores();
        lstAtribuicoes = new ListaAtribuicoes();
        m_state = new ExposiçãoCriadaState(this);
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

    @XmlElement
    public final void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido!");
        }
        this.titulo = titulo;
    }

    @XmlElement
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
        setDataInicio(dataInicio);
        setDataFim(dataFim);
    }

    @XmlElement
    public final void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    @XmlElement
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @XmlElement
    public final void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
            throw new IllegalArgumentException("Local inválido!");
        }
        this.local = local;
    }

    @XmlElement
    public final void setListaCandidaturasExposicoes(ListaCandidaturas listaCandidaturasExposicoes) {
        this.listaCandidaturasExposicoes = listaCandidaturasExposicoes;
    }

    @Override
    public String toString() {
        return String.format("Título: %s; Local: %s", titulo, local);
    }

    public void adicionarCandidatura(CandidaturaExposicao d) {
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

    /**
     * @return the listaRepresentantes
     */
    public RegistoRepresentantes getListaRepresentantes() {
        return listaRepresentantes;
    }

    public void adicionarRepresentante(Representante r) {
        listaRepresentantes.addRepresentante(r);
    }

    public ListaCandidaturas getListaCandidaturasDemonstracoes() {
        return listaCandidaturasDemonstracoes;
    }

    private boolean validaAtribuicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListaDemonstracoes getListaDemonstracao() {
        return listaDemonstracao;
    }

    @XmlElement
    public void setListaCandidaturasDemonstracoes(ListaCandidaturas listaCandidaturasDemonstracoes) {
        this.listaCandidaturasDemonstracoes = listaCandidaturasDemonstracoes;
    }

    @XmlElement
    public void setListaDemonstracao(ListaDemonstracoes listaDemonstracao) {
        this.listaDemonstracao = listaDemonstracao;
    }

    @XmlElement
    public void setListaAtribuicoes(ListaAtribuicoes lstA) {
        this.lstAtribuicoes = lstA;
    }

    public ListaAtribuicoes getListaAtribuicoes() {
        return lstAtribuicoes;
    }

    public boolean setAtribuicoes(ListaAtribuicoes listaAtribuicao) {
        return validaAtribuicao();
    }

    public ExposiçãoState getExposicaoEstado() {
        return m_state;
    }

    public void setEstado(ExposiçãoState m_state2) {
        m_state = m_state2;
    }

    public boolean setExposicaoCriada() {
        return m_state.setExposicaoCriada();
    }

    public boolean setExposicaoDemonstracoesSemFAE() {
        return m_state.setDemonstracoesSemFAE();
    }

    public boolean setExposicaoFAESemDemonstracoes() {
        return m_state.setExposicaoFAESemDemonstracoes();
    }

    public boolean setExposicaoCompleta() {
        return m_state.setExposicaoCompleta();
    }

    public boolean setExposicaoAbertaParaCandidaturas() {
        return m_state.setExposicaoAbertaParaCandidaturas();
    }

    public boolean setExposicaoCandidaturasFechadas() {
        return m_state.setExposicaoCandidaturasFechadas();
    }

    public boolean setExposicaoCandidaturaConflitosDetetados() {
        return m_state.setExposicaoCandidaturasConflitosDetetados();
    }

    public boolean setExposicaoCandidaturaConflitosAlterados() {
        return m_state.setExposicaoCandidaturasConflitosAlterados();
    }

    public boolean setExposicaoCandidaturasAtribuidas() {
        return m_state.setExposicaoCandidaturasAtribuidas();
    }

    public boolean setExposicaoCandidaturasAvaliadas() {
        return m_state.setExposicaoCandidaturasAvaliadas();
    }

    public boolean setExposicaoCandidaturasAtribuidasStand() {
        return m_state.setExposicaoCandidaturasAtribuidasStand();
    }

    public boolean setExposicaoStandsConfirmados() {
        return m_state.setExposicaoStandsConfirmados();
    }

    public boolean setExposicaoDemonstracoesDefinidas() {
        return m_state.setExposicaoDemonstracoesDefinidas();
    }

    public boolean setExposicaoAbertaCandDemonstracao() {
        return m_state.setExposicaoAbertaCandidaturasDemonstracoes();
    }

    public boolean setExposicaoFechadaCandDemonstracao() {
        return m_state.setExposicaoFechadaCandidaturasDemonstracoes();
    }

    public boolean setExposicaoConflitosDetetadosDemonstracao() {
        return m_state.setExposicaoConflitosDemonstracoesDetetados();
    }

    public boolean setExposicaoConflitosAlteradosDemonstracao() {
        return m_state.setExposicaoConflitosDemonstracoesAlterados();
    }

    public boolean setExposicaoCandidaturasDemonstracaoAtribuidas() {
        return m_state.setExposicaoDemonstracoesAtribuidas();
    }

    public boolean setExposicaoCandidaturasDemonstracaoAvaliadas() {
        return m_state.setExposicaoCandidaturasAvaliadas();
    }

    public boolean setExposicaoCandidaturasDemonstracaoAceites() {
        return m_state.setCandidaturasDemonstracoesAceites();
    }

}
