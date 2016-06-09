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
public class RegistoTipoDeCandidaturaTest {
    
    @Test
    public boolean test (){
        
      RegistoTipoDeConflito lst = new  RegistoTipoDeConflito();
        TipoDeConflito e = new TipoDeConflito ("dinheiro");
        TipoDeConflito a = new TipoDeConflito ("familia");
      
      lst.adicionarTipoDeConflito(a);
      lst.adicionarTipoDeConflito(e);
      
      
      
      if(lst.tamanho()==2 ){
          if(lst.obterTipoDeConflito(0).equals(a))
          return true;
          
          
      }
      
        return false ;
        
        
        

    }
    
    
    
    
    
    
}
