/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author JOAO
 */
public class ListaFAETest {
    
    
        
    @Test
    public void test() {
        
         Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        FAE f = new FAE(u,"123");

        ListaFAE lst = new ListaFAE();
        
        
        
        

        lst.adicionarFAE(f);
            assertEquals(f, lst.obterFAE(0));
            assertEquals(1, lst.tamanho());
            assertEquals(0, lst.indiceDe(f));
    }
    
}
