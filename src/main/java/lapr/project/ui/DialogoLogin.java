package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Login;
import lapr.project.model.Utilizador;

/**
 *
 * @author Diogo
 */
public class DialogoLogin extends JDialog {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private Login autenticarLogin;
    private JButton btnLogin;
    private JButton btnCancelar;
    private JanelaPrincipal framePai;
    private CentroExposicoes ce;
    private Utilizador utilizadorAtivo;

    private static final Dimension LABEL_TAMANHO = new JLabel("Username: ").
            getPreferredSize();

    public DialogoLogin(JanelaPrincipal framePai, CentroExposicoes centroExpo) {
        super(framePai, "Login", true);
        this.framePai = framePai;
        autenticarLogin = new Login(centroExpo);
        ce = centroExpo;
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel p1 = criarPainelUsername();
        JPanel p2 = criarPainelPassword();
        JPanel p3 = criarPainelBotoes();

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

    }

    public String getUsername() {
        return txtUsername.getText();
    }

    private JPanel criarPainelUsername() {
        JLabel lbl = new JLabel("Username: ", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 20;
        txtUsername = new JTextField(CAMPO_LARGURA);
        txtUsername.requestFocusInWindow();

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 0;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lbl);
        p.add(txtUsername);

        return p;
    }

    private JPanel criarPainelPassword() {
        JLabel lbl = new JLabel("Password: ", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int CAMPO_LARGURA = 20;
        txtPassword = new JPasswordField(CAMPO_LARGURA);
        txtPassword.setEchoChar('*');

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 0;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lbl);
        p.add(txtPassword);
        return p;

    }

    private JPanel criarPainelBotoes() {
        JButton btnOK = criarBotaoLogin();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

    private JButton criarBotaoLogin() {
        btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String username = txtUsername.getText();
                    String password = txtPassword.getText();
                    utilizadorAtivo = autenticarLogin.authenticate(username, password);
                    JOptionPane.showMessageDialog(DialogoLogin.this,
                            "Bem Vindo " + getUsername(),
                            "Login bem sucedido",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    framePai.dispose();
                    new MenuPrincipal(ce, utilizadorAtivo);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            framePai,
                            ex.getMessage(),
                            "ERRO!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        return btnLogin;
    }

    private JButton criarBotaoCancelar() {

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        return btnCancelar;
    }

}
