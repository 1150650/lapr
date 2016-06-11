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
public class RegistoMecanismos {
    
    private List<Mecanismo> listaMecanismos;
    
    public RegistoMecanismos(){
        listaMecanismos = new ArrayList<>();
    }
    
    public List getListaMecanismos(){
        return listaMecanismos;
    }
}
