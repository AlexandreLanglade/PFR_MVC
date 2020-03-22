package control;

import model.Historique;

/**
 * ControlVisualiserHistorique
 */
public class ControlVisualiserHistorique {

    private Historique historique = Historique.getInstance();

    public String visualiserHistorique() {
        return historique.toString();
    }
}