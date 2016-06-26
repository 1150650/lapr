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
import lapr.project.model.Avaliacao;
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

    private JComboBox simNao;

    private Icon icon;

    private JComboBox cb1, cb2, cb3, cb4;

    private boolean aceite = true, nAceite = false;

    private JFrame framePai;

    private JTextArea txtJustificacao;

    private AvaliarCandidaturaFAEController crtlAvaliarCand;

    private CentroExposicoes ce;

    private FAE fae;

    public AvaliarCandidaturaUI(AvaliarCandidaturaSelecionarCandidaturaUI framePai, AvaliarCandidaturaFAEController crtlAvaliarCand) {
        super();
        this.framePai = framePai;
        this.fae = fae;
        this.ce = ce;
        this.crtlAvaliarCand = crtlAvaliarCand;

        GridLayout g = new GridLayout(4, 1);
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
        JLabel lbl = new JLabel("Justificação", JLabel.CENTER);
        String[] decisao = new String[2];
        decisao[0] = "Aceitar";
        decisao[1] = "Não Aceite";
        simNao = new JComboBox(decisao);
        txtJustificacao = new JTextArea();
        txtJustificacao.setColumns(50);
        txtJustificacao.setLineWrap(true);
        txtJustificacao.setRows(7);
        txtJustificacao.setWrapStyleWord(true);
        txtJustificacao.setEditable(true);

        JScrollPane jsp1 = new JScrollPane(txtJustificacao);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p.add(lbl, BorderLayout.NORTH);
        p.add(simNao, FlowLayout.LEFT);;
        p.add(jsp1, FlowLayout.RIGHT);

        return p;

    }

    private JPanel criarPainelInformaçãoCandidatura() {
        JPanel p = new JPanel();
        JLabel l = new JLabel("Informação da Candidatura", JLabel.LEFT);
        JTextArea txt = new JTextArea(crtlAvaliarCand.getInfo());
        txt.setEditable(false);
        txt.setAlignmentY(CENTER_ALIGNMENT);
        p.add(l);
        p.add(txt);

        return p;
    }

    private JPanel criarPainelConhecimentosFAE() {
        JPanel pai = new JPanel();
        String[] parametros = {"Conhecimento a cerca da exposição",
            "Adequação da candidatura à exposição",
            "Adequação do número de convites por candidatura",
            "Recomendação global"};
        GridLayout j = new GridLayout(4, 2);
        setLayout(j);
        JPanel p1 = new JPanel(j);
        JPanel p2 = new JPanel(j);
        JPanel p3 = new JPanel(j);
        JPanel p4 = new JPanel(j);
        p1.add(new JLabel(parametros[0]), new FlowLayout(FlowLayout.LEFT));
        p1.add(Combo1(), new FlowLayout(FlowLayout.CENTER));
        p2.add(new JLabel(parametros[1]), new FlowLayout(FlowLayout.LEFT));
        p2.add(Combo2(), new FlowLayout(FlowLayout.CENTER));
        p3.add(new JLabel(parametros[2]), new FlowLayout(FlowLayout.LEFT));
        p3.add(Combo3(), new FlowLayout(FlowLayout.CENTER));
        p4.add(new JLabel(parametros[3]), new FlowLayout(FlowLayout.LEFT));
        p4.add(Combo4(), new FlowLayout(FlowLayout.CENTER));
        pai.add(p1);
        pai.add(p2);
        pai.add(p3);
        pai.add(p4);
        return pai;

    }

    private JComboBox Combo1() {
        String[] items = {"0", "1", "2", "3", "4", "5"};
        cb1 = new JComboBox(items);
        cb1.setEditable(false);
        cb1.setMaximumRowCount(4);
        return cb1;
    }

    private JComboBox Combo2() {
        String[] items = {"0", "1", "2", "3", "4", "5"};
        cb2 = new JComboBox(items);
        cb2.setEditable(false);
        cb2.setMaximumRowCount(4);
        return cb2;
    }

    private JComboBox Combo3() {
        String[] items = {"0", "1", "2", "3", "4", "5"};
        cb3 = new JComboBox(items);
        cb3.setEditable(false);
        cb3.setMaximumRowCount(4);
        return cb3;
    }

    private JComboBox Combo4() {
        String[] items = {"0", "1", "2", "3", "4", "5"};
        cb4 = new JComboBox(items);
        cb4.setEditable(false);
        cb4.setMaximumRowCount(4);
        return cb4;
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
        JButton btn = new JButton("Confirmar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean decisao;
                    if (simNao.getSelectedIndex() == 0) {
                        decisao = true;
                    } else {
                        decisao = false;
                    }
                    int avaliacao1 = Integer.parseInt(cb1.getSelectedItem().toString());
                    int avaliacao2 = Integer.parseInt(cb2.getSelectedItem().toString());
                    int avaliacao3 = Integer.parseInt(cb3.getSelectedItem().toString());
                    int avaliacao4 = Integer.parseInt(cb4.getSelectedItem().toString());
                    int[] conhecimentos = new int[4];
                    conhecimentos[0] = avaliacao1;
                    conhecimentos[1] = avaliacao2;
                    conhecimentos[2] = avaliacao3;
                    conhecimentos[3] = avaliacao4;
                    Avaliacao a = new Avaliacao(decisao, txtJustificacao.getText(), conhecimentos);
                    crtlAvaliarCand.adicionarAvaliacao(a);
                    dispose();
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
}
