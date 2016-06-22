/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lapr.project.controller.AtribuirCandidaturaController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaAtribuicoes;

/**
 *
 * @author SimãoPedro
 */
public class AtribuirCandidaturaUI extends JFrame {

    private Icon icon;

    private AtribuirCandidaturaController crtAtribuir;

    private CentroExposicoes ce;

    private final MenuPrincipal framePai;

    private JButton btnOk, btnCancelar;

    private JComboBox cbMec;

    public AtribuirCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {
        super();
        this.framePai = framePai;
        this.ce = ce;
        this.crtAtribuir = new AtribuirCandidaturaController(ce);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        selecionarExposicao();
        add(criarPainelMecanismo());
        add(criarPainelDescrição());
        add(criarPainelListaAtribuicoes());
        add(criarPainelBotoes());
    }

    public void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao[] arrayExposicao = ce.getListaExposicoes().getRegistoExposicoesConflitosAlterados().getArray();
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
        crtAtribuir.selecionarExposicao(expo);
    }

    private JPanel criarPainelMecanismo() {
        JPanel p = new JPanel();
        JLabel label = new JLabel("Mecanismos");
        String[] mecanismo = {"", "Mecanismo Carga Equitativa Por FAE", "Mecanismo Experiencia por FAE", "Mecanismo numero candidaturas por FAE"};
        cbMec = new JComboBox(mecanismo);
        cbMec.setEditable(false);
        cbMec.setMaximumRowCount(4);
        crtAtribuir.selecionarMecanismo(cbMec.getSelectedIndex());
        p.add(label, new FlowLayout(FlowLayout.LEFT));
        p.add(cbMec, new FlowLayout(FlowLayout.CENTER));
        return p;
    }

    private JPanel criarPainelDescrição() {
        JPanel d = new JPanel();
        JLabel jl = new JLabel(crtAtribuir.getExposicaoSelecionada().getTitulo());

        d.add(jl, new FlowLayout(FlowLayout.CENTER));
        return d;

    }

    private JPanel criarPainelListaAtribuicoes() {
        JPanel l = new JPanel();
        JList list = new JList(new ModeloListaAtribuicoes(crtAtribuir.getLstAtribuicoes()));
        l.add(list, new FlowLayout(FlowLayout.CENTER));
        return l;
    }

    private JPanel criarPainelBotoes() {
        JPanel j = new JPanel();
        JButton j1 = criarBotaoCancelar();
        JButton j2 = criarBotaoOk();
        j.add(j1, new FlowLayout(FlowLayout.CENTER));
        j.add(j2, new FlowLayout(FlowLayout.CENTER));
        return j;
    }

    private JButton criarBotaoCancelar() {
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnCancelar;
    }

    private JButton criarBotaoOk() {
        btnOk = new JButton("Confirmar Atribuições");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    crtAtribuir.registaAtribuições();
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            framePai,
                            ex.getMessage(),
                            "ERRO!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        return btnOk;
    }
}
