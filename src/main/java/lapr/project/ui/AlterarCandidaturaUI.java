/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lapr.project.controller.AlterarCandidaturaController;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;

/**
 *
 * @author SimãoPedro
 */
public class AlterarCandidaturaUI extends JFrame {

    private AlterarCandidaturaController crtl;

    private Icon icon;

    private CentroExposicoes ce;

    private Representante r;

    private MenuPrincipal framePai;
    
    private 

    public AlterarCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce, Representante r) {
        super("Alterar Candidatura");
        this.ce = ce;
        this.crtl = new AlterarCandidaturaController(r, ce);
        this.framePai = framePai;
        GridLayout g = new GridLayout(1, 1);
        g.setHgap(20);
        g.setVgap(20);
        setLayout(g);
        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(framePai);
        setVisible(true);

    }

    public void selecionarCandidatura() {
        CandidaturaExposicao[] aux = r.getListaCandidaturasSubmetidas().listaCandExposicaoToArray();
        CandidaturaExposicao candi;
        candi = (CandidaturaExposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique candidatura que deseja remover"
                + ":",
                "Seleção De Candidatura a Remover",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtl.selecionarCandidatura(candi);
    }

    private void criarComponentes() {
        selecionarCandidatura();
        JPanel nomeEmpresa = criarPainelNomeEmpresa();
        JPanel morada = criarPainelMorada();
        JPanel telemovel = criarPainelTelemovel();
        JPanel areaExposicao = criarPainelAreaExposicao();
        JPanel produtosExposicao = criarPainelProdutosExposicao();
        JPanel NrConvites = criarPainelNrConvites();
        JPanel botoes = criarPainelBotoes();

        add(nomeEmpresa);
        add(morada);
        add(telemovel);
        add(areaExposicao);
        add(produtosExposicao);
        add(NrConvites);
        add(botoes);

    }

    private JPanel criarPainelNomeEmpresa() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Nome Empresa ");
        JTextField jf = new JTextField(crtl.getCandidaturaSelecionada().getNomeEmpresa());
        jf.setEditable(false);

        jp.add(jf);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelMorada() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Morada ");
        JTextField jf = new JTextField(crtl.getCandidaturaSelecionada().getMorada());
        jf.setEditable(true);

        jp.add(jf);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelTelemovel() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Telemovel ");
        JTextField jf = new JTextField(Integer.toString(crtl.getCandidaturaSelecionada().getTelemovel()));
        jf.setEditable(true);

        jp.add(jf);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelAreaExposicao() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Área da Exposição ");
        JTextField jf = new JTextField(Float.toString(crtl.getCandidaturaSelecionada().getAreaPretendida()));
        jf.setEditable(true);

        jp.add(jf);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelProdutosExposicao() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Produtos Exposicao ");
        JTextField jf = new JTextField(crtl.getCandidaturaSelecionada().getProdutos());
        jf.setEditable(true);

        jp.add(jf);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelNrConvites() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Número Convites ");
        JTextField jf = new JTextField(Integer.toString(crtl.getCandidaturaSelecionada().getQuantidadeConvites()));
        jf.setEditable(true);

        jp.add(jf);
        jp.add(l);
        return jp;
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
                
            }
        });

        return btn;
    }
}
