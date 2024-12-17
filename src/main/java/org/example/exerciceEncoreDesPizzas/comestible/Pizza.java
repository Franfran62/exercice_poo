package org.example.exerciceEncoreDesPizzas.comestible;

import org.example.exerciceEncoreDesPizzas.comestible.abstracts.Enfournable;
import org.example.exerciceEncoreDesPizzas.comestible.enums.Base;
import org.example.exerciceEncoreDesPizzas.comestible.enums.Pate;
import org.example.exerciceEncoreDesPizzas.comestible.enums.TypeIngredient;

import java.util.HashSet;
import java.util.Set;

class Pizza extends Enfournable {

    private static int coutFIXE = 1;

    public static void setCoutFIXE(int coutFIXE) {
        Pizza.coutFIXE = coutFIXE;
    }

    private String nom;
    private Pate pate;
    private Base base;
    private Set<Ingredient> viandes;
    private Set<Ingredient> fromages;
    private Set<Ingredient> assaisonnements;
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
            if (pizza.fromages.size() <=4) {
                pizza.base = base;
            } else {
                pizza.base = Base.CREME;
            }
            return this;
        }

        public PizzaBuilder withViande(Ingredient viande) throws IllegalStateException {
            if (viande.getTypeIngredient() == TypeIngredient.VIANDE) {
                if (pizza.viandes.size() >= 5) {
                    throw new IllegalStateException("Trop de viandes");
                }
                pizza.viandes.add(viande);
            }
            return this;
        }

        public PizzaBuilder withFromage(Ingredient fromage) throws IllegalStateException {
            if (fromage.getTypeIngredient() == TypeIngredient.FROMAGE) {
                switch (pizza.fromages.size() + 1) {
                    case 4:
                        pizza.base = Base.CREME;
                        pizza.fromages.add(fromage);
                        break;
                    case 6:
                        throw new IllegalStateException("Trop de fromages");
                    default:
                        pizza.fromages.add(fromage);
                }
            }
            return this;
        }

        public PizzaBuilder withAssaisonnement(Ingredient assaisonnement) throws IllegalStateException {
            if (assaisonnement.getTypeIngredient() == TypeIngredient.ASSAISSONNEMENT) {
                if (pizza.assaisonnements.size() >= 5) {
                    throw new IllegalStateException("Trop d'assaisonnements");
                }
                pizza.assaisonnements.add(assaisonnement);
            }
            return this;
        }

        public Pizza build() {
            pizza.prixHT = 0;
            pizza.nombreDeCalorie = 0;

            for (Ingredient viande : pizza.viandes) {
                pizza.prixHT += viande.getPrixHT();
                pizza.nombreDeCalorie += viande.getNombreDeCalorie();
            }
            for (Ingredient fromage : pizza.fromages) {
                pizza.prixHT += fromage.getPrixHT();
                pizza.nombreDeCalorie += fromage.getNombreDeCalorie();
            }
            for (Ingredient assaisonement : pizza.assaisonnements) {
                pizza.prixHT += assaisonement.getPrixHT();
                pizza.nombreDeCalorie += assaisonement.getNombreDeCalorie();
            }
            pizza.prixHT += coutFIXE;
            return pizza;
        }
    }
}

