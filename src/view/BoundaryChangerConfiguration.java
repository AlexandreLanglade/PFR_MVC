package view;

import control.ControlChangerConfiguration;

/**
 * BoundaryChangerConfiguration
 */
public class BoundaryChangerConfiguration {

    private ControlChangerConfiguration controlChangerConfiguration;

    public BoundaryChangerConfiguration(ControlChangerConfiguration controlChangerConfiguration) {
        this.controlChangerConfiguration = controlChangerConfiguration;
    }
    
    public void changerConfiguration() {
        if (controlChangerConfiguration.verifierID()) {
            System.out.println(controlChangerConfiguration.afficherConfig());
            System.out.println("Quel paramètre voulez-vous modifier ?");
            System.out.println("0 Aucun");
            System.out.println("1 Valeur Limite Texte");
            System.out.println("2 Seuil Texte");
            System.out.println("3 Nombre Bits Image");
            System.out.println("4 Nombre Echantillons Audio");
            System.out.println("5 Nombre Intervalles Audio");
            int choix = Clavier.entrerClavierInt();
            if (choix >= 1 && choix <= 5) {
                System.out.println("Nouvelle valeur : ");
                int valeur = Clavier.entrerClavierInt();
                controlChangerConfiguration.changerConfiguration(choix, valeur);
            }
        }
    }
}