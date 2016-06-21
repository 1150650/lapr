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
public class ListaAtribuicoesTest {

    @Test
    public void test() {

        ListaAtribuicoes lst = new ListaAtribuicoes();
        AtribuicaoFAE e = new AtribuicaoFAE();
        AtribuicaoFAE a = new AtribuicaoFAE();

        lst.adicionarAtribuição(a);
        lst.adicionarAtribuição(e);

        assertEquals(a, lst.obterAtribuicao(0));
        assertEquals(2, lst.tamanho());
        assertEquals(1, lst.indiceDe(e));
    }

}
