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

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxAzote = 0.0f;

        uranus.atmosphere = atmosphereUranus;

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 100;

        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 60;

        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 50;

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 150;

        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 160;

        System.out.println("Quel vaisseau souhaitez-vous sélectionner? Veuillez indiquer son nom.");
        Scanner sc = new Scanner(System.in);
        String vaisseauSelection = sc.nextLine();

        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser? Veuillez indiquer le nom de la planète.");
        String planeteSelection = sc.nextLine();

        System.out.println("Quel tonnage souhaitez vous embarquer");
        int cargaison = sc.nextInt();

        TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelection);
        Vaisseau vaisseau = null;
        switch (typeVaisseau){
            case CHASSEUR:
                vaisseau = chasseur;
                break;
            case FREGATE:
                vaisseau = fregate;
                break;
            case CROISEUR:
                vaisseau = croiseur;
                break;
            case CARGO:
                vaisseau = cargo;
                break;
            case VAISSEAUMONDE:
                vaisseau = vaisseauMonde;
                break;
        }

        PlaneteTellurique planete = null;
        switch (planeteSelection){
            case "Mercure":
                planete = mercure;
                break;
            case "Venus":
                planete = venus;
                break;
            case "Terre":
                planete = terre;
                break;
            case "Mars":
                planete = mars;
                break;
        }

 planete.accueillirVaisseau(vaisseau);

 int rejet = vaisseau.emporterCargaison(cargaison);
        System.out.println("Le rejet est de " + rejet);



    }
    }

