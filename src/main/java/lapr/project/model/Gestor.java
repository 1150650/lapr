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
public class Gestor {
    
    private Utilizador utilizador;
    
    public Gestor (Utilizador u){
        setUtilizador(u);
    }
    
    public Gestor(){
        
    }
    
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
    
    public Utilizador getUtilizador() {
        return utilizador;
    }
    
}
