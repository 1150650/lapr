/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lapr.project.controller.CriarCandidaturaController;
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

    private CriarCandidaturaController crtlCriarCandidatura;

    public CriarCandidaturaOpcaoUI(MenuPrincipal framePai, CentroExposicoes ce, Utilizador u) {
        Janela = this;
        this.framePai = framePai;
        this.ce = ce;
        criarComponentes();

        crtlCriarCandidatura = new CriarCandidaturaController(ce, u);

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
                "Indique candidatura que deseja remover"
                + ":",
                "Seleção De Candidatura a Remover",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtlCriarCandidatura.selecionaExposicao(expo);
    }

    private JPanel criarBotoes() {
        JPanel j = new JPanel();
        add(criarSubmeterFicheiroXml());
        add(criarCandidaturaPrograma());
        add(criarBotaoSair());
        return j;
    }

    private JButton criarSubmeterFicheiroXml() {
        JButton j = new JButton("Submeter ficheiro em XML");
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SubmeterCandidaturaXML(Janela, crtlCriarCandidatura, ce);
            }
        });
        return j;
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
