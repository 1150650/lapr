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
public class OrganizadorTest {
    
    
    
    @Test
    public void organizadorTest(){
        Organizador o = new Organizador ();
        Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        o.setUtilizador(u);
        
         assertEquals(u, o.getUtilizador());
       
    }
}
