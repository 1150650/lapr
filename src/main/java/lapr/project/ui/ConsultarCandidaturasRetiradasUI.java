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
import lapr.project.controller.ConsultarCandidaturasRetiradasController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class ConsultarCandidaturasRetiradasUI extends JFrame {
      private ModeloListaCandidaturas lstCandidaturasExposicao, lstCandidaturasDemonstracao;

    private final ConsultarCandidaturasRetiradasController contr;
    private final CentroExposicoes centroexpo;
    private Icon icon;
    private Exposicao expo;
    private JPanel painelista;
    private int condicaoParagem = 0;


    public ConsultarCandidaturasRetiradasUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super("Remover Candidatura ");
        this.centroexpo = ce;
        this.contr = new ConsultarCandidaturasRetiradasController(ce);
        this.expo = ce.getListaExposicoes().obterExposicao(0);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        if (condicaoParagem == 0) {
            JPanel paiel1 = criarPainelN();
            JPanel painel2 = criarPainelS();
            add(new JPanel().add(new JLabel("Selecione a exposição", JLabel.CENTER)));
            add(paiel1, BorderLayout.NORTH);
            add(painel2, BorderLayout.SOUTH);
           
        }

        if(condicaoParagem ==1){
            
            painelista = criarPainelC();

        add(painelista, BorderLayout.CENTER);

        revalidate();
        
        }

        
         condicaoParagem = 1;

    }
    

    private JPanel criarPainelN() {
        JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();

        JPanel pCentro = new JPanel();
        pCentro.add(btnSelecionarExposicao);

        return pCentro;
    }

    private JPanel criarPainelS() {
        JButton btnOK = criarBotaoConcluirProcess();
        JButton btnCancelar = criarBotaoCancelar();

        JPanel pSul = new JPanel();
        pSul.add(btnOK);
        pSul.add(btnCancelar);

        return pSul;
    }

    private JPanel criarPainelC() {

        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        painelista = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstCandidaturasExposicao = new ModeloListaCandidaturas(contr.getListaCandidaturasExposicao(expo));
        JList lstCompleta = new JList(lstCandidaturasExposicao);

        

        painelista.add(criarPainelListas("Lista de Candidaturas (Exposicao):",
                lstCompleta,
                lstCandidaturasExposicao));

        lstCandidaturasDemonstracao = new ModeloListaCandidaturas(contr.getListaCandidaturasDemonstracao(expo));
        JList lstCompleta1 = new JList(lstCandidaturasDemonstracao);

        

        painelista.add(criarPainelListas("Lista de Candidaturas (Demonstracao):",
                lstCompleta1,
                lstCandidaturasDemonstracao
              ));

        return painelista;
    }

    private JPanel criarPainelListas(
            String tituloLista,
            JList lstLista,
            ModeloListaCandidaturas modeloLista
            ) {
        JLabel lblTitulo = new JLabel(tituloLista, JLabel.LEFT);
        lstLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstLista);

        JPanel p1 = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR1 = 20, MARGEM_INFERIOR1 = 20;
        final int MARGEM_ESQUERDA1 = 20, MARGEM_DIREITA = 20;
        p1.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR1,
                MARGEM_ESQUERDA1,
                MARGEM_INFERIOR1,
                MARGEM_DIREITA));

        p1.add(lblTitulo, BorderLayout.NORTH);
        p1.add(scrPane, BorderLayout.CENTER);


        return p1;
    }

   

    private JButton criarBotaoConcluirProcess() {
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
                try {
                    Exposicao[] aux = contr.getListaExposicoes();

                    expo = (Exposicao) JOptionPane.showInputDialog(
                            ConsultarCandidaturasRetiradasUI.this,
                            "Indique a exposição da qual deseja vizualizar  as candidaturas Retiradas"
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

    private JButton criarBotaoCancelar() {
        JButton btn1 = new JButton("Cancelar");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn1;
    }

   

   
}
