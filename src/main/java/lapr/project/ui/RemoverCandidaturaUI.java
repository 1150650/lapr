/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.RemoverCandidaturaController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;

/**
 *
 * @author JOAO
 */
public class RemoverCandidaturaUI extends JFrame {
  
   private  ModeloListaCandidaturas lstCandidaturasExposicao , lstCandidaturasDemonstracao ;
    private JButton btnRemoverCandidaturaExposicao, btnRemoverCandidaturaDemonstracao;
    private final RemoverCandidaturaController contr;
    private final CentroExposicoes centroexpo;
    private Icon icon;
    private Exposicao expo;

    public RemoverCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Remover Candidatura ");
        this.centroexpo = ce;
        this.contr = new RemoverCandidaturaController(ce);
        this.expo=new Exposicao();
        this.centroexpo.getListaExposicoes().adicionarExposicao(expo);
        
        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel painel1 = criarPainelN();
        JPanel painel3= criarPainelC();
        JPanel painel2 = criarPainelS();
        
        add(painel1, BorderLayout.NORTH);
        add(painel3,BorderLayout.CENTER);
        add(painel2, BorderLayout.SOUTH);

    }

    private JPanel criarPainelN() {
        JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();

        JPanel pCentro = new JPanel();
        pCentro.add(btnSelecionarExposicao);

        return pCentro;
    }

    private JPanel criarPainelS() {
        JButton btnOK = criarBotaoConcluirProcesso();
        JButton btnCancelar = criarBotaoCancelar();

        JPanel pSul = new JPanel();
        pSul.add(btnOK);
        pSul.add(btnCancelar);

        return pSul;
    }
private JPanel criarPainelC() {
        
         final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
         lstCandidaturasExposicao = new ModeloListaCandidaturas (contr.getListaCandidaturasExposicoes(expo));
         JList lstCompleta = new JList(lstCandidaturasExposicao );
        
        btnRemoverCandidaturaExposicao = criarBotaoRemoverCandidaturaExposicao(lstCompleta);
         btnRemoverCandidaturaExposicao.setToolTipText("Remove uma candidatura a Exposicao");
         
        
        p.add(criarPainelListas( "Lista de Candidaturas (Exposicao):",
                                lstCompleta,
                                lstCandidaturasExposicao,
                                btnRemoverCandidaturaExposicao));
        
        lstCandidaturasDemonstracao = new ModeloListaCandidaturas (contr.getListaCandidaturasDemonstracoes(expo));
         JList lstCompleta1 = new JList(lstCandidaturasDemonstracao );
        
        btnRemoverCandidaturaDemonstracao = criarBotaoRemoverCandidaturaDemonstracao(lstCompleta);
       btnRemoverCandidaturaDemonstracao.setToolTipText("Remove uma candidatura a Demonstracao");
        
        p.add(criarPainelListas( "Lista de Candidaturas (Demonstracao):",
                                lstCompleta1,
                                lstCandidaturasDemonstracao,
                                btnRemoverCandidaturaDemonstracao));

        return p;
    }
    
     private JPanel criarPainelListas(
            String tituloLista,
            JList lstLista,
            ModeloListaCandidaturas modeloLista,
            JButton btnSuperior) {
        JLabel lblTitulo = new JLabel(tituloLista, JLabel.LEFT);
        lstLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstLista);

        JPanel p1 = new JPanel(new BorderLayout());
        
        final int MARGEM_SUPERIOR1 = 20, MARGEM_INFERIOR1 = 20;
        final int MARGEM_ESQUERDA1 = 20, MARGEM_DIREITA = 20;
        p1.setBorder(BorderFactory.createEmptyBorder( MARGEM_SUPERIOR1, 
                                                     MARGEM_ESQUERDA1,
                                                     MARGEM_INFERIOR1, 
                                                     MARGEM_DIREITA));
        
        p1.add(lblTitulo, BorderLayout.NORTH);
        p1.add(scrPane, BorderLayout.CENTER);

        JPanel pBotoes = criarPainelBotao(btnSuperior);
        p1.add(pBotoes, BorderLayout.SOUTH);
        return p1;
    }
    private JPanel criarPainelBotao(JButton btnSuperior) {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 1;
        final int INTERVALO_HORIZONTAL = 0, INTERVALO_VERTICAL = 10;        
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
        
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder( MARGEM_SUPERIOR, 
                                                     MARGEM_ESQUERDA,
                                                     MARGEM_INFERIOR, 
                                                     MARGEM_DIREITA));
        
        p.add(btnSuperior);
        
        
        return p;
    }
    private JButton criarBotaoConcluirProcesso() {
        JButton btn = new JButton("Concluir Processo");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                    dispose();
                

            }
        });

        return btn;
    }

    private JButton criarBotaoSelecionarExposicao() {
        JButton btn = new JButton("Selecionar Exposicao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exposicao[] aux = contr.getListaExposicoes();

                expo = (Exposicao) JOptionPane.showInputDialog(
                        RemoverCandidaturaUI.this,
                        "Indique a exposição da qual deseja retirar a candidatura"
                        + ":",
                        "Seleção De Exposição",
                        JOptionPane.DEFAULT_OPTION,
                        icon,
                        aux,
                        "");

               
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



    private JButton criarBotaoRemoverCandidaturaDemonstracao(JList lstCompleta) {
         JButton btn = new JButton("Remover Candidatura a Demonstracao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ModeloListaCandidaturas m  = ( ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura m1 =(Candidatura ) lstCompleta.getSelectedValue();
                contr.removerCandidaturaDemonstracao(m1);
                m.removeElement(m1);
                    dispose();
                

            }
        });

        return btn;
    }

    private JButton criarBotaoRemoverCandidaturaExposicao(JList lstCompleta) {
           JButton btn = new JButton("Remover Candidatura a Exposicao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ModeloListaCandidaturas m  = ( ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura m1 =(Candidatura ) lstCompleta.getSelectedValue();
                contr.removerCandidaturaDemonstracao(m1);
                m.removeElement(m1);
                    dispose();
                

            }
        });

        return btn;
    }
    }
