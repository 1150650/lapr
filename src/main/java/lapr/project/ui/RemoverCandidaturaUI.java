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
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
public class RemoverCandidaturaUI extends JFrame {

    private RemoverCandidaturaController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;
    private Icon icon;
    private Exposicao expo;
    private Candidatura candi;

    public RemoverCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Remover Candidatura ");
        this.centroexpo = ce;
        this.contr = new RemoverCandidaturaController(ce);
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
        JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();
        JButton btnRemoverCandidatura = criarBotaoRemoverCandidatura();
        JPanel pCentro = new JPanel();
        pCentro.add(btnSelecionarExposicao);
        pCentro.add(btnRemoverCandidatura);

        return pCentro;
    }

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoConcluirProcesso();
        JButton btnCancelar = criarBotaoCancelar();

        JPanel pSul = new JPanel();
        pSul.add(btnOK);
        pSul.add(btnCancelar);

        return pSul;
    }

    private JButton criarBotaoConcluirProcesso() {
        JButton btn = new JButton("Concluir Processo");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                    dispose();
                

            }
        });

        return btn;
    }

    private JButton criarBotaoSelecionarExposicao() {
        JButton btn = new JButton("Selecionar Exposicao");
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

    private JButton criarBotaoRemoverCandidatura() {
        JButton btn = new JButton("Remover Candidaturas");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (expo==null){
                    JOptionPane.showMessageDialog(rootPane, "Por favor selecione uma exposicao");
                }else{
                new DialogoRemoverCandidatura(RemoverCandidaturaUI.this,expo,contr);
                   dispose();
                }
               

             
            }
        });

        return btn;
    }
}
