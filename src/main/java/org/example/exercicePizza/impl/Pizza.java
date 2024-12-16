package org.example.exercicePizza.impl;

import org.example.exercicePizza.abstracts.Produit;

public class Pizza extends Produit  {

    private String taille;
    private Ingredient[] ingredients;
    private double poids;

    public Pizza(int id, String nom, double prix, String taille, Ingredient[] ingredients, double poids) {
        super(id, nom, prix);
        this.taille = taille;
        this.ingredients = ingredients;
        this.poids = poids;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
}
