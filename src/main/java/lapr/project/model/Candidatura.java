package lapr.project.model;

public class Candidatura {

    private CandidaturaState state;

    /**
     * Lista de Avalialões de uma candidatura
     */
    private ListaAvaliacoes listaAvaliacao;

    /**
     * Nome da empresa que se candidata
     */
    private String nomeEmpresa;

    /**
     * Morada da empresa que se candidata
     */
    private String morada;

    /**
     * Numero de telemovel da empresa
     */
    private int telemovel;

    /**
     * Produtos que a empresa vai expor
     */
    private String produtos;

    /*+
    Numero de convites necessários
     */
    private int quantidadeConvites;

    /**
     * Avaliacao do FAE
     */
    private int[] avalicaoFAE;

    /**
     * Stand
     */
    private Stand stand;

    /**
     * Construtor de Candidatura Sem Parametros
     */
    public Candidatura() {
        this.listaAvaliacao = new ListaAvaliacoes();
        state = new CandidaturaAbertaState(this);
        this.avalicaoFAE = new int[5];

    }

    /**
     * Construtor com parametros de um objeto do tipo Candidatura
     *
     * @param nomeEmpresa empresa
     * @param morada morada
     * @param telemovel telemovel
     * @param produtos produtos
     * @param quantidadeConvites convites /** Construtor com parametros de um
     * objeto do tipo Candidatura
     *
     * @param nomeEmpresa empresa
     * @param morada morada
     * @param telemovel telemovel
     * @param produtos produtos
     * @param quantidadeConvites convites
     */
    public Candidatura(String nomeEmpresa, String morada, int telemovel, String produtos, int quantidadeConvites) {
        setNomeEmpresa(nomeEmpresa);
        setMorada(morada);
        setTelemovel(telemovel);
        setProdutos(produtos);
        setQuantidadeConvites(quantidadeConvites);
        this.listaAvaliacao = new ListaAvaliacoes();
        state = new CandidaturaAbertaState(this);
        this.avalicaoFAE = new int[5];
    }

    /**
     * Retorna o nome da empresa
     *
     * @return nome
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Retorna a morada
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Retorna o Numero de telemovel
     *
     * @return telemovel
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * Retorna os produtos a ser exibidos ou demonstrados
     *
     * @return produtos
     */
    public String getProdutos() {
        return produtos;
    }

    /**
     * Retorna o Numero de Convites
     *
     * @return convites
     */
    public int getQuantidadeConvites() {
        return quantidadeConvites;
    }

    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacao;
    }

    /**
     * Altera o nome da empresa
     *
     * @param nomeEmpresa nome da empresa
     */
    public final void setNomeEmpresa(String nomeEmpresa) {
        if (nomeEmpresa == null || nomeEmpresa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da empresa inválido!");
        }
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Altera o parametro da morada
     *
     * @param morada a morada
     */
    public final void setMorada(String morada) {
        if (morada == null || morada.trim().isEmpty()) {
            throw new IllegalArgumentException("Morada da empresa inválida!");
        }
        this.morada = morada;
    }

    /**
     * Altera o parametro telemovel
     *
     * @param telemovel telemovel
     */
    public final void setTelemovel(int telemovel) {
        if (telemovel < 100000000 || telemovel > 999999999) {
            throw new IllegalArgumentException("Telemóvel é inválido!");
        }
        this.telemovel = telemovel;
    }

    /**
     * Altera os Produtos
     *
     * @param produtos produtos
     */
    public final void setProdutos(String produtos) {
        if (produtos == null || produtos.trim().isEmpty()) {
            throw new IllegalArgumentException("Produtos inválidos!");
        }
        this.produtos = produtos;
    }

    /**
     * Altera quantidade de Convites
     *
     * @param quantidadeConvites
     */
    public final void setQuantidadeConvites(int quantidadeConvites) {
        if (quantidadeConvites < 0) {
            throw new IllegalArgumentException("Quantidade de convites é inválida!");
        }
        this.quantidadeConvites = quantidadeConvites;
    }

    /**
     * To String
     *
     * @return String
     */
    @Override
    public String toString() {
        return String.format(" Empresa:" + nomeEmpresa + "\n Morada:" + morada + "\nd Telemovel:" + telemovel + "\n Produtos:" + produtos + "\n Número de Convites" + quantidadeConvites);
    }

    /**
     * Altera o Estado de candidatura
     */
    public boolean setCandidaturaStandAtribuido() {
        return state.setStandsAtribuidos();
    }

    /**
     * Altera as Avaliacao do FAE
     *
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     * @param p5
     */
    public void setavalicaoFAE(int p1, int p2, int p3, int p4, int p5) {
        avalicaoFAE[0] = avalicaoFAE[0] + p1;
        avalicaoFAE[1] = avalicaoFAE[1] + p2;
        avalicaoFAE[2] = avalicaoFAE[2] + p3;
        avalicaoFAE[3] = avalicaoFAE[3] + p4;
        avalicaoFAE[4] = avalicaoFAE[4] + p5;
    }

    /**
     * Retorna o Estado Da Candidatura
     */
    public CandidaturaState getState() {
        return state;
    }

    /**
     * Altera o Estado da Candidatura
     *
     * @param state estado
     */
    public void setEstado(CandidaturaState state) {
        this.state = state;
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaEmSubmissao() {
        return state.setCandidaturaEmSubmissao();
    }

    /**
     * Altera Stand
     *
     * @param stand novo stand
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    /**
     * Retorna o Stand
     *
     * @return
     */
    public Stand getStand() {
        return this.stand;
    }

    /**
     * Altera o Estado da Candidatura
     *
     * @return
     */
    public boolean setCandidaturaConflitosDetetados() {
        return state.setConflitosDetetados();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaAceite() {
        return state.setAceite();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaAlterada() {
        return state.setAlterada();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaAvaliada() {
        return state.setAvaliada();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaEmAvaliacao() {
        return state.setCandidaturaEmAvaliacao();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaFechada() {
        return state.setCandidaturaFechada();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaRetirada() {
        return state.setCandidaturaRetirada();
    }

    /**
     * Altera Estado de Candidatura
     */
    public boolean setCandidaturaStandsAtribuidos() {
        return state.isEstadoStandAtribuido();
    }
}
