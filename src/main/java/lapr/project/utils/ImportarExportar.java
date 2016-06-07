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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author Diogo
 */
public class ImportarExportar {
    public static void exportar(CentroExposicoes ce, String filename) throws Exception{
        XMLEncoder encoder =
           new XMLEncoder(
              new BufferedOutputStream(
                new FileOutputStream(filename)));
        encoder.writeObject(ce);
        encoder.close();
    }
    
    public static CentroExposicoes importar(String filename) throws Exception {
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        CentroExposicoes ce = (CentroExposicoes)decoder.readObject();
        decoder.close();
        return ce;
    }
}
