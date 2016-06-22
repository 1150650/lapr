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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.RegistarExposicaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import lapr.project.utils.HintTextField;

/**
 *
 * @author JOAO
 */
public class RegistarExposicaoUI extends JDialog {
    
     private JTextField txtTitulo,  txtLocal,txtDateInicio,txtDateFinal;
     private JTextArea txtDescricao;
     private Date dtInico,dtFim;
     private JButton btnAdicionarOrganizador;
    private ModeloListaUtilizadores lstUtilizadores;
    private RegistarExposicaoController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;
    private final int CAMPO_LARGURA = 30;
    
    
   public RegistarExposicaoUI (MenuPrincipal framePai, CentroExposicoes ce){
       
        super(framePai,"Registar Exposição",true);
        this.centroexpo = ce;
        this.contr = new RegistarExposicaoController(ce);
        this.framePai = framePai;
        
        contr.novaExposicao();

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
        

        JPanel pNorte = new JPanel(new BorderLayout());
        pNorte.add(p1, BorderLayout.NORTH);
        
        pNorte.add(p2, BorderLayout.CENTER);

        return pNorte;
    }

    private JPanel criarPainelCentro() {
        JPanel p1 = criarPainelUtilizador();
        JPanel p2 = criarPainelLocal();
        JPanel p3 = criarPainelData();
    

        JPanel pCentro = new JPanel(new BorderLayout());
        pCentro.add(p1, BorderLayout.NORTH);
        pCentro.add(p2, BorderLayout.CENTER);
        pCentro.add(p3, BorderLayout.SOUTH);
    

        return pCentro;
    }

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoOK();
        btnOK.setToolTipText("Regista a Exposicao");
        
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();
        btnCancelar.setToolTipText("Cancela o registo a Exposicao");
        JPanel p = new JPanel();
        
       
        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

  

    private JPanel criarPainelTitulo() {
        JLabel lbl = new JLabel("Titulo:");

        
        txtTitulo = new HintTextField("Indicação do Titulo da Exposição");
        txtTitulo.setColumns(CAMPO_LARGURA);
        

        JPanel p = new JPanel();
        p.add(lbl);
        p.add(txtTitulo);

        return p;
    }

    private JPanel criarPainelDescricao() {
        JLabel lbl = new JLabel("Descricao:");

      
        txtDescricao =  new JTextArea();
        txtDescricao.setColumns(CAMPO_LARGURA);
        

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
       lstUtilizadores  = new ModeloListaUtilizadores (contr.getListaUtilizadores());
         JList lstCompleta = new JList( lstUtilizadores);
        
        btnAdicionarOrganizador = criarBotaoAdiconarOrganizador(lstCompleta);
        btnAdicionarOrganizador.setToolTipText("Adiciona um Organizador á Exposicao");
        
        p.add(criarPainelLista( "Lista de Utilizadores:",
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
       JLabel lbl = new JLabel("Local :");

        
        txtLocal = new HintTextField("Indicação do Local da Exposição");
        txtLocal.setColumns(CAMPO_LARGURA);

        JPanel p = new JPanel();
     
        p.add(lbl);
        p.add(txtLocal);

        return p;
    }
    
  
    

 


    private JPanel criarPainelData() {
       JLabel lbl = new JLabel("Data de inicio :");

        
        txtDateInicio = new HintTextField("Indicação da data de Inico (AAAA-MM-DD)");
        JLabel lbl1 = new JLabel("Data de Final :");
        txtDateInicio.setColumns(CAMPO_LARGURA);

       
        txtDateFinal = new HintTextField("Indicação da data de Fim (AAAA-MM-DD)");
        txtDateFinal.setColumns(CAMPO_LARGURA);

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
                  
                
                
                
                   String Titulo = txtTitulo.getText();
                   String Descricao = txtDescricao.getText();
                   String Local = txtLocal.getText();
                   
                   String[] data1 =txtDateInicio.getText().split("-");
                   String[] data2 =txtDateFinal.getText().split("-");
                   
                   
                      dtInico=new Date(Integer.parseInt(data1[0]),Integer.parseInt(data1[1]),Integer.parseInt(data1[2]));
                  dtFim = new Date (Integer.parseInt(data2[0]),Integer.parseInt(data2[1]),Integer.parseInt(data2[2]));
                     contr.setDados(Titulo, Descricao, dtInico,dtFim, Local);
                     contr.setEstadoExposicaoCriada();
                     contr.validaRegistaExposicao();
                    
                  

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
