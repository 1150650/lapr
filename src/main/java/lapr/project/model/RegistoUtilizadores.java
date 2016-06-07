/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoUtilizadores {

    private List<Utilizador> registoUtilizadoresConf;
    private List<Utilizador> registoUtilizadoresNConf;
    private Utilizador u;

    public RegistoUtilizadores() {
        registoUtilizadoresConf = new ArrayList<>();
        registoUtilizadoresNConf = new ArrayList<>();
    }

    public Utilizador criarUtilizador(String nome, String email, String username, String password) {
        u = new Utilizador(nome, email, username, password);
        return u;
    }

    public Utilizador obterUtilizador(int indice) {
        return registoUtilizadoresConf.get(indice);
    }

    public int tamanho() {
        return this.registoUtilizadoresConf.size();
    }

    public void registaUtilizador(Utilizador u) {
        boolean valida = validaUtilizador(u);
        if (valida == true) {
            addUtilizador(u);
        }
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
        for (int i = 0; i < registoUtilizadoresConf.size(); i++) {
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
        for (int i = 0; i < registoUtilizadoresConf.size(); i++) {
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
        registoUtilizadoresConf.add(u);
    }

    public void removerUtilizador(Utilizador u) {
        registoUtilizadoresConf.remove(u);
    }

    public Utilizador getUtilizadorInfo(String username) {
        
    }

}
