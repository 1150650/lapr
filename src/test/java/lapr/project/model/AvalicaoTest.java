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
public class AvalicaoTest {
    private Avaliacao a= new Avaliacao();
    
    @Test
    public void AvaliacaoTest(){
        String justificacao ="porque acho uma otima candidatura";
        int[] faeranking = {4,5,3,4,2};
        boolean decisao = true ;
        a.setAvaliacao(decisao);
        a.setJustificacao(justificacao);
        a.setConhecimentosFAE(faeranking);
        
          assertEquals(justificacao, a.getJustificacao());
          assertEquals(faeranking, a.getAvaliacao());
          assertEquals(decisao, a.getConhecimentosFAE());
    }
    
}
