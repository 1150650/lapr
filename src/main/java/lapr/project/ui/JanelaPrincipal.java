/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author JOAO
 */
class JanelaPrincipal extends JFrame {

    private CentroExposicoes centroexpo;
    private static final ImageIcon ICON
            = new ImageIcon(JanelaPrincipal.class.getResource("/imagem/centroExpo.jpg"));

    public JanelaPrincipal(CentroExposicoes centroexposicao) throws IOException {

        super("Centro De Exposições");
        this.centroexpo = centroexposicao;

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setMinimumSize(new Dimension(600, 307));

        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void criarComponentes() throws IOException {
        add(criarLblTitulo(), BorderLayout.NORTH);
    //    add(criarLblImagem(), BorderLayout.CENTER);

    }

    private JPanel criarLblTitulo() {
        JLabel lblMenuPrincipal = new JLabel("Centro de Exposições", JLabel.CENTER);
        lblMenuPrincipal.setFont(new Font("Helvetica", Font.BOLD, 30));
        lblMenuPrincipal.setForeground(Color.BLACK);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 30;
        final int MARGEM_ESQUERDA = 10, MARGEM_DIREITA = 10;
        p.setBorder(new EmptyBorder(MARGEM_SUPERIOR, MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));

        p.add(lblMenuPrincipal, JLabel.CENTER);

        return p;
    }
/*
    private JLabel criarLblImagem() throws IOException {
        BufferedImage myPicture = ImageIO.read(new File("/imagem/centroExpo.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);
        return picLabel;
    }
*/
}
