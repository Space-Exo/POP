package fr.caensup.pop.niveau;

import fr.caensup.pop.personnage.Personnage;
import fr.caensup.pop.object.Fiole;
import fr.caensup.pop.niveau.Piege;
public class Emplacement {
    private Personnage personnage;
    private Piege piege;
    private Fiole fiole;

    public Emplacement() {
        this.personnage = null;
        this.piege = null;
        this.fiole = null;
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

    public Piege getPiege() {
        return piege;
    }

    public void placerPiege(Piege piege) {
        this.piege = piege;
    }

    public void retirerPiege() {
        this.piege = null;
    }

    public Fiole getFiole() {
        return fiole;
    }

    public void placerFiole(Fiole fiole) {
        this.fiole = fiole;
    }

    public void retirerFiole() {
        this.fiole = null;
    }
}
