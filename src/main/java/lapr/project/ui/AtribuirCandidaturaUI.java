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
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
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

    final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
    final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;

    private AtribuirCandidaturaController crtAtribuir;

    private CentroExposicoes ce;

    private ModeloListaAtribuicoes modeloListaAtribuicoes;

    private final MenuPrincipal framePai;

    private JButton btnOk, btnCancelar;

    private JComboBox cbMec;

    public AtribuirCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {
        super("Atribuir Candidatura");
        this.framePai = framePai;
        this.ce = ce;
        this.crtAtribuir = new AtribuirCandidaturaController(ce);
        GridLayout g = new GridLayout(1, 1);
        g.setHgap(5);
        g.setVgap(5);
        setLayout(g);
        criarComponentes();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        //Exposicao[] arrayExposicao = ce.getRegistoExposicoesConflitosAlterados().getArray();
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

        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        crtAtribuir.selecionarMecanismo(cbMec.getSelectedIndex());
        p.add(label, new FlowLayout(FlowLayout.LEFT));
        p.add(cbMec, new FlowLayout(FlowLayout.CENTER));
        return p;
    }

    private JPanel criarPainelDescrição() {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        JLabel jl = new JLabel(crtAtribuir.getExposicaoSelecionada().getTitulo());
        p.add(jl, new FlowLayout(FlowLayout.CENTER));
        return p;

    }

    private JPanel criarPainelListaAtribuicoes() {
        JPanel p = new JPanel();
        modeloListaAtribuicoes = new ModeloListaAtribuicoes(crtAtribuir.getLstAtribuicoes());
        JList lstCompleta = new JList(modeloListaAtribuicoes);
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        p.add(criarPainelLista(lstCompleta));

        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel j = new JPanel();
        JButton j1 = criarBotaoCancelar();
        JButton j2 = criarBotaoOk();
        j.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
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

    private JPanel criarPainelLista(JList lstCompleta) {
        JLabel lblTitulo = new JLabel("Lista Atribuições", JLabel.CENTER);
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);
        return p;
    }
}
