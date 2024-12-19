package org.example;

import org.example.designpattern.exerciceFactory.Animal;
import org.example.designpattern.exerciceFactory.AnimalFactory;
import org.example.designpattern.exerciceIterator.StringWrapper;
import org.example.exerciceBundle.Bundle;
import org.example.exerciceBundle.Iterators.ProduitIterator;
import org.example.exerciceBundle.Produit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Exercice Factory
        Animal dog = AnimalFactory.createAnimal("Dog", "Yoshi");
        dog.animalSound();

        //Exercice MyItérator
        StringWrapper stringWrapper = new StringWrapper("Test", false);
        for (char c : stringWrapper) {
            System.out.println(c);
        }

        //Exercice Iterator et Bundle
        var produitBuilder = new Produit.ProduitBuilder();
        var bundleBuilder = new Bundle.BundleBuilder();
        var bundleDeBundleBuilder = new Bundle.BundleBuilder();
        Produit produit = produitBuilder.withPrix(10)
                .withReference("ref")
                .withDesignation("des")
                .withPoids(3)
                .build();
        Produit produit1 = produitBuilder.withPrix(20)
                .withReference("ref1")
                .withDesignation("des1")
                .withPoids(4)
                .build();
        Produit produit2 = produitBuilder.withPrix(30)
                .withReference("ref2")
                .withDesignation("des2")
                .withPoids(5)
                .build();
        Bundle bundle = bundleBuilder.addPayable(produit)
                .addPayable(produit1)
                .addPayable(produit2)
                .build();

        Bundle bundle1 = bundleDeBundleBuilder.addPayable(bundle)
                .addPayable(produit1)
                .addPayable(produit2)
                .build();

        for (Produit p : bundle1) {
            System.out.println(p.getReference());
        }
    }
}
