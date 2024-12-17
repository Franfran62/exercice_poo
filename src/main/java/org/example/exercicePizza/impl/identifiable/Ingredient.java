package org.example.exercicePizza.impl.identifiable;

import org.example.exercicePizza.abstracts.Identifiable;
import org.example.exercicePizza.abstracts.Produit;

public class Ingredient extends Identifiable {

    public Ingredient(String nom) {
        super(0, nom);
    }
}
