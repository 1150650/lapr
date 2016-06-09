/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.Test;

/**
 *
 * @author JOAO
 */
public class StandTest {
    
    @Test
    public boolean test (){
       Stand u = new Stand();
       String descricao ="hall";
       u.setDescricao("hall");
        Candidatura candidatura = new Candidatura ();
       u.addCandidatura(candidatura);
       if (u.getDescricao().equalsIgnoreCase(descricao)&& u.hasCandidatura()==true){
           return true ;
           
           
       }

       
       return false;
   } 
    
}
