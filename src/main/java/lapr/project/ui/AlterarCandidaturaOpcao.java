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
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.AlterarCandidaturaController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class AlterarCandidaturaOpcao extends JFrame {

    private Utilizador u;

    private Icon icon;

    private AlterarCandidaturaController controller;

    private CentroExposicoes ce;

    private ModeloListaCandidaturas lstCandidaturasExposicao;

    private JButton btnSelecionarCandidatura, btnSair;

    private MenuPrincipal framePai;

    public AlterarCandidaturaOpcao(MenuPrincipal framePai, Utilizador u, CentroExposicoes ce) {
        this.framePai = framePai;
        this.u = u;
        this.ce = ce;
        this.controller = new AlterarCandidaturaController(u, ce);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        selecionarExposicao();
        add(criarPainelListaCanidaturas(), BorderLayout.CENTER);
        add(BotaoSair(), BorderLayout.SOUTH);
    }

    public void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique Exposicao que se candidatou"
                + ":",
                "Seleção Da Exposicao",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        controller.selecionaExposicao(expo);
    }

    private JPanel criarPainelListaCanidaturas() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstCandidaturasExposicao = new ModeloListaCandidaturas(controller.getListaCandidaturas());
        JList lstCompleta = new JList(lstCandidaturasExposicao);

        btnSelecionarCandidatura = criarBotaoSelecionarCandidatura(lstCompleta);

        p.add(criarPainelLista(lstCompleta, btnSelecionarCandidatura));

        return p;
    }

    private JPanel BotaoSair() {
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 1;
        final int INTERVALO_HORIZONTAL = 0, INTERVALO_VERTICAL = 10;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        p.add(btnSair);
        return p;
    }

    private JButton criarBotaoSelecionarCandidatura(JList lstCompleta) {
        JButton btn = new JButton("Selecionar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModeloListaCandidaturas m = (ModeloListaCandidaturas) lstCompleta.getModel();
                CandidaturaExposicao c = (CandidaturaExposicao) lstCompleta.getSelectedValue();
                controller.selecionarCandidatura(c);
                if (c != null) {
                    new AlterarCandidaturaUI(AlterarCandidaturaOpcao.this, controller);
                }
            }
        });

        return btn;
    }

    private JPanel criarPainelLista(JList lstCompleta, JButton btnSelecionarCandidatura) {
        JLabel lblTitulo = new JLabel("Selecione Candidatura a Alterar", JLabel.LEFT);
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);
        p.add(btnSelecionarCandidatura, BorderLayout.SOUTH);
        return p;
    }
}
