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
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.utils.ImportarExportar;
import lapr.project.utils.MyJFileChooser;

/**
 *
 * @author JOAO
 */
class JanelaPrincipal extends JFrame {

    private JButton btnLogin, btnRegistar, btnSair;
    private JanelaPrincipal framePai;
    private CentroExposicoes centroExpo;
    private static final ImageIcon ICONE
            = new ImageIcon("centroExpo.jpg");

    public JanelaPrincipal(CentroExposicoes centroexposicao) {

        super("Centro De Exposições");
        this.centroExpo = centroexposicao;

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void criarComponentes() {
        add(criarPainelTitulo(), BorderLayout.NORTH);
        add(criarLblImagem(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
        JMenuBar menuBar = criarBarraMenus();
            setJMenuBar(menuBar);

    }
    
    private JMenuBar criarBarraMenus() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(criarMenuCE());
        //   menuBar.add(criarMenuOpcoes());

        return menuBar;
    }
    
    private JMenu criarMenuCE() {
        JMenu menu = new JMenu("Centro de Exposições");
        menu.setMnemonic(KeyEvent.VK_C);

        menu.add(criarImportar());
        menu.addSeparator();
        menu.add(criarSair());

        return menu;
    }
    
    private JMenuItem criarImportar() {
        JMenuItem item = new JMenuItem("Importar Novo", KeyEvent.VK_I);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImportarExportar imp = new ImportarExportar();
                MyJFileChooser fileChooser = new MyJFileChooser();
                int resposta = fileChooser.showOpenDialog(JanelaPrincipal.this);

                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    CentroExposicoes ce;
                    try {
                        ce = imp.importar(file.getPath());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                JanelaPrincipal.this,
                                "Impossível ler o ficheiro: " + file.getPath() + " !",
                                "Importar",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(
                            JanelaPrincipal.this,
                            "Centro de Exposições adicionado",
                            "Importar Centro de Exposição",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            
            }
        });
        return item;
    }
    
    private JMenuItem criarSair() {
        JMenuItem item = new JMenuItem("Sair", KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return item;
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

    private JPanel criarLblImagem() {
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
        
        JButton btnSair = criarBotaoSair();
        btnSair.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        
        
        p.add(btnNovo);
        p.add(Box.createRigidArea(new Dimension(285,0)));
        p.add(btnEntrar);        
        p.add(btnSair);


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
        btnRegistar = new JButton("Registar Utilizador");

        btnRegistar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new RegistarUtilizadorUI(JanelaPrincipal.this, centroExpo);
                
                
            }
        });
        return btnRegistar;
    }
    
    private JButton criarBotaoSair(){
        btnSair = new JButton("Sair");

        btnSair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                dispose();
                
                
            }
        });
        return btnSair;
    }
    
    
    
    
    }
    
    


