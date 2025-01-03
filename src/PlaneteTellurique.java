public class PlaneteTellurique  extends Planete implements Habitable {

    Vaisseau[] vaisseauxAccostes;
    /*Vaisseau vaisseauAccoste;*/
    int nbTotalHumains;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[tailleBaie];
    }

    boolean restePlaceDisponible() {
        for (int index = 0; index < vaisseauxAccostes.length; index++) {
            if (vaisseauxAccostes[index] == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void accueillirVaisseaux(Vaisseau... vaisseaux) {

        for (int i = 0; i < vaisseaux.length; i++){

            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }
            nbTotalHumains = nbTotalHumains + vaisseaux[i].nbPassagers;

            for (int index = 0; index < vaisseauxAccostes.length; index++) {
                if (vaisseauxAccostes[index] == null) {
                    vaisseauxAccostes[index] = vaisseaux[i];
                    break;
                }
            }
        }
    }
}