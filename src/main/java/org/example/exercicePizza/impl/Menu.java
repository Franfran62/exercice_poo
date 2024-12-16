package org.example.exercicePizza.impl;

import java.util.List;

public class Menu {

    private final List<Pizza> carte;

    public Menu(List<Pizza> carte) {
        this.carte = carte;
    }

    public List<Pizza> getCarte() {
        return carte;
    }

    public void removeFromCarte(Pizza pizza) {
        this.carte.remove(pizza);
    }

    public void addToCarte(Pizza pizza) {
        this.carte.add(pizza);
    }
}
