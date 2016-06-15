package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class ListaCandidaturas {

    /**
     * Lista de Candidaturas
     */
    private List<Candidatura> listaCandidaturas;

    /**
     * Construtor do Objeto ListaCandidaturas
     */
    public ListaCandidaturas() {
        listaCandidaturas = new ArrayList<>();
    }

    /**
     * Obter uma candidatura com base no indice
     *
     * @param indice posicao na lista
     * @return candidatura
     */
    public Candidatura obterCandidatura(int indice) {
        return listaCandidaturas.get(indice);
    }

    /**
     * Adiciona uma Candidatura fornecida a Lista
     *
     * @param candidatura candidatura
     * @return booleano
     */
    public boolean adicionarCandidatura(Candidatura candidatura) {
        if (!listaCandidaturas.contains(candidatura)) {
            return listaCandidaturas.add(candidatura);
        }
        return false;
    }

    /**
     * Remove uma candidatura fornecida
     *
     * @param candidatura candidatura
     * @return candidatura removida
     */
    public boolean removerCandidatura(Candidatura candidatura) {
        return listaCandidaturas.remove(candidatura);
    }

    /**
     * Tamanho da lista de Candidaturas
     *
     * @return tamanho
     */
    public int tamanho() {
        return this.listaCandidaturas.size();
    }

    /**
     * Indice de uma candidatura
     *
     * @param candidatura candidatura
     * @return indice
     */
    public int indiceDe(Candidatura candidatura) {
        return listaCandidaturas.indexOf(candidatura);
    }

    /**
     * Verifica se contem uma candidatura
     *
     * @param candidatura candidatura
     * @return lista
     */
    public boolean contem(Candidatura candidatura) {
        return listaCandidaturas.contains(candidatura);
    }

    public Candidatura novaCandidatura() {
        return new Candidatura();
    }

    public List getCandidaturasAceites() {
        List<Candidatura> listaCandidaturasAceites = new ArrayList<Candidatura>();
        for (Candidatura c : listaCandidaturas) {
            if (c.getState() instanceof CandidaturaAceiteState) {
                listaCandidaturasAceites.add(c);
            }
        }
        return listaCandidaturasAceites;
    }

    public List getListaCandidaturas() {
        return listaCandidaturas;
    }

    public boolean validaCandidatura(Candidatura c) {
        boolean a, b = false;
        return b;
    }

    public List<Candidatura> getCandidaturasSemAtribuicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CandidaturaExposicao[] listaCandExposicaoToArray() {
        return (CandidaturaExposicao[]) listaCandidaturas.toArray();
    }
    
    public List getListaCandidaturasExpo(){
        List<Candidatura> listaCandExpo = new ArrayList<>();
        for(Candidatura c : listaCandidaturas){
            if(c instanceof CandidaturaExposicao){
                listaCandExpo.add(c);
            }
        }
        return listaCandExpo;
    }
    
        public List getListaCandidaturasDemo(){
        List<Candidatura> listaCandDemo = new ArrayList<>();
        for(Candidatura c : listaCandidaturas){
            if(c instanceof CandidaturaDemonstracao){
                listaCandDemo.add(c);
            }
        }
        return listaCandDemo;
    }

}
