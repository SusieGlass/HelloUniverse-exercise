public enum TypeVaisseau {
    CHASSEUR("Chasseur"),
    FREGATE("Fregate"),
    CROISEUR("Croiseur"),
    CARGO("Cargo"),
    VAISSEAUMONDE("Vaisseau-Monde");

    String nom;
    private TypeVaisseau(String nom){
        this.nom = nom;
    }
}