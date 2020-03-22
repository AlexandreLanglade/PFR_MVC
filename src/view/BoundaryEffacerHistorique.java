package view;

import control.ControlEffacerHistorique;

/**
 * BoundaryEffacerHistorique
 */
public class BoundaryEffacerHistorique {

    private ControlEffacerHistorique controlEffacerHistorique;

    public BoundaryEffacerHistorique(ControlEffacerHistorique controlEffacerHistorique) {
        this.controlEffacerHistorique = controlEffacerHistorique;
    }

    public void effacerHistorique() {
        if (controlEffacerHistorique.verifierID()) {
            System.out.println("Etes vous sûr de vouloir supprimer l'historique ? (1 oui 0 non) : ");
            int choix = Clavier.entrerClavierInt();
            if (choix == 1) {
                controlEffacerHistorique.effacerHistorique();
                System.out.println("Historique supprimé");
            }
        }
    }
}