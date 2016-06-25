/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.DecidirDemonstraçõesController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.utils.HintTextField;

/**
 *
 * @author Simão Pedro
 */
public class DefinirDemonstraçõesEfetivasUI extends JFrame {

    private CentroExposicoes ce;

    private ModeloListaDemonstracoes lstDemonstracoes;

    private MenuPrincipal framePai;

    private Icon icon;

    private JButton btnSair, btnAceitar;

    private DecidirDemonstraçõesController crtlDecidirDemos;

    public DefinirDemonstraçõesEfetivasUI(MenuPrincipal framePai, CentroExposicoes ce) {
        super("Definir Demonstrações Efetivas");
        this.ce = ce;
        this.framePai = framePai;
        crtlDecidirDemos=new DecidirDemonstraçõesController(ce);

        selecionarExposicao();
        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        add(criarPainelNorte(), BorderLayout.NORTH);
        add(criarPainelCentro(), BorderLayout.CENTER);
        add(criarBotaoSair(), BorderLayout.SOUTH);
    }

    public void selecionarExposicao() {
        //Exposicao[] aux = ce.getListaExposicoes().getListaExposicaoParaDefinirDemos();
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
        crtlDecidirDemos.selecionarExposicao(expo);
        dispose();
    }

    private JPanel criarPainelNorte() {
        JLabel l = new JLabel(crtlDecidirDemos.getExpo().getTitulo(), JLabel.CENTER);
        JPanel j = new JPanel();
        j.add(l);
        return j;
    }

    private JPanel criarPainelCentro() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstDemonstracoes = new ModeloListaDemonstracoes(crtlDecidirDemos.getLstDemo());
        JList lstCompleta = new JList(lstDemonstracoes);

        btnAceitar = criarBotaoAceitarDemo(lstCompleta);

        p.add(criarPainelLista(lstCompleta, btnAceitar));

        return p;
    }

    private JButton criarBotaoAceitarDemo(JList lstCompleta) {
        btnAceitar = new JButton("Selecionar Candidatura");
        btnAceitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Demonstracao d = (Demonstracao) lstCompleta.getSelectedValue();
                if (d != null) {
                    crtlDecidirDemos.selecionarDemonstracao(d);
                    new AceitarUmaDemonstracaoUI(crtlDecidirDemos, DefinirDemonstraçõesEfetivasUI.this);
                } else {
                    JOptionPane.showMessageDialog(DefinirDemonstraçõesEfetivasUI.this, "Nenhuma Demonstração Selecionada", "Erro", ERROR);
                }
            }
        });
        return btnAceitar;
    }

    private JPanel criarPainelLista(JList lstCompleta, JButton btnAceitar) {
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(scrPane, BorderLayout.NORTH);
        p.add(btnAceitar, BorderLayout.CENTER);
        return p;
    }

    private JButton criarBotaoSair() {
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnSair;
    }
}
