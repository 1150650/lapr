package lapr.project.ui;

import java.io.IOException;
import java.util.Date;
import javax.swing.JFrame;
import lapr.project.model.CalculatorExample;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
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
    public static void main(String[] args) {

        CalculatorExample calculatorExample = new CalculatorExample();
        System.out.println(calculatorExample.sum(3, 5));
        Exposicao e = new Exposicao("Expo1", "Melhor Exposicao", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        Utilizador u = new Utilizador("Diogo Barros", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        CentroExposicoes ce = new CentroExposicoes();
        ce.getListaExposicoes().adicionarExposicao(e);
        ce.getRegistoUtilizadoresNConf().registaUtilizador(u);
        ce.getListaExposicoes().obterExposicao(0).setExposicaoCriada();

        new MenuPrincipal(ce, u);
        new JanelaPrincipal(ce);
    }

}
