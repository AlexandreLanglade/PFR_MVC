package view;

import control.ControlLancerRecherche;
import model.Recherche;
import model.TypeRecherche;

/**
 * BoundaryLancerRecherche
 */
public class BoundaryLancerRecherche {

    private ControlLancerRecherche controlLancerRecherche;

    public BoundaryLancerRecherche(ControlLancerRecherche controlLancerRecherche) {
        this.controlLancerRecherche = controlLancerRecherche;
    }

    public void lancerRecherche() {
        System.out.println("Vous allez effectuer une recherche");
        System.out.println("Sur quel type de fichiers souhaitez-vous effectuer une recherche : ");
        System.out.println("1 Texte 2 Image 3 Audio");
        int choix = Clavier.entrerClavierInt();
        TypeRecherche typeRecherche;
        switch (choix) {
            case 1:
                typeRecherche = TypeRecherche.TEXTE;
                System.out.println("Entrez l'adresse d'un article ou un mot clé : ");
                break;
            
            case 2:
                typeRecherche = TypeRecherche.IMAGE;
                System.out.println("Entrez l'adresse d'une image ou une couleur dominante : ");
                break;

            case 3:
                typeRecherche = TypeRecherche.AUDIO;
                System.out.println("Entrez l'adresse d'un son ou d'un extrait : ");
                break;

            default:
                return;
        }
        String requete = Clavier.entrerClavierString();
        Recherche recherche = controlLancerRecherche.lancerRecherche(typeRecherche, requete);
        System.out.println(controlLancerRecherche.afficherRecherche(recherche));
        System.out.println("Enregistrer la recherche dans l'historique ? (o/n) ");
        String enregistrer = Clavier.entrerClavierString();
        if (enregistrer.equals("o")) {
            controlLancerRecherche.enregistrerDansHistorique(recherche);
            System.out.println("Recherche enregistrée.");
        }
    }
}