package view;

import control.ControlChangerMdp;

/**
 * BoundaryChangerMdp
 */
public class BoundaryChangerMdp {

    private ControlChangerMdp controlChangerMdp;

    public BoundaryChangerMdp(ControlChangerMdp controlChangerMdp) {
        this.controlChangerMdp = controlChangerMdp;
    }

    public void changerMdp() {
        if (controlChangerMdp.verifierID()) {
            System.out.println("Choisir un nouveau mot de passe : ");
            String mdp = Clavier.entrerClavierString();
            controlChangerMdp.changerMdp(mdp);
            System.out.println("Le mot de passe est maintenant " + mdp);
        }
    }

}