package org.example.models;

public class Animal {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name ne doit pas être vide");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age doit être positif");
        }
        this.age = age;
    }

    public void animalCry() {
        System.out.println("Animal cry");
    }

    public void move() {
        System.out.println("Animal move");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
