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

    private JPanel pLista;

    private JPanel pMeca, pDesc, pBot;

    private JComboBox cbMec;

    private int termoParagem = 0;

    public AtribuirCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {
        super("Atribuir Candidatura");
        this.framePai = framePai;
        this.ce = ce;
        this.crtAtribuir = new AtribuirCandidaturaController(ce);
        selecionarExposicao();
        GridLayout g = new GridLayout(4, 1);
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
        if (termoParagem == 0) {
            add(criarPainelMecanismo());
            add(criarPainelDescrição());
            add(criarPainelListaAtribuicoes());
            add(criarPainelBotoes());
            termoParagem++;
        } else {
            remove(pBot);
            remove(pLista);
            remove(pMeca);
            remove(pDesc);
            pMeca = criarPainelMecanismo();
            pDesc = criarPainelDescrição();
            pLista = criarPainelListaAtribuicoes();
            pBot = criarPainelBotoes();
            add(pMeca);
            add(pDesc);
            add(pLista);
            add(pBot);
            revalidate();
        }
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
        pMeca = new JPanel();
        JLabel label = new JLabel("Mecanismos");
        String[] mecanismo = {"", "Mecanismo Carga Equitativa Por FAE", "Mecanismo Experiencia por FAE", "Mecanismo numero candidaturas por FAE"};
        cbMec = new JComboBox(mecanismo);
        cbMec.setEditable(false);
        cbMec.setMaximumRowCount(4);

        pMeca.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        cbMec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int s1 = cbMec.getSelectedIndex();
                crtAtribuir.selecionarMecanismo(s1);
                crtAtribuir.atribuir();
                criarComponentes();
            }
        });
        pMeca.add(label, new FlowLayout(FlowLayout.LEFT));
        pMeca.add(cbMec, new FlowLayout(FlowLayout.CENTER));
        return pMeca;
    }

    private JPanel criarPainelDescrição() {
        pDesc = new JPanel();
        pDesc.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        JLabel jl = new JLabel(crtAtribuir.getExposicaoSelecionada().getTitulo());
        pDesc.add(jl, new FlowLayout(FlowLayout.CENTER));
        return pDesc;

    }

    private JPanel criarPainelListaAtribuicoes() {
        pLista = new JPanel();
        modeloListaAtribuicoes = new ModeloListaAtribuicoes(crtAtribuir.getLstAtribuicoes());
        JList lstCompleta = new JList(modeloListaAtribuicoes);
        pLista.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        pLista.add(criarPainelLista(lstCompleta));
        lstCompleta.revalidate();
        return pLista;
    }

    private JPanel criarPainelBotoes() {
        pBot = new JPanel();
        JButton j1 = criarBotaoCancelar();
        JButton j2 = criarBotaoOk();
        pBot.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));
        pBot.add(j1, new FlowLayout(FlowLayout.CENTER));
        pBot.add(j2, new FlowLayout(FlowLayout.CENTER));
        return pBot;
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
