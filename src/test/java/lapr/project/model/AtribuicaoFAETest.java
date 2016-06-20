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
public class AtribuicaoFAETest {
    private AtribuicaoFAE a=new AtribuicaoFAE();
    private FAE f;
    private Candidatura c;
    
    
    
    @Test
    public void AtribuicaoFAETest(){
         Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        this.f = new FAE(u,"123");
        this.c = new Candidatura();
        c.setNomeEmpresa("isep");
        a.setCandidatura(c);
        a.setFAE(f);
        
        
           assertEquals(c, a.getCandidatura());
           assertEquals(f, a.getFAE());
           
    }
    
    
    @Test
    public void AdicionarTest (){
         Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        this.f = new FAE(u,"123");
        this.c = new Candidatura();
        c.setNomeEmpresa("isep");
        a.setCandidatura(c);
        a.setFAE(f);
        
        a.addCandidaturaFae();
        assertEquals(c, a.getFAE().getListacandidatura().obterCandidatura(0));
        
        
        
        
    }
}
