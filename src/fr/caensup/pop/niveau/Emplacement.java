package fr.caensup.pop.niveau;

import fr.caensup.pop.personnage.Personnage;

public class Emplacement {
    private Personnage personnage;

    public Emplacement() {
        this.personnage = null;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void placerPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public void retirerPersonnage() {
        this.personnage = null;
    }
}
