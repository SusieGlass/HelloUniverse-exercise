public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

    VaisseauDeGuerre(TypeVaisseau type) {
        this.type = type;
        if (type == TypeVaisseau.CHASSEUR) {
            tonnageMax = 0;
        } else if (type == TypeVaisseau.FREGATE) {
            tonnageMax = 50;
        } else if (type == TypeVaisseau.CROISEUR) {
            tonnageMax = 100;
        }
    }

    @Override
    void activerBouclier() {
        desactiverArmes();
        super.activerBouclier();
    }

    void attaque(Vaisseau cible, String weaponUsed, int attackTime) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un  " + cible.type + " en utilisant l'arme " + weaponUsed + " pendant " + attackTime + " minutes");
            cible.resistanceDuBouclier = 0;
            cible.blindage = cible.blindage / 2;
        }
    }

    void desactiverArmes() {
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
    }

    @Override
    int emporterCargaison(int cargaison) {
        if (type.equals("CHASSEUR")) {
            return cargaison;
        } else if (nbPassagers < 12) {
            return cargaison;
        } else {
            int tonnagePassager = nbPassagers * 2;
            int tonnageRestant = tonnageMax - tonnageActuel;
            int tonnageAConsiderer = (tonnagePassager < tonnageRestant ? tonnagePassager : tonnageRestant);
            if (cargaison > tonnageAConsiderer) {
                tonnageActuel = tonnageMax;
                return cargaison - tonnageAConsiderer;
            } else {
                tonnageActuel = tonnageActuel + cargaison;
                return 0;
            }
        }
    }
}
