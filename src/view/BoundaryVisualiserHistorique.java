package view;

import control.ControlVisualiserHistorique;

/**
 * BoundaryVisualiserHistorique
 */
public class BoundaryVisualiserHistorique {

    private ControlVisualiserHistorique controlVisualiserHistorique;

    public BoundaryVisualiserHistorique(ControlVisualiserHistorique controlVisualiserHistorique) {
        this.controlVisualiserHistorique = controlVisualiserHistorique;
    }

    public void VisualiserHistorique() {
        System.out.println(controlVisualiserHistorique.visualiserHistorique());
    }
    
}