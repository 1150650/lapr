package lapr.project.ui;

import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lapr.project.model.AtribuicaoFAE;
import lapr.project.model.CalculatorExample;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
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

//        CalculatorExample calculatorExample = new CalculatorExample();
//        System.out.println(calculatorExample.sum(3, 5));
//        Exposicao e = new Exposicao("Expo1", "Melhor Exposicao", new Date(2015, 9, 22), new Date(2016, 9, 22), "Porto");
//        
//        Utilizador u = new Utilizador("Lapr2", "lapr2@gmail.com", "lapr2", ".Lapr2016");
//        Utilizador u1 = new Utilizador("Error404", "error404@gmail.com", "error404", ".Error404");
//        
//        FAE fae = e.getListaFAE().addFAE(u, "barros16");
//        FAE fae1 = e.getListaFAE().addFAE(u1, "barros116");
//        
//        Candidatura candidatura = new Candidatura("Empresa1", "Rua da rua", 911803479, "muitos produtos", 53);
//        
//        Demonstracao d = new Demonstracao("isto é uma descriçao");
//        
//        Stand s = new Stand("Isto é um Stand");
//        
//        TipoDeConflito tc = new TipoDeConflito("ISto é um conflito");
//        
//        Recurso r1 = new Recurso("lapis");
//        Recurso r2 = new Recurso("caneta");
//        
//        
//        AtribuicaoFAE atribuicao = new AtribuicaoFAE(fae, candidatura);
//        
//        Representante r = new Representante(u);
//        
//        e.getListaFAE().registaFAE(fae);
//        e.getListaFAE().registaFAE(fae1);
//        e.getListaCandidaturasExposicoes().adicionarCandidatura(candidatura);
//        e.getListaCandidaturasDemonstracoes().adicionarCandidatura(candidatura);
//        e.getListaDemonstracoes().addDemonstracao(d);
//        e.getListaRepresentantes().addRepresentante(r);
//        e.getListaAtribuicoes().adicionarAtribuição(atribuicao);
//        
//        
//        
//        CentroExposicoes ce = new CentroExposicoes();
//        ce.getListaExposicoes().adicionarExposicao(e);
//        ce.getRegistoUtilizadoresNConf().registaUtilizador(u);
//        ce.getRegistoUtilizadoresConf().registaUtilizador(u1);
//        ce.getListastands().adicionarStand(s);
//        ce.getListaTipoDeConflito().adicionarTipoDeConflito(tc);
//        ce.getRegistoRecursos().addRecurso(r1);
//        ce.getRegistoRecursos().addRecurso(r2);
//        
try {

		File file = new File("teste.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		CentroExposicoes ce = (CentroExposicoes) jaxbUnmarshaller.unmarshal(file);
                new JanelaPrincipal(ce);
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
////
////    
////        
////        ce.getListaExposicoes().obterExposicao(0).setExposicaoCriada();
//        ImportarExportar exp = new ImportarExportar();
//        exp.exportar(ce, "teste.xml");
//
////        new MenuPrincipal(ce, u);
//       new JanelaPrincipal(ce);
    }
    }


