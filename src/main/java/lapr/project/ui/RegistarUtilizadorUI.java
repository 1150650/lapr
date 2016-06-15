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
import lapr.project.controller.RegistarUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.utils.CaeserCypher;

/**
 *
 * @author Diogo
 */
public class RegistarUtilizadorUI extends JFrame {

    private JTextField txtNome, txtUsername, txtEmail;
    private JPasswordField txtPassword, txtPassword1;
    private JanelaPrincipal framePai;
    private RegistarUtilizadorController cntr;
    private static final Dimension LABEL_TAMANHO = new JLabel("Repita a password: ").
            getPreferredSize();

    public RegistarUtilizadorUI(JanelaPrincipal framePai, CentroExposicoes ce) {
        super("Novo Utilizador");

        GridLayout gl = new GridLayout(7, 1);
        gl.setHgap(20);
        gl.setVgap(20);
        this.cntr = new RegistarUtilizadorController(ce);

        setLayout(gl);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    private void criarComponentes() {

        JPanel titulo = criarPainelTitulo();
        JPanel nome = criarPainelNome();
        JPanel email = criarPainelEmail();
        JPanel username = criarPainelUsername();
        JPanel password = criarPainelPassword();
        JPanel password1 = criarPainelPassword1();
        JPanel botoes = criarPainelBotoes();

        add(titulo);
        add(nome);
        add(email);
        add(username);
        add(password);
        add(password1);
        add(botoes);
    }

    private JPanel criarPainelTitulo() {
        JLabel lblMenuPrincipal = new JLabel("Novo Utilizador", JLabel.LEFT);
        lblMenuPrincipal.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblMenuPrincipal.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblMenuPrincipal);

        return p;
    }

    private JPanel criarPainelNome() {
        JLabel lbl = new JLabel("Nome:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtNome = new JTextField(CAMPO_LARGURA);

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

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtUsername);

        return p;
    }

    private JPanel criarPainelPassword() {
        JLabel lbl = new JLabel("Password:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtPassword = new JPasswordField(CAMPO_LARGURA);
        txtPassword.setEchoChar('*');

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtPassword);

        return p;
    }

    private JPanel criarPainelPassword1() {
        JLabel lbl = new JLabel("Repita password:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 25;
        txtPassword1 = new JPasswordField(CAMPO_LARGURA);
        txtPassword1.setEchoChar('*');

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 25, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtPassword1);

        return p;
    }

    private JPanel criarPainelBotoes() {
        JButton btnRegistar = criarBotaoRegistar();
        getRootPane().setDefaultButton(btnRegistar);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 5, MARGEM_INFERIOR = 5;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(btnRegistar);
        p.add(btnCancelar);

        return p;
    }

    private JButton criarBotaoRegistar() {
        JButton btn = new JButton("Registar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txtPassword.getText().equals(txtPassword1.getText())) {
                        try {
                            String nome = txtNome.getText();
                            String email = txtEmail.getText();
                            String username = txtUsername.getText();
                            String password = txtPassword.getText();                       
                            cntr.criarUtilizador(nome, email, username, password);
                            cntr.registaUtilizador();
                            dispose();

                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(
                                    framePai,
                                    ex.getMessage(),
                                    "ERRO!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            framePai,
                            "Passwords não correspondem!",
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
