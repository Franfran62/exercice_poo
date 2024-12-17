package org.example.designpattern.exerciceFactory;

public class Dog extends Quadripede implements Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Wouaf Waouf");
    }
}
