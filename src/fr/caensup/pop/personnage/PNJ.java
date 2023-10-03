package fr.caensup.pop.personnage;

public class PNJ extends Personnage {
    private String nom;
    public PNJ(String nom, int maxPv, int dammagePoint) {
        super(nom, maxPv,dammagePoint);
        this.nom = nom;
    }
}
