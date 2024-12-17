package org.example.designpattern.exerciceFactory;

public abstract class Quadripede implements Animal {

    private String name;
    private final int nbPattes = 4;

    @Override
    public void run() {
        System.out.println("A 4 pattes");
    }

    @Override
    public abstract void animalSound();

    public Quadripede(String name) {
        this.name = name;
    }
}
