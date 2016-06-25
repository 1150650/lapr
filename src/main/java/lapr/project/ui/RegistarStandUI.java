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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import lapr.project.controller.RegistarStandController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author JOAO
 */
public class RegistarStandUI extends JFrame {

    private JTextArea txtDescricaoStand;
    private RegistarStandController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;

    public RegistarStandUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Registar Stand");
        this.centroexpo = ce;
        this.contr = new RegistarStandController(ce);
        this.framePai = framePai;

        criarComponentes();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 300));
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
        JLabel lbl = new JLabel("Descricao Stand :", JLabel.RIGHT);
        txtDescricaoStand = new JTextArea(5,40);
        JScrollPane scrollPane = new JScrollPane(txtDescricaoStand);

        JPanel pNorte = new JPanel();
        pNorte.add(lbl);
        pNorte.add(scrollPane);

        return pNorte;
    }

    private JPanel criarPainelSul() {
        JButton btnOK1 = criarBotaoOK();
        JButton btnCancelar = criarButtonCancelar();

        JPanel pCentro = new JPanel();
        pCentro.add(btnOK1);
        pCentro.add(btnCancelar);

        return pCentro;
    }

    private JButton criarBotaoOK() {
        JButton btn3 = new JButton("Registar Stand");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String descricao = txtDescricaoStand.getText();
                contr.criarStand();
                contr.setDadosStand(descricao);
                contr.registarStand();
                dispose();
            }
        });

        return btn3;
    }

    private JButton criarButtonCancelar() {
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
