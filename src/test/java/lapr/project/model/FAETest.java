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
public class FAETest {
    private FAE f ;
    private Candidatura c;
    
    
    @Test
    public void FAETest (){
         Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        this.f = new FAE(u,"123");
        int experienciaFae =9;
//        f.setExperienciaFAE(experienciaFae);
         this.c = new Candidatura();
        c.setNomeEmpresa("isep");
         
        assertEquals(experienciaFae, f.getExperienciaFAE());
        assertEquals("123", f.getIdentificador());
        assertEquals(u, f.getUtilizador());
        
       
        
    }
    @Test
    public void FAEadicionarCandidaturaTest (){
        FAETest();
        f.getListacandidatura().adicionarCandidatura(c);
        
        assertEquals(c,  f.getListacandidatura().obterCandidatura(0));
    }
    
    public void FAEExperienciaComparada (){
        FAETest();
        Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        FAE f1 = new FAE(u,"1234");
        int experienciaFae1 =10;
   //     f1.setExperienciaFAE(experienciaFae1);
        
       
        
         assertEquals(1,   f.compareTo(f1));
       
        
    }
}
