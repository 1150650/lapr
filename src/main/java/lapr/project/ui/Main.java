package lapr.project.ui;

import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lapr.project.model.AtribuicaoFAE;
import lapr.project.model.CalculatorExample;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Gestor;
import lapr.project.model.Organizador;
import lapr.project.model.Recurso;
import lapr.project.model.Representante;
import lapr.project.model.Stand;
import lapr.project.model.TipoDeConflito;
import lapr.project.model.Utilizador;
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

        importar();

    }

    public static void importar() {
        try {

            File file = new File("teste.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CentroExposicoes ce = (CentroExposicoes) jaxbUnmarshaller.unmarshal(file);
            new JanelaPrincipal(ce);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
