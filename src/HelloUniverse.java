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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;
        chasseur.activerBouclier();

        VaisseauCivil vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        vaisseauMonde.activerBouclier();

        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur a rejeté " + chasseurSurTerre.emporterCargaison(20) + " tonnes.");

        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nbPassagers = 100;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println("La frégate a rejeté " + fregateSurTerre.emporterCargaison(45) + " tonnes.");
        System.out.println("La frégate a rejeté " + fregateSurTerre.emporterCargaison(12) + " tonnes.");

        Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nbPassagers = 14;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println("La frégate 2 a rejeté " + fregateSurTerre2.emporterCargaison(30) + " tonnes.");

        Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("La vaisseau-monde a rejeté " + vaisseauMondeSurTerre.emporterCargaison(1560) + " tonnes.");
        System.out.println("La vaisseau-monde a rejeté " + vaisseauMondeSurTerre.emporterCargaison(600) + " tonnes.");

    }
    }

