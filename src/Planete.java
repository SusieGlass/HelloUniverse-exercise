public abstract class Planete {
    String nom;
    long diametre;
    Atmosphere atmosphere;
    static String forme = "sphérique";
    static  int nbPlanetesDecouvertes;

    Planete(String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    int revolution(int angle) {
        return angle / 360;
    }

    int rotation(int angle) {
        return angle / 360;
    }


}
