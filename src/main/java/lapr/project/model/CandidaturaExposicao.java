/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class CandidaturaExposicao extends Candidatura {

    /**
     * float com a area pretendida para apresentar o produto
     */
    private float areaPretendida;

    private ListaDemonstracoes demonstracoesComInteresse;

    private String[] KEYWORDS;

    public CandidaturaExposicao(String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int quantidadeConvites) {
        super(nomeEmpresa, morada, telemovel, produtos, quantidadeConvites);
        setAreaPretendida(areaPretendida);
        demonstracoesComInteresse = new ListaDemonstracoes();
    }

    public CandidaturaExposicao() {
        super();
        demonstracoesComInteresse = new ListaDemonstracoes();
    }

    /**
     * Retorna a area pretendida
     *
     * @return are pretendida
     */
    public float areaPretendida() {
        return getAreaPretendida();
    }

    public final void setAreaPretendida(float areaPretendida) {
        if (areaPretendida < 0) {
            throw new IllegalArgumentException("Área pretendida é inválida!");
        }
        this.areaPretendida = areaPretendida;
    }

    public String toString() {
        return super.toString() + String.format("%n Area Pretendida: %d", getAreaPretendida());
    }

    /**
     * @return the areaPretendida
     */
    public float getAreaPretendida() {
        return areaPretendida;
    }

    /**
     * @return the KEYWORDS
     */
    public String[] getKEYWORDS() {
        return KEYWORDS;
    }

    /**
     * @param KEYWORDS the KEYWORDS to set
     */
    public void setKEYWORDS(String[] KEYWORDS) {
        this.KEYWORDS = KEYWORDS;
    }

    public void setDemonstracoesComInteresse(ListaDemonstracoes demonstracoesComInteresse) {
        this.demonstracoesComInteresse = demonstracoesComInteresse;
    }

    public ListaDemonstracoes getDemonstracoesComInteresse() {
        return demonstracoesComInteresse;
    }

    public boolean addDemonstracoesComInteresse(Demonstracao demonstracao) {
        if (!demonstracoesComInteresse.contains(demonstracao)) {
            demonstracoesComInteresse.addDemonstracao(demonstracao);
            return true;
        } else {
            return false;
        }
    }

}
