package lapr.project.ui;

import java.io.IOException;
import javax.swing.JFrame;
import lapr.project.model.CalculatorExample;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import lapr.project.ui.AlterarCandidaturaUI;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {


    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws IOException {

        CalculatorExample calculatorExample = new CalculatorExample();
        System.out.println(calculatorExample.sum(3, 5));
        Utilizador u = new Utilizador("Diogo Barros", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        CentroExposicoes ce = new CentroExposicoes();
        new MenuPrincipal(ce, u);
    //   new JanelaPrincipal(ce);
    }

}
