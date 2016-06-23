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

    private int[] avalicaoFAE;

    private Stand stand;

    /**
     * O representante que cria a candidatura;
     */
    private Representante representante;

    public Candidatura() {
        this.listaAvaliacao = new ListaAvaliacoes();
        state = new CandidaturaAbertaState(this);

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

    public final void setProdutos(String produtos) {
        if (produtos == null || produtos.trim().isEmpty()) {
            throw new IllegalArgumentException("Produtos inválidos!");
        }
        this.produtos = produtos;
    }

    public final void setQuantidadeConvites(int quantidadeConvites) {
        if (quantidadeConvites < 0) {
            throw new IllegalArgumentException("Quantidade de convites é inválida!");
        }
        this.quantidadeConvites = quantidadeConvites;
    }

    @Override
    public String toString() {
        return String.format("Empresa:%s Telemóvel:%d", nomeEmpresa, telemovel);
    }

    /**
     * Mostra todas as especificaçoes da candidatura
     *
     * @return string
     */
    public String apresentarDados() {
        return " Empresa:" + nomeEmpresa + "\n Morada:" + morada + "\nd Telemovel:" + telemovel + "\n Produtos:" + produtos + "\n Número de Convites" + quantidadeConvites;
    }

    public boolean setCandidaturaStandAtribuido() {
        return state.setStandsAtribuidos();
    }

    public void setavalicaoFAE(int p1, int p2, int p3, int p4, int p5) {
        avalicaoFAE[0] = avalicaoFAE[0] + p1;
        avalicaoFAE[1] = avalicaoFAE[1] + p2;
        avalicaoFAE[2] = avalicaoFAE[2] + p3;
        avalicaoFAE[3] = avalicaoFAE[3] + p4;
        avalicaoFAE[4] = avalicaoFAE[4] + p5;
    }

    public CandidaturaState getState() {
        return state;
    }

    public void setEstado(CandidaturaState state) {
        this.state = state;
    }

    public boolean setCandidaturaEmSubmissao() {
        return state.setCandidaturaEmSubmissao();
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Stand getStand() {
        return this.stand;
    }

    public boolean setCandidaturaConflitosDetetados() {
        return state.setConflitosDetetados();
    }
    
    public boolean setCandidaturaAceite() {
        return state.setAceite();
    }
    
    public boolean setCandidaturaAlterada() {
        return state.setAlterada();
    }
    
    public boolean setCandidaturaAvaliada() {
        return state.setAvaliada();
    }
    
    public boolean setCandidaturaEmAvaliacao() {
        return state.setCandidaturaEmAvaliacao();
    }
    
    public boolean setCandidaturaFechada() {
        return state.setCandidaturaFechada();
    }
    
    public boolean setCandidaturaRetirada() {
        return state.setCandidaturaRetirada();
    }
    
    public boolean setCandidaturaStandsAtribuidos() {
        return state.isEstadoStandAtribuido();
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
        }

}
