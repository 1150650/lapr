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
import java.io.File;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import lapr.project.controller.CriarCandidaturaExposicaoController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Representante;
import lapr.project.model.Utilizador;
import lapr.project.utils.ImportarExportar;
import lapr.project.utils.MyJFileChooser;

/**
 *
 * @author Simão Pedro
 */
public class CriarCandidaturaOpcaoUI extends JFrame {

    private MenuPrincipal framePai;

    private CriarCandidaturaOpcaoUI Janela;

    private CentroExposicoes ce;

    private Icon icon;

    private Representante r;

    private CriarCandidaturaExposicaoController crtlCriarCandidatura;

    public CriarCandidaturaOpcaoUI(MenuPrincipal framePai, CentroExposicoes ce, Utilizador u) {
        Janela = this;
        this.framePai = framePai;
        this.ce = ce;
        crtlCriarCandidatura = new CriarCandidaturaExposicaoController(ce, u);
        GridLayout g = new GridLayout(0, 1);
        g.setHgap(200);
        g.setVgap(200);
        setLayout(g);
        selecionarExposicao();
        criarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public void selecionarExposicao() {
        Exposicao[] aux = ce.getArrayExposicao();
        Exposicao expo;
        expo = (Exposicao) JOptionPane.showInputDialog(
                framePai,
                "Indique  Exposição que se pretende candidatar"
                + ":",
                "Seleção da Exposição que se pretende candidatar",
                JOptionPane.CLOSED_OPTION,
                icon,
                aux,
                "");
        crtlCriarCandidatura.selecionaExposicao(expo);
        dispose();
    }

    private void criarComponentes() {
        add(criarSubmeterFicheiroXml());
        add(criarCandidaturaPrograma());
        add(criarBotaoSair());
    }

    private JButton criarSubmeterFicheiroXml() {
        JButton j = new JButton("Submeter ficheiro em XML");
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImportarExportar imp = new ImportarExportar();
                MyJFileChooser fileChooser = new MyJFileChooser();
                int resposta = fileChooser.showOpenDialog(CriarCandidaturaOpcaoUI.this);

                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    Candidatura c;
                    try {
                        file = new File(file.getPath());
                        JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

                        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                        c = (Candidatura) jaxbUnmarshaller.unmarshal(file);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                CriarCandidaturaOpcaoUI.this,
                                "Impossível ler o ficheiro: " + file.getPath() + " !",
                                "Importar",
                                JOptionPane.ERROR_MESSAGE);
                    }


                }

            }
        });
        return j;
    }

    private JButton criarCandidaturaPrograma() {
        JButton j = new JButton("Criar Candidatura no Sistema");
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CriarCandidaturaExposicaoUI(Janela, crtlCriarCandidatura);
            }
        });
        return j;
    }

    private JButton criarBotaoSair() {
        JButton btn = new JButton("Sair");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }

}
