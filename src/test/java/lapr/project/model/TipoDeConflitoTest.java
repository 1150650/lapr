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
public class TipoDeConflitoTest {

    @Test
    public void  test() {
        TipoDeConflito u = new TipoDeConflito();
        String descricao = "Familia";
        u.setDescricao("Familia");

        
            assertEquals(descricao, u.getDescricao());
            

        

        
    }

}
