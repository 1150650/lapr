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
public class ListaStandTest {
    
    
    @Test
    public boolean test (){
        
         
      ListaStands lst = new ListaStands();
       Stand e = new Stand ("salao");
        Stand a = new Stand ("hall");
      
      lst.adicionarStand(a);
      lst.adicionarStand(e);
      
      
      
      if(lst.tamanho()==2 ){
          if(lst.obterStand(0).equals(a)){
               return true;
               
          }
         
           return false ;
          
      }
      
        return false ;
        
        
        
        
        
    }
            
}
