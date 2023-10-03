package fr.caensup.pop.object;

public abstract class Object {
    private int pointPv;
    private String nom;
    private int damagePoint;

    public Object(String nom, int pointPv, int damagePoint) {
        this.nom = nom;
        this.pointPv = pointPv;
        this.damagePoint = damagePoint;
    }

    // Provide getters and setters as needed
    // For example:
    public int getPointPv() {
        return pointPv;
    }

    public String getNom() {
        return nom;
    }

    public int getDamagePoint() {
        return damagePoint;
    }
}
