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
public class ListaDemonstracoesTest {

    @Test
    public boolean test() {

        ListaDemonstracoes lst = new ListaDemonstracoes();
        Demonstracao e = new Demonstracao();

        Demonstracao a = new Demonstracao();
        a.setCodigo(867608);

        lst.addDemonstracao(a);
        lst.addDemonstracao(e);

        if (lst.tamanho() == 2) {
            if (lst.obterDemonstracao(0).equals(a)) {
                return true;

            }

            return false;

        }

        return false;

    }

}
