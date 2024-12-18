package org.example.exerciceBundle;

import org.example.exerciceBundle.abstracts.Package;
import org.example.exerciceBundle.interfaces.Payable;

import java.util.ArrayList;
import java.util.List;

public class Box extends Package {

    private int coutFixe = 15;

    private Box(int id, List<Payable> produits) {
        super(id, produits);
    }

    @Override
    public int getPrix() {
        int prix = coutFixe;
        for (Payable produit : produits) {
            prix += produit.getPrix();
        }
        return prix;
    }

    @Override
    public void addProduit(Payable produit) {
        if (produit instanceof Box) {
            throw new IllegalStateException("Impossible d'ajouter une box dans une box.");
        }
        produits.add(produit);
    }

    public static class BoxBuilder {

        private static int id = 0;
        private List<Payable> produits = new ArrayList<>();

        public BoxBuilder addPayable(Payable payable) {
            if (payable instanceof Box) {
                throw new IllegalStateException("Impossible d'ajouter une box dans une box.");
            }
            produits.add(payable);
            return this;
        }

        public Box build() {
            id++;
            return new Box(id, produits);
        }
    }
}
