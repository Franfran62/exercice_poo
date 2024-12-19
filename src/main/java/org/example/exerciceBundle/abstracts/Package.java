package org.example.exerciceBundle.abstracts;

import org.example.exerciceBundle.Iterators.ProduitIterator;
import org.example.exerciceBundle.Produit;
import org.example.exerciceBundle.interfaces.Payable;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Package implements Payable, Iterable<Produit> {

    protected int id;
    protected List<Payable> produits = new ArrayList<>();

    public Package(int id, List<Payable> produits) {
        this.id = id;
        this.produits = produits;
    }

    public abstract void addProduit(Payable produit);

    public List<Produit> listAllProduit(Package pack) {
        Set<Package> visited = new HashSet<>();
        List<Produit> response = new ArrayList<>();
        Queue<Package> queue = new LinkedList<>();
        queue.add(pack);

        while (!queue.isEmpty()) {
            Package current = queue.poll();
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);

            for (Payable produit : current.getProduits()) {
                if (produit instanceof Produit) {
                    response.add((Produit) produit);
                } else if (produit instanceof Package) {
                    queue.add((Package) produit);
                }
            }
        }
        return response;
    }

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

    public List<Payable> getProduits() {
        return produits;
    }

    @Override
    public Iterator<Produit> iterator() {
        Set<Package> visited = new HashSet<>();
        List<Produit> response = new ArrayList<>();
        Queue<Package> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Package current = queue.poll();
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);

            for (Payable produit : current.getProduits()) {
                if (produit instanceof Produit) {
                    response.add((Produit) produit);
                } else if (produit instanceof Package) {
                    queue.add((Package) produit);
                }
            }
        }
        return new ProduitIterator(response);
    }
}
