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
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import lapr.project.controller.CriarDemonstracaoController;
import lapr.project.controller.DefinirInteresseStandController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.Recurso;
import lapr.project.model.Utilizador;

/**
 *
 * @author JOAO
 */
public class DefinirInteresseStandUI extends JFrame {
    private JButton btnAceitarStand;
    private ModeloListaCandidaturas lstCandidaturas;
    private DefinirInteresseStandController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;
    private Exposicao expo;
    private Icon icon;

    public DefinirInteresseStandUI(MenuPrincipal framePai, CentroExposicoes ce,Utilizador u) {

        super("Registar Demonstracao");
        this.centroexpo = ce;
        this.contr = new DefinirInteresseStandController(ce,u);
        this.framePai = framePai;
        this.expo=ce.getListaExposicoes().obterExposicao(0);

        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {

        JPanel pai1 = criarPainelNorte();
        JPanel p2 = criarPainelCentro();
        JPanel pain3 = criarPainelSul();

        add(pai1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(pain3, BorderLayout.SOUTH);
    }

    private JPanel criarPainelNorte() {
        
        
         JButton btnSelecionarExposicao = criarBotaoSelecionarExposicao();


        
        JPanel pNorte = new JPanel(new BorderLayout());
        pNorte.add(btnSelecionarExposicao, BorderLayout.CENTER);
        return pNorte;
    }

    private JPanel criarPainelCentro() {
        JPanel p231 = criarPainelRecurso();

        JPanel pCentro = new JPanel(new BorderLayout());
        pCentro.add(p231, BorderLayout.CENTER);

        return pCentro;
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

   

    private JPanel criarPainelRecurso() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstCandidaturas = new ModeloListaCandidaturas(contr.getListaCandidaturasExposicoes(expo));
        JList lstCompleta = new JList(lstCandidaturas);

        btnAceitarStand = criarBotaoAceitarStand(lstCompleta);

        p.add(criarPainelLista("Lista de Candidaturas:",
                lstCompleta,
                lstCandidaturas,
                btnAceitarStand));

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

    private JButton criarBotaoAceitarStand(JList lstCompleta) {
        JButton btn = new JButton("Adicionar Recursos");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ModeloListaCandidaturas m = (ModeloListaCandidaturas) lstCompleta.getModel();
                    Candidatura r = (Candidatura) lstCompleta.getSelectedValue();
                    contr.aceitarStand(r);
                    m.removeElement(r);

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
                            DefinirInteresseStandUI.this,
                            "Indique a exposição da qual deseja viziualizar a candidatura"
                            + ":",
                            "Seleção De Exposição",
                            JOptionPane.DEFAULT_OPTION,
                            icon,
                            aux,
                            "");

                } catch (Exception e1) {

                }

                
            }

        });

        return btn;
    }

    private JButton criarBotaoConclui() {
        JButton btnConclui = new JButton("COncluir Processo");
        btnConclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btnConclui;
    }
}
