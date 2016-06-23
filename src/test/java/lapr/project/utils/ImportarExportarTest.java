/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import lapr.project.model.CentroExposicoes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class ImportarExportarTest {
    
    public ImportarExportarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of exportar method, of class ImportarExportar.
     */
    @Test
    public void testExportar() throws Exception {
        System.out.println("exportar");
        CentroExposicoes ce = new CentroExposicoes();
        String filename = "teste1.xml";
        ImportarExportar instance = new ImportarExportar();
        instance.exportar(ce, filename);
    }

    /**
     * Test of importar method, of class ImportarExportar.
     */
    @Test
    public void testImportar() throws Exception {
        System.out.println("importar");
        String filename = "teste1.xml";
        ImportarExportar instance = new ImportarExportar();
        CentroExposicoes expResult = new CentroExposicoes();
        CentroExposicoes result = instance.importar(filename);
        assertEquals(expResult, result);
    }
    
}
