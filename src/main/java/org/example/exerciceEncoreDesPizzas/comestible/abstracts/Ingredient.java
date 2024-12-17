package org.example.exerciceEncoreDesPizzas.comestible.abstracts;

import org.example.exerciceEncoreDesPizzas.comestible.enums.TypeIngredient;

public abstract class Ingredient {

    private String nom;
    private int prixHT;
    private int nombreDeCalorie;

    public Ingredient(String nom, int prixHT, int nombreDeCalorie) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.nombreDeCalorie = nombreDeCalorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(int prixHT) {
        this.prixHT = prixHT;
    }


    public int getNombreDeCalorie() {
        return nombreDeCalorie;
    }

    public void setNombreDeCalorie(int nombreDeCalorie) {
        this.nombreDeCalorie = nombreDeCalorie;
    }
}
