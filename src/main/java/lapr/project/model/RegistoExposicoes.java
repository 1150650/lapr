package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistoExposicoes {

    @XmlElement(name = "Exposicao")
    private List<Exposicao> listaExposicoes;

    public RegistoExposicoes() {
        listaExposicoes = new ArrayList<>();
    }

    public void adicionarExposicao(Exposicao e) {
        listaExposicoes.add(e);
    }

    public int tamanho() {
        return this.listaExposicoes.size();
    }

    public Exposicao obterExposicao(int indice) {
        return listaExposicoes.get(indice);
    }

    public List<Exposicao> getListaExposicoes() {
        return new ArrayList(listaExposicoes);
    }

    public Exposicao[] getArray() {
        return listaExposicoes.toArray(new Exposicao[listaExposicoes.size()]);
    }

    public List getExposicoesOrganizador(Utilizador utilizador) {
        List<Exposicao> exposicoesDoOrganizador = new ArrayList<Exposicao>();

        for (Exposicao expo : listaExposicoes) {
            if (expo.getListaOrganizadores().isUserOrganizador(utilizador)) {
                exposicoesDoOrganizador.add(expo);
            }
        }
        return exposicoesDoOrganizador;
    }

    public int indiceDe(Exposicao e) {
        return listaExposicoes.indexOf(e);
    }

    public Exposicao novaExposicao() {
        return new Exposicao();
    }
}
