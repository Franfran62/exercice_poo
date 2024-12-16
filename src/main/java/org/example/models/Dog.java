package org.example.models;

public class Dog extends Animal {

        @Override
        public void animalCry() {
            System.out.println("Wouaf wouaf");
        }

        @Override
        public void move() {
            System.out.println("Le chien court");
        }

    public Dog(String name, int age) {
        super(name, age);
    }
}
