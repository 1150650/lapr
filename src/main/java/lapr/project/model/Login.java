/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Diogo
 */
public class Login {

    private Utilizador utilizadorAtivo;
    private CentroExposicoes ce;
    private RegistoUtilizadores ru;

    public Login(CentroExposicoes centroExpo) {
        this.ce = centroExpo;
        this.ru = ce.getRegistoUtilizadoresConf();
    }

    public Utilizador authenticate(String username, String password) {
        int tamanho = ru.tamanho();
        if (tamanho == 0) {
            throw new IllegalArgumentException("Utilizador não registado/confirmado!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (ru.obterUtilizador(i).getUsername().equalsIgnoreCase(username)) {
                    utilizadorAtivo = ru.obterUtilizador(i);
                    tamanho = ru.tamanho();

                } 
            }
        }
        
        if(utilizadorAtivo==null){
            throw new IllegalArgumentException("Utilizador não registado/confirmado!");
        }
        
        if (!utilizadorAtivo.getPasswordDesencriptada().equalsIgnoreCase(password)) {
            throw new IllegalArgumentException("Password incorreta!");
        }
       

        return utilizadorAtivo;
    }
}
