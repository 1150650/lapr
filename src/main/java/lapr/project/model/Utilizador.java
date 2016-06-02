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
public class Utilizador {
    
    private String nome, email, username, password;
    
    
    public Utilizador(String nome, String email, String username, String password){
        setNome(nome);
        setEmail(email);
        setUsername(username);
        setPassword(password);
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    
    }
    //PERGUNTAR SE PODEMOS USAR REGEX
    private void setEmail(String email) {
        
    }

    private void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username inválido!");
        }
        this.username = username;
    }

    private void setPassword(String password) {
        
    }
    //PERGUNTAR PARA QUE SERVE
   // private boolean valida(){
        
  //  }
    
    
    
    @Override
    public String toString() {
        return String.format("Nome: %s%nEmail: %s%nUsername: %s", nome, email, username);
    }
}
