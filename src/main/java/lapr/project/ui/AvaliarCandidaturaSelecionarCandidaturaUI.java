/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import lapr.project.controller.AvaliarCandidaturaFAEController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class AvaliarCandidaturaSelecionarCandidaturaUI extends JFrame {

    private CentroExposicoes ce;

    private AvaliarCandidaturaFAEController crtlAvaliar;

    private Exposicao expo;

    private int termoParagem = 0;

    private Utilizador u;

    private JPanel cBox, listaCand, botoes;

    private FAE fae;

    public AvaliarCandidaturaSelecionarCandidaturaUI(MenuPrincipal framePai, Utilizador u, CentroExposicoes ce) {
        this.ce = ce;
        this.u = u;
        this.crtlAvaliar = new AvaliarCandidaturaFAEController(ce, u);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        if (termoParagem == 0) {
            add(cBox = criarComboBox());
            add(listaCand = criarPainelListaCanidaturas());
            add(botoes = Botoes());
            termoParagem++;
        } else {
            remove(cBox);
            remove(listaCand);
            remove(botoes);
            add(cBox = criarComboBox());
            add(listaCand = criarPainelListaCanidaturas());
            add(botoes = Botoes());
            revalidate();
        }
    }

    private JPanel criarComboBox() {

    }

    private JPanel criarPainelListaCanidaturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JPanel Botoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
