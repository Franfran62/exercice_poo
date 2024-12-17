package org.example.exercicePizza;

import org.example.exercicePizza.abstracts.Produit;

import java.util.List;

public class Menu {

    private final List<Produit> carte;

    public Menu(List<Produit> carte) {
        this.carte = carte;
    }

    public List<Produit> getCarte() {
        return carte;
    }

    public void removeFromCarte(Produit produit) {
        this.carte.remove(produit);
    }

    public void addToCarte(Produit produit) {
        this.carte.add(produit);
    }
}
