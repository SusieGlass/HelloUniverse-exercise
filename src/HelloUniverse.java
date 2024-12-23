import java.util.Scanner;

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
        chasseur.nbPassagers = 100;

        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nbPassagers = 60;

        VaisseauDeGuerre croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 50;

        VaisseauCivil vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 150;

        VaisseauCivil  cargo = new VaisseauCivil("CARGO");
        cargo.nbPassagers = 160;

        System.out.println("Quel vaisseau souhaitez-vous manipuler parmi les 5 suivants? Veuillez indiquer son nom.");
        Scanner sc = new Scanner(System.in);
        String nomDuVaisseau = sc.nextLine();

        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser? Veuillez indiquer le nom de la planète.");
        String nomDeLaPlanete = sc.nextLine();

        System.out.println("Quel tonnage souhaitez vous embarquer");
        int tonnage = sc.nextInt();

        terre.accueillirVaisseau(croiseur);
        System.out.println("La croiseur a rejeté " + croiseur.emporterCargaison(47) + " tonnes.");


    }
    }

