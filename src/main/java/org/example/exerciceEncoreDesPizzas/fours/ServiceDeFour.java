package org.example.exerciceEncoreDesPizzas.fours;

import org.example.exerciceEncoreDesPizzas.comestible.Pizza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceDeFour {

    private List<PizzaInfo> pizzaInside;

    public ServiceDeFour() {
        this.pizzaInside = new ArrayList<>();
    }

    public int getNombrePizzaInside() {
        return this.pizzaInside.size();
    }

    public void enfourner(PizzaInfo pizzaInfo) {
        this.pizzaInside.add(pizzaInfo);
    }

    public String defourner(Pizza pizza) {
        for (PizzaInfo pizzaInfo : this.pizzaInside) {
            if (pizzaInfo.getPizza().equals(pizza)) {
                this.pizzaInside.remove(pizzaInfo);
                return "Pizza défourner";
            }
        }
        return "Pizza non trouvé";
    }

    private boolean isPizzaCuite(PizzaInfo pizzaInfo) {
        return new Date().getTime() - pizzaInfo.getDateEnfourne().getTime() > 0;
    }

}
