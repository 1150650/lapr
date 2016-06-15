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
        boolean validaEmail = validaEmail(u);
        boolean validaUsername = validaUsername(u);
        if (validaEmail == true && validaUsername == true) {
            return true;
        }
        return false;
    }

    private boolean validaEmail(Utilizador u) {
        boolean valida = true;
        for (int i = 0; i < registoUtilizadores.size(); i++) {
            if (!u.getEmail().equalsIgnoreCase(obterUtilizador(i).getEmail())) {
                valida = true;
            } else {
                valida = false;
                throw new IllegalArgumentException("O email já está registado no sistema.");
            }
        }
        return valida;
    }

    private boolean validaUsername(Utilizador u) {
        boolean valida = true;
        for (int i = 0; i < registoUtilizadores.size(); i++) {
            if (!u.getUsername().equalsIgnoreCase(obterUtilizador(i).getUsername())) {
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

    public List<Utilizador> getRegistoUtilizadores() {
        return registoUtilizadores;
    }
     public int indiceDe(Utilizador u) {
        return registoUtilizadores.indexOf(u);
    }
    
}
