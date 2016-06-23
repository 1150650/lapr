/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class AlterarPerfilUtilizadorControllerTest {
    
    public AlterarPerfilUtilizadorControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validaAlteracaoDados method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testValidaAlteracaoDados() {
        System.out.println("validaAlteracaoDados");
        String email = "diogo1@gmail.com";
        String username = "barros15";
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador utilizadorAtivo = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, utilizadorAtivo);
        instance.validaAlteracaoDados(email, username);

    }

    /**
     * Test of alterarDados method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testAlterarDados() {
        System.out.println("alterarDados");
        String nome = "Diogo1";
        String email = "diogo1@gmail.com";
        String username = "barros15";
        String password = ".DiogoBarros11";
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador utilizadorAtivo = new Utilizador("Diogo", "diogo@gmail.com", "barros16", ".DiogoBarros10");
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, utilizadorAtivo);
        instance.alterarDados(nome, email, username, password);

    }
    
}
