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
public class ListaOrganizadoresTest {

    @Test
    public void test() {

        Utilizador u = new Utilizador("admin", "admin@gmail.com", "admin", ".Admin10");
        Organizador o = new Organizador();
        o.setUtilizador(u);

        ListaOrganizadores lst = new ListaOrganizadores();

        lst.adicionarOrganizador(o);

        assertEquals(o, lst.obterOrganizador(0));
        assertEquals(1, lst.tamanho());
        assertEquals(0, lst.indiceDe(o));
        assertEquals(true, lst.isUserOrganizador(u));
    }

}
