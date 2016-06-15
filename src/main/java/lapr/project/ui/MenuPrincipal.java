/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoUtilizador;
import lapr.project.model.Utilizador;

/**
 *
 * @author SimãoPedro
 */
class MenuPrincipal extends JFrame {

    private CentroExposicoes ce;
    private DialogoLogin login;
    private JComboBox<TipoUtilizador> cbTipo;
    private Utilizador utilizadorAtivo;

    public MenuPrincipal(CentroExposicoes centroexposicao, Utilizador u) {
        super("Menu Principal");
        this.ce = centroexposicao;
        this.utilizadorAtivo = u;
        GridLayout gl = new GridLayout(6, 1);
        gl.setHgap(20);
        gl.setVgap(20);

        setLayout(gl);

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void criarComponentes() {
        add(criarPainelTitulo(), BorderLayout.NORTH);
        add(criarPainelUtilizador(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);

    }

    private JPanel criarPainelTitulo() {
        JLabel lblMenuPrincipal = new JLabel("Menu Principal", JLabel.CENTER);
        lblMenuPrincipal.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblMenuPrincipal.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblMenuPrincipal, JLabel.CENTER);

        return p;
    }

    private JPanel criarPainelUtilizador() {
        cbTipo = new JComboBox(TipoUtilizador.values());
        cbTipo.setEditable(false);
        cbTipo.setMaximumRowCount(3);
        String utilizador = new String("User: " + utilizadorAtivo.getNome() + " no papel de " + cbTipo);
        JLabel lblUtilizador = new JLabel(utilizador, JLabel.CENTER);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblUtilizador, JLabel.CENTER);
        
        return p;
    }

}
