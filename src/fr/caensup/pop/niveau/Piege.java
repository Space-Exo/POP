package fr.caensup.pop.niveau;

public class Piege {
    private boolean actif;

    public Piege() {
        this.actif = false; // Par défaut, le piège est inactif
    }

    public boolean isActif() {
        return actif;
    }

    public void activerPiege() {
        this.actif = true;
    }

    public void desactiverPiege() {
        this.actif = false;
    }
}
