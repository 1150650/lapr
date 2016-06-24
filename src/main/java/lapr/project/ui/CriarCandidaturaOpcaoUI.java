/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lapr.project.controller.CriarCandidaturaExposicaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class CriarCandidaturaOpcaoUI extends JFrame {

    private MenuPrincipal framePai;

    private CriarCandidaturaOpcaoUI Janela;

    private CentroExposicoes ce;

    private Icon icon;

    private Representante r;

    private CriarCandidaturaExposicaoController crtlCriarCandidatura;

    public CriarCandidaturaOpcaoUI(MenuPrincipal framePai, CentroExposicoes ce, Utilizador u) {
        Janela = this;
        this.framePai = framePai;
        this.ce = ce;
        crtlCriarCandidatura = new CriarCandidaturaExposicaoController(ce, u);

        GridLayout gl = new GridLayout(7, 1);
        gl.setHgap(20);
        gl.setVgap(20);
        setLayout(gl);

        selecionarExposicao();
        criarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void criarComponentes() {

        add(criarBotoes());

    }

    public void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique  Exposição que se pretende candidatar"
                + ":",
                "Seleção da Exposição que se pretende candidatar",
                JOptionPane.CLOSED_OPTION,
                icon,
                aux,
                "");
        crtlCriarCandidatura.selecionaExposicao(expo);
        dispose();
    }

    private JPanel criarBotoes() {
        JPanel j = new JPanel();
        add(criarSubmeterFicheiroXml());
        add(criarCandidaturaPrograma());
        add(criarBotaoSair());
        return j;
    }

    private JPanel criarSubmeterFicheiroXml() {
        JPanel pCentro = new JPanel(new BorderLayout());
        JButton j = new JButton("Submeter ficheiro em XML");
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SubmeterCandidaturaXML(Janela, crtlCriarCandidatura, ce);
            }
        });
        pCentro.add(j, BorderLayout.CENTER);
        return pCentro;
    }

    private JButton criarCandidaturaPrograma() {
        JButton j = new JButton("Criar Candidatura no Sistema");
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CriarCandidaturaExposicaoUI(Janela, crtlCriarCandidatura);
            }
        });
        return j;
    }

    private JButton criarBotaoSair() {
        JButton btn = new JButton("Sair");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }

}
