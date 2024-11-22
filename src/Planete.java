public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;

    int revolution(int angle) {
       return angle / 360;
    }
    int rotation(int angle) {
        return angle / 360;
    }

    void accueillirVaisseau(int nbNouveauxArrives){
     totalVisiteurs += nbNouveauxArrives;
    }
    void accueillirVaisseau(String typeVaisseau) {
      int nbPassagers = switch (typeVaisseau) {
          case "CHASSEUR" -> 3;
          case "FREGATE" -> 12;
          case "CROISEUR" -> 50;
          default -> 0;
      };
        totalVisiteurs += nbPassagers;
    }
}
