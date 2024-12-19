package org.example;

import org.example.designpattern.exerciceBiMap.MaisonEdition;
import org.example.designpattern.exerciceBiMap.Superheroes;
import org.example.designpattern.exerciceFactory.Animal;
import org.example.designpattern.exerciceFactory.AnimalFactory;
import org.example.designpattern.exerciceIterator.StringWrapper;
import org.example.exerciceBundle.Bundle;
import org.example.exerciceBundle.Iterators.ProduitIterator;
import org.example.exerciceBundle.Produit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Superheroes superheroes = new Superheroes();
        System.out.println(superheroes.getValueOfKey(new MaisonEdition("DC Comics")));
    }
}
