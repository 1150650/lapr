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
import lapr.project.controller.DefinirInteresseStandController;
import lapr.project.controller.RegistarCandidaturaDemonstracaoController;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class RegistarCandidaturaDemonstracaoUI extends JFrame {
      private JButton btnCandidatarDemonstracao;
    private ModeloListaCandidaturas lstCandidaturas;
    private RegistarCandidaturaDemonstracaoController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;
    private Exposicao expo;
    private Icon icon;
    private int condicaoDeParagem=0;
    private JPanel painelllista;

    public RegistarCandidaturaDemonstracaoUI(MenuPrincipal framePai, CentroExposicoes ce,Utilizador u) {

        super("Registar Candidatura A Demonstracao");
        this.centroexpo = ce;
        this.contr = new RegistarCandidaturaDemonstracaoController(ce,u);
        this.framePai = framePai;
      

        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        
         if (condicaoDeParagem == 0) {
            JPanel painl1 = criarPainelNorte();
            JPanel painel2 =  criarPainelSul();
            add(new JPanel().add(new JLabel("Selecione a exposição", JLabel.CENTER)));
            add(painl1, BorderLayout.NORTH);
            add(painel2, BorderLayout.SOUTH);
           
        }

        if(condicaoDeParagem ==1){
            
            painelllista = criarPainelCandi();

        add(painelllista, BorderLayout.CENTER);

        revalidate();
        
        }

        
         condicaoDeParagem = 1;
    }

    private JPanel criarPainelNorte() {
        
        
         JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();


        
        JPanel pNorte = new JPanel(new BorderLayout());
        pNorte.add(btnSelecionarExposicao, BorderLayout.CENTER);
        return pNorte;
    }

   

    private JPanel criarPainelSul() {
        JButton btnOK = criarBotaoConclui();
        getRootPane().setDefaultButton(btnOK);

        JButton btnCancelar = criarBotaoCancelar();

        JPanel p = new JPanel();

        p.add(btnOK);
        p.add(btnCancelar);

        return p;
    }

   

    private JPanel criarPainelCandi() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        painelllista = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstCandidaturas = new ModeloListaCandidaturas(contr.getListaCandidaturas(expo));
        JList lstCompleta = new JList(lstCandidaturas);

        btnCandidatarDemonstracao = criarBotaoCandidatarDemonstracao(lstCompleta);

       painelllista.add(criarPainelLista("Lista de Candidaturas:",
                lstCompleta,
                lstCandidaturas,
                btnCandidatarDemonstracao));

        return painelllista;
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
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
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
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));

        final int MARGEM_1SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_1SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(btnSuperior);

        return p;
    }

    

    private JButton criarBotaoCancelar() {
        JButton btnCancell = new JButton("Cancelar");
        btnCancell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnCancell;
    }

    private JButton criarBotaoCandidatarDemonstracao(JList lstCompleta) {
        JButton btn = new JButton("Candidatar Demonstracao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ModeloListaCandidaturas m = (ModeloListaCandidaturas) lstCompleta.getModel();
                    CandidaturaExposicao r = (CandidaturaExposicao) lstCompleta.getSelectedValue();
                    if(r != null){
                    contr.setCandidaturaExposicao(r);
                    contr.newCandidaturaDemo(r);
                    Demonstracao[] aux = contr.getListaDemonstracoesCInteresse();

                    Demonstracao d = (Demonstracao) JOptionPane.showInputDialog(
                            RegistarCandidaturaDemonstracaoUI.this,
                            "Indique a Demonstracao que deseja atribuir a  candidatura"
                            + ":",
                            "Seleção De Demonstracao",
                            JOptionPane.DEFAULT_OPTION,
                            icon,
                            aux,
                            "");
                    
                    contr.setDemonstracao(d);
                    contr.addCandidaturaDemonstracao();
                    
                    
                    m.removeElement(r);
                    }
                    
                } catch (NumberFormatException ex) {

                }
            }
        });

        return btn;
    }

    private JButton criarBotaoSelecionarExposicao() {
        JButton btn = new JButton("Selecionar Exposicao");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Exposicao[] aux = contr.getListaExposicoes();

                    expo = (Exposicao) JOptionPane.showInputDialog(
                            RegistarCandidaturaDemonstracaoUI.this,
                            "Indique a exposição da qual deseja viziualizar a candidatura"
                            + ":",
                            "Seleção De Exposição",
                            JOptionPane.DEFAULT_OPTION,
                            icon,
                            aux,
                            "");

                } catch (Exception e1) {

                }

                criarComponentes();
            }

        });

        return btn;
    }

    private JButton criarBotaoConclui() {
        JButton btnConclui = new JButton("Concluir Processo");
        btnConclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnConclui;
    }
}
