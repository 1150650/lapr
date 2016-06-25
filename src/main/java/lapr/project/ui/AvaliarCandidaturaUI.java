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
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import lapr.project.controller.AvaliarCandidaturaFAEController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;

/**
 *
 * @author SimãoPedro
 */
public class AvaliarCandidaturaUI extends JFrame {

    private JRadioButton jrAceitar, jrNAceitar;

    private Icon icon;

    private JComboBox cb;

    private boolean aceite = true, nAceite = false;

    private JFrame framePai;

    private JTextArea txtJustificacao;

    private AvaliarCandidaturaFAEController crtlAvaliarCand;

    private CentroExposicoes ce;

    private FAE fae;

    public AvaliarCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce, Utilizador u) {
        super();
        this.framePai = framePai;
        this.fae = fae;
        this.ce = ce;
        this.crtlAvaliarCand = new AvaliarCandidaturaFAEController(ce, fae);
        selecionarExposicao();
        selecionarCandidatura();

        GridLayout g = new GridLayout(1, 1);
        g.setHgap(20);
        g.setVgap(20);
        setLayout(g);
        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        add(criarPainelInformaçãoCandidatura());
        add(criarPainelDecisão());
        add(criarPainelConhecimentosFAE());
        add(criarPainelBotoes());

    }

    private JPanel criarPainelDecisão() {
        JLabel lbl = new JLabel("Justificação: ", JLabel.RIGHT);
        jrAceitar = new JRadioButton("Aceite", aceite);
        jrNAceitar = new JRadioButton("Não Aceite", nAceite);
        txtJustificacao = new JTextArea();
        txtJustificacao.setColumns(50);
        txtJustificacao.setLineWrap(true);
        txtJustificacao.setRows(7);
        txtJustificacao.setWrapStyleWord(true);
        txtJustificacao.setEditable(true);

        JScrollPane jsp1 = new JScrollPane(txtJustificacao);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p.add(lbl);
        p.add(jrAceitar, FlowLayout.LEFT);
        p.add(jrNAceitar, FlowLayout.RIGHT);
        p.add(jsp1, BorderLayout.SOUTH);

        return p;

    }

    public void selecionarCandidatura() {
        CandidaturaExposicao[] aux = fae.getListacandidatura().listaCandExposicaoToArray();
        CandidaturaExposicao candi;
        candi = (CandidaturaExposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique candidatura que deseja Avaliar"
                + ":",
                "Seleção De Candidatura Avaliar",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtlAvaliarCand.selecionarCandidatura(candi);
    }

    private JPanel criarPainelInformaçãoCandidatura() {
        JPanel p = new JPanel();
        JLabel l = new JLabel("Informação da Candidatura");
        JTextArea txt = new JTextArea(crtlAvaliarCand.getInfo(), 20, 6);
        p.add(l);
        p.add(txt);

        return p;
    }

    private JPanel criarPainelConhecimentosFAE() {
        String[] parametros = {"Conhecimento a cerca da exposição",
            "Adequação da candidatura à exposição",
            "Adequação do número de convites por candidatura",
            "Recomendação global"};
        GridLayout j = new GridLayout(4, 2);
        setLayout(j);
        JPanel p1 = new JPanel(j);
        for (int i = 0; i < parametros.length; i++) {
            p1.add(new JLabel(parametros[i]), new FlowLayout(FlowLayout.LEFT));
            p1.add(Combo(), new FlowLayout(FlowLayout.CENTER));
        }
        return p1;

    }

    private JComboBox Combo() {
        String[] items = {"0", "1", "2", "3", "4", "5"};
        cb = new JComboBox(items);
        cb.setEditable(false);
        cb.setMaximumRowCount(4);
        return cb;
    }

    private JPanel criarPainelBotoes() {
        JPanel j = new JPanel();
        JButton j1 = criarBotaoCancelar();
        JButton j2 = criarBotaoConfirmar();
        j.add(j1);
        j.add(j2);
        return j;
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

    private JButton criarBotaoConfirmar() {
        JButton btn = new JButton("Alterar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            framePai,
                            ex.getMessage(),
                            "ERRO!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        );
        return btn;
    }

    private void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                this.framePai,
                "Selecionar Exposição"
                + ":",
                "Seleção De Exposição",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtlAvaliarCand.selecionarExposicao(expo);
    }

}
