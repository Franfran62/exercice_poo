package org.example.exerciceEncoreDesPizzas.comestible;

import org.example.exerciceEncoreDesPizzas.comestible.abstracts.Ingredient;

public class Viande extends Ingredient implements org.example.exerciceEncoreDesPizzas.comestible.interfaces.AOC {
    private String AOC;

    public Viande(String nom, int prixHT, int nombreDeCalorie, String AOC) {
        super(nom, prixHT, nombreDeCalorie);
        this.AOC = AOC;
    }

    @Override
    public String getAOC() {
        return this.AOC;
    }
    @Override
    public void setAOC(String AOC) {
        this.AOC = AOC;
    }
}
