/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.DefinirRecursosController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Recurso;
import lapr.project.utils.HintTextField;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DefinirRecursosUI extends JFrame {

    private DefinirRecursosController controller;

    private JTextField descricaoTF;

    private JList listaRecursos;

    final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 0;
    final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;

    private JLabel descricaoL;

    private CentroExposicoes centroExposicoes;

    private Recurso recurso;

    public DefinirRecursosUI(MenuPrincipal framePai, CentroExposicoes centroExposicoes) {

        super();
        this.centroExposicoes = centroExposicoes;

        criarComponentes();

        GridLayout gl = new GridLayout(7, 2);
        gl.setHgap(20);
        gl.setVgap(20);
        setLayout(gl);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel descricao = criarPainelDescricao();
        JPanel botoes = criarPainelBotoes();
        JPanel lista = criarPainelLista();

        add(descricao);
        add(lista);
        add(botoes);

    }

    private JPanel criarPainelDescricao() {
        JLabel lbl = new JLabel("Descrição", JLabel.RIGHT);

        descricaoTF = new HintTextField("Introduza a descrição");

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(descricaoTF);

        return p;
    }

    private JPanel criarPainelBotoes() {
        JButton btnOK = criarBotaoOK();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

    private JButton criarBotaoOK() {
        JButton btn = new JButton("Guardar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    recurso = controller.newRecurso(descricaoTF.getText());
                    controller.addRecurso(recurso);
                    dispose();
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            DefinirRecursosUI.this,
                            ex.getMessage(),
                            "ERRO!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        return btn;
    }

    private JButton criarBotaoCancelar() {
        JButton btn = new JButton("Cancelar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }

    private JPanel criarPainelLista() {
        JLabel lblTitulo = new JLabel("Lista de Recursos", JLabel.LEFT);
        listaRecursos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JPanel p = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(lblTitulo, BorderLayout.NORTH);
        return p;
    }

}
