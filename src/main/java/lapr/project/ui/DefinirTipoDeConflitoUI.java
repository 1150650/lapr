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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lapr.project.controller.DefinirTpoDeConflitoController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author JOAO
 */
public class DefinirTipoDeConflitoUI extends JFrame{

    private JTextField txtDescricao;
    private DefinirTpoDeConflitoController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;

    public DefinirTipoDeConflitoUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Definir Tipo de Conflito");
        this.centroexpo = ce;
        this.contr = new DefinirTpoDeConflitoController(ce);
        this.framePai = framePai;

        criarComponentes();
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel p1 = criarPainelCentro();
        JPanel p2 = criarPainelSul();

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

    }

    private JPanel criarPainelCentro() {
        JLabel lbl = new JLabel("Descricao Do Tipo De Conflito:", JLabel.RIGHT);
        txtDescricao = new JTextField(40);

        JPanel pNorte = new JPanel();
        pNorte.add(lbl);
        pNorte.add(txtDescricao);

        return pNorte;
    }

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoOK();
        JButton btnCancelar = criarBotaoCancelar();

        JPanel pCentro = new JPanel();
        pCentro.add(btnOK);
        pCentro.add(btnCancelar);

        return pCentro;
    }

    private JButton criarBotaoOK() {
        JButton btn = new JButton("Registar Tipo De Conflito");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String descricao = txtDescricao.getText();
                contr.criarTipoDeConflito();
                contr.definirTipoDeConflito(descricao);
                contr.registarTipoDeConflito();
                dispose();
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
