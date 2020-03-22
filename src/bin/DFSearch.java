package bin;

import control.ControlAuthentification;
import control.ControlChangerConfiguration;
import control.ControlChangerMdp;
import control.ControlEffacerHistorique;
import control.ControlEnregistrerDansHistorique;
import control.ControlLancerIndexation;
import control.ControlLancerRecherche;
import control.ControlVerifierID;
import control.ControlVisualiserDescripteurs;
import control.ControlVisualiserHistorique;
import view.BoundaryAuthentification;
import view.BoundaryChangerConfiguration;
import view.BoundaryChangerMdp;
import view.BoundaryEffacerHistorique;
import view.BoundaryLancerIndexation;
import view.BoundaryLancerRecherche;
import view.BoundaryVisualiserDescripteurs;
import view.BoundaryVisualiserHistorique;
import view.Clavier;

/**
 * DFSearch
 */
public class DFSearch {

    public static void main(String[] args) {

        /* Mise en place de l'environnement */
        ControlVerifierID controlVerifierID = new ControlVerifierID();
        ControlEnregistrerDansHistorique controlEnregistrerDansHistorique = new ControlEnregistrerDansHistorique();
        ControlLancerRecherche controlLancerRecherche = new ControlLancerRecherche(controlEnregistrerDansHistorique);
        BoundaryLancerRecherche boundaryLancerRecherche = new BoundaryLancerRecherche(controlLancerRecherche);
        ControlVisualiserHistorique controlVisualiserHistorique = new ControlVisualiserHistorique();
        BoundaryVisualiserHistorique boundaryVisualiserHistorique = new BoundaryVisualiserHistorique(controlVisualiserHistorique);
        ControlLancerIndexation controlLancerIndexation = new ControlLancerIndexation(controlVerifierID);
        BoundaryLancerIndexation boundaryLancerIndexation = new BoundaryLancerIndexation(controlLancerIndexation);
        ControlVisualiserDescripteurs controlVisualiserDescripteurs = new ControlVisualiserDescripteurs(controlVerifierID);
        BoundaryVisualiserDescripteurs boundaryVisualiserDescripteurs = new BoundaryVisualiserDescripteurs(controlVisualiserDescripteurs);
        ControlChangerConfiguration controlChangerConfiguration = new ControlChangerConfiguration(controlVerifierID);
        BoundaryChangerConfiguration boundaryChangerConfiguration = new BoundaryChangerConfiguration(controlChangerConfiguration);
        ControlEffacerHistorique controlEffacerHistorique = new ControlEffacerHistorique(controlVerifierID);
        BoundaryEffacerHistorique boundaryEffacerHistorique = new BoundaryEffacerHistorique(controlEffacerHistorique);
        ControlChangerMdp controlChangerMdp = new ControlChangerMdp(controlVerifierID);
        BoundaryChangerMdp boundaryChangerMdp = new BoundaryChangerMdp(controlChangerMdp);
        ControlAuthentification controlAuthentification = new ControlAuthentification(controlVerifierID);
        BoundaryAuthentification boundaryAuthentification = new BoundaryAuthentification(controlAuthentification);

        /* Main */
        System.out.println("   ***   DFSEARCH   ***   ");
        boolean continuer = true;
        while (continuer) {
            boolean admin = controlVerifierID.verifierID();
            menu(admin);
            int choix = Clavier.entrerClavierInt();
            if ((admin && choix >= 1 && choix <= 8) || (!admin && choix >= 1 && choix <= 4)) {
                if (admin) {
                    continuer = actionAdmin(boundaryLancerRecherche, boundaryVisualiserHistorique,
                            boundaryLancerIndexation, boundaryVisualiserDescripteurs, boundaryChangerConfiguration,
                            boundaryEffacerHistorique, boundaryChangerMdp, continuer, choix);
                } else {
                    continuer = actionNonAdmin(boundaryLancerRecherche, boundaryVisualiserHistorique,
                            boundaryAuthentification, continuer, choix);
                }
            }
        }
    }

    private static boolean actionNonAdmin(BoundaryLancerRecherche boundaryLancerRecherche,
            BoundaryVisualiserHistorique boundaryVisualiserHistorique,
            BoundaryAuthentification boundaryAuthentification, boolean continuer, int choix) {
        switch (choix) {
            case 1:
                boundaryLancerRecherche.lancerRecherche();
                break;
            case 2:
                boundaryVisualiserHistorique.VisualiserHistorique();
                break;
            case 3:
                boundaryAuthentification.authentification();
                break;
            default:
                continuer = false;
                break;
        }
        return continuer;
    }

    private static boolean actionAdmin(BoundaryLancerRecherche boundaryLancerRecherche,
            BoundaryVisualiserHistorique boundaryVisualiserHistorique,
            BoundaryLancerIndexation boundaryLancerIndexation,
            BoundaryVisualiserDescripteurs boundaryVisualiserDescripteurs,
            BoundaryChangerConfiguration boundaryChangerConfiguration,
            BoundaryEffacerHistorique boundaryEffacerHistorique, BoundaryChangerMdp boundaryChangerMdp,
            boolean continuer, int choix) {
        switch (choix) {
            case 1:
                boundaryLancerRecherche.lancerRecherche();
                break;
            case 2:
                boundaryVisualiserHistorique.VisualiserHistorique();
                break;
            case 3:
                boundaryLancerIndexation.lancerIndexation();
                break;
            case 4:
                boundaryVisualiserDescripteurs.visualiserDescripteurs();
                break;
            case 5:
                boundaryChangerConfiguration.changerConfiguration();
                break;
            case 6:
                boundaryEffacerHistorique.effacerHistorique();
                break;
            case 7:
                boundaryChangerMdp.changerMdp();
                break;
            default:
                continuer = false;
                break;
        }
        return continuer;
    }

    private static void menu(boolean admin) {
        System.out.println("Que souhaitez-vous faire : \n");
        System.out.println("1) Lancer une recherche");
        System.out.println("2) Visualiser l'historique");
        if (admin) {
            System.out.println("3) Lancer l'indexation");
            System.out.println("4) Visualiser les descripteurs");
            System.out.println("5) Changer la configuration");
            System.out.println("6) Effacer l'historique");
            System.out.println("7) Changer le mot de passe");
            System.out.println("8) Quitter\n");
        } else {
            System.out.println("3) Se connecter en mode admin");
            System.out.println("4) Quitter\n");
        }
    }
}