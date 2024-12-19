package org.example.designpattern.exerciceBiMap;

import java.util.Objects;

public class MaisonEdition {

    private String nom;

    public MaisonEdition(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaisonEdition maisonEdition = (MaisonEdition) o;
        return Objects.equals(nom, maisonEdition.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}