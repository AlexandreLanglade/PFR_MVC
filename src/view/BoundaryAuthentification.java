package view;

import control.ControlAuthentification;

/**
 * BoundaryAuthentification
 */
public class BoundaryAuthentification {

    private ControlAuthentification controlAuthentification;

    public BoundaryAuthentification(ControlAuthentification controlAuthentification) {
        this.controlAuthentification = controlAuthentification;
    }

    public void authentification() {
        System.out.println("Mot de passe : ");
        String mdp = Clavier.entrerClavierString();
        controlAuthentification.authentification(mdp);
        if (controlAuthentification.verifierID()) {
            System.out.println("Connexion réussie");
        } else {
            System.out.println("Mot de passe incorrect");
        }
    }
    
}