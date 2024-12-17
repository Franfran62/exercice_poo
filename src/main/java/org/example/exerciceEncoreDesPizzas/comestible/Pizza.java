package org.example.exerciceEncoreDesPizzas.comestible;

import org.example.exerciceEncoreDesPizzas.comestible.abstracts.Enfournable;
import org.example.exerciceEncoreDesPizzas.comestible.enums.Base;
import org.example.exerciceEncoreDesPizzas.comestible.enums.Pate;

import java.util.HashSet;
import java.util.Set;

public class Pizza extends Enfournable {

    private static int coutFIXE = 1;

    public static void setCoutFIXE(int coutFIXE) {
        Pizza.coutFIXE = coutFIXE;
    }

    private String nom;
    private Pate pate;
    private Base base;
    private Set<Viande> viandes;
    private Set<Fromage> fromages;
    private Set<Assaisonement> assaisonnements;
    private int prixHT;
    private int nombreDeCalorie;

    private Pizza() {
        super();
        this.viandes = new HashSet<>();
        this.fromages = new HashSet<>();
        this.assaisonnements = new HashSet<>();
    }

    public static class PizzaBuilder {

        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder withNom(String nom) {
            pizza.nom = nom;
            return this;
        }

        public PizzaBuilder withPate(Pate pate) {
            pizza.pate = pate;
            return this;
        }

        public PizzaBuilder withBase(Base base) {
            pizza.base = base;
            return this;
        }

        public PizzaBuilder withViande(Viande viande) throws IllegalStateException {
            if (pizza.viandes.size() >= 5) {
                throw new IllegalStateException("Trop de viandes");
            }
            pizza.viandes.add(viande);
            return this;
        }

        public PizzaBuilder withFromage(Fromage fromage) throws IllegalStateException {
            if (pizza.fromages.size() >= 5) {
                throw new IllegalStateException("Trop de fromages");
            }
            pizza.fromages.add(fromage);
            return this;
        }

        public PizzaBuilder withAssaisonnement(Assaisonement assaisonnement) throws IllegalStateException {
            if (pizza.assaisonnements.size() >= 5) {
                throw new IllegalStateException("Trop d'assaisonnements");
            }
            pizza.assaisonnements.add(assaisonnement);
            return this;
        }

        public Pizza build() {
            pizza.prixHT = 0;
            pizza.nombreDeCalorie = 0;

            if (pizza.fromages.size() >= 4) {
                pizza.base = Base.CREME;
            }

            for (Viande viande : pizza.viandes) {
                pizza.prixHT += viande.getPrixHT();
                pizza.nombreDeCalorie += viande.getNombreDeCalorie();
            }
            for (Fromage fromage : pizza.fromages) {
                pizza.prixHT += fromage.getPrixHT();
                pizza.nombreDeCalorie += fromage.getNombreDeCalorie();
            }
            for (Assaisonement assaisonement : pizza.assaisonnements) {
                pizza.prixHT += assaisonement.getPrixHT();
                pizza.nombreDeCalorie += assaisonement.getNombreDeCalorie();
            }
            pizza.prixHT += coutFIXE;
            return pizza;
        }
    }
}

