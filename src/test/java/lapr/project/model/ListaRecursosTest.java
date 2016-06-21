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
public class ListaRecursosTest {
    
    
    
       @Test
    public void test() {

        ListaRecursos lst = new ListaRecursos();
        Recurso e = new Recurso();
        Recurso a = new Recurso();

        lst.addRecurso(a);
        lst.addRecurso(e); 
        
            assertEquals(a, lst.obterRecurso(0));
            assertEquals(2, lst.tamanho());
            assertEquals(1, lst.indiceDe(e));
    }
}
