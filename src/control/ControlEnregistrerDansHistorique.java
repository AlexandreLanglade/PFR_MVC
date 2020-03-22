package control;

import model.Historique;
import model.Recherche;

/**
 * ControlEnregistrerDansHistorique
 */
public class ControlEnregistrerDansHistorique {

    private Historique historique = Historique.getInstance();

    public void enregistrerDansHistorique(Recherche recherche) {
        historique.add(recherche);
    }
}