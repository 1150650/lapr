/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author Diogo
 */
public class ImportarExportar {
    
    private CentroExposicoes ce;

    public void exportar(CentroExposicoes ce, String filename) throws Exception {
        try {
        JAXBContext jaxbContext = JAXBContext.newInstance( CentroExposicoes.class );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
         jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
         jaxbMarshaller.marshal( ce, new File( filename ) );
         jaxbMarshaller.marshal( ce, System.out );
          } catch (JAXBException e) {
		e.printStackTrace();
	      }
    }

    public CentroExposicoes importar(String filename) throws Exception {
        try {

		File file = new File(filename);
		JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ce = (CentroExposicoes) jaxbUnmarshaller.unmarshal(file);
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
        return ce;
    }
}
