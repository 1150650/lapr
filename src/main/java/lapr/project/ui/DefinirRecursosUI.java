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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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

    private ModeloListaRecursos lstRecursos;

    public DefinirRecursosUI(MenuPrincipal framePai, CentroExposicoes centroExposicoes) {

        super("Definir Recursos");
        this.centroExposicoes = centroExposicoes;
        this.controller = new DefinirRecursosController(this.centroExposicoes);

        GridLayout gl = new GridLayout(8, 0);
        gl.setHgap(20);
        gl.setVgap(20);
        setLayout(gl);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel descricao = criarPainelDescricao();
        JPanel botoes = criarPainelBotoes();

        add(descricao, BorderLayout.NORTH);
        add(botoes, BorderLayout.SOUTH);

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
}
