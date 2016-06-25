package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaCandidaturas {

    /**
     * Lista de Candidaturas
     */
    @XmlElement(name = "candidatura")
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
        return new Candidatura() {
        };
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
        return listaCandidaturas.contains(c);
    }

    public List<Candidatura> getCandidaturasSemAtribuicao() {
        List<Candidatura> candidaturasRetiradas = new ArrayList<>();
        List<Candidatura> list = getListaCandidaturasExpo();
        for (Candidatura c : list) {
            if (c.getState().isEstadoConflitosAlterados()) {
                candidaturasRetiradas.add(c);
            }
        }
        return candidaturasRetiradas;
    }

    public List getListaCandidaturasExpo() {
        List<Candidatura> listaCandExpo = new ArrayList<>();
        for (Candidatura c : listaCandidaturas) {
            if (c instanceof CandidaturaExposicao) {
                listaCandExpo.add(c);
            }
        }
        return listaCandExpo;
    }

    public List<Candidatura> getListaCandidaturasDemo() {
        List<Candidatura> listaCandDemo = new ArrayList<>();
        for (Candidatura c : listaCandidaturas) {
            if (c instanceof CandidaturaDemonstracao) {
                listaCandDemo.add(c);
            }
        }
        return listaCandDemo;
    }

    public List getListaCandidaturasExpoRetiradas() {
        List<Candidatura> candidaturasRetiradas = new ArrayList<>();
        List<Candidatura> list = getListaCandidaturasExpo();
        for (Candidatura c : list) {
            if (c.getState() instanceof CandidaturaRetiradaState) {
                candidaturasRetiradas.add(c);
            }
        }
        return candidaturasRetiradas;
    }

    public List getListaCandidaturasDemoRetiradas() {
        List<Candidatura> candidaturasRetiradas = new ArrayList<>();
        List<Candidatura> list = getListaCandidaturasDemo();
        for (Candidatura c : list) {
            if (c.getState() instanceof CandidaturaRetiradaState) {
                candidaturasRetiradas.add(c);
            }
        }
        return candidaturasRetiradas;
    }

    public CandidaturaDemonstracao newCandidaturaDemo(Candidatura candidatura) {
        String nomeEmpresa = candidatura.getNomeEmpresa();
        String morada = candidatura.getMorada();
        int telemovel = candidatura.getTelemovel();
        Demonstracao demonstracao = null;
        String produtos = candidatura.getProdutos();
        int quantidadeConvites = candidatura.getQuantidadeConvites();
        return new CandidaturaDemonstracao(nomeEmpresa, morada, telemovel, demonstracao, produtos, quantidadeConvites);
    }

    public CandidaturaExposicao[] listaCandExposicaoToArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
