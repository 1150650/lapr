package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.CriarCandidaturaController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Representante;

/**
 *
 * @author Simão Pedro
 */
public class CriarCandidaturaExposicaoUI extends JFrame {

    private CriarCandidaturaController crtlCriarCandidatura;

    private Icon icon;

    private Exposicao expo;

    private CentroExposicoes ce;

    private MenuPrincipal framePai;

    private JTextField nomeEmpresaTF;

    private JTextArea moradaTF;

    private JTextField telemovelTF;

    private JTextField areaExposicaoTF;

    private JTextField produtosTF;

    private JTextField nConvitesTF;

    public CriarCandidaturaExposicaoUI(MenuPrincipal framePai, CentroExposicoes ce, Representante r) {
        this.ce = ce;
        this.framePai = framePai;
        this.crtlCriarCandidatura = new CriarCandidaturaController(ce, r);
        selecionarCandidatura();

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    public void selecionarCandidatura() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique candidatura que deseja remover"
                + ":",
                "Seleção De Candidatura a Remover",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtlCriarCandidatura.selecionaExposicao(expo);
    }

    private void criarComponentes() {
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
        JLabel lbl = new JLabel("Nome da Empresa:", JLabel.RIGHT);

        final int CAMPO_LARGURA = 25;
        nomeEmpresaTF = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(nomeEmpresaTF);

        return p;
    }

    private JPanel criarPainelMorada() {
        JLabel lbl = new JLabel("Morada:", JLabel.RIGHT);

        moradaTF = new JTextArea();
        txtMorada.setColumns(25);
        txtMorada.setLineWrap(true);
        txtMorada.setRows(3);
        txtMorada.setWrapStyleWord(true);
        txtMorada.setEditable(true);

        JScrollPane jsp1 = new JScrollPane(txtMorada);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(jsp1, BorderLayout.NORTH);

        return p;
    }

    private JPanel criarPainelTelemovel() {
        JLabel lbl = new JLabel("Telemóvel:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtTelemovel = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtTelemovel);

        return p;
    }

    private JPanel criarPainelAreaExposicao() {
        JLabel lbl = new JLabel("Área da exposição:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtAreaExposicao = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtAreaExposicao);

        return p;
    }

    private JPanel criarPainelProdutosExposicao() {
        JLabel lbl = new JLabel("Produtos: ", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtProdutosExposicao = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtProdutosExposicao);

        return p;
    }

    private JPanel criarPainelNrConvites() {
        JLabel lbl = new JLabel("Número de convites:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtQuantidadeConvites = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtQuantidadeConvites);

        return p;
    }

    private JPanel criarPainelBotoes() {
        JButton btnOK = criarBotaoOK();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

    private JButton criarBotaoOK() {
        JButton btn = new JButton("Registar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String NomeEmpresa = txtNomeEmpresa.getText();
                    String Morada = txtMorada.getText();
                    int Telemovel = Integer.parseInt(txtTelemovel.getText());
                    String Produtos = txtProdutosExposicao.getText();
                    float AreaExposicao = Float.parseFloat(txtAreaExposicao.getText());
                    int QuantidadeConvites = Integer.parseInt(txtQuantidadeConvites.getText());
                    cntr.selecionaExposicao(expoSelecionada);
                    Candidatura auxiliar = new Candidatura();
                    cntr.setDados(auxiliar, NomeEmpresa, Morada, Telemovel, AreaExposicao, Produtos, QuantidadeConvites);

                    cntr.adicionarCandidatura();
                    dispose();

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            frame,
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
}
