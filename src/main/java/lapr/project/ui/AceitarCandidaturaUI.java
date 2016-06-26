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
import lapr.project.controller.AceitarCandidaturaController;

import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.Stand;

/**
 *
 * @author JOAO
 */
public class AceitarCandidaturaUI extends JFrame {
     private AceitarCandidaturaController contr;
      private  ModeloListaCandidaturas lstCandidaturasExposicao , lstCandidaturasDemonstracao ;
    private JButton btnAceitarCandidaturaExposicao, btnAceitarCandidaturaDemonstracao;
    private final CentroExposicoes centroexpo;
    private Icon icon;
    private Exposicao expo;
    private Candidatura candi;

    public AceitarCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super( "Aceitar Candidatura ");
        this.centroexpo = ce;
        this.contr = new AceitarCandidaturaController(ce);
         this.expo= ce.getListaExposicoes().obterExposicao(0);
        
        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel p1 = criarPainelNorth();
        JPanel p2 = criarPainelSouth();
        JPanel p3= criarPainelCenter();

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.CENTER);

    }

    private JPanel criarPainelNorth() {
        JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();

        JPanel pCentro = new JPanel();
        pCentro.add(btnSelecionarExposicao);


        return pCentro;
    }

    private JPanel criarPainelSouth() {
        JButton btnOK = criarBotaoConcluirProcesso();
        JButton btnCancelar = criarBotaoCancel();

        JPanel pSul = new JPanel();
        pSul.add(btnOK);
        pSul.add(btnCancelar);

        return pSul;
    }
     private JPanel criarPainelCenter() {
        
         final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel painel1 = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
         lstCandidaturasExposicao = new ModeloListaCandidaturas (contr.getListaCandidaturasExposicoes(expo));
         JList lstCompleta = new JList(lstCandidaturasExposicao );
        
        btnAceitarCandidaturaExposicao = criarBotaoAceitarCandidaturaExposicao(lstCompleta);
        
        painel1.add(criarPainelLista( "Lista de Candidaturas (Exposicao):",
                                lstCompleta,
                                lstCandidaturasExposicao,
                                btnAceitarCandidaturaExposicao));
        
        lstCandidaturasDemonstracao = new ModeloListaCandidaturas (contr.getListaCandidaturasDemonstracoes(expo));
         JList lstCompleta1 = new JList(lstCandidaturasDemonstracao );
        
        btnAceitarCandidaturaDemonstracao = criarBotaoAceitarCandidaturaDemonstracao(lstCompleta);
        
        painel1.add(criarPainelLista( "Lista de Candidaturas (Demonstracao):",
                                lstCompleta1,
                                lstCandidaturasDemonstracao,
                                btnAceitarCandidaturaDemonstracao));

        return painel1;
    }
    
     private JPanel criarPainelLista(
            String tituloLista,
            JList lstLista,
            ModeloListaCandidaturas modeloLista,
            JButton btnSuperior) {
        JLabel lblTitulo = new JLabel(tituloLista, JLabel.LEFT);
        lstLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstLista);

        JPanel p = new JPanel(new BorderLayout());
        
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder( MARGEM_SUPERIOR, 
                                                     MARGEM_ESQUERDA,
                                                     MARGEM_INFERIOR, 
                                                     MARGEM_DIREITA));
        
        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);

        JPanel pBotoes = criarPainelBotao(btnSuperior);
        p.add(pBotoes, BorderLayout.SOUTH);
        return p;
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
                        AceitarCandidaturaUI.this,
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

    private JButton criarBotaoCancel() {
        JButton btn1 = new JButton("Cancelar");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn1;
    }

   

    private JButton criarBotaoAceitarCandidaturaDemonstracao(JList lstCompleta) {
        JButton btn = new JButton(" Candidaturas");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (expo==null){
                    JOptionPane.showMessageDialog(rootPane, "Por favor selecione uma exposicao");
                }else{
                 ModeloListaCandidaturas m  = ( ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura m1 =(Candidatura ) lstCompleta.getSelectedValue();
                    
                    contr.aceitarCandidaturaDemonstracao(m1);
                    m.removeElement(m1);
                   dispose();
                }
               

             
            }
        });

        return btn;
    }

    private JButton criarBotaoAceitarCandidaturaExposicao(JList lstCompleta) {
        JButton btn = new JButton(" Candidaturas");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (expo==null){
                    JOptionPane.showMessageDialog(rootPane, "Por favor selecione uma exposicao");
                }else {
                ModeloListaCandidaturas m  = ( ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura m1 =(Candidatura ) lstCompleta.getSelectedValue();
                    if(m1.getState().isEstadoAceite()==false && m1.getState().isEstadoAvaliada()==true){
                    
                    int i=JOptionPane.YES_NO_OPTION; 
                    JOptionPane.showConfirmDialog(rootPane, "Deseja Atribuir um stand","Warning",i);
                    if( i==JOptionPane.YES_OPTION){
                    Stand[] aux = contr.getListaStands();

               Stand s = (Stand) JOptionPane.showInputDialog(
                        AceitarCandidaturaUI.this,
                        "Indique o Stand que deseja atribui a candidatura"
                        + ":",
                        "Seleção De Stand",
                        JOptionPane.DEFAULT_OPTION,
                        icon,
                        aux,
                        "");
                contr.adicionarStandCandidaturaExposciao(s);
                    }
                    
                    }
                   
                   contr.aceitarCandidaturaExposicao(m1);
                   m.removeElement(m1);
                   dispose();
                }
               

             
            }
        });

        return btn;
    }
}
