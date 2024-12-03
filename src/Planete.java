public class Planete {

    static String forme = "sphérique";
    static  int nbPlanetesDecouvertes = 0;

    String nom;
    long diametre;
    Atmosphere atmosphere;

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
