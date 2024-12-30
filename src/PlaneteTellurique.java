public class PlaneteTellurique  extends Planete implements Habitable{

    Vaisseau[] vaisseauxAccostes;
    /*Vaisseau vaisseauAccoste;*/
    int nbTotalHumains;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[tailleBaie];
    }

    boolean restePlaceDisponible(){
        for(int index = 0; index<vaisseauxAccostes.length; index++){
            if (vaisseauxAccostes[index] == null){
                return true;
            }
        }
                return false;
    }

    @Override
    public void accueillirVaisseau(Vaisseau vaisseau) {

        if (vaisseau instanceof VaisseauDeGuerre) {
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }
        nbTotalHumains += vaisseau.nbPassagers;
        for (int index = 0; index<vaisseauxAccostes.length; index++){
            if (vaisseauxAccostes[index] == null){
                vaisseauxAccostes[index] = vaisseau;
                break;
            }
        }
    }
}

