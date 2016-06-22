/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoUtilizadores {

    /**
     * Lista de Utilizadores
     */
    private List<Utilizador> registoUtilizadores;

    private Utilizador u;

    public RegistoUtilizadores() {
        registoUtilizadores = new ArrayList<>();
    }

    public Utilizador criarUtilizador(String nome, String email, String username, String password) {
        u = new Utilizador(nome, email, username, password);
        return u;
    }

    public Utilizador obterUtilizador(int indice) {
        return registoUtilizadores.get(indice);
    }

    public int tamanho() {
        return this.registoUtilizadores.size();
    }

    public boolean registaUtilizador(Utilizador u) {
        boolean valida = validaUtilizador(u);
        if (valida == true) {
            addUtilizador(u);
            return true;
        }
        return false;
    }

    private boolean validaUtilizador(Utilizador u) {
        boolean validaEmail = validaEmail(u.getEmail());
        boolean validaUsername = validaUsername(u.getUsername());
        if (validaEmail == true && validaUsername == true) {
            return true;
        }
        return false;
    }

    public void validaAlteracaoDados(Utilizador u, String email, String username) {
        if (!email.equals(u.getEmail())) {
            validaEmail(email);
        }
        if (!username.equals(u.getUsername())) {
           validaUsername(username);
        }
    }

    private boolean validaEmail(String email) {
        boolean valida = true;
        for (int i = 0; i < registoUtilizadores.size(); i++) {
            if (!email.equalsIgnoreCase(obterUtilizador(i).getEmail())) {
                valida = true;
            } else {
                valida = false;
                throw new IllegalArgumentException("O email já está registado no sistema.");
            }
        }
        return valida;
    }

    private boolean validaUsername(String username) {
        boolean valida = true;
        for (int i = 0; i < registoUtilizadores.size(); i++) {
            if (!username.equalsIgnoreCase(obterUtilizador(i).getUsername())) {
                valida = true;
            } else {
                valida = false;
                throw new IllegalArgumentException("Já existe um utilizador com esse username");
            }
        }
        return valida;
    }

    private void addUtilizador(Utilizador u) {
        registoUtilizadores.add(u);
    }

    public boolean removerUtilizador(Utilizador u) {
        registoUtilizadores.remove(u);
        return true;
    }

    public void alterarDados(Utilizador utilizadorAtivo, String nome, String email, String username, String password) {
        utilizadorAtivo.setNome(nome);
        utilizadorAtivo.setEmail(email);
        utilizadorAtivo.setUsername(username);
        utilizadorAtivo.setPassword(password);
    }

    public List<Utilizador> getRegistoUtilizadores() {
        return registoUtilizadores;
    }

    public int indiceDe(Utilizador u) {
        return registoUtilizadores.indexOf(u);
    }

}
