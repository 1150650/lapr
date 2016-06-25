/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import lapr.project.controller.DecidirDemonstraçõesController;
import lapr.project.utils.HintTextField;

/**
 *
 * @author Simão Pedro
 */
public class AceitarUmaDemonstracaoUI extends JFrame {

    private DecidirDemonstraçõesController crtlDecidirDemo;

    final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
    final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;

    private JTextField txtInicio, txtFim;

    private JButton btnSair, btnAceitar;

    private Date dtIncio, dtFim;

    private DefinirDemonstraçõesEfetivasUI framePai;

    public AceitarUmaDemonstracaoUI(DecidirDemonstraçõesController crtlDecidirDemo, DefinirDemonstraçõesEfetivasUI framePai) {
        this.crtlDecidirDemo = crtlDecidirDemo;
        this.framePai = framePai;

        GridLayout g = new GridLayout(3, 0);
        g.setHgap(20);
        g.setVgap(20);
        setLayout(g);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        add(criarPainelInfoDemo());
        add(criarData());
        add(criarBotoes());
    }

    private JPanel criarData() {
        JLabel lbl = new JLabel("Data de inicio :");

        txtInicio = new HintTextField("Indicação da data de Inico (AAAA-MM-DD)");
        JLabel lbl1 = new JLabel("Data de Final :");

        txtFim = new HintTextField("Indicação da data de Fim (AAAA-MM-DD)");

        JPanel p = new JPanel();

        p.add(lbl);
        p.add(txtInicio);
        p.add(lbl1);
        p.add(txtFim);

        return p;
    }

    private JPanel criarPainelInfoDemo() {
        JTextArea txtArea = new JTextArea(crtlDecidirDemo.getDemonstraccao().toString());
        JScrollPane txtScrollpane = new JScrollPane(txtArea);
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        p.add(txtScrollpane);
        return p;
    }

    private JPanel criarBotoes() {
        JPanel j = new JPanel();
        btnAceitar = criarBotaoAceitar();
        btnSair = criarBotaoSair();
        j.add(btnAceitar);
        j.add(btnSair);
        return j;
    }

    private JButton criarBotaoAceitar() {
        btnAceitar = new JButton("Aceitar");
        btnAceitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data1 = txtInicio.getText().split("-");
                String[] data2 = txtFim.getText().split("-");
                dtIncio = new Date(Integer.parseInt(data1[0]), Integer.parseInt(data1[1]), Integer.parseInt(data1[2]));
                dtFim = new Date(Integer.parseInt(data2[0]), Integer.parseInt(data2[1]), Integer.parseInt(data2[2]));
                crtlDecidirDemo.getDemonstraccao().setDataInicio(dtIncio);
                crtlDecidirDemo.getDemonstraccao().setDataFim(dtFim);
                crtlDecidirDemo.getDemonstraccao().setDemonstracaoAprovada();
                dispose();
            }
        });
        return btnAceitar;
    }

    private JButton criarBotaoSair() {
        btnSair = new JButton("Cancelar");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnSair;
    }
}
