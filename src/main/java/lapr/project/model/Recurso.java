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
class Recurso {
     private String recurso;
    
    public Recurso(String recurso){
        recurso = recurso;
    }
    
    public Recurso(){
        recurso = "";
    }
    
    public void setRecurso(String r){
        recurso = r;
    }
}
