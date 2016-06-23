/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Button;
import java.awt.Dimension;
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
import javax.swing.JTextArea;
import lapr.project.controller.DecidirDemonstraçõesController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;

/**
 *
 * @author Simão Pedro
 */
public class DecidirDemonstraçõesUI extends JFrame {

    private CentroExposicoes ce;

    private JComboBox<Demonstracao> cbTipo;

    private DecidirDemonstraçõesController cntrlDecidirDemo;

    private Icon icon;

    private JFrame framePai;

    private Exposicao expo;

    private JPanel painelInformaçãoDemonstracao = new JPanel();

    public DecidirDemonstraçõesUI(CentroExposicoes ce, MenuPrincipal framePai) {
        this.framePai = framePai;
        this.ce = ce;
        cntrlDecidirDemo = new DecidirDemonstraçõesController(ce);
        GridLayout gl = new GridLayout(4, 1);
        gl.setHgap(20);
        gl.setVgap(20);
        setLayout(gl);

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void selecionarExposicao() {
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
        cntrlDecidirDemo.selecionarExposicao(expo);
    }

    private JComboBox criarComboBox() {
        cbTipo = new JComboBox(cntrlDecidirDemo.getLstDemo().listaDemonstracaoToArray());
        cbTipo.setEditable(false);
        cbTipo.setMaximumRowCount(5);

        cbTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int s = cbTipo.getSelectedIndex();
                Demonstracao d = (Demonstracao) cbTipo.getSelectedItem();
                cntrlDecidirDemo.selecionarDemonstracao(d);
                painelInformaçãoDemonstracao.revalidate();
            }
        });
        return cbTipo;
    }

    private JPanel criarPainelInformaçãoDemonstracao() {
        JLabel l = new JLabel("Informação da Demonstração");
        JTextArea txt = new JTextArea(cntrlDecidirDemo.apresentarDados(), 20, 6);
        painelInformaçãoDemonstracao.add(l);
        painelInformaçãoDemonstracao.add(txt);

        return painelInformaçãoDemonstracao;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        add(criarBotaoOK());
        add(criarBotaoCancelar());
        return p;
    }

    private void criarComponentes() {
        add(criarComboBox());
        add(criarPainelInformaçãoDemonstracao());
        add(criarBotaoAceita());
        add(criarPainelBotoes());
    }

    private JButton criarBotaoOK() {
        JButton btn = new JButton("Guardar Demonstrações");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cntrlDecidirDemo.getExpo().setExposicaoDemonstracoesSemFAE();

                    dispose();

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            framePai,
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

    private Button criarBotaoAceita() {
        Button aceita = new Button("Irá funcionar");
        aceita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cntrlDecidirDemo.getDemonstraccao().setDemonstracaoCriada();

            }
        });
        return aceita;
    }

}
