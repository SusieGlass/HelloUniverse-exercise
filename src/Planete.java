public class Planete {
    String nom;
    String matiere;
    long diametre;
    int nbTotalHumains = 0;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoste;
    static String forme = "sphérique";

    int revolution(int angle) {
        return angle / 360;
    }

    int rotation(int angle) {
        return angle / 360;
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        nbTotalHumains += vaisseau.nbPassagers;
        if (vaisseauAccoste == null){
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauAccoste.type + " doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent = vaisseauAccoste;
        vaisseauAccoste = vaisseau;
        return vaisseauPrecedent;
    }
}
