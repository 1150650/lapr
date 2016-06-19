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
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class CriarCandidaturaExposicaoUI extends JFrame {

    private CriarCandidaturaController crtlCriarCandidatura;

    final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 0;
    final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;

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

    private JTextField KeyWord1;

    private JTextField KeyWord2;

    private JTextField KeyWord3;

    private JTextField KeyWord4;

    private JTextField KeyWord5;

    public CriarCandidaturaExposicaoUI(MenuPrincipal framePai, CentroExposicoes ce, Utilizador u) {
        this.ce = ce;
        this.framePai = framePai;
        this.crtlCriarCandidatura = new CriarCandidaturaController(ce, u);
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
        JPanel KEYWORDS = criarPainelKeyWords();
        JPanel botoes = criarPainelBotoes();

        add(nomeEmpresa);
        add(morada);
        add(telemovel);
        add(areaExposicao);
        add(produtosExposicao);
        add(NrConvites);
        add(KEYWORDS);
        add(botoes);
    }

    private JPanel criarPainelNomeEmpresa() {
        JLabel lbl = new JLabel("Nome da Empresa:", JLabel.RIGHT);

        nomeEmpresaTF = new JTextField("Nome da Empresa");

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(nomeEmpresaTF);

        return p;
    }

    private JPanel criarPainelMorada() {
        JLabel lbl = new JLabel("Morada:", JLabel.RIGHT);

        moradaTF = new JTextArea("Insira Morada");
        moradaTF.setColumns(25);
        moradaTF.setLineWrap(true);
        moradaTF.setRows(3);
        moradaTF.setWrapStyleWord(true);
        moradaTF.setEditable(true);

        JScrollPane jsp1 = new JScrollPane(moradaTF);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(jsp1, BorderLayout.NORTH);

        return p;
    }

    private JPanel criarPainelTelemovel() {
        JLabel lbl = new JLabel("Telemóvel:", JLabel.RIGHT);

        telemovelTF = new JTextField("Insira número de telémovel");

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(telemovelTF);

        return p;
    }

    private JPanel criarPainelAreaExposicao() {
        JLabel lbl = new JLabel("Área da exposição:", JLabel.RIGHT);

        areaExposicaoTF = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(areaExposicaoTF);

        return p;
    }

    private JPanel criarPainelProdutosExposicao() {
        JLabel lbl = new JLabel("Produtos: ", JLabel.RIGHT);

        produtosTF = new JTextField("Insira os produtos que iram ser utilizados");

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(produtosTF);

        return p;
    }

    private JPanel criarPainelNrConvites() {
        JLabel lbl = new JLabel("Número de convites:", JLabel.RIGHT);

        nConvitesTF = new JTextField("Número de convites necessários");

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(nConvitesTF);

        return p;
    }

    private JPanel criarPainelBotoes() {
        JButton btnOK = criarBotaoOK();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
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

    private JPanel criarPainelKeyWords() {
        JLabel l = new JLabel("Keywords:");
        JPanel j = new JPanel();
        j.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        KeyWord1 = new JTextField("Palavras-chaves que definam a Candidatura");
        KeyWord2 = new JTextField("Palavras-chaves que definam a Candidatura");
        KeyWord3 = new JTextField("Palavras-chaves que definam a Candidatura");
        KeyWord4 = new JTextField("Palavras-chaves que definam a Candidatura");
        KeyWord5 = new JTextField("Palavras-chaves que definam a Candidatura");
        add(l);
        add(KeyWord1);
        add(KeyWord2);
        add(KeyWord3);
        add(KeyWord4);
        add(KeyWord5);

        return j;
    }
}
