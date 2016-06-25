/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.CaeserCypher;

/**
 *
 * @author Diogo
 */
@XmlRootElement(name = "utilizador")
public class Utilizador {

    private String nome, email, username, password;

 

    public Utilizador(String nome, String email, String username, String password) {
        setNome(nome);
        setEmail(email);
        setUsername(username);
        setPasswordDesencriptada(password);
    }

    public Utilizador() {

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordDesencriptada() {
         CaeserCypher encriptacao = new CaeserCypher(password);
        String passwordDes = encriptacao.desencriptar();
        return passwordDes;
    }

    @XmlElement
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;

    }

    @XmlElement
    public void setEmail(String email) {
        String FUNCAO_OBJ = "(.*)[@](.*)((.com)|(.pt))$";
        Pattern FUNCAO_OBJETIVO = Pattern.compile(FUNCAO_OBJ);
        Matcher verificar = FUNCAO_OBJETIVO.matcher(email);
        if (!verificar.find()) {
            throw new IllegalArgumentException("Email inválido!");
        }
        this.email = email;
    }

    @XmlElement
    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username inválido!");
        }
        this.username = username;
    }

    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordDesencriptada(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password inválida! Deve conter pelo menos 8 carateres.");
        }
        char ch;
        boolean temMinuscula = false, temMaiuscula = false, temNumero = false, temEspecial = false;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                temMinuscula = true;
            }
            if (Character.isUpperCase(ch)) {
                temMaiuscula = true;
            }
            if (Character.isDigit(ch)) {
                temNumero = true;
            }
        }
        if (password.matches(".*[,.;:-].*")) {
            temEspecial = true;
        }

        if (temMinuscula == false || temMaiuscula == false || temNumero == false || temEspecial == false) {
            throw new IllegalArgumentException("Password inválida! Deve conter "
                    + "pelo menos uma letra minuscula, uma letra maiuscula, "
                    + "um número e um carater especial(,.;:-)");
        }

        CaeserCypher  encriptacao = new CaeserCypher(password);
        setPassword(encriptacao.encriptar());
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + "     Email:   " + email + "    Username: " + username);
    }
}
