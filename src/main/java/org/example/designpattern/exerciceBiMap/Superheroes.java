package org.example.designpattern.exerciceBiMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Superheroes {

    private HashMap<MaisonEdition, Set<String>> superheroes;

    public Superheroes() {
        this.superheroes = new HashMap<>();
        addSuperhero("Superman", new MaisonEdition("DC Comics"));
        addSuperhero("Batman",  new MaisonEdition("DC Comics"));
        addSuperhero("Hulk", new MaisonEdition("Marvel"));
    }

    public void addSuperhero(String name, MaisonEdition maisonEdition) {
        superheroes.computeIfAbsent(maisonEdition, k -> new HashSet<>()).add(name);
    }

    public Set<String> getValueOfKey(MaisonEdition maisonEdition) {
        return superheroes.getOrDefault(maisonEdition, new HashSet<>());
    }
}
