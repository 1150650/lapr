/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author JOAO
 */
public class ProdutoTest {
    
    
    @Test
    public void ProdutoTest(){
        Produto p =new Produto();
        String produto ="Jogos";
        
        p.setDesignacao(produto);
        
         assertEquals(produto, p.getDesignacao());
        
    }
}
