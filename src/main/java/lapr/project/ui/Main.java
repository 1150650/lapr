package lapr.project.ui;

import java.io.IOException;
import java.util.Date;
import javax.swing.JFrame;
import lapr.project.model.CalculatorExample;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Stand;
import lapr.project.model.Utilizador;
import lapr.project.ui.AlterarCandidaturaUI;
import lapr.project.utils.ImportarExportar;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws Exception {

        CalculatorExample calculatorExample = new CalculatorExample();
        System.out.println(calculatorExample.sum(3, 5));
        Exposicao e = new Exposicao("Expo1", "Melhor Exposicao", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
        
        Utilizador u = new Utilizador("Diogo Barros", "diogo@gmail.com", "barros15", ".DiogoBarros10");
        Utilizador u1 = new Utilizador("Diogo Barros1", "diogo1@gmail.com", "barros115", ".DiogoBarros10");
        FAE fae = e.getListaFAE().addFAE(u, "barros16");
        FAE fae1 = e.getListaFAE().addFAE(u1, "barros116");
        e.getListaFAE().registaFAE(fae);
        e.getListaFAE().registaFAE(fae1);
        
        
        Stand s = new Stand();
        CentroExposicoes ce = new CentroExposicoes();
        ce.getListaExposicoes().adicionarExposicao(e);
        ce.getRegistoUtilizadoresNConf().registaUtilizador(u);
        ce.getRegistoUtilizadoresNConf().registaUtilizador(u1);
        ce.getListastands().adicionarStand(s);
        
//        ce.getListaExposicoes().obterExposicao(0).setExposicaoCriada();
        ImportarExportar exp = new ImportarExportar();
        exp.exportar(ce, "teste.xml");

        new MenuPrincipal(ce, u);
        new JanelaPrincipal(ce);
    }

}
