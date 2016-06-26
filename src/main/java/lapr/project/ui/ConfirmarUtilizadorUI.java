/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
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
import lapr.project.controller.ConfirmarUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class ConfirmarUtilizadorUI extends JFrame {

    private MenuPrincipal framePai;

    private ConfirmarUtilizadorController crtl;

    private ModeloListaUtilizadores listaUtilizadores;

    private CentroExposicoes ce;

    private JButton btnAdd, btnSair;

    public ConfirmarUtilizadorUI(MenuPrincipal framePai, CentroExposicoes ce) {
        this.framePai = framePai;
        this.ce = ce;
        this.crtl = new ConfirmarUtilizadorController(ce);

        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(framePai);
        setVisible(true);

    }

    private void criarComponentes() {
        JPanel b1 = criarPainelTitulo();
        JPanel b2 = criarPainelListaAdicionar();
        JPanel b3 = criarPainelSair();

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.SOUTH);
    }

    private JPanel criarPainelTitulo() {
        JPanel titulo = new JPanel();
        JLabel lTitulo = new JLabel("Utilizadores Por Confirmar");
        titulo.add(lTitulo);
        return titulo;
    }

    private JPanel criarPainelListaAdicionar() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        listaUtilizadores = new ModeloListaUtilizadores(crtl.getRegistoUtilizadoresNConf());
        JList lstCompleta = new JList(listaUtilizadores);

        btnAdd = criarBotaoAdicionarUtilizador(lstCompleta);

        p.add(criarPainelLista(lstCompleta, btnAdd));
        return p;
    }

    private JPanel criarPainelSair() {
        JPanel k = new JPanel();
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        k.add(btnSair);
        return k;
    }

    private JButton criarBotaoAdicionarUtilizador(JList lstCompleta) {
        JButton btn = new JButton("Aceitar Utilizador");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModeloListaUtilizadores m = (ModeloListaUtilizadores) lstCompleta.getModel();
                Utilizador m1 = (Utilizador) lstCompleta.getSelectedValue();
                crtl.selecionarUtilizador(m1);
                crtl.confirmarUtilizador();
                m.removeElement(m1);
            }
        });

        return btn;
    }

    private JPanel criarPainelLista(JList lstCompleta, JButton btnAdd) {
        JLabel lblTitulo = new JLabel("Utilizadores Nao Confirmados", JLabel.LEFT);
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
        p.add(btnAdd, BorderLayout.SOUTH);
        return p;
    }

}
