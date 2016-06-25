/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.AvaliarCandidaturaFAEController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ModeloListaCandidaturas;
import lapr.project.model.TipoUtilizador;
import lapr.project.model.Utilizador;

/**
 *
 * @author Simão Pedro
 */
public class AvaliarCandidaturaSelecionarCandidaturaUI extends JFrame {

    private CentroExposicoes ce;

    private AvaliarCandidaturaFAEController crtlAvaliar;

    private Exposicao expo;

    private int termoParagem = 0;

    private Utilizador u;

    private JPanel cBox, listaCand, botoes;

    private JButton btnSelecionarCandidatura;

    private ModeloListaCandidaturas modeloListaCand;

    public AvaliarCandidaturaSelecionarCandidaturaUI(MenuPrincipal framePai, Utilizador u, CentroExposicoes ce) {
        this.ce = ce;
        this.u = u;
        this.crtlAvaliar = new AvaliarCandidaturaFAEController(ce, u);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        if (termoParagem == 0) {
            add(cBox = criarComboBox());
            add(listaCand = criarPainelListaCanidaturas());
            add(botoes = Botoes());
            termoParagem++;
        } else {
            remove(cBox);
            remove(listaCand);
            remove(botoes);
            add(cBox = criarComboBox());
            add(listaCand = criarPainelListaCanidaturas());
            add(botoes = Botoes());
            revalidate();
        }
    }

    private JPanel criarComboBox() {
        cBox = new JPanel();
        JComboBox cb = new JComboBox(ce.getArrayExposicao());
        cb.setEditable(false);
        cb.setMaximumRowCount(5);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crtlAvaliar.selecionarExposicao(expo);
                if (crtlAvaliar.getFAE() == null) {
                    JOptionPane.showMessageDialog(AvaliarCandidaturaSelecionarCandidaturaUI.this, "Não é FAE nessa Expo", "Erro", ERROR);
                } else {
                    criarComponentes();
                }

            }
        });
        cBox.add(cb);
        return cBox;
    }

    private JPanel criarPainelListaCanidaturas() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        modeloListaCand = new ModeloListaCandidaturas(crtlAvaliar.getFAE().getListacandidatura());
        JList lstCompleta = new JList(modeloListaCand);

        btnSelecionarCandidatura = criarBotaoSelecionarCandidatura(lstCompleta);

        p.add(criarPainelLista(lstCompleta, btnSelecionarCandidatura));

        return p;
    }

    private JPanel Botoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JButton criarBotaoSelecionarCandidatura(JList lstCompleta) {
        JButton btn = new JButton("Selecionar Candidatura");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModeloListaCandidaturas m = (ModeloListaCandidaturas) lstCompleta.getModel();
                CandidaturaExposicao c = (CandidaturaExposicao) lstCompleta.getSelectedValue();
                crtlAvaliar.selecionarCandidatura(c);
                if (c != null) {
                    new AvaliarCandidaturaUI(AvaliarCandidaturaSelecionarCandidaturaUI.this, crtlAvaliar);
                }
            }
        });

        return btn;
    }

    private JPanel criarPainelLista(JList lstCompleta, JButton btnSelecionarCandidatura) {
        JLabel lblTitulo = new JLabel("Selecione Candidatura a Alterar", JLabel.LEFT);
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);
        p.add(btnSelecionarCandidatura, BorderLayout.SOUTH);
        return p;
    }

}
