package org.example.designpattern;

import javax.smartcardio.CardChannel;
import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class Car {

    private String engine;
    private int numberOfSeats;
    private String innerColor;
    private String outsideColor;
    private GearBox gearBox;
    private int rim;
    private Set<String> options;

    private Car() {
        options = new HashSet<>();
    }

    private void setEngine(String engine) {
        this.engine = engine;
    }

    private Set<String> getOptions() {
        return options;
    }

    public enum GearBox {
        BVM, BVA;
    }

    public static class Builder {

        private Car car;

        public Builder() {
            car = new Car();
        }

        public Builder withEngine(String engine) {
            car.setEngine(engine);
            return this;
        }

        public Builder withNumberOfSeats(int numberOfSeats) {
            // Utiliser plutôt les setters ici pour respecter l'encapsulation
            car.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder withOption(String option) {
            // Utiliser plutôt un getter ici pour respecter l'encapsulation
            car.getOptions().add(option);
            return this;
        }

        public Builder withRim(int rim) {
            // Utiliser plutôt les setters ici pour respecter l'encapsulation
            car.rim = rim;
            return this;
        }

        public Builder withGearBox(GearBox gearBox) {
            // Utiliser plutôt les setters ici pour respecter l'encapsulation
            car.gearBox = gearBox;
            return this;
        }

        public Builder withInnerColor(String innerColor) {
            // Utiliser plutôt les setters ici pour respecter l'encapsulation
            car.innerColor = innerColor;
            return this;
        }

        public Builder withOutsideColor(String outsideColor) {
            // Utiliser plutôt les setters ici pour respecter l'encapsulation
            car.outsideColor = outsideColor;
            return this;
        }

        public Car build() {
            if (car.engine != null && "diesel".equals(car.engine) && car.rim > 0) {
                // Conditions d'instanciation vérifiées
                return car;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}




