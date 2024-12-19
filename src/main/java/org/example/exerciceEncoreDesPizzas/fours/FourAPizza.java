package org.example.exerciceEncoreDesPizzas.fours;

import org.example.exerciceEncoreDesPizzas.comestible.Pizza;

public class FourAPizza {

    private int temperature;
    private TypeDeFour type;
    private ServiceDeFour service;

    public FourAPizza(TypeDeFour type) {
        this.service = new ServiceDeFour();
        this.type = type;
    }

    public void enfourner(Pizza pizza) {
        if (this.service.getNombrePizzaInside() >= this.type.getMaximumPizzaDedans()) {
            throw new IllegalStateException("Le four est plein");
        }
        this.service.enfourner(new PizzaInfo(pizza));
    }

    public String defourner(Pizza pizza) {
        return this.service.defourner(pizza);
    }
}