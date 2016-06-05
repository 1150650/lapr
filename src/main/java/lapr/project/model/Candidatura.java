package lapr.project.model;

import java.util.List;

public class Candidatura {

    /**
     * Referência para o Utilizador que submete a nova candidatura
     */
    private Utilizador representante;

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
     * float com a area pretendida para apresentar o produto
     */
    private float areaPretendida;

    /**
     * Produtos que a empresa vai expor
     */
    private String produtos;

    /*+
    Numero de convites necessários
     */
    private int quantidadeConvites;

    public Candidatura() {
        this.listaAvaliacao = new ListaAvaliacoes();
    }

    /**
     * Construtor com parametros de um objeto do tipo Candidatura
     *
     * @param nomeEmpresa empresa
     * @param morada morada
     * @param telemovel telemovel
     * @param areaPretendida area
     * @param produtos produtos
     * @param quantidadeConvites convites /** Construtor com parametros de um
     * objeto do tipo Candidatura
     *
     * @param nomeEmpresa empresa
     * @param morada morada
     * @param telemovel telemovel
     * @param areaPretendida area
     * @param produtos produtos
     * @param quantidadeConvites convites
     */
    public Candidatura(String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int quantidadeConvites) {
        setNomeEmpresa(nomeEmpresa);
        setMorada(morada);
        setTelemovel(telemovel);
        setAreaPretendida(areaPretendida);
        setProdutos(produtos);
        setQuantidadeConvites(quantidadeConvites);
        this.listaAvaliacao = new ListaAvaliacoes();
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
     * Retorna a area pretendida
     *
     * @return are pretendida
     */
    public float areaPretendida() {
        return areaPretendida;
    }

    /**
     * Retorna os produtos a ser exibidos
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
     * @return O utilizador (Representante que submete a candidatura)
     */
    public Utilizador getRepresentante() {
        return representante;
    }

    /**
     * @param representante altera o parametro do representante
     */
    public void setRepresentante(Utilizador representante) {
        this.representante = representante;
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

    public final void setAreaPretendida(float areaPretendida) {
        if (areaPretendida < 0) {
            throw new IllegalArgumentException("Área pretendida é inválida!");
        }
        this.areaPretendida = areaPretendida;
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
        return " Empresa:" + nomeEmpresa + "\n Morada:" + morada + "\nd Telemovel:" + telemovel + "\n Area Pretendida:" + areaPretendida + "\n Produtos:" + produtos + "\n Número de Convites" + quantidadeConvites;
    }
}
