package org.example.exerciceEncoreDesPizzas.fours;

public class TypeDeFour {

    private String nom;
    private long temperatureDeCuisson;
    private double maximumPizzaDedans;

    private TypeDeFour(String nom, long temperatureDeCuisson, double maximumPizzaDedans) {
        this.nom = nom;
        this.temperatureDeCuisson = temperatureDeCuisson;
        this.maximumPizzaDedans = maximumPizzaDedans;
    }

    public String getNom() {
        return this.nom;
    }
    public long getTemperatureDeCuisson() {
        return this.temperatureDeCuisson;
    }
    public double getMaximumPizzaDedans() {
        return this.maximumPizzaDedans;
    }

    public static class TypeDeFourBuilder {

        private String nom;
        private long temperatureDeCuisson;
        private double maximumPizzaDededans;

        public TypeDeFourBuilder() {
        }

        public TypeDeFour buildFeuDeBois() {
            this.nom = "Feu de bois";
            this.temperatureDeCuisson = 500;
            this.maximumPizzaDededans = 1;
            return new TypeDeFour(this.nom, this.temperatureDeCuisson, this.maximumPizzaDededans);
        }

        public TypeDeFour buildElectrique() {
            this.nom = "Electrique";
            this.temperatureDeCuisson = 450;
            this.maximumPizzaDededans = 5;
            return new TypeDeFour(this.nom, this.temperatureDeCuisson, this.maximumPizzaDededans);
        }

        public TypeDeFour buildAtomic() {
            this.nom = "Atomic";
            this.temperatureDeCuisson = 10000000L;
            this.maximumPizzaDededans = 10000000.1;
            return new TypeDeFour(this.nom, this.temperatureDeCuisson, this.maximumPizzaDededans);
        }

    }
}
