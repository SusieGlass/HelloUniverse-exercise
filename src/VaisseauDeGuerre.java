public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

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
    void desactiverArmes(){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        }
}
