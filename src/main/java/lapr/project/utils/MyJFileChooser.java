package lapr.project.utils;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

public class MyJFileChooser extends JFileChooser {

    public MyJFileChooser() {
        super();
        definirFiltroExtensaoBin();
        personalizarEmPortugues();
    }

    private void definirFiltroExtensaoBin() {
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

    public static void personalizarEmPortugues() {

        // T�tulos das Caixas de Di�logo
        UIManager.put("FileChooser.openDialogTitleText", "Importar Listas");
        UIManager.put("FileChooser.saveDialogTitleText", "Exportar Listas");

        // Bot�o "Importar"
        UIManager.put("FileChooser.openButtonText", "Importar");
        UIManager.put("FileChooser.openButtonToolTipText", "Importar Listas");

        // Bot�o "Exportar"
        UIManager.put("FileChooser.saveButtonText", "Exportar");
        UIManager.put("FileChooser.saveButtonToolTipText", "Exportar Listas");

        // Bot�o "Cancelar"
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");

        // Legenda "Procurar em:"
        UIManager.put("FileChooser.lookInLabelText", "Procurar em:");

        // Legenda "Guardar em:"
        UIManager.put("FileChooser.saveInLabelText", "Guardar em:");

        // Legenda "Tipo de ficheiros:"
        UIManager.put("FileChooser.filesOfTypeLabelText", "Ficheiros do tipo:");

        // Legenda "Nome do ficheiro:"
        UIManager.put("FileChooser.fileNameLabelText", "Nome do ficheiro:");

        // Filtro "Todos os Ficheiros"
        UIManager.put("FileChooser.acceptAllFileFilterText", "Todos os Ficheiros");

        // Bot�o "Um n�vel acima"
        UIManager.put("FileChooser.upFolderToolTipText", "Um nível acima");

        // Bot�o "Nova Pasta"
        UIManager.put("FileChooser.newFolderToolTipText", "Criar nova pasta");

        // Bot�o "Vista Lista"
        UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");

        // Bot�o "Vista Detalhada"
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalhes");

    }

}
