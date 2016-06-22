/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoUtilizador;
import lapr.project.model.Utilizador;
import lapr.project.utils.ImportarExportar;
import lapr.project.utils.MyJFileChooser;

/**
 *
 * @author SimãoPedro
 */
public class MenuPrincipal extends JFrame {

    private CentroExposicoes ce;
    private JanelaPrincipal framePrincipal;
    private String tipoUtilizador = "Utilizador";
    private int termoParagem = 0;
    private DialogoLogin login;
    private JComboBox<TipoUtilizador> cbTipo;
    private Utilizador utilizadorAtivo;
    private JTabbedPane tabPane;
    private JButton btnDecidirFAE, btnAtribuirCandidatura, btnCriarStand,
            btnAvaliacaoFinalCand, btnCriarDemonstracao, btnAtribuirStands,
            btnAtribuirCandDemonstracao, btnDecidirCandidatura,
            btnAtualizarConflitosInteresse, btnAvaliarCandDemonstracao,
            btnRegistarExposicao, btnConfirmarRegistoUtilizador,
            btnDefinirRecursos, btnDefinirTipoConflito, btnCandidatarExposicao,
            btnAlterarCandidatura, btnDecidirDemonstracao, btnRetirarCandidatura,
            btnRegistarCandDemonstracao, btnConfirmarStand;
    private static final Dimension LABEL_TAMANHO = new JLabel("Username: ").
            getPreferredSize();
    private JPanel painelDadosUtilizador = new JPanel(),
            painelBotoesOrganizador = new JPanel(),
            painelBotoesFAE = new JPanel(), painelBotoesGestor = new JPanel(),
            painelBotoesRepresentante = new JPanel();

    public MenuPrincipal(CentroExposicoes centroexposicao, Utilizador u) {
        super("Menu Principal");
        this.ce = centroexposicao;
        this.utilizadorAtivo = u;

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        //  setResizable(false);
    }

    private void criarComponentes() {
        if (termoParagem == 0) {
            add(criarPainelTitulo(), BorderLayout.NORTH);
            add(criarPainelUtilizador(), BorderLayout.SOUTH);
            JMenuBar menuBar = criarBarraMenus();
            setJMenuBar(menuBar);
            termoParagem = 1;
        }
        if (tipoUtilizador.equals("Utilizador")) {
            eliminarPaineis();
            add(criarPainelDadosUtilizador(), BorderLayout.CENTER);

        } else if (tipoUtilizador.equals("Organizador")) {
            eliminarPaineis();
            add(criarPainelBotoesOrganizador(), BorderLayout.CENTER);

        } else if (tipoUtilizador.equals("FAE")) {
            eliminarPaineis();
            add(criarPainelBotoesFAE(), BorderLayout.CENTER);

        } else if (tipoUtilizador.equals("Gestor de Exposições")) {
            eliminarPaineis();
            add(criarPainelBotoesGestor(), BorderLayout.CENTER);

        } else if (tipoUtilizador.equals("Representante de expositor")) {
            eliminarPaineis();
            add(criarPainelBotoesRepresentante(), BorderLayout.CENTER);
        }

        revalidate();
    }

    private void eliminarPaineis() {
        remove(painelBotoesFAE);
        remove(painelBotoesGestor);
        remove(painelBotoesOrganizador);
        remove(painelBotoesRepresentante);
        remove(painelDadosUtilizador);
    }

    private JMenuBar criarBarraMenus() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(criarMenuFicheiro());
        //   menuBar.add(criarMenuOpcoes());

