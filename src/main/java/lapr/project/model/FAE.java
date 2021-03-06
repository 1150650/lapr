package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FAE implements Comparable<FAE> {

    /**
     * String que contem a sigla de identificação do FAE
     */
    private String identificador;

    /**
     * String com o nome de utilizador
     */
    private Utilizador utilizador;

    /**
     * Variavel que define o numero de Exposiçoes em que o utilizador(FAE)
     * desempenhou o seu papel de FAE
     */
    @XmlElement
    private int experienciaFAE = 0;

    /**
     * Construtor de um objeto do tipo FAE
     *
     * @param u
     * @param identificador
     */
    @XmlElement
    private ListaCandidaturas listaCandidaturasParaAvaliar;

    /**
     * Construtor de um objeto do tipo FAE
     *
     * @param u recebendo um utilizador
     * @param id recebe a id para o fae ser identificado
     */
    public FAE(Utilizador u, String iD) {
        setUtilizador(u);
        setIdentificador(iD);
        listaCandidaturasParaAvaliar = new ListaCandidaturas();
    }

    public FAE() {
        listaCandidaturasParaAvaliar = new ListaCandidaturas();

    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    /**
     * Altera a String Utilizador para a recebida
     *
     * @param utilizador Stirng utilizador
     */
    @XmlElement
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Altera o parametro indentificação para o recebido e verifica se este é
     * valido
     *
     * @param identificador id
     */
    @XmlElement
    public void setIdentificador(String identificador) {
        if (identificador == null || identificador.trim().isEmpty()) {
            throw new IllegalArgumentException("Identificador inválido!");
        }
        this.identificador = identificador;
    }

    /**
     * @return the experienciaFAE
     */
    public int getExperienciaFAE() {
        return experienciaFAE;
    }

    /**
     * @param experienciaFAE the experienciaFAE to set
     */
    public void aumentarExperienciaFAE() {
        this.experienciaFAE++;
    }

    /**
     * Devolve uma String com o nome de utilizador e o idenficador
     *
     * @return string
     */
    @Override
    public String toString() {
        return "FAE: " + getUtilizador();
    }

    /**
     * @return the listacandidatura
     */
    public ListaCandidaturas getListacandidatura() {
        return listaCandidaturasParaAvaliar;
    }

    /**
     * Adiciona uma Candidatura atribuida ao FAE para avaliar
     *
     * @param c candidatura
     */
    public void adicionarCandidatura(Candidatura c) {
        listaCandidaturasParaAvaliar.adicionarCandidatura(c);
    }

    @Override
    public int compareTo(FAE o) {
        if (o.getExperienciaFAE() < experienciaFAE) {
            return -1;
        }
        if (o.getExperienciaFAE() > experienciaFAE) {
            return 1;
        }
        return 0;
    }
}
