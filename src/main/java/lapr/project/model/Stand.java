/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author JOAO
 */
public class Stand {
       private String localizacao;
    
    public Stand (){
        
    }
    
    public String getLocalizacao(){
        return localizacao;
        
    }
    
    public void setLocalizacao(String localizao){
        this.localizacao=localizacao;
    }
    
    @Override
    public String toString() {
        return String.format("Stand com a localização : "+localizacao);
    }
}