        return menuBar;
    }

    private JMenu criarMenuFicheiro() {
        JMenu menu = new JMenu("Ficheiro");
        menu.setMnemonic(KeyEvent.VK_C);

        menu.add(criarTerminarSessao());
        menu.addSeparator();
        menu.add(criarSubMenuLista());
        menu.addSeparator();
        menu.addSeparator();
        //    menu.add(criarItemSair());

        return menu;
    }

    private JMenuItem criarTerminarSessao() {
        JMenuItem item = new JMenuItem("Terminar Sessão", KeyEvent.VK_T);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal.this.dispose();
                new JanelaPrincipal(ce);
            }
        });
        return item;
    }

    private JMenu criarSubMenuLista() {
        JMenu menu = new JMenu("Listas");
        menu.setMnemonic(KeyEvent.VK_L);

        menu.add(criarItemImportarLista());
        menu.add(criarItemExportarLista());

        return menu;
    }

    private JMenuItem criarItemImportarLista() {
        JMenuItem item = new JMenuItem("Importar", 'I');
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ImportarExportar imp = new ImportarExportar();
                MyJFileChooser fileChooser = new MyJFileChooser();
                int resposta = fileChooser.showOpenDialog(MenuPrincipal.this);

                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    CentroExposicoes ce;
                    try {
                        ce = imp.importar(file.getPath());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                MenuPrincipal.this,
                                "Impossível ler o ficheiro: " + file.getPath() + " !",
                                "Importar",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(
                            MenuPrincipal.this,
                            "Centro de Exposições adicionado",
                            "Importar Centro de Exposição",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            }
        });

        return item;
    }

    private JMenuItem criarItemExportarLista() {
        JMenuItem item = new JMenuItem("Exportar", 'X');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ImportarExportar exp = new ImportarExportar();
                MyJFileChooser fileChooser = new MyJFileChooser();
                int resposta = fileChooser.showSaveDialog(MenuPrincipal.this);

                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    if (!file.getName().endsWith(".bin")) {
                        file = new File(file.getPath().trim() + ".xml");
                    }
                    try {
                        exp.exportar(ce, file.getPath());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                MenuPrincipal.this,
                                "Impossível exportar o ficheiro: " + file.getPath() + " !",
                                "Exportar",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        });
        return item;
    }

    private JPanel criarPainelTitulo() {
        JLabel lblMenuPrincipal = new JLabel("Menu Principal", JLabel.CENTER);
        lblMenuPrincipal.setFont(new Font("Helvetica", Font.BOLD, 40));
        lblMenuPrincipal.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblMenuPrincipal, JLabel.CENTER);

        return p;
    }

    private JPanel criarPainelUtilizador() {

        String utilizador = "User: " + utilizadorAtivo.getNome() + " no papel de ";
        JLabel lblUtilizador = new JLabel(utilizador, JLabel.CENTER);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblUtilizador, JLabel.CENTER);
        p.add(criarComboBox());
        return p;
    }

    private JComboBox criarComboBox() {
        cbTipo = new JComboBox(TipoUtilizador.values());
        cbTipo.setEditable(false);
        cbTipo.setMaximumRowCount(5);

        cbTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int s = cbTipo.getSelectedIndex();
                Object s1 = cbTipo.getSelectedItem();
                tipoUtilizador = s1.toString();
                criarComponentes();

            }
        });
        return cbTipo;
    }

    private JPanel criarPainelDadosUtilizador() {
        String nome = "Nome: " + utilizadorAtivo.getNome();
        JLabel lblNome = new JLabel(nome, JLabel.LEFT);
        lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
        lblNome.setPreferredSize(LABEL_TAMANHO);

        String email = "Email: " + utilizadorAtivo.getEmail();
        JLabel lblEmail = new JLabel(email, JLabel.LEFT);
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        lblEmail.setPreferredSize(LABEL_TAMANHO);

        String username = "Username: " + utilizadorAtivo.getUsername();
        JLabel lblUsername = new JLabel(username, JLabel.LEFT);
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 15));
        lblUsername.setPreferredSize(LABEL_TAMANHO);

        JLabel lblPassword = new JLabel("Password: (password não apresentada por motivos de segurança)", JLabel.LEFT);
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        lblPassword.setPreferredSize(LABEL_TAMANHO);

        painelDadosUtilizador = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        painelDadosUtilizador.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        painelDadosUtilizador.setLayout(new GridLayout(5, 1, 20, 20));
        JButton btnAlterarDadosUtilizador = criarBotaoAlterarDadosUtilizador();
        painelDadosUtilizador.add(lblNome);
        painelDadosUtilizador.add(lblEmail);
        painelDadosUtilizador.add(lblUsername);
        painelDadosUtilizador.add(lblPassword);
        painelDadosUtilizador.add(btnAlterarDadosUtilizador, BorderLayout.EAST);
        return painelDadosUtilizador;
    }

    private JPanel criarPainelBotoesOrganizador() {
        btnDecidirFAE = criarBotaoDecidirFAE();
        btnAtribuirCandidatura = criarBotaoAtribuirCandidatura();
        btnCriarStand = criarBotaoCriarStand();
        btnAvaliacaoFinalCand = criarBotaoAvaliacaoFinalCand();
        btnCriarDemonstracao = criarBotaoCriarDemonstracao();
        btnAtribuirStands = criarBotaoAtribuirStands();
        btnAtribuirCandDemonstracao = criarBotaoAtribuirCandDemonstracao();

        painelBotoesOrganizador = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        painelBotoesOrganizador.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        painelBotoesOrganizador.setLayout(new GridLayout(4, 2, 20, 20));

        painelBotoesOrganizador.add(btnDecidirFAE);
        painelBotoesOrganizador.add(btnAtribuirCandidatura);
        painelBotoesOrganizador.add(btnCriarStand);
        painelBotoesOrganizador.add(btnAvaliacaoFinalCand);
        painelBotoesOrganizador.add(btnCriarDemonstracao);
        painelBotoesOrganizador.add(btnAtribuirStands);
        painelBotoesOrganizador.add(btnAtribuirCandDemonstracao);

        return painelBotoesOrganizador;
    }

    private JPanel criarPainelBotoesFAE() {
        btnDecidirCandidatura = criarBotaoDecidirCandidatura();
        btnAtualizarConflitosInteresse = criarBotaoAtualizarConflitosInteresse();
        btnAvaliarCandDemonstracao = criarBotaoAvaliarCandDemonstracao();

        painelBotoesFAE = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        painelBotoesFAE.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        painelBotoesFAE.setLayout(new GridLayout(3, 1, 20, 20));
        painelBotoesFAE.add(btnDecidirCandidatura);
        painelBotoesFAE.add(btnAtualizarConflitosInteresse);
        painelBotoesFAE.add(btnAvaliarCandDemonstracao);
        return painelBotoesFAE;
    }

    private JPanel criarPainelBotoesGestor() {
        btnRegistarExposicao = criarBotaoRegistarExposicao();
        btnConfirmarRegistoUtilizador = criarBotaoConfirmarRegistoUtilizador();
        btnDefinirRecursos = criarBotaoDefinirRecursos();
        btnDefinirTipoConflito = criarBotaoDefinirTipoConflito();

        painelBotoesGestor = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        painelBotoesGestor.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        painelBotoesGestor.setLayout(new GridLayout(2, 2, 20, 20));

        painelBotoesGestor.add(btnRegistarExposicao);
        painelBotoesGestor.add(btnConfirmarRegistoUtilizador);
        painelBotoesGestor.add(btnDefinirRecursos);
        painelBotoesGestor.add(btnDefinirTipoConflito);

        return painelBotoesGestor;
    }

    private JPanel criarPainelBotoesRepresentante() {
        btnCandidatarExposicao = criarBotaoCandidatarExposicao();
        btnAlterarCandidatura = criarBotaoAlterarCandidatura();
        btnDecidirDemonstracao = criarBotaoDecidirDemonstracao();
        btnRetirarCandidatura = criarBotaoRetirarCandidatura();
        btnRegistarCandDemonstracao = criarBotaoRegistarCandDemonstracao();
        btnConfirmarStand = criarBotaoConfirmarStand();

        painelBotoesRepresentante = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        painelBotoesRepresentante.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        painelBotoesRepresentante.setLayout(new GridLayout(3, 2, 20, 20));

        painelBotoesRepresentante.add(btnCandidatarExposicao);
        painelBotoesRepresentante.add(btnAlterarCandidatura);
        painelBotoesRepresentante.add(btnDecidirDemonstracao);
        painelBotoesRepresentante.add(btnRetirarCandidatura);
        painelBotoesRepresentante.add(btnRetirarCandidatura);
        painelBotoesRepresentante.add(btnRegistarCandDemonstracao);
        painelBotoesRepresentante.add(btnConfirmarStand);

        return painelBotoesRepresentante;
    }

    private JButton criarBotaoAlterarDadosUtilizador() {
        JButton btnAlterar = new JButton("Alterar Dados");
        btnAlterar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new AlterarPerfilUtilizadorUI(ce, utilizadorAtivo);
            }
        });

        return btnAlterar;
    }

    private JButton criarBotaoDecidirFAE() {
        btnDecidirFAE = new JButton("Decidir FAE");

        btnDecidirFAE.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnDecidirFAE;
    }

    private JButton criarBotaoAtribuirCandidatura() {
        btnAtribuirCandidatura = new JButton("Atribuir Candidatura");

        btnAtribuirCandidatura.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAtribuirCandidatura;
    }

    private JButton criarBotaoCriarStand() {
        btnCriarStand = new JButton("Criar Stand");

        btnCriarStand.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            new RegistarStandUI(MenuPrincipal.this,ce);
            }
        });
        return btnCriarStand;
    }

    private JButton criarBotaoAvaliacaoFinalCand() {
        btnAvaliacaoFinalCand = new JButton("Avaliacao Final das Candidaturas");

        btnAvaliacaoFinalCand.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAvaliacaoFinalCand;
    }

    private JButton criarBotaoCriarDemonstracao() {
        btnCriarDemonstracao = new JButton("Criar Demonstracao");

        btnCriarDemonstracao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
             new CriarDemonstracaoUI(MenuPrincipal.this,ce);
            }
        });
        return btnCriarDemonstracao;
    }

    private JButton criarBotaoAtribuirStands() {
        btnAtribuirStands = new JButton("Atribuir Stands");

        btnAtribuirStands.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAtribuirStands;
    }

    private JButton criarBotaoAtribuirCandDemonstracao() {
        btnAtribuirCandDemonstracao = new JButton("Atribuir Candidatura a Demonstracao");

        btnAtribuirCandDemonstracao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAtribuirCandDemonstracao;
    }

    private JButton criarBotaoDecidirCandidatura() {
        btnDecidirCandidatura = new JButton("Decidir Candidatura");

        btnDecidirCandidatura.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnDecidirCandidatura;
    }

    private JButton criarBotaoAtualizarConflitosInteresse() {
        btnAtualizarConflitosInteresse = new JButton("Atualizar Conflitos Interesse");

        btnAtualizarConflitosInteresse.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAtualizarConflitosInteresse;
    }

    private JButton criarBotaoAvaliarCandDemonstracao() {
        btnAvaliarCandDemonstracao = new JButton("Avaliar Candidatura a Demonstracao");

        btnAvaliarCandDemonstracao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAvaliarCandDemonstracao;
    }

    private JButton criarBotaoRegistarExposicao() {
        btnRegistarExposicao = new JButton("Registar Exposicao");

        btnRegistarExposicao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
             new RegistarExposicaoUI(MenuPrincipal.this,ce);
            }
        });
        return btnRegistarExposicao;
    }

    private JButton criarBotaoConfirmarRegistoUtilizador() {
        btnConfirmarRegistoUtilizador = new JButton("Confirmar Registo de Utilizador");

        btnConfirmarRegistoUtilizador.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnConfirmarRegistoUtilizador;
    }

    private JButton criarBotaoDefinirRecursos() {
        btnDefinirRecursos = new JButton("Definir Recursos");

        btnDefinirRecursos.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnDefinirRecursos;
    }

    private JButton criarBotaoDefinirTipoConflito() {
        btnDefinirTipoConflito = new JButton("Definir Tipo de Conflito");

        btnDefinirTipoConflito.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnDefinirTipoConflito;
    }

    private JButton criarBotaoCandidatarExposicao() {
        btnCandidatarExposicao = new JButton("Candidatar a Exposicao");

        btnCandidatarExposicao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnCandidatarExposicao;
    }

    private JButton criarBotaoAlterarCandidatura() {
        btnAlterarCandidatura = new JButton("Alterar Candidatura");

        btnAlterarCandidatura.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnAlterarCandidatura;
    }

    private JButton criarBotaoDecidirDemonstracao() {
        btnDecidirDemonstracao = new JButton("Decidir Demonstracao");

        btnDecidirDemonstracao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnDecidirDemonstracao;
    }

    private JButton criarBotaoRetirarCandidatura() {
        btnRetirarCandidatura = new JButton("Retirar Candidatura");

        btnRetirarCandidatura.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new RemoverCandidaturaUI (MenuPrincipal.this,ce);

            }
        });
        return btnRetirarCandidatura;
    }

    private JButton criarBotaoRegistarCandDemonstracao() {
        btnRegistarCandDemonstracao = new JButton("Registar Candidatura a Demonstracao");

        btnRegistarCandDemonstracao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnRegistarCandDemonstracao;
    }

    private JButton criarBotaoConfirmarStand() {
        btnConfirmarStand = new JButton("Confirmar Stand");

        btnConfirmarStand.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        return btnConfirmarStand;
    }

}
