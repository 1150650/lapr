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
public class ListaDemonstracoesTest {

    @Test
    public void test() {

        ListaDemonstracoes lst = new ListaDemonstracoes();
        Demonstracao e = new Demonstracao();

        Demonstracao a = new Demonstracao();
        a.setCodigo(867608);

        lst.addDemonstracao(a);
        lst.addDemonstracao(e);
        assertEquals(a, lst.obterDemonstracao(0));
        assertEquals(2, lst.tamanho());
    }

}
