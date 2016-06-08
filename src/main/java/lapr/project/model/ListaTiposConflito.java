/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class ListaTiposConflito {
    
    private List<TipoConflito> listaTipoConflito;
    
    public ListaTiposConflito(){
        listaTipoConflito = new ArrayList<TipoConflito>();
    }
    
    public List getTiposConflitosAtivos(){
        return listaTipoConflito;
    }
    
}
