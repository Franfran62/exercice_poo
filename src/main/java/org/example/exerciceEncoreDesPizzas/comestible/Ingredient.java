package org.example.exerciceEncoreDesPizzas.comestible;

import org.example.exerciceEncoreDesPizzas.comestible.enums.TypeIngredient;

public class Ingredient {

    private String nom;
    private TypeIngredient typeIngredient;
    private int prixHT;
    private String aoc;
    private int nombreDeCalorie;

    public Ingredient(String nom, int prixHT, String aoc, int nombreDeCalorie, TypeIngredient typeIngredient) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.aoc = aoc;
        this.nombreDeCalorie = nombreDeCalorie;
        this.typeIngredient = typeIngredient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    public int getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(int prixHT) {
        this.prixHT = prixHT;
    }

    public String getAoc() {
        return aoc;
    }

    public void setAoc(String aoc) {
        this.aoc = aoc;
    }

    public int getNombreDeCalorie() {
        return nombreDeCalorie;
    }

    public void setNombreDeCalorie(int nombreDeCalorie) {
        this.nombreDeCalorie = nombreDeCalorie;
    }
}
