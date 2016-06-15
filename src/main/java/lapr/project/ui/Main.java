package lapr.project.ui;

import java.io.IOException;
import javax.swing.JFrame;
import lapr.project.model.CentroExposicoes;
import lapr.project.ui.AlterarCandidaturaUI;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws IOException {

        CalculatorExample calculatorExample = new CalculatorExample();
        System.out.println(calculatorExample.sum(3, 5));
        CentroExposicoes ce = new CentroExposicoes();
        new JanelaPrincipal(ce);
    }

}
