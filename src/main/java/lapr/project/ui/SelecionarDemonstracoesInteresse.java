/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.CriarCandidaturaExposicaoController;
import lapr.project.model.Demonstracao;
import lapr.project.model.ListaDemonstracoes;

/**
 *
 * @author Simão Pedro
 */
public class SelecionarDemonstracoesInteresse extends JFrame {

    private CriarCandidaturaExposicaoController crt;

    private ModeloListaDemonstracoes modeloListaDemonstracoes;

    private CriarCandidaturaExposicaoUI framePai;

    private JButton btnAdd, btnSair;

    public SelecionarDemonstracoesInteresse(CriarCandidaturaExposicaoUI framePai, CriarCandidaturaExposicaoController crt) {
        this.crt = crt;
        this.framePai = framePai;

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel p1 = criarPainelNorte();
        JPanel p3 = criarPainelCentro();
        JPanel p2 = criarPainelSul();

        add(p1, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }

    private JPanel criarPainelNorte() {
        JPanel painelLabel = new JPanel();
        JLabel j = new JLabel("Selecione Demonstrações que tenha interesse em participar");
        painelLabel.add(j);
        return painelLabel;
    }

    private JPanel criarPainelCentro() {
        JPanel p = new JPanel();
        modeloListaDemonstracoes = new ModeloListaDemonstracoes(crt.getListaDemonstracoes());
        JList lstCompleta = new JList(modeloListaDemonstracoes);
        btnAdd = criarBotaoAdicionar(lstCompleta);
        p.add(criarPainelLista("Lista de Demonstrações",
                lstCompleta,
                btnAdd));
        return p;
    }

    private JPanel criarPainelSul() {
        JPanel i = new JPanel();
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        i.add(btnSair);
        return i;
    }

    private JPanel criarPainelLista(String titulo, JList lstCompleta, JButton btnAdd) {
        JLabel lblTitulo = new JLabel(titulo, JLabel.CENTER);
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());

//        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
//        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
//        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
//                MARGEM_ESQUERDA,
//                MARGEM_INFERIOR,
//                MARGEM_DIREITA));
        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);
        p.add(btnAdd, BorderLayout.SOUTH);
        return p;
    }

    private JButton criarBotaoAdicionar(JList lstCompleta) {
        JButton btn = new JButton("Adicionar Demonstração");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModeloListaDemonstracoes listaDemo = (ModeloListaDemonstracoes) lstCompleta.getModel();
                Demonstracao demo = (Demonstracao) lstCompleta.getSelectedValue();
                crt.getCandidaturaCriada().addDemonstracoesComInteresse(demo);
                listaDemo.removeElement(demo);

            }
        });

        return btn;
    }

}
