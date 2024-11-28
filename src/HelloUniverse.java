public class HelloUniverse {
    public static void main(String[] args) {

        Planete mercure = new Planete("Mercure");
        mercure.matiere = "tellurique";
        mercure.diametre = 4880;

        Planete venus = new Planete("Venus");
        venus.matiere = "tellurique";
        venus.diametre = 12100;

        Planete terre = new Planete("Terre");
        terre.matiere = "tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete("Mars");
        mars.matiere = "tellurique";
        mars.diametre = 6792;

        Planete jupiter = new Planete("Jupiter");
        jupiter.matiere = "gazeuse";
        jupiter.diametre = 142984;

        Planete saturne = new Planete("Saturne");
        saturne.matiere = "gazeuse";
        saturne.diametre = 120536;

        Planete uranus = new Planete("Uranus");
        uranus.matiere = "gazeuse";
        uranus.diametre = 51118;

        Planete neptune = new Planete("Neptune");
        neptune.matiere = "gazeuse";
        neptune.diametre = 49532;

        Vaisseau fregate = new Vaisseau();
        fregate.type = "FREGATE";
        fregate.nbPassagers = 9;
        mars.accueillirVaisseau(fregate);

        Vaisseau croiseur = new Vaisseau();
        croiseur.type = "CROISEUR";
        croiseur.nbPassagers = 42;
        mars.accueillirVaisseau(croiseur);

        Vaisseau chasseur = new Vaisseau();
        chasseur.type = "CHASSEUR";

        /*System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre+ " kilomètres.");

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile." );

        System.out.println(mars.nom + " a effectué " + mars.rotation(-684) + " tours sur elle-même." );

        System.out.println(venus.nom + " a effectué " + venus.rotation(1250)+ " tours sur elle-même." );*/

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.nbTotalHumains + ".");
        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est " + Planete.forme);
        System.out.println("Le nombre de planètes découvertes est actuellement de " + Planete.nbPlanetesDecouvertes);
    }
    }

