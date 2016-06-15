/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.FlowLayout;
import javafx.scene.control.ComboBox;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import lapr.project.controller.AtribuirCandidaturaController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaAtribuicoes;

/**
 *
 * @author SimãoPedro
 */
public class AtribuirCandidaturaUI extends JFrame {

    private int opcao;

    private Icon icon;

    private AtribuirCandidaturaController crtAtribuir;

    private CentroExposicoes ce;

    private MenuPrincipal framePai;

    private JButton btnOk, btnCancelar;

    private ListaAtribuicoes lstAtribuicoes;

    private Exposicao exposicaoSelecionada;

    private JComboBox cbMec;

    public AtribuirCandidaturaUI(MenuPrincipal framePai, CentroExposicoes ce) {
        super();
        this.framePai = framePai;
        this.ce = ce;
        this.crtAtribuir = new AtribuirCandidaturaController(ce);

        criarComponentes();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(framePai);
        setVisible(true);
    }

    private void criarComponentes() {
        selecionarExposicao();
        JPanel mecanismos = criarPainelMecanismo();
        JPanel descrição = criarPainelDescrição();
        JPanel listaAtribuiçoes = criarPainelListaAtribuicoes();
        
        add(mecanismos);
        add(descrição);
        add(listaAtribuiçoes);
    }

    public void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Selecionar Exposição"
                + ":",
                "Seleção De Exposição",
                JOptionPane.DEFAULT_OPTION,
                icon,
                aux,
                "");

        dispose();
        crtAtribuir.selecionarExposicao(expo);
    }

    private JPanel criarPainelMecanismo() {
        JPanel p = new JPanel();
        JLabel label = new JLabel("Mecanismos");
        String[] mecanismo = {"", "Mecanismo Carga Equitativa Por FAE", "Mecanismo Experiencia por FAE", "Mecanismo numero candidaturas por FAE"};
        cbMec = new JComboBox(mecanismo);
        cbMec.setEditable(false);
        cbMec.setMaximumRowCount(4);

        p.add(label, new FlowLayout(FlowLayout.LEFT));
        p.add(cbMec, new FlowLayout(FlowLayout.CENTER));
        return p;
    }

    private JPanel criarPainelDescrição() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JPanel criarPainelListaAtribuicoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void 
            
    }
}
