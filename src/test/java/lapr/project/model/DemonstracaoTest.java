/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author JOAO
 */
public class DemonstracaoTest {

    @Test
    public void test() {
        Demonstracao u = new Demonstracao();
        String descricao = "hall";
        u.setDescricao("hall");
        int codigo = 100;
        u.setCodigo(100);
        Recurso r = null;
        u.addRecurso(r);

        assertEquals(descricao, u.getDescricao());
    }
}
