public class PlaneteTellurique  extends Planete implements Habitable{
    Vaisseau vaisseauAccoste;
    int nbTotalHumains;

    PlaneteTellurique(String nom) {
        super(nom);
    }
    @Override
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
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

