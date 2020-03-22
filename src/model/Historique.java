package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Historique
 */
public class Historique {

    private List<Recherche> historique = new ArrayList<>();

    private Historique() {
    }

    private static class HistoriqueHolder {
        private final static Historique instance = new Historique();
    }

    public static Historique getInstance() {
        return HistoriqueHolder.instance;
    }

    public void add(Recherche recherche) {
        historique.add(recherche);
    }

    public List<Recherche> get() {
        return historique;
    }

    public void clear() {
        historique.clear();
    }

    @Override
    public String toString() {
        String res = "Historique\n";
        for (Recherche recherche : historique) {
            res += recherche;
        }
        return res;
    }

}