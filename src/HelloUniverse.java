public class HelloUniverse {
    public static void main(String[] args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre();
        chasseur.type = "CHASSEUR";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;
        chasseur.activerBouclier();

        Vaisseau vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "Vaisseau-Monde";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        vaisseauMonde.activerBouclier();

        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();


        /*Vaisseau fregate = new Vaisseau();
        fregate.type = "FREGATE";
        fregate.nbPassagers = 9;
        mars.accueillirVaisseau(fregate);

        Vaisseau croiseur = new Vaisseau();
        croiseur.type = "CROISEUR";
        croiseur.nbPassagers = 42;
        mars.accueillirVaisseau(croiseur);

        Vaisseau chasseur = new Vaisseau();
        chasseur.type = "CHASSEUR";

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);*/

        
        /*System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre+ " kilomètres.");

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile." );

        System.out.println(mars.nom + " a effectué " + mars.rotation(-684) + " tours sur elle-même." );

        System.out.println(venus.nom + " a effectué " + venus.rotation(1250)+ " tours sur elle-même." );

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.nbTotalHumains + ".");
        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est " + Planete.forme);
        System.out.println("Le nombre de planètes découvertes est actuellement de " + Planete.nbPlanetesDecouvertes);*/
        /*System.out.println(vaisseauMonde.blindage);
        System.out.println(vaisseauMonde.resistanceDuBouclier);*/

    }
    }

