package model;

/**
 * Configuration
 */
public class Configuration {

    private int valeurLimiteTexte = 1;
    private int seuilTexte = 4;
    private int nombreBitsImage = 3;
    private int nombreEchantillonsAudio = 8192;
    private int nombreIntervallesAudio = 15;

    private Configuration() {
    }

    private static class ConfigurationHolder {
        private final static Configuration instance = new Configuration();
    }

    public static Configuration getInstance() {
        return ConfigurationHolder.instance;
    }

    public int getValeurLimiteTexte() {
        return valeurLimiteTexte;
    }

    public void setValeurLimiteTexte(int valeurLimiteTexte) {
        this.valeurLimiteTexte = valeurLimiteTexte;
    }

    public int getSeuilTexte() {
        return seuilTexte;
    }

    public void setSeuilTexte(int seuilTexte) {
        this.seuilTexte = seuilTexte;
    }

    public int getNombreBivoidtsImage() {
        return nombreBitsImage;
    }

    public void setNombreBitsImage(int nombreBitsImage) {
        this.nombreBitsImage = nombreBitsImage;
    }

    public int getNombreEchantillonsAudio() {
        return nombreEchantillonsAudio;
    }

    public void setNombreEchantillonsAudio(int nombreEchantillonsAudio) {
        this.nombreEchantillonsAudio = nombreEchantillonsAudio;
    }

    public int getNombreIntervallesAudio() {
        return nombreIntervallesAudio;
    }

    public void setNombreIntervallesAudio(int nombreIntervallesAudio) {
        this.nombreIntervallesAudio = nombreIntervallesAudio;
    }

    @Override
    public String toString() {
        return "Configuration [nombreBitsImage=" + nombreBitsImage + ", nombreEchantillonsAudio="
                + nombreEchantillonsAudio + ", nombreIntervallesAudio=" + nombreIntervallesAudio + ", seuilTexte="
                + seuilTexte + ", valeurLimiteTexte=" + valeurLimiteTexte + "]";
    }
   
}