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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.RemoverCandidaturaController;
import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;


/**
 *
 * @author JOAO
 */
class DialogoRemoverCandidatura extends JDialog {
    private  ModeloListaCandidaturas lstCandidaturasExposicao , lstCandidaturasDemonstracao ;
    private JButton btnRemoverCandidaturaExposicao, btnRemoverCandidaturaDemonstracao;
    private Exposicao expo;
    private RemoverCandidaturaController contr;
    private RemoverCandidaturaUI framePai;

    public DialogoRemoverCandidatura(RemoverCandidaturaUI framePai,Exposicao expo, RemoverCandidaturaController contr) {
        super (framePai,"Remover Candidaturas",true);
        
        this.expo=expo;
        this.contr=contr;
        this.framePai=framePai;
        
         criarComponentes();

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(framePai);
        setVisible(true);
        
        
        
        
    }

    private void criarComponentes() {
         JPanel p1 = criarPainelCentro();
         JPanel p2 =criarPainelSul();
       

        add(p1, BorderLayout.CENTER);
        
    }

    private JPanel criarPainelCentro() {
         final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
         lstCandidaturasExposicao = new ModeloListaCandidaturas (contr.getListaCandidaturasExposicoes(expo));
         JList lstCompleta = new JList(lstCandidaturasExposicao );
        
        btnRemoverCandidaturaExposicao = criarBotaoRemoverCandidaturaDemonstracao(lstCompleta);
        
        p.add(criarPainelLista( "Lista de Candidaturas (Exposicao):",
                                lstCompleta,
                                lstCandidaturasExposicao,
                                btnRemoverCandidaturaExposicao));
        
        lstCandidaturasDemonstracao = new ModeloListaCandidaturas (contr.getListaCandidaturasDemonstracoes(expo));
         JList lstCompleta1 = new JList(lstCandidaturasDemonstracao );
        
        btnRemoverCandidaturaDemonstracao = criarBotaoRemoverCandidaturaDemonstracao(lstCompleta);
        
        p.add(criarPainelLista( "Lista de Candidaturas (Demonstracao):",
                                lstCompleta1,
                                lstCandidaturasDemonstracao,
                                btnRemoverCandidaturaDemonstracao));

        return p;
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

    private JButton criarBotaoRemoverCandidaturaDemonstracao(JList lstCompleta) {
        JButton btn = new JButton("Remover Candidatura a Demonstracao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ModeloListaCandidaturas m  = ( ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura m1 =(Candidatura ) lstCompleta.getSelectedValue();
                    contr.removerCandidatura(m1);
                     
                  

                } catch (NumberFormatException ex) {

                }
            }
        });
        
        
        return btn;
    }

    private JPanel criarPainelSul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
