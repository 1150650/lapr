/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author Filipe <FilipeCorreia.1150524>
 */
public class ConsultarCandidaturasRetiradasController {
    
    private CentroExposicoes centroExposicoes;
    
    private Exposicao exposicao;
    
    private ListaCandidaturas registoCandidaturas;
    
    private List listaCandidaturas;
    
    public ConsultarCandidaturasRetiradasController(CentroExposicoes centroExposicoes){
        this.centroExposicoes = centroExposicoes;
    }
    
    public List getListaCandidaturas(Exposicao exposicao){
        this.exposicao=exposicao;
        registoCandidaturas = this.exposicao.getListaCandidaturas();
        return listaCandidaturas = registoCandidaturas.getListaCandidaturasRetiradas();
    }
    
}
