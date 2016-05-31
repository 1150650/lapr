package lapr.project.model;

public class FAE implements Comparable<FAE> {

    /**
     * String que contem a sigla de identificação do FAE
     */
    private String identificador;

    /**
     * String com o nome de utilizador
     */
    private String utilizador;

    /**
     * Variavel que define o numero de Exposiçoes em que o utilizador(FAE)
     * desempenhou o seu papel de FAE
     */
    private int experienciaFAE;

    /**
     * Construtor de um objeto do tipo FAE
     *
     * @param u
     * @param identificador
     */
    private ListaCandidaturas listacandidatura ;
    
    private ListaAtribuicoes listaAtribuicoes;
    
    
    public FAE() {
        listacandidatura=new ListaCandidaturas();
        listaAtribuicoes= new ListaAtribuicoes();
        this.utilizador=getUtilizador();
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
    public String getUtilizador() {
        return utilizador;
    }

    /**
     * Altera a String Utilizador para a recebida
     *
     * @param utilizador Stirng utilizador
     */
    public void setUtilizador(String utilizador) {
        if (utilizador == null || utilizador.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Utilizador inválido");
        }
        this.utilizador = utilizador;
    }

    /**
     * Altera o parametro indentificação para o recebido e verifica se este é
     * valido
     *
     * @param identificador id
     */
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
    public void setExperienciaFAE(int experienciaFAE) {
        this.experienciaFAE = experienciaFAE;
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

    @Override
    public int compareTo(FAE o) {
        if (o.getExperienciaFAE() < o.getExperienciaFAE()) {
            return -1;
        }
        if (o.getExperienciaFAE() > o.getExperienciaFAE()) {
            return 1;
        }
        return 0;
    }
    
    public Candidatura[] mostrarLista(ListaAtribuicoes lista){
        Candidatura[] string = new Candidatura[lista.tamanho()];

        int tamanho = lista.tamanho()-1;
        for (int i=0 ; i< tamanho; i++){
         
//           String aux = m_lExposicoes.obterExposicao(index).toString();
           string[i]=lista.obterAtribuiçao(i).getCandidatura();
        } 
        return string;
    }

    /**
     * @return the listacandidatura
     */
    public ListaCandidaturas getListacandidatura() {
        return listacandidatura;
    }
    
    public void adicionarAtribuicao(Atribuicao a){
        listaAtribuicoes.adicionarAtribuição(a);
    }
    
    public ListaAtribuicoes getListaAtribuicoes(){
        return listaAtribuicoes;
    }

}
