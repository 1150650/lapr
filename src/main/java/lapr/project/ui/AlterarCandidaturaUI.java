/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lapr.project.controller.AlterarCandidaturaController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Representante;

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

    private JTextField nomeEmpresaTF;
    private JTextField moradaTF;
    private JTextField telemovelTF;
    private JTextField areaExposicaoTF;
    private JTextField produtosTF;
    private JTextField nConvitesTF;

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
        JLabel l = new JLabel("Alterar Candidatura");
        JPanel nomeEmpresa = criarPainelNomeEmpresa();
        JPanel morada = criarPainelMorada();
        JPanel telemovel = criarPainelTelemovel();
        JPanel areaExposicao = criarPainelAreaExposicao();
        JPanel produtosExposicao = criarPainelProdutosExposicao();
        JPanel NrConvites = criarPainelNrConvites();
        JPanel botoes = criarPainelBotoes();

        add(l);
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
        nomeEmpresaTF = new JTextField(crtl.getCandidaturaSelecionada().getNomeEmpresa());
        nomeEmpresaTF.setEditable(false);

        jp.add(nomeEmpresaTF);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelMorada() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Morada ");
        moradaTF = new JTextField(crtl.getCandidaturaSelecionada().getMorada());
        moradaTF.setEditable(true);

        jp.add(moradaTF);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelTelemovel() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Telemovel ");
        telemovelTF = new JTextField(Integer.toString(crtl.getCandidaturaSelecionada().getTelemovel()));
        telemovelTF.setEditable(true);

        jp.add(telemovelTF);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelAreaExposicao() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Área da Exposição ");
        areaExposicaoTF = new JTextField(Float.toString(crtl.getCandidaturaSelecionada().getAreaPretendida()));
        areaExposicaoTF.setEditable(true);

        jp.add(areaExposicaoTF);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelProdutosExposicao() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Produtos Exposicao ");
        produtosTF = new JTextField(crtl.getCandidaturaSelecionada().getProdutos());
        produtosTF.setEditable(true);

        jp.add(produtosTF);
        jp.add(l);
        return jp;
    }

    private JPanel criarPainelNrConvites() {
        JPanel jp = new JPanel();
        JLabel l = new JLabel("Número Convites ");
        nConvitesTF = new JTextField(Integer.toString(crtl.getCandidaturaSelecionada().getQuantidadeConvites()));
        nConvitesTF.setEditable(true);

        jp.add(nConvitesTF);
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
                try {
                    String NomeEmpresa = nomeEmpresaTF.getText();
                    String Morada = moradaTF.getText();
                    int Telemovel = Integer.parseInt(telemovelTF.getText());
                    String Produtos = produtosTF.getText();
                    float AreaExposicao = Float.parseFloat(areaExposicaoTF.getText());
                    int QuantidadeConvites = Integer.parseInt(nConvitesTF.getText());
                    crtl.novaCandidatura(NomeEmpresa, Morada, Telemovel, AreaExposicao, Produtos, QuantidadeConvites);
                    if (crtl.validarNovosDadosGlobal()) {
                        crtl.alterarDadosCandidatura();
                    }
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            AlterarCandidaturaUI.this.framePai,
                            ex.getMessage(),
                            "ERRO",
                            JOptionPane.WARNING_MESSAGE);
                }
                crtl.getCandidaturaSelecionada().getState().setAlterada();
            }
        }
        );

        return btn;
    }
}
