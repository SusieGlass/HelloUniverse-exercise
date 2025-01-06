public class PlaneteTellurique  extends Planete implements Habitable {

    Vaisseau[][]vaisseauxAccostes;
    /*Vaisseau vaisseauAccoste;*/
    int nbTotalHumains;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[tailleBaie][tailleBaie];
    }

    boolean restePlaceDisponible(Vaisseau vaisseau) {

        int indexZone = 0;

        switch (vaisseau.type){
            case CARGO:
            case VAISSEAUMONDE:
                indexZone = 1;
        }
        for (int index = 0; index < vaisseauxAccostes[indexZone].length; index++) {
            if (vaisseauxAccostes[indexZone][index] == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void accueillirVaisseaux(Vaisseau... vaisseaux) {

        for (int i = 0; i < vaisseaux.length; i++){

            int indexZone = 0;

            switch (vaisseaux[i].type) {
                case CARGO:
                case VAISSEAUMONDE:
                    indexZone = 1;
            }

            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }
            nbTotalHumains = nbTotalHumains + vaisseaux[i].nbPassagers;

            for (int index = 0; index < vaisseauxAccostes[indexZone].length; index++) {
                if (vaisseauxAccostes[indexZone][index] == null) {
                    vaisseauxAccostes[indexZone][index] = vaisseaux[i];
                    break;
                }
            }
        }
    }
}