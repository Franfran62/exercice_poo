package org.example.exerciceEncoreDesPizzas.fours;

import org.example.exerciceEncoreDesPizzas.comestible.Pizza;

import java.util.Date;

public class PizzaInfo {

    private Pizza pizza;
    private Date dateEnfourne;

    public PizzaInfo(Pizza pizza) {
        this.pizza = pizza;
        this.dateEnfourne = new Date();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Date getDateEnfourne() {
        return this.dateEnfourne;
    }
}
