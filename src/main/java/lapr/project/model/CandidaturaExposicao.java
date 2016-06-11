/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class CandidaturaExposicao extends Candidatura {

    /**
     * float com a area pretendida para apresentar o produto
     */
    float areaPretendida;

    public CandidaturaExposicao(String nomeEmpresa, String morada, int telemovel, float areaPretendida, String produtos, int quantidadeConvites) {
        super(nomeEmpresa, morada, telemovel, produtos, quantidadeConvites);
        setAreaPretendida(areaPretendida);
    }

    /**
     * Retorna a area pretendida
     *
     * @return are pretendida
     */
    public float areaPretendida() {
        return areaPretendida;
    }

    public final void setAreaPretendida(float areaPretendida) {
        if (areaPretendida < 0) {
            throw new IllegalArgumentException("Área pretendida é inválida!");
        }
        this.areaPretendida = areaPretendida;
    }

    public String toString() {
        return super.toString() + String.format("%n Area Pretendida: %d", areaPretendida);
    }

}
