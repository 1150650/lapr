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
public class TipoDeConflitoTest {

    @Test
    public boolean test() {
        TipoDeConflito u = new TipoDeConflito();
        String descricao = "Familia";
        u.setDescricao("Familia");

        if (u.getDescricao().equalsIgnoreCase(descricao)) {
            return true;

        }

        return false;
    }

}
