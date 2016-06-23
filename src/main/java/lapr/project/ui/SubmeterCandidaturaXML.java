/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JFrame;
import lapr.project.controller.CriarCandidaturaController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author Simão Pedro
 */
public class SubmeterCandidaturaXML extends JFrame {

    private CriarCandidaturaOpcaoUI framePai;

    private CriarCandidaturaController crtlCandidaturaController;

    private CentroExposicoes ce;

    public SubmeterCandidaturaXML(CriarCandidaturaOpcaoUI framepai, CriarCandidaturaController crt, CentroExposicoes ce) {
        this.framePai = framepai;
        this.ce = ce;
        this.crtlCandidaturaController = crt;
        new MyfileChooserXMLCandidatura();
    }

}
