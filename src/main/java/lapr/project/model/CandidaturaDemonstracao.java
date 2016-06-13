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
public class CandidaturaDemonstracao extends Candidatura{
    
    private Demonstracao demonstracao;
    
    public CandidaturaDemonstracao(String nomeEmpresa, String morada, int telemovel, Demonstracao demonstracao, String produtos, int quantidadeConvites){
         super(nomeEmpresa, morada, telemovel, produtos, quantidadeConvites);
         setDemonstracao(demonstracao);
    }
    
    public Demonstracao getDemonstracao(){
        return demonstracao;
    }

    public void setDemonstracao(Demonstracao demonstracao) {
        if (demonstracao == null) {
            throw new IllegalArgumentException("Área pretendida é inválida!");
        }
        this.demonstracao =demonstracao;
    }
    
     public String toString() {
        return super.toString() + String.format("%n Demonstracao: %d", demonstracao.getDescricao());
    }
    
}
