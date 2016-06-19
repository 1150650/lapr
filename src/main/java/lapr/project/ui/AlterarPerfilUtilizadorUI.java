/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Dimension;
import javax.swing.JFrame;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Diogo
 */
public class AlterarPerfilUtilizadorUI extends JFrame {
    
    private CentroExposicoes centroExpo;
    private Utilizador utilizadorAtivo;
    
    public AlterarPerfilUtilizadorUI(CentroExposicoes ce, Utilizador utilizadorAtivo) {
        super("Alterar Dados de Utilizador");
        this.centroExpo = ce;
        this.utilizadorAtivo = utilizadorAtivo;
        
        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        //  setResizable(false);
    }
}
