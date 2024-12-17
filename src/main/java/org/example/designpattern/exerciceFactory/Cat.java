package org.example.designpattern.exerciceFactory;

public class Cat extends Quadripede implements Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Miaou");
    }
}
