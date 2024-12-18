package org.example.exerciceBundle.abstracts;

import org.example.exerciceBundle.Box;
import org.example.exerciceBundle.interfaces.Payable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Package implements Payable {

    protected int id;
    protected List<Payable> produits = new ArrayList<>();

    public Package(int id, List<Payable> produits) {
        this.id = id;
        this.produits = produits;
    }

    public abstract void addProduit(Payable produit);

    @Override
    public abstract int getPrix();

    @Override
    public int getPoids() {
        int poids = 0;
        for (Payable produit : produits) {
            poids += produit.getPoids();
        }
        return poids;
    }

    @Override
    public String getReference() {
        return produits.stream()
                .map(Payable::getReference)
                .collect(Collectors.joining(", "));
    }
}
