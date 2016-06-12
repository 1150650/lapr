/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lapr.project.controller.RemoverCandidaturaController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;

/**
 *
 * @author JOAO
 */
public class RemoverCandidaturaUI extends JDialog {

    private RemoverCandidaturaController contr;
    private CentroExposicoes centroexpo;
    private JanelaPrincipal framePai;
    private Icon icon;
    private Exposicao expo;
    private Candidatura candi;

    public RemoverCandidaturaUI(JanelaPrincipal framePai, CentroExposicoes ce, Exposicao expo) {

        super(framePai, "Nova Candidatura", true);
        this.centroexpo = ce;
        this.contr = new RemoverCandidaturaController(ce);
        this.framePai = framePai;
        criarComponentes();

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel p1 = criarPainelCentro();
        JPanel p2 = criarPainelSul();

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

    }

    private JPanel criarPainelCentro() {
        JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();
        JButton btnSelecionarCandidatura = criarBotaoSelecionarCandidatura();
        JPanel pCentro = new JPanel(new BorderLayout());
        pCentro.add(btnSelecionarExposicao);
        pCentro.add(btnSelecionarCandidatura);

        return pCentro;
    }

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoRemover();
        JButton btnCancelar = criarBotaoCancelar();

        JPanel pSul = new JPanel(new BorderLayout());
        pSul.add(btnOK);
        pSul.add(btnCancelar);

        return pSul;
    }

    private JButton criarBotaoRemover() {
        JButton btn = new JButton("Registar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (expo == null || candi == null) {
                    JOptionPane.showMessageDialog(rootPane, e, "Tem de selecionar a exposicao e de seguida a"
                            + "Candidatura que deseja remover", JOptionPane.ERROR_MESSAGE);

                } else {
                    contr.removerCandidatura(candi);
                    dispose();
                }

            }
        });

        return btn;
    }

    private JButton criarBotaoSelecionarExposicao() {
        JButton btn = new JButton("Registar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exposicao[] aux = contr.getListaExposicoes();

                expo = (Exposicao) JOptionPane.showInputDialog(
                        framePai,
                        "Indique a exposição da qual deseja retirar a candidatura"
                        + ":",
                        "Seleção De Exposição",
                        JOptionPane.DEFAULT_OPTION,
                        icon,
                        aux,
                        "");

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

    private JButton criarBotaoSelecionarCandidatura() {
        JButton btn = new JButton("Registar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Candidatura[] aux = contr.getListaCandidaturas(expo);

                candi = (Candidatura) JOptionPane.showInputDialog(
                        framePai,
                        "Indique candidatura que deseja remover"
                        + ":",
                        "Seleção De Candidatura a Remover",
                        JOptionPane.DEFAULT_OPTION,
                        icon,
                        aux,
                        "");

                dispose();
            }
        });

        return btn;
    }
}
