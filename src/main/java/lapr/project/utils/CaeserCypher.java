/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author JOAO
 */
public class CaeserCypher {

    private String password;
    private String passwordEncriptada;
    private String passwordDesencriptada;

    private final int nivel = 2;

    public CaeserCypher(String password) {
        this.password = password;
    }

    public String encriptar() {
        passwordEncriptada = "";
        int len = password.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (password.charAt(x) + nivel);
            if (c > 'z') {
                passwordEncriptada += (char) (password.charAt(x) - (26 - nivel));
            } else {
                passwordEncriptada += (char) (password.charAt(x) + nivel);
            }
        }
        return passwordEncriptada;
    }

    public String toString() {
        return passwordEncriptada + "   " + passwordDesencriptada;

    }

    public String desencriptar() {
        passwordDesencriptada = "";
        int len = password.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (password.charAt(x) - nivel);
            if (c > 'z') {
                passwordDesencriptada += (char) (password.charAt(x) - (26 + nivel));
            } else {
                passwordDesencriptada += (char) (password.charAt(x) - nivel);
            }
        }
        return passwordDesencriptada;
    }
}
