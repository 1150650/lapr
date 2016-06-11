package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class Candidatura {

    /**
     * Palavras chaves para descrever Candidatura
     */
    private ArrayList palavrasChaves;

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
    private ListaProdutos lstProdutos;

    /*+
    Numero de convites necessários
     */
    private int quantidadeConvites;

    /**
     * Estado Candidatura
     */
    private CandidaturaState c_estado;

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
    public Candidatura(String nomeEmpresa, String morada, int telemovel, float areaPretendida, Produto produtos, int quantidadeConvites) {
        setNomeEmpresa(nomeEmpresa);
        setMorada(morada);
        setTelemovel(telemovel);
        setAreaPretendida(areaPretendida);
        setQuantidadeConvites(quantidadeConvites);
        this.listaAvaliacao = new ListaAvaliacoes();
        this.lstProdutos = new ListaProdutos();
    }

    /**
     * Retorna o estado da candidatura
     *
     * @return
     */
    public CandidaturaState getCandidaturaEstado() {
        return c_estado;
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
     * Adiciona até 3 palavras chaves
     *
     * @param pc
     */
    public void adicionarPalavrasChaves(String pc) {
        palavrasChaves.add(pc);
    }

    /**
     * Adicionar Produtos
     *
     * @param produto
     */
    public void adicionarProdutos(String produto) {
        lstProdutos.addProduto(new Produto(produto));
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
    public float getAreaPretendida() {
        return areaPretendida;
    }

    /**
     * Retorna os produtos a ser exibidos
     *
     * @return produtos
     */
    public ListaProdutos getListaProdutos() {
        return lstProdutos;
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
    public void setTelemovel(int telemovel) {
        if (telemovel < 100000000 || telemovel > 999999999) {
            throw new IllegalArgumentException("Telemóvel é inválido!");
        }
        this.telemovel = telemovel;
    }

    public void setAreaPretendida(float areaPretendida) {
        if (areaPretendida < 0) {
            throw new IllegalArgumentException("Área pretendida é inválida!");
        }
        this.areaPretendida = areaPretendida;
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
