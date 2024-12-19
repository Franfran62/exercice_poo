package org.example.designpattern.exerciceBiMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Superheroes {

    private HashMap<String, String> superheroMap = new HashMap<>();
    private HashMap<String, Set<String>> superheroes = new HashMap<>();

    public Superheroes() {
        addSuperhero("Superman", "DC Comics");
        addSuperhero("Batman", "DC Comics");
        addSuperhero("Hulk", "Marvel");
    }

    public void addSuperhero(String name, String maisonEdition) {
        superheroMap.put(name, maisonEdition);
        superheroes.computeIfAbsent(maisonEdition, k -> new HashSet<>()).add(name);
    }

    public Set<String> getSuperheroes(String maisonEdition) {
        return superheroes.get(maisonEdition);
    }

    public String getMaisonEdition(String superhero) {
        return superheroMap.getOrDefault(superhero, null);
    }
}
