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
public class RegistoTipoDeCandidaturaTest {

    @Test
    public void test() {

        RegistoTipoDeConflito lst = new RegistoTipoDeConflito();
        TipoDeConflito e = new TipoDeConflito("dinheiro");
        TipoDeConflito a = new TipoDeConflito("familia");

        lst.adicionarTipoDeConflito(a);
        lst.adicionarTipoDeConflito(e);
          assertEquals(2, lst.tamanho());
        
            
                assertEquals(a, lst.obterTipoDeConflito(0));
            

        }

        

    }


