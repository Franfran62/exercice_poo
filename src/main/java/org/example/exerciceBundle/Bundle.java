package org.example.exerciceBundle;

import org.example.exerciceBundle.Iterators.ProduitIterator;
import org.example.exerciceBundle.abstracts.Package;
import org.example.exerciceBundle.interfaces.Payable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bundle extends Package {

    private int pourcentagePrix;

    private Bundle(int id, List<Payable> produits, int pourcentagePrix) {
        super(id, produits);
        this.pourcentagePrix = pourcentagePrix;
    }

    @Override
    public int getPrix() {
        int prix = 0;
        for (Payable produit :produits) {
            prix += produit.getPrix();
        }
        return prix * pourcentagePrix / 100;
    }

    @Override
    public void addProduit(Payable produit) {
        produits.add(produit);
    }

    public static class BundleBuilder {

        private static int id = 0;
        private List<Payable> produits = new ArrayList<>();
        private int pourcentagePrix = 100;

        public BundleBuilder withPourcentagePrix(int pourcentagePrix) {
            if (pourcentagePrix < 0 || pourcentagePrix > 100) {
                throw new IllegalArgumentException("Le pourcentage doit être compris entre 0 et 100.");
            }
            this.pourcentagePrix = pourcentagePrix;
            return this;
        }

        public BundleBuilder addPayable(Payable payable) {
            produits.add(payable);
            return this;
        }

        public Bundle build() {
            id++;
            return new Bundle(id, produits, pourcentagePrix);
        }
    }
}
