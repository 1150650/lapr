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
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.DefinirFAEController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class DefinirFAEUI extends JFrame {

    private JButton addBtn;

    private JButton cancelBtn;

    private CentroExposicoes centroExposicoes;

    private DefinirFAEController controller;

    private Exposicao exposicao;

    private MenuPrincipal framePai;

    private ModeloListaUtilizadores lstUtilizadores;

    private Icon icon;

    private Utilizador utilizador;
    
    private String id;

    private FAE fae;
    
    private JTextField txtFIdFae;

    public DefinirFAEUI(MenuPrincipal framePai, CentroExposicoes centroExposicoes, Utilizador utilizador) {
        super("Definir FAEs");
        this.centroExposicoes = centroExposicoes;
        this.utilizador = utilizador;
        this.framePai = framePai;
        this.controller = new DefinirFAEController(centroExposicoes);

        selecionarExposicao();
        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void selecionarExposicao() {
        //Exposicao[] aux = ce.getListaExposicoes().getListaExposicaoParaDefinirDemos();
        int auxSize = controller.getExposicoesOrganizador(utilizador).size();
        Exposicao[] aux = new Exposicao[auxSize];
        controller.getExposicoesOrganizador(utilizador).toArray(aux);
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique Exposicao em que é Organizador"
                + ":",
                "Seleção Da Exposicao",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");
        controller.setExposicao(expo);
        exposicao = expo;
        dispose();
    }

    private void criarComponentes() {
        add(criarPainelNorte(), BorderLayout.NORTH);
        add(criarPainelCentro(), BorderLayout.CENTER);
        add(criarBotaoSair(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelNorte() {
        JLabel l = new JLabel(controller.getExposicao().getTitulo(), JLabel.CENTER);
        JPanel j = new JPanel();
         txtFIdFae = new JTextField("Introduza o id do FAE", JTextField.CENTER);
        j.add(l, BorderLayout.NORTH);
        j.add(txtFIdFae, BorderLayout.SOUTH);
        return j;
    }

    private JPanel criarPainelCentro() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout(NUMERO_LINHAS,
                NUMERO_COLUNAS,
                INTERVALO_HORIZONTAL,
                INTERVALO_VERTICAL));
        lstUtilizadores = new ModeloListaUtilizadores(controller.getRegistoUtilizadores());
        JList lstCompleta = new JList(lstUtilizadores);

        addBtn = criarBotaoAdicionarUtilizador(lstCompleta);

        p.add(criarPainelLista(lstCompleta, addBtn));

        return p;
    }

    private JButton criarBotaoAdicionarUtilizador(JList lstCompleta) {
        addBtn = new JButton("Selecionar Candidatura");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utilizador u = (Utilizador) lstCompleta.getSelectedValue();
                if (u != null) {
                    id = txtFIdFae.getText();
                    fae = controller.addFAE(u, id);
                    controller.registaFAE(fae);
                } else {
                    JOptionPane.showMessageDialog(DefinirFAEUI.this, "Nenhum Utilizador Selecionado", "Erro", ERROR);
                }
            }
        });
        return addBtn;
    }

    private JPanel criarPainelLista(JList lstCompleta, JButton btnAceitar) {
        lstCompleta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstCompleta);

        JPanel p = new JPanel(new BorderLayout());

        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA,
                MARGEM_INFERIOR,
                MARGEM_DIREITA));

        p.add(scrPane, BorderLayout.NORTH);
        p.add(btnAceitar, BorderLayout.CENTER);
        return p;
    }

    private JButton criarBotaoSair() {
        cancelBtn = new JButton("Sair");
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return cancelBtn;
    }
}
