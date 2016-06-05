/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;

/**
 *
 * @author JOAO
 */
public class ListaDemonstracoes {
    /**
     * A lista de demonstracoes
     */
    private ArrayList<Demonstracao> listalDemonstracao;
    
    /**
     * Cria uma instancia de ListaDemonstracoes
     */
    public ListaDemonstracoes(){
       this.listalDemonstracao=new ArrayList <>();
    }
    
    /**
     * Metodo que retorna a lista da demonstracao
     * @return ListaDemonstracao
     */
    public ArrayList<Demonstracao> getListalDemonstracao() {
        return listalDemonstracao;
    }

    /**
     * Metodo que altera a lista de demonstracoes
     * @param listalDemonstracao a nova lista de demonstracoes
     */
    public void setListalDemonstracao(ArrayList<Demonstracao> listalDemonstracao) {
        
        this.listalDemonstracao = listalDemonstracao;
    }
    
    /**
     * Metodo que retorna uma descricao textual da lista de demonstracao
     * @return descricao da lista de demonstracoes
     */
    @Override
    public String toString(){
        return super.toString();
    } 
    
    /**
     * Metodo que cria uma demonstracao
     */
    public Demonstracao criacaoDemonstracao(){
        return new Demonstracao();
    }
    

    
    /**
     * Metodo que adiciona uma demonstracao a lista de demonstracoes
     * @param d - a demonstracao a adicionar
     */
    public void addDemonstracao(Demonstracao d){
        getListalDemonstracao().add(d);
    }
    
}
