/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author JOAO
 */
class JanelaPrincipal extends JFrame {

    private JButton btnLogin, btnRegistar;
    private JanelaPrincipal framePai;
    private CentroExposicoes centroExpo;
    private static final ImageIcon ICONE
            = new ImageIcon("centroExpo.jpg");

    public JanelaPrincipal(CentroExposicoes centroexposicao) throws IOException {

        super("Centro De Exposições");
        this.centroExpo = centroexposicao;

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void criarComponentes() throws IOException {
        add(criarPainelTitulo(), BorderLayout.NORTH);
        add(criarLblImagem(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);

    }

    private JPanel criarPainelTitulo() {
        JLabel lblMenuPrincipal = new JLabel("Centro de Exposições", JLabel.CENTER);
        lblMenuPrincipal.setFont(new Font("Helvetica", Font.BOLD, 50));
        lblMenuPrincipal.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblMenuPrincipal, JLabel.CENTER);

        return p;
    }

    private JPanel criarLblImagem() throws IOException {
        JLabel lbl = new JLabel(ICONE);
       
        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 50, MARGEM_DIREITA = 50;
         lbl.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        return p;
    }
    
    private JPanel criarPainelBotoes() {
        JButton btnEntrar = criarBotaoLogin();
        btnEntrar.setFont(new Font("Monospaced", Font.BOLD, 25));    
        
        JButton btnNovo = criarBotaoRegistarUtilizador();
        btnNovo.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        
        p.add(btnNovo);
        p.add(btnEntrar);


        return p;
    }
    
    private JButton criarBotaoLogin(){
        btnLogin = new JButton("Fazer Login");

        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DialogoLogin(JanelaPrincipal.this, centroExpo);

                
            }
        });
        return btnLogin;
    }
    
    private JButton criarBotaoRegistarUtilizador(){
        btnLogin = new JButton("Registar Utilizador");

        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


                
            }
        });
        return btnLogin;
    }
    
    
    
    
    }
    
    


