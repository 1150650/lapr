/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Simão Pedro
 */
public class MyfileChooserXMLCandidatura extends JFileChooser {

    public MyfileChooserXMLCandidatura() {
        super();
        definirFiltroExtensaoXML();
    }

    private void definirFiltroExtensaoXML() {
        setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extensao = extensao(f);
                if (extensao != null) {
                    return extensao.equals("xml");
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "*.xml";
            }

            private String extensao(File f) {
                String ext = null;
                String s = f.getName();
                int i = s.lastIndexOf(".");
                if (i != -1) {
                    ext = s.substring(i + 1).toLowerCase();
                }
                return ext;
            }
        });
    }

}
