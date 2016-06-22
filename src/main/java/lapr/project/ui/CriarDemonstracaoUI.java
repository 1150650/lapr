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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.CriarDemonstracaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Recurso;

/**
 *
 * @author JOAO
 */
public class CriarDemonstracaoUI extends JFrame {

    private JTextField txtDescricao;
    private JButton btnAdicionarRecurso;
    private ModeloListaRecursos lstRecursos;
    private CriarDemonstracaoController contr;
    private CentroExposicoes centroexpo;
    private MenuPrincipal framePai;
    private Exposicao expo;
    private Icon icon;

    public CriarDemonstracaoUI(MenuPrincipal framePai, CentroExposicoes ce) {

        super("Registar Demonstracao");
        this.centroexpo = ce;
        this.contr = new CriarDemonstracaoController(ce);
        this.framePai = framePai;
        contr.novaDemonstracao();
        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
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

        JPanel p2 = criarPainelDescricao();
        JPanel pNorte = new JPanel(new BorderLayout());
        pNorte.add(p2, BorderLayout.CENTER);
        return pNorte;
    }

    private JPanel criarPainelCentro() {
        JPanel p1 = criarPainelRecurso();

        JPanel pCentro = new JPanel(new BorderLayout());
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

    private JPanel criarPainelDescricao() {
        JLabel lbl = new JLabel("Descricao:", JLabel.RIGHT);

        final int CAMPO_LARGURA = 10;
        txtDescricao = new JTextField(CAMPO_LARGURA);

        JPanel p = new JPanel();

        p.add(lbl);
        p.add(txtDescricao);

        return p;
    }

    private JPanel criarPainelRecurso() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstRecursos = new ModeloListaRecursos(contr.getListaRecursos());
        JList lstCompleta = new JList(lstRecursos);

        btnAdicionarRecurso = criarBotaoAdiconarRecurso(lstCompleta);

        p.add(criarPainelLista("Lista de Recursos:",
                lstCompleta,
                lstRecursos,
                btnAdicionarRecurso));

        return p;
    }

    private JPanel criarPainelLista(
            String tituloLista,
            JList lstLista,
            ModeloListaRecursos modeloLista,
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

        JPanel pBotoes = criarPainelBotoes(btnSuperior);
        p.add(pBotoes, BorderLayout.SOUTH);
        return p;
    }

    private JPanel criarPainelBotoes(JButton btnSuperior) {
        final int NUMERO_LINHAS = 2, NUMERO_COLUNAS = 1;
        final int INTERVALO_HORIZONTAL = 0, INTERVALO_VERTICAL = 10;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));

        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(btnSuperior);

        return p;
    }

    private JButton criarBotaoOK() {
        JButton btn = new JButton("Registar Demonstração");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 Exposicao[] aux = contr.getListaExposicoes();

                expo = (Exposicao) JOptionPane.showInputDialog(
                            CriarDemonstracaoUI.this ,
                        "Indique a exposição da qual deseja retirar a candidatura"
                        + ":",
                        "Seleção De Exposição",
                        JOptionPane.DEFAULT_OPTION,
                        icon,
                        aux,
                        "");
                contr.selecionarExposicao(expo);
                String Descricao = txtDescricao.getText();
              contr.setDados(Descricao);
              contr.setEstadoDemonstracaoCriada();
              contr.validaRegistaDemonstracao();
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

    private JButton criarBotaoAdiconarRecurso(JList lstCompleta) {
        JButton btn = new JButton("Adicionar Recursos");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ModeloListaRecursos m = (ModeloListaRecursos) lstCompleta.getModel();
                    Recurso r = (Recurso) lstCompleta.getSelectedValue();
                    contr.adicionarRecurso(r);

                } catch (NumberFormatException ex) {

                }
            }
        });

        return btn;
    }

}
