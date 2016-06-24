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
import lapr.project.controller.DefinirTpoDeConflitoController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author JOAO
 */
public class DefinirTipoDeConflitoUI extends JFrame{

    private JTextArea txtDescricaoConflito;
    private final DefinirTpoDeConflitoController contr;
    private final CentroExposicoes centroexpo;
    

    public DefinirTipoDeConflitoUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Definir Tipo de Conflito");
        this.centroexpo = ce;
        this.contr = new DefinirTpoDeConflitoController(ce);
        

        criarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel painel1 = criarPainelCentro();
        JPanel painel2 = criarPainelSul();

        add(painel1, BorderLayout.CENTER);
        add(painel2, BorderLayout.SOUTH);

    }

    private JPanel criarPainelCentro() {
        JLabel lbl1 = new JLabel("Descricao Do Tipo De Conflito:", JLabel.RIGHT);
        txtDescricaoConflito = new JTextArea(5,50);
        JScrollPane scrollPane2 = new JScrollPane(txtDescricaoConflito);

        JPanel pNorte = new JPanel();
        pNorte.add(lbl1);
        pNorte.add(scrollPane2);

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

                String descricao = txtDescricaoConflito.getText();
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
