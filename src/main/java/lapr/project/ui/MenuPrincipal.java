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
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoUtilizador;
import lapr.project.model.Utilizador;

/**
 *
 * @author SimãoPedro
 */
class MenuPrincipal extends JFrame {

    private CentroExposicoes ce;
    private String tipoUtilizador = "Organizador";
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
            termoParagem = 1;
        }
        if (tipoUtilizador.equals("Organizador")) {
            remove(criarPainelBotoesGestor());
            remove(criarPainelBotoesRepresentante());
            remove(criarPainelBotoesFAE());
            add(criarPainelBotoesOrganizador(), BorderLayout.CENTER);

        } else if (tipoUtilizador.equals("FAE")) {
            remove(criarPainelBotoesOrganizador());
            remove(criarPainelBotoesGestor());
            remove(criarPainelBotoesRepresentante());
            add(criarPainelBotoesFAE(), BorderLayout.CENTER);
            
        } else if (tipoUtilizador.equals("Gestor de Exposições")) {
            remove(criarPainelBotoesOrganizador());
            remove(criarPainelBotoesRepresentante());
            remove(criarPainelBotoesFAE());
            add(criarPainelBotoesGestor(), BorderLayout.CENTER);
            
        } else if (tipoUtilizador.equals("Representante de expositor")) {
            remove(criarPainelBotoesFAE());
            remove(criarPainelBotoesGestor());
            remove(criarPainelBotoesOrganizador());
            add(criarPainelBotoesRepresentante(), BorderLayout.CENTER);
        }
        //   tabPane = criarSeparadores();
        //   add(tabPane, BorderLayout.SOUTH);
        //   add(criarPainelBotoes1());
        //   add(criarPainelBotoes2());
        //   add(criarPainelBotoes3());
        //   add(criarPainelBotoes4());
        revalidate();
       // repaint();
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
        cbTipo.setMaximumRowCount(4);

        cbTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int s = cbTipo.getSelectedIndex();
                Object s1 = cbTipo.getSelectedItem();
                tipoUtilizador = s1.toString();
                criarComponentes();
                /*     if (s.equals("Organizador")) {
                    criarComponentes();
                    add(criarPainelBotoesOrganizador(), BorderLayout.CENTER);
                } else if (s.equals("FAE")) {
                    criarComponentes();
                    add(criarPainelBotoesFAE(), BorderLayout.CENTER);
                }*/

            }
        });
        return cbTipo;
    }

    /*   private JTabbedPane criarSeparadores() {
        JTabbedPane tabPane = new JTabbedPane();
         final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        tabPane.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));
        tabPane.addTab("Organizador", criarPainelBotoesOrganizador());
        tabPane.addTab("FAE", criarPainelBotoesFAE());
        tabPane.addTab("Gestor", criarPainelBotoesGestor());
        tabPane.addTab("Representante", criarPainelBotoesRepresentante());
        
        return tabPane; 
    }
     */
    //  private JPanel criarPainelBotoes1(){
    // }
    private JPanel criarPainelBotoesOrganizador() {
        btnDecidirFAE = criarBotaoDecidirFAE();
        btnAtribuirCandidatura = criarBotaoAtribuirCandidatura();
        btnCriarStand = criarBotaoCriarStand();
        btnAvaliacaoFinalCand = criarBotaoAvaliacaoFinalCand();
        btnCriarDemonstracao = criarBotaoCriarDemonstracao();
        btnAtribuirStands = criarBotaoAtribuirStands();
        btnAtribuirCandDemonstracao = criarBotaoAtribuirCandDemonstracao();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.setLayout(new GridLayout(4, 2, 20, 20));

        p.add(btnDecidirFAE);
        p.add(btnAtribuirCandidatura);
        p.add(btnCriarStand);
        p.add(btnAvaliacaoFinalCand);
        p.add(btnCriarDemonstracao);
        p.add(btnAtribuirStands);
        p.add(btnAtribuirCandDemonstracao);

        return p;
    }

    private JPanel criarPainelBotoesFAE() {
        btnDecidirCandidatura = criarBotaoDecidirCandidatura();
        btnAtualizarConflitosInteresse = criarBotaoAtualizarConflitosInteresse();
        btnAvaliarCandDemonstracao = criarBotaoAvaliarCandDemonstracao();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.setLayout(new GridLayout(3, 1, 20, 20));
        p.add(btnDecidirCandidatura);
        p.add(btnAtualizarConflitosInteresse);
        p.add(btnAvaliarCandDemonstracao);
        return p;
    }

    private JPanel criarPainelBotoesGestor() {
        btnRegistarExposicao = criarBotaoRegistarExposicao();
        btnConfirmarRegistoUtilizador = criarBotaoConfirmarRegistoUtilizador();
        btnDefinirRecursos = criarBotaoDefinirRecursos();
        btnDefinirTipoConflito = criarBotaoDefinirTipoConflito();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.setLayout(new GridLayout(2, 2, 20, 20));
        
        p.add(btnRegistarExposicao);
        p.add(btnConfirmarRegistoUtilizador);
        p.add(btnDefinirRecursos);
        p.add(btnDefinirTipoConflito);
        
        return p;
    }

    private JPanel criarPainelBotoesRepresentante() {
        btnCandidatarExposicao = criarBotaoCandidatarExposicao();
        btnAlterarCandidatura = criarBotaoAlterarCandidatura();
        btnDecidirDemonstracao = criarBotaoDecidirDemonstracao();
        btnRetirarCandidatura = criarBotaoRetirarCandidatura();
        btnRegistarCandDemonstracao = criarBotaoRegistarCandDemonstracao();
        btnConfirmarStand = criarBotaoConfirmarStand();

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA,
                MARGEM_INFERIOR, MARGEM_DIREITA));
        p.setLayout(new GridLayout(3, 2, 20, 20));
        
        p.add(btnCandidatarExposicao);
        p.add(btnAlterarCandidatura);
        p.add(btnDecidirDemonstracao);
        p.add(btnRetirarCandidatura);
        p.add(btnRetirarCandidatura);
        p.add(btnRegistarCandDemonstracao);
        p.add(btnConfirmarStand);
        
        return p;
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
