package org.example.exerciceBundle.Iterators;

import org.example.exerciceBundle.Produit;
import org.example.exerciceBundle.interfaces.Payable;

import java.util.Iterator;
import java.util.List;

public class ProduitIterator implements Iterator<Produit> {

    private List<Produit> produitOrBundles;
    private int cursor;

    public ProduitIterator(List<Produit> produitOrBundles) {
        this.produitOrBundles = produitOrBundles;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < produitOrBundles.size();
    }

    @Override
    public Produit next() {
        return produitOrBundles.get(cursor++);
    }
}
