package org.example.models;

public class Duck  extends Animal {

    @Override
    public void animalCry() {
        System.out.println("Coin coin");
    }

    @Override
    public void move() {
        System.out.println("Le canard nage");
    }

    public Duck(String name, int age) {
        super(name, age);
    }
}
