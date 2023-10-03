package fr.caensup.pop.personnage;

public class Joueur extends Personnage {
    private String nom;
    public Joueur(String nom, int maxPv, int dammagePoint) {
        super(nom, maxPv,dammagePoint);
        this.nom = nom;
    }
}
