/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.AlterarPerfilUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import lapr.project.utils.HintPasswordField;

/**
 *
 * @author Diogo
 */
public class AlterarPerfilUtilizadorUI extends JFrame {

    private JTextField txtNome, txtUsername, txtEmail;
    private JPasswordField txtPasswordAtual, txtPasswordNova, txtPasswordNova1;
    private CentroExposicoes centroExpo;
    private Utilizador utilizadorAtivo;
    private AlterarPerfilUtilizadorController cntr;
    private static final Dimension LABEL_TAMANHO = new JLabel("Repita a password: ").
            getPreferredSize();

    public AlterarPerfilUtilizadorUI(CentroExposicoes ce, Utilizador utilizadorAtivo) {
        super("Alterar Dados de Utilizador");
        this.centroExpo = ce;
        this.utilizadorAtivo = utilizadorAtivo;

        GridLayout gl = new GridLayout(8, 1);
        gl.setHgap(20);
        gl.setVgap(20);
        this.cntr = new AlterarPerfilUtilizadorController(ce, utilizadorAtivo);
        setLayout(gl);

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        //  setResizable(false);
    }

    private void criarComponentes() {
        JPanel titulo = criarPainelTitulo();
        JPanel nome = criarPainelNome();
        JPanel email = criarPainelEmail();
        JPanel username = criarPainelUsername();
        JPanel passwordAtual = criarPainelPasswordAtual();
        JPanel passwordNova = criarPainelPasswordNova();
        JPanel passwordNova1 = criarPainelPasswordNova1();
        JPanel botoes = criarPainelBotoes();

        add(titulo);
        add(nome);
        add(email);
        add(username);
        add(passwordAtual);
        add(passwordNova);
        add(passwordNova1);
        add(botoes);
    }

    private JPanel criarPainelTitulo() {
        JLabel lblTitulo = new JLabel("Alterar Dados do utilizador", JLabel.LEFT);
        lblTitulo.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblTitulo.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblTitulo);

        return p;
    }

    private JPanel criarPainelNome() {
        JLabel lbl = new JLabel("Nome:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtNome = new JTextField(CAMPO_LARGURA);
        txtNome.setText(utilizadorAtivo.getNome());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtNome);

        return p;
    }

    private JPanel criarPainelEmail() {
        JLabel lbl = new JLabel("Email:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtEmail = new JTextField(CAMPO_LARGURA);
        txtEmail.setText(utilizadorAtivo.getEmail());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtEmail);

        return p;
    }

    private JPanel criarPainelUsername() {
        JLabel lbl = new JLabel("Username:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtUsername = new JTextField(CAMPO_LARGURA);
        txtUsername.setText(utilizadorAtivo.getUsername());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtUsername);

        return p;
    }

    private JPanel criarPainelPasswordAtual() {
        JLabel lbl = new JLabel("Password Atual:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtPasswordAtual = new HintPasswordField("Digite a sua password atual");
        txtPasswordAtual.setColumns(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtPasswordAtual);

        return p;
    }

    private JPanel criarPainelPasswordNova() {
        JLabel lbl = new JLabel("Nova Password:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtPasswordNova = new HintPasswordField("Digite a nova password");
        txtPasswordNova.setColumns(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtPasswordNova);

        return p;
    }

    private JPanel criarPainelPasswordNova1() {
        JLabel lbl = new JLabel("Repita Nova Password:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtPasswordNova1 = new HintPasswordField("Digite novamente a nova password");
        txtPasswordNova1.setColumns(CAMPO_LARGURA);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtPasswordNova1);

        return p;
    }

    private JPanel criarPainelBotoes() {
        JButton btnConcluido = criarBotaoConcluido();
        getRootPane().setDefaultButton(btnConcluido);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(btnConcluido);
        p.add(btnCancelar);

        return p;
    }

    private JButton criarBotaoConcluido() {
        JButton btn = new JButton("Concluir");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txtPasswordAtual.getText().equals(utilizadorAtivo.getPasswordDesencriptada())) {
                        try {
                            if (txtPasswordNova.getText().equals(txtPasswordNova1.getText())) {
                                try {
                                    String nome = txtNome.getText();
                                    String email = txtEmail.getText();
                                    String username = txtUsername.getText();
                                    String password = txtPasswordNova.getText();
                                    cntr.validaAlteracaoDados(email, username);
                                    cntr.alterarDados(nome, email, username, password);
                                    JOptionPane.showMessageDialog(
                                            AlterarPerfilUtilizadorUI.this,
                                            "Alterações realizada com sucesso!",
                                            "Sucesso",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    dispose();

                                } catch (IllegalArgumentException ex) {
                                    JOptionPane.showMessageDialog(
                                            AlterarPerfilUtilizadorUI.this,
                                            ex.getMessage(),
                                            "ERRO!",
                                            JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(
                                    AlterarPerfilUtilizadorUI.this,
                                    "Passwords novas não correspondem!",
                                    "ERRO!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            AlterarPerfilUtilizadorUI.this,
                            "Password atual incorreta!",
                            "ERRO!",
                            JOptionPane.WARNING_MESSAGE);
                    txtPasswordAtual.setText(null);
                    txtPasswordAtual.setFocusable(true);
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
