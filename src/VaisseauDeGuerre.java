public class VaisseauDeGuerre extends Vaisseau {

    void attaque(Vaisseau cible, String weaponUsed, int attackTime){
        System.out.println("Un vaisseau de type " + type + " attaque un  " + cible.type + " en utilisant l'arme " + weaponUsed + " pendant " + attackTime + " minutes");
        cible.resistanceDuBouclier = 0;
        cible.blindage = cible.blindage / 2;

    }

}
