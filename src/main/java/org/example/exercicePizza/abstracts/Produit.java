package org.example.exercicePizza.abstracts;

public abstract class Produit extends Identifiable {

    private double prix;

    public Produit(int id, String nom, double prix) {
        super(id, nom);
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
