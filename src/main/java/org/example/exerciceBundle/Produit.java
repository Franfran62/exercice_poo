package org.example.exerciceBundle;

import org.example.exerciceBundle.interfaces.Payable;

import java.util.HashSet;
import java.util.Set;

public class Produit implements Payable {

    private int id;
    private int prix;
    private String reference;
    private String designation;
    private int poids;
    private Set<String[]> caracteristiques;

    private Produit(int id, int prix, String reference, String designation, int poids, Set<String[]> caracteristiques) {
        this.id = id;
        this.prix = prix;
        this.reference = reference;
        this.designation = designation;
        this.poids = poids;
        this.caracteristiques = caracteristiques;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "";
    }

    public static class ProduitBuilder {

        private static int id = 0;
        private int prix;
        private String reference;
        private String designation;
        private int poids;
        private Set<String[]> caracteristiques = new HashSet<>();

        public ProduitBuilder withPrix(int prix) {
            this.prix = prix;
            return this;
        }

        public ProduitBuilder withReference(String reference) {
            this.reference = reference;
            return this;
        }

        public ProduitBuilder withDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public ProduitBuilder withPoids(int poids) {
            if (poids < 0) {
                throw new IllegalArgumentException("Le poids doit être positif.");
            }
            this.poids = poids;
            return this;
        }

        public ProduitBuilder addCaracteristique(String[] caracteristique) {
            caracteristiques.add(caracteristique);
            return this;
        }

        public ProduitBuilder withCaracteristiques(Set<String[]> caracteristiques) {
            this.caracteristiques = caracteristiques;
            return this;
        }

        public Produit build() {
            return new Produit(++id, prix, reference, designation, poids, caracteristiques);
        }
    }
}
