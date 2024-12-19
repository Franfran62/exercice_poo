package org.example;

import org.example.designpattern.exerciceBiMap.Superheroes;

public class Main {
    public static void main(String[] args) {

        Superheroes superheroes = new Superheroes();
        System.out.println(superheroes.getSuperheroes("DC Comics"));
        System.out.println(superheroes.getMaisonEdition("Superman"));
    }
}
