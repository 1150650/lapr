/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.RegistarExposicaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class RegistarExposicaoUI extends JDialog {
    
     private JTextField txtTitulo, txtDescricao, txtLocal,txtDateInicio,txtDateFinal;
     private Date dtInico,dtFim;
     private JButton btnAdicionarOrganizador;
    private ModeloListaUtilizadores lstUtilizadores;
    private RegistarExposicaoController contr;
    private CentroExposicoes centroexpo;
    private JanelaPrincipal framePai;
    
    
   public RegistarExposicaoUI (JanelaPrincipal framePai, CentroExposicoes ce){
       
        super(framePai, "Nova Candidatura", true);
        this.centroexpo = ce;
        this.contr = new RegistarExposicaoController(ce);
        this.framePai = framePai;

        criarComponentes();

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(framePai);
        setVisible(true);
   }

   private void criarComponentes() {
        
        JPanel p1 = criarPainelNorte();
        JPanel p2 = criarPainelCentro();
        JPanel p3 = criarPainelSul();

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
    }

    private JPanel criarPainelNorte() {
        JPanel p1 = criarPainelTitulo();
        JPanel p2 = criarPainelDescricao();
        JPanel p3 = criarPainelData();

        JPanel pNorte = new JPanel(new BorderLayout());
        pNorte.add(p1, BorderLayout.NORTH);
        pNorte.add(p2, BorderLayout.CENTER);
        pNorte.add(p3, BorderLayout.SOUTH);

        return pNorte;
    }

    private JPanel criarPainelCentro() {
        JPanel p1 = criarPainelUtilizador();
        JPanel p2 = criarPainelLocal();
    

        JPanel pCentro = new JPanel(new BorderLayout());
     pCentro.add(p2, BorderLayout.NORTH);
        pCentro.add(p1, BorderLayout.CENTER);
    

        return pCentro;
    }

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoOK();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();
       
        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

  

    private JPanel criarPainelTitulo() {
        JLabel lbl = new JLabel("Titulo:", JLabel.RIGHT);

        final int CAMPO_LARGURA = 10;
        txtTitulo = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel();
        p.add(lbl);
        p.add(txtTitulo);

        return p;
    }

    private JPanel criarPainelDescricao() {
        JLabel lbl = new JLabel("Descricao:", JLabel.RIGHT);

        final int CAMPO_LARGURA = 10;
        txtDescricao = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel();
       
        p.add(lbl);
        p.add(txtDescricao);

        return p;
    }

    private JPanel criarPainelUtilizador() {
         final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
       lstUtilizadores  = new ModeloListaUtilizadores (centroexpo.getRegistoUtilizadoresConf());
         JList lstCompleta = new JList( lstUtilizadores);
        
        btnAdicionarOrganizador = criarBotaoAdiconarOrganizador(lstCompleta);
        
        p.add(criarPainelLista( "Lista de Jogadores Completa:",
                                lstCompleta,
                                 lstUtilizadores,
                                btnAdicionarOrganizador));

        return p;
    }
    private JPanel criarPainelLista(
            String tituloLista,
            JList lstLista,
            ModeloListaUtilizadores modeloLista,
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

        JPanel pBotoes = criarPainelBotoes(btnSuperior);
        p.add(pBotoes, BorderLayout.SOUTH);
        return p;
    }
    private JPanel criarPainelBotoes(JButton btnSuperior) {
        final int NUMERO_LINHAS = 2, NUMERO_COLUNAS = 1;
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

   private JPanel criarPainelLocal() {
       JLabel lbl = new JLabel("Local :", JLabel.RIGHT);

        final int CAMPO_LARGURA = 10;
        txtLocal = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel();
     
        p.add(lbl);
        p.add(txtLocal);

        return p;
    }
    
  
    

 


    private JPanel criarPainelData() {
       JLabel lbl = new JLabel("Data de inicio :", JLabel.RIGHT);

        final int CAMPO_LARGURA = 10;
        txtDateInicio = new JTextField(CAMPO_LARGURA);
        JLabel lbl1 = new JLabel("Data de Final :", JLabel.RIGHT);

       
        txtDateFinal = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel();
     
        p.add(lbl);
        p.add(txtDateInicio);
         p.add(lbl1);
        p.add(txtDateFinal);
        
        

        return p;
    }
    
      private JButton criarBotaoOK() {
        JButton btn = new JButton("Registar Exposição");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                   //  String NomeEmpresa = txtTitulo.getText();
                   //  String Morada = txtDescricao.getText();
                   // String Telemovel = txtLocal.getText();
                    
                    
                   //  float AreaExposicao = Float.parseFloat(txtAreaExposicao.getText());
                  //  int QuantidadeConvites = Integer.parseInt(txtQuantidadeConvites.getText());
                   //  Candidatura objCandidatura =new Candidatura();
                   //  contr.novaExposicao();
                   //  contr.setDados( );
                   //  contr.guardarCandidatura();

                    dispose();
                
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

    private JButton criarBotaoAdiconarOrganizador(JList lstCompleta) {
       JButton btn = new JButton("Adicionar Organizador");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ModeloListaUtilizadores m  = ( ModeloListaUtilizadores) lstCompleta.getModel();
                    Utilizador m1 =(Utilizador ) lstCompleta.getSelectedValue();
                    contr.adicionarOrganizador(m1);
                     
                  

                } catch (NumberFormatException ex) {

                }
            }
        });
        
        
        return btn;
    }

    
 
}
