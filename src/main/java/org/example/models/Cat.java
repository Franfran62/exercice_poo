package org.example.models;

public class Cat extends Animal {

        @Override
        public void animalCry() {
            System.out.println("Miaou");
        }

        @Override
        public void move() {
            System.out.println("Le chat court");
        }

        public Cat(String name, int age) {
        super(name, age);
    }
}
