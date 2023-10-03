package fr.caensup.pop.niveau;

public class Map extends Niveau {
    private String libelle;
    private Emplacement[][] grille;

    public Map(String libelle, int nbLignes, int nbColonnes) {
        super(libelle);
        this.libelle = libelle;
        this.grille = new Emplacement[nbLignes][nbColonnes];
        // Initialiser la grille avec des emplacements vides
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                this.grille[i][j] = new Emplacement();
            }
        }
    }

}
