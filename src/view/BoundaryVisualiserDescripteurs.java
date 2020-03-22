package view;

import control.ControlVisualiserDescripteurs;
import model.TypeRecherche;

/**
 * BoundaryVisualiserDescripteurs
 */
public class BoundaryVisualiserDescripteurs {

    private ControlVisualiserDescripteurs controlVisualiserDescripteurs;

    public BoundaryVisualiserDescripteurs(ControlVisualiserDescripteurs controlVisualiserDescripteurs) {
        this.controlVisualiserDescripteurs = controlVisualiserDescripteurs;
    }

    public void visualiserDescripteurs() {
        if (controlVisualiserDescripteurs.verifierID()) {
            System.out.println("Quel type de descripteurs voulez-vous afficher ?");
            System.out.println("1 Tous");
            System.out.println("2 Texte");
            System.out.println("3 Image");
            System.out.println("4 Audio");
            int choix = Clavier.entrerClavierInt();
            switch (choix) {
                case 1:
                    System.out.println(controlVisualiserDescripteurs.visualiserDescripteurs());
                    break;
                
                case 2:
                    System.out.println(controlVisualiserDescripteurs.visualiserDescripteurs(TypeRecherche.TEXTE));
                    break;
                
                case 3:
                    System.out.println(controlVisualiserDescripteurs.visualiserDescripteurs(TypeRecherche.IMAGE));
                    break;

                case 4:
                    System.out.println(controlVisualiserDescripteurs.visualiserDescripteurs(TypeRecherche.AUDIO));
                    break;
            
                default:
                    System.out.println("Entrée incorrecte");
                    break;
            }
        }
    }
    
}