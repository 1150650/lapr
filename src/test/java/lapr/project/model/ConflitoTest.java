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
public class ConflitoTest {
    private Conflito conf=new Conflito();
    private FAE f ;
    private Candidatura c; 
    
    @Test
    public void ConflitoTest (){
         Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        this.f = new FAE(u,"123");
        this.c = new Candidatura();
        conf.setCandidatura(c);
        conf.setFae(f);
        
        assertEquals(c, conf.getCandidatura());
        assertEquals(f, conf.getFae());
    }
}
