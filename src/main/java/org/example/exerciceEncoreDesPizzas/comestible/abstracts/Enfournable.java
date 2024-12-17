package org.example.exerciceEncoreDesPizzas.comestible.abstracts;

public abstract class Enfournable {

    private int tempsDeCuisson;
    private int temperatureDeCuissonIdeale;

    public Enfournable() {
        this.temperatureDeCuissonIdeale = 400;
        this.tempsDeCuisson = 90;
    }

    public int getTempsDeCuisson() {
        return tempsDeCuisson;
    }

    public void setTempsDeCuisson(int tempsDeCuisson) {
        this.tempsDeCuisson = tempsDeCuisson;
    }

    public int getTemperatureDeCuissonIdeale() {
        return temperatureDeCuissonIdeale;
    }

    public void setTemperatureDeCuissonIdeale(int temperatureDeCuissonIdeale) {
        this.temperatureDeCuissonIdeale = temperatureDeCuissonIdeale;
    }
}
